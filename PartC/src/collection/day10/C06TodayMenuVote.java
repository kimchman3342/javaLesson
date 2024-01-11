package collection.day10;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry; // Map 안에서 구성요소로 정의된 Entry 내부 클래스


public class C06TodayMenuVote {
    // Map 연습
    public static void main(String[] args) {
        
        String menu = "치킨, 스파게티, 곱창, 불고기, 삼겹살";
        Map<String,Integer> map = new LinkedHashMap<>();
        map.put("치킨", 0); 
        map.put("스파게티", 0); 
        map.put("곱창", 0); 
        map.put("불고기", 0); 
        map.put("삼겹살", 0);
        
        System.out.println("오늘의 메뉴 투표합니다.");
        System.out.println("메뉴 : " + menu);

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println(" 메뉴 이름 입력 >>>");
            String key = sc.nextLine();
            if(key.equals("end")) break;
            if(map.containsKey(key)) {
                int value = map.get(key);
                map.put(key,++value);

            } else{
                System.out.println("투표에 없는 메뉴입니다. 투표 메뉴 중에 골라주세요.");
                map.put(key, 1);
                menu += "," + key;
            }

        }
        System.out.println("투표가 종료되었습니다.");
        System.out.println(map); 
        System.out.println(Collections.max(map.keySet()));
        System.out.println(Collections.max(map.values()));
        
        Comparator<Entry<String,Integer>> comparator = new Comparator<Entry<String,Integer>>() {
            @Override
            public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
                return o1.getValue() - o2.getValue();
            }
        };
        

        Entry<String,Integer> maEntry = Collections.max(map.entrySet(),comparator);
        System.out.println("최다 득표 결과");
        System.out.println("\t 메뉴 이름 : " + maEntry.getKey());
        System.out.println("\t 메뉴 이름 : " + maEntry.getValue());

       /*  // 가장 많이 투표된 메뉴 찾기
        int maxMenu = Collections.max(map.values()); // 투표 수 중 가장 큰 값 찾기

        System.out.println("가장 많이 투표된 메뉴:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxMenu) {
                System.out.println(entry.getKey());
            }
        } */
    }
}
