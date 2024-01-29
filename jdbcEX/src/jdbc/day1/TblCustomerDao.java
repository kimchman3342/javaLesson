package jdbc.day1;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class TblCustomerDao {
    public static final String URL ="jdbc:oracle:thin:@//localhost:1521/xe";
    public static final String USERNAME = "c##idev";
    private static final String PASSWORD = "1234";

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }

    // 회원 가입
    public void join(CustomerVo vo){
        // 할일 1 : SQL 작성하기 (매개변수 표시 정확히 합시다.)
        String sql = "INSERT INTO tbl_custom(custom_id,name,email,age,reg_date)";    // insert
        try( Connection connection = getConnection();
            PreparedStatement pstmt = connection.prepareStatement(sql);
            ){
        // 할일 2 : 매개변수 바인딩(매개변수 타입에 맞는 메소드를 실행합시다.)
                pstmt.setString(1, vo.getCustomID());
                pstmt.setString(2, vo.getEmail());
                pstmt.setString(3, vo.getEmail());
                pstmt.setInt(4, vo.getAge());

                pstmt.executeUpdate();
            }catch (SQLException e){
                System.out.println("join 실행 예외 발생 : " + e.getMessage());
            } // finally 없음.

    }
    
    
    //회원 정보 수정
    public void modify(CustomerVo vo){
        String sql = "UPDATE TBL_CUSTOM SET EMAIL = ?, age=? WHERE CUSTOM_ID = ?";

        try (   //auto close
            Connection connection = getConnection();
            PreparedStatement pstmt = connection.prepareStatement(sql);
        ){
            //매개변수 바인딩
            pstmt.setString(1, vo.getEmail());
            pstmt.setInt(2, vo.getAge());
            pstmt.setString(3, vo.getCustomID());

            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("modify 실행 예외 발생 : "+ e.getMessage());
        }//finally 없음
    }

    // 회원 탈퇴
    public void delete(String customerID){
        
        String sql = "DELETE FROM tbl_custom WHERE custom_id = ?";
        try (
            Connection connection = getConnection();
            PreparedStatement pstmt = connection.prepareStatement(sql);
        ) {
            pstmt.setString(1, customerID);
            
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("delete 실행 예외 발생 : " + e.getMessage());
        }
    
        

    }

    // 회원 정보 조회   : select * from tbl_custom where custom_id = ?
    public CustomerVo getCustomer(String customerID){
            CustomerVo customerVo = null;
            
            String sql = "SELECT * FROM tbl_custom WHERE custom_id = ?";
            try (
                Connection connection = getConnection();
                PreparedStatement pstmt = connection.prepareStatement(sql);
            ) {
                pstmt.setString(1, customerID);
                
                return customerVo;
            } catch (SQLException e) {
                System.out.println("getCustomer 실행 예외 발생 : " + e.getMessage());
            }
            return null;
        
        
    }

   // 관리자를 위한 기능 : 모든 회원정보 조회  select * from tbl_custom
public List<CustomerVo> allCustomers() {
    
    String sql = "SELECT * FROM tbl_custom = ?";
    return null;
}


}

