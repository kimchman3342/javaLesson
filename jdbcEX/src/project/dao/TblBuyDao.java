package project.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import project.vo.BuyVo;
import project.vo.CustomerBuyVo;
import project.vo.CustomerVo;



public class TblBuyDao {
    
    public static final String URL ="jdbc:oracle:thin:@//localhost:1521/xe";
    public static final String USERNAME = "c##idev";
    private static final String PASSWORD = "1234";

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
    //구매하기
    public void insert(BuyVo vo){
        // 할일1 : SQL 작성하기 (매개변수 표시 정확히 합시다.)
        String sql="INSERT INTO TBL_BUY \r\n" + 
                "VALUES (buy_pk_seq.nextval, ?,?,?,sysdate)";
        try (Connection connection = getConnection();       //auto close
            PreparedStatement pstmt = connection.prepareStatement(sql);)
            {   
                //할일2 : 매개변수 바인딩 (매개변수 타입에 맞는 메소드를 실행합시다.)
               pstmt.setString(1, vo.getCustomid());
               pstmt.setString(2, vo.getPcode());
               pstmt.setInt(3, vo.getQuantity());
                pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("join 실행 예외 발생 : " + e.getMessage());
        }//close는 자동으로 합니다. finally 없음
    }

    // 구매 수량 수정 - PK는 행 식별합니다. 특정 행을 수정하려면 where 조건컬럼은 buy_idx(PK) 
    public void modify(BuyVo vo) {

        String sql=  "UPDATE tbl_buy " + 
                "SET QUANTITY = ? " + 
                "WHERE BUY_IDX = ?";
        try (Connection connection = getConnection();       //auto close
            PreparedStatement pstmt = connection.prepareStatement(sql);)
            {   //매개변수 바인딩
                pstmt.setInt(1, vo.getQuantity());
                pstmt.setInt(1, vo.getBuyIdx());
                pstmt.executeUpdate();          //실행
        } catch (SQLException e) {
            System.out.println("join 실행 예외 발생 : " + e.getMessage());
        }
    }
    //구매 취소 - PK는 행 식별합니다. 특정 행을 삭제하려면 where 조건컬럼은 buy_idx(PK) 
    public void delete(int buyIdx) {

        String sql=  "DELETE FROM tbl_buy \r\n" + //
                "WHERE BUY_IDX=?";
        try (
            Connection connection = getConnection();       //auto close
            PreparedStatement pstmt = connection.prepareStatement(sql);
        )
            {   
                //매개변수 바인딩
                pstmt.setInt(1, buyIdx);
                pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("join 실행 예외 발생 : " + e.getMessage());
        }
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

    
 }
