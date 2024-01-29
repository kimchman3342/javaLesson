package jdbc.day1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertDMLTest {
    public static void main(String[] args) {
        Connection conn = OracleConnectionUtil.getConnection();
        if (conn != null) System.out.println("데이터베이스 연결 성공!!");

        String sql = "insert into tbl_custom(custom_id,name,email,age,reg_date)"
                     + "values ('nayeon22','박나연2','na2@gmail.com',27,sysdate)"; 
            
            try (
            // auto close 위한  try 형식 - pstmt.close() 필요하므로  try- with -resources 사용
            PreparedStatement pstmt = conn.prepareStatement(sql)
        ){
                // pstmt.execute();        // sql 실행 메소드
                pstmt.executeUpdate();      // 리턴 값 int는 반영된 행의 개수를 리턴. 
            
            } catch (SQLException e) {
            System.out.println("SQL 실행 예외 발생 : " + e.getMessage());
        }finally {
        OracleConnectionUtil.close(conn);
    }
  }
}