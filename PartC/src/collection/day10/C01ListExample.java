package collection.day10;

import java.util.ArrayList;
import java.util.List;

public class C01ListExample {
    public static void main(String[] args) {
        
        List<String> strlist = new ArrayList<>();
        // List 인터페이스를 구현한 클래스가 ArrayList 입니다.

        strlist.add("트와이스");    // 인덱스 0
        strlist.add("잇지");
        strlist.add("아이브");
        strlist.add("원더걸스");
        strlist.add("레드벨벳");
        strlist.add("뉴진스");  // 인덱스 5

        System.out.println("문자열 LIST strlist size : " + strlist.size()); //? 답 : 6
        System.out.println("\n  데이터 추가");
        strlist.add("르세라핌");
        System.out.println("항목 추가 후 리스트 : " + strlist);     // ArrayList 클래스의 toString 메소드 실행

        System.out.println("\n  데이터 삭제");
        strlist.remove("원더걸스");     // remove 메소드 오버로딩
        strlist.remove(1);          // 메소드 인자 타입이 int와 String(요소의 타입) 2가지로 동작
        System.out.println("항목 삭제 후 리스트 : " + strlist); //ArrayList 클래스의 toString 메소드 실행

        // 아래 2개 메소드 비교
        System.out.println("\n  데이터 항목 변경");
        strlist.add(2, "????");
        strlist.add(2, "!!!!");
        System.out.println("항목 변경 후 리스트 : " + strlist);
    }
    
}
/* 
 * List 구현 클래스 특징 : 배열처럼 인덱스를 갖습니다. 인덱스가 있다는 것은 데이터의 순서가 있다는 의미. 
 * 배열에 없는 '삭제' 기능이 있습니다. 그 외에도 조회와 관련 기능 등 조작과 조회를 다양하게 할 수 있습니다.
 */