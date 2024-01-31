package project.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.naming.spi.DirStateFactory.Result;

import project.vo.BuyVo;
import project.vo.CustomerBuyVo;

public class TblBuyDao {

    public static void main(String[] args) {
        String customid = System.console().readLine();

        TblBuyDao dao = new TblBuyDao();
        List<CustomerBuyVo> result = dao.selectCustomerBuyList(customid);
        System.out.println(result);
    }

    public static final String URL = "jdbc:oracle:thin:@//localhost:1521/xe";
    public static final String USERNAME = "c##idev";
    private static final String PASSWORD = "1234";

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }

    //executeUpdate 메소드는 insert, update, delete 가 정상 실행(반영된 행 있으면) 되면 1을 리턴,
    //                  특히 Update, delete 는 조건에 맞는 행이 없어서 반영된 행이 없으면 0을 리턴.
    public int insert(BuyVo vo) {
        String sql = "insert into tbl_buy(buy_idx,customId,Pcode,Quantity,buy_date) " +
                "values (buy_pk_seq.nextval, ?, ?, ?, sysdate)";
        int result=0;        
        try (Connection connection = getConnection();
                PreparedStatement pstmt = connection.prepareStatement(sql);) {

            pstmt.setInt(1, vo.getBuyIdx());
            pstmt.setString(2, vo.getCustomid());
            pstmt.setString(3, vo.getPcode());
            pstmt.setInt(4, vo.getQuantity());

            result=pstmt.executeUpdate();

        } catch (SQLException e) {
            //customid 와 pcode 는 참조테이블에 존재하는 값이 아니면 무결성 위반 오류
            System.out.println("구매하기 실행 예외 발생 : " + e.getMessage());
        } // close는 자동으로 합니다. finally 없음
        return result;
    }

    public int delete(int Buyidx) {
        int result = 0;
        String sql = "delete from tbl_custom where buy_idx = ?";
        try (Connection connection = getConnection();
                PreparedStatement pstmt = connection.prepareStatement(sql);) {
            pstmt.setInt(1, Buyidx);
            result = pstmt.executeUpdate();
        } catch (SQLException e) {
            //buy_idx 컬럼에 없는 값이면 오류는 아니고 update 반영한 행의 개수가 0입니다
            System.out.println("구매취소 실행 예외 발생 : " + e.getMessage());
        } // close는 자동으로 합니다. finally 없음
        return result;
    }

    public int update(Map<String, Integer> arg) {
        int result = 0;
        String sql = "update tbl_buy set Quantity = ?  where buy_idx = ?";
        try (Connection connection = getConnection();
            PreparedStatement pstmt = connection.prepareStatement(sql);) {
            pstmt.setInt(1, arg.get("Quantity"));
            pstmt.setInt(2, arg.get("buy_idx"));
            result = pstmt.executeUpdate();
            //buy_idx 컬럼에 없는 값이면 오류는 아니고 update 반영한 행의 개수가 0입니다.
        } catch (SQLException e) {
            System.out.println("수량 변경 실행 예외 발생 : " + e.getMessage());
        } // close는 자동으로 합니다. finally 없음
        return result;
    }

    // MyPage 기능
    public List<CustomerBuyVo> selectCustomerBuyList(String customid) {
        List<CustomerBuyVo> list = new ArrayList<>();
        String sql = "SELECT BUY_IDX , tb.PCODE , PNAME , PRICE , QUANTITY , BUY_DATE \r\n" +
                "FROM TBL_BUY tb \r\n" +
                "JOIN TBL_PRODUCT tp \r\n" +
                "ON tb.PCODE = tp.PCODE \r\n" +
                "WHERE tb.CUSTOMID  =? " +
                "ORDER BY BUY_DATE DESC ";

        try (Connection conn = getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, customid);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                CustomerBuyVo vo = new CustomerBuyVo(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getTimestamp(6));
                list.add(vo);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return list;
    }

    public void insert(String customerID, String pCODE, int pRICE) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insert'");
    }
}