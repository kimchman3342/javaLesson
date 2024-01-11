package collection.day10;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class C04SetExample {
    public static void main(String[] args) {
        
        Set<String> set = new HashSet<>();
        set.add("트와이스");    
        set.add("잇지");
        set.add("아이브");
        set.add("원더걸스");
        set.add("레드벨벳");
        set.add("뉴진스");  

        System.out.println("~~~~~~~HashSet~~~~~~~");    // 무작위 추출(랜덤방식은 아님)
        System.out.println("set : " + set);
        System.out.println("set size : " + set.size());

        System.out.println("\tset 데이터 요소 한 개씩 접근하기");
        for (String temp : set) {
            System.out.println("set 요소 = " + temp );
        }
        
        // set 인덱스 없습니다.
        //            for(int i = 0; i < set.size(); i++) 와 같은 방식은 불가.
        
        
        Set<String> set2 = new LinkedHashSet<>();
        // 본래의 set은 순서가 없으므로 무작위 접근
        // Linked 는 다음 입력 데이터의 참조값을 저장하여 입력 순서대로 접근하도록 합니다.
        set2.add("트와이스");    
        set2.add("잇지");
        set2.add("아이브");
        set2.add("원더걸스");
        set2.add("레드벨벳");
        set2.add("뉴진스");  
        
        System.out.println("~~~~~~~LinkedHashSet~~~~~~~");
        System.out.println("set2 : " + set2);
        System.out.println("set2 size : " + set2.size());
        
        Set<String> set3 = new TreeSet<>();
        // 이진트리 알고리즘을 이용하여 데이터를 정렬된 방식으로 접근합니다.
         

        set3.add("트와이스");    
        set3.add("잇지");
        set3.add("아이브");
        set3.add("원더걸스");
        set3.add("레드벨벳");
        set3.add("뉴진스");  
        
        System.out.println("~~~~~~~LinkedHashSet~~~~~~~");
        System.out.println("set3 : " + set3);
        System.out.println("set3 size : " + set3.size());
    }
    
}
/* 
 * set : 수학시간에 배운 집합
 * 순서(인덱스)가 없습니다.
 * 중복값이 없습니다.
 * Map의 구성요소 : Key,Value 중에서 Key는 Set 특성을 갖고 있습니다.
 */
