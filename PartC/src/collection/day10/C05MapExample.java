package collection.day10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class C05MapExample {
    
    public static void main(String[] args) {
    
    // Map<K,V> : key 값으로 value를 가져오기. 'key'는 중복된 값을 가질 수 없습니다. key와 value 모두 순서가 없습니다. key와 value는 모든 타입 Object 입니다.
    //            맵에 입력한 순서대로 접근해야 한다면 LinkedHashMap 또는 정렬(Key 기준)된 방식으로 접근해야한다면 TreeMap
    // Map의 구성요소 : Key,Value 중에서 Key는 Set 특성을 갖고 있습니다.

    Map<String,String> map = new TreeMap<>();      //LinkedHashMap<>();       //HashMap<>();
    map.put("tw", "트와이스");
    map.put("nu", "뉴진스");
    map.put("as", "에스파");
    map.put("gr", "소녀시대");
    map.put("tw", "원더걸스");
    map.put("js", "뉴진스");
    System.out.println("map 의 크기 = " + map.size());
    System.out.println("map 에 저장된 문자열 = " + map);
    
    Scanner sc = new Scanner(System.in);

    while (true) {     
    System.out.print("찾을 값에 대한 key 입력하세요. >>> ");
    String key = sc.nextLine();
    if (key.equals("end")) // end 입력하면 while 종료  
        break;
    System.out.println("당신이 원하는 key의 값 = " + map.get(key));
    }
    
    System.out.println("\n== Iterator 반복자를 이용한 set 의 값 가져오기 ==");
    System.out.println("\t map.keyset() ? " + map.keySet());        // 맵의 key만 가져와서 set을 생성합니다.
    Iterator<String> mapIterator = map.keySet().iterator();
    int cnt =0;
    while(mapIterator.hasNext()) {
        String temp =mapIterator.next();        // 반복자가 가져온 값은 key 입니다.
        System.out.println(String.format("count = %d , key = %s , value = %s", cnt++, 
                                                                                        temp,  //key 
                                                                                        map.get(temp) //value
                                                                                        ));
    }
    System.out.println("\n== for 반복자로 출력하기 ==");
    cnt = 0;
    for(String key : map.keySet())
    System.out.println(String.format("count = %d , key = %s , value = %s",       cnt++, 
                                                                                         key, //key 
                                                                                        map.get(key) //value
                                                                                        ));
    System.out.println();
    System.out.println("map.values() ? "+map.values());
    System.out.println("map.containsKey(\"tt\") ? " + map.containsKey("tt"));
    System.out.println("map.containsKey(\"js\") ? " + map.containsKey("js"));
    System.out.println("map.containsValue(\"에스파\") ? " + map.containsValue("에스파"));
    System.out.println("map.containsValue(\"잇지\") ? " + map.containsValue("잇지"));
  }
    
}
