package etc.day15;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class LocalDateTypeTest {
    public static void main(String[] args) {

        System.out.println("1. 현재 날짜와 시간을 구하여 출력하기");
        LocalDate currentDate = LocalDate.now();        // 객체생성 메소드 now(), new 연산을 대신함.
        System.out.println("\tLocalDate 현재 날짜 : " + currentDate);

        LocalTime currentTime = LocalTime.now(); // 10억분의 1초(ns) 까지 구해줍니다.
        System.out.println("\tLocalTime 현재 날짜 : " + currentTime);
        
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("\tLocalDateTime 현재 날짜 : " + currentDateTime);

        System.out.println("2. 특정 날짜와 시간을 지정해서 객체를 생성합니다.");
        LocalDate mybirth = LocalDate.of(2000, 10,11);
        // of 메소드 : 객체를 생성하고 값을 초기화 합니다.
        LocalTime mybirth_time = LocalTime.of(17,20);
        System.out.println("\tLocalDate.of(2000, 10,11) : " + mybirth);
        System.out.println("\tLocalTime.of(17,20) : " + mybirth_time);
        
        // java.time 패키지에 다른 클래스 테스트
        System.out.println("3. 날짜 사이의 간격 계산하기");
        System.out.println("\t 내가 태어난지 ..년 ..월 ..일이 지났습니다.");
        Period between = Period.between( mybirth, currentDate);
        System.out.println(between.getYears() + " 년");
        System.out.println(between.getMonths() + " 월");
        System.out.println(between.getDays() + " 일");

        System.out.println("4. 날짜 사이의 간격 계산하기(단위 : 년 또는 월 또는 일)");
        System.out.println("\t 내가 태어나서 ..년(개월 또는 일)이 지났습니다.");
        System.out.println(ChronoUnit.DAYS.between(mybirth, currentDate) + " 일");
        System.out.println(ChronoUnit.MONTHS.between(mybirth, currentDate) + " 개월");
        System.out.println(ChronoUnit.YEARS.between(mybirth, currentDate) + " 년");


    }
    
}
