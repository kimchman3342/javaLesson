package collection.day10;

import java.util.ArrayList;
import java.util.List;

public class C02MemeberList {
    public static void main(String[] args) {
        List<Memeber> list = new ArrayList<>();

        list.add(new Memeber("momo", 23));
        list.add(new Memeber("nana", 22));
        list.add(new Memeber("momo", 25));
        list.add(new Memeber("dahy", 21));
        list.add(new Memeber("sana", 26));

        System.out.println("현재 리스트 내용 : " + list + " 크기 : " + list.size());
        list.remove(new Memeber("momo", 23));
        System.out.println("삭제 후 리스트 내용 : " + list + " 크기 : " + list.size());
        
        System.out.println("특정 멤버 조회 : " + list.indexOf(new Memeber("mono",23))); //-1
        
        // new Member("momo", 23) 에서 인스턴스 필드 값이 같다고 동일한 객체가 아닙니다.
        // remove, indexOf 등의 메소드는 동일한 객체를 찾아서 삭제하거나 조회합니다.
        // 참고 : String은 문자열 리터럴이 같으면 주소가 같습니다.
        // 일반적으로 만들어진 클래스는 hashcode 로 메모리의 참조 위치가 결정됩니다.
        //                            인스턴스 필드 내용이 같으면 hashcode를 동일하게 만들도록 재정의합니다.

        System.out.println(" ");
    }
    
}
