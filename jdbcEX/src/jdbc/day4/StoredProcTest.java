package jdbc.day4;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Types;

import jdbc.day1.OracleConnectionUtil;

public class StoredProcTest {
    public static void main(String[] args) {
        exec_max_customer();
    }
    
    private static void exec_max_customer(){
        Connection connection = OracleConnectionUtil.getConnection();
        String sql = "{call max_custom(?,?)}";        
        // 프로시저 sql 형식 "{ call 프로시저 이름(?,?...) }"   매개변수는 정의된 개수만큼 ? 나열 
        try(
            CallableStatement cstmt = connection.prepareCall(sql)   
            // 프로시저 실행 및 관리 인터페이스 CallableStatement의 메소드 prepareCall로 객체 생성하기
        ) {
            // 프로시저 실행결과 OUT 파라미터 1번 인덱스의 오라클 타입 지정하기 - 고객이름
            cstmt.registerOutParameter(1, Types.VARCHAR);
            
            // 프로시저 실행결과 OUT 파라미터 2번 인덱스의 타입 지정하기 - 고객나이
            cstmt.registerOutParameter(2, Types.NUMERIC);
            cstmt.executeUpdate();  // 프로시저 실행

            // 프로시저 실행결과 OUT 파라미터 값은 cstmt 객체에 저장됩니다.
            // 쇼핑몰 관리자(일반 사용자)가 원하는 정보.
            System.out.println("구매 수량이 가장 많은 고객 정보 조회한 결과입니다.");
            // 인덱스 1번 OUT 실행 결과 값 가져오기
            System.out.println("고객 이름 : " + cstmt.getString(1));
            System.out.println("고객 나이 : " + cstmt.getInt(2));

        } catch (Exception e) {
            System.out.println("max custom 프로시저 실행 예외 : " + e.getMessage());
        }
    }
}
