package basic.day2;

public class A08PreViewTest {
    public static void main(String[] args) {
        
        char start = 'A'; //65

        // 반복명령 while 맛보기
        while(start <='Z'){
            System.out.print(start++); //91
        }
        System.out.println();   //91부터 시작
        while (start>'A') {     //65
            System.out.print(--start);  //90부터 시작해서 60으로 끝남
            
        }
    }
    
}
