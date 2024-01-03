package basic.day4;

public class A21VariableArea {
    int number = 999;           // 1. 클래스 범위에서 사용되는 변수
    public static void main(String[] args) {
        
        int a = 23;         //2.main 메소드 범위에서 사용되는 변수

        for(int i= 0; i<10; i++){       //3. 특정 블럭 (for) 블럭 안에서 사용되는 변수 -i
            System.out.println("i="+i);
        }

        while (a == 23) {
            int count;      //3. 특정 블럭(while) 안에서 사용되는 변수 - count 
            System.out.println("a = " + a);
            count = 100;
            System.out.println("count = " + count);
            
        }
        System.out.println("a = " + a);
    }
    
}
