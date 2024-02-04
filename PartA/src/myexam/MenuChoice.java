package myexam;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MenuChoice {
    public static void main(String[] args) {
        // 점심 메뉴 리스트 생성
        List<String> lunchMenuList = new ArrayList<>();
        lunchMenuList.add("중식");
        lunchMenuList.add("덮밥");
        lunchMenuList.add("한식");
        lunchMenuList.add("햄버거"); 
        
        // 랜덤 숫자 생성
        Random random = new Random();
        int randomIndex = random.nextInt(lunchMenuList.size());
        
        // 랜덤으로 점심 메뉴 선택
        String selectedMenu = lunchMenuList.get(randomIndex);
        
        // 선택된 메뉴 출력
        System.out.println("오늘의 점심 메뉴는 " + selectedMenu + "입니다.");
    }
}
