package basic.day4;

public class A26Test25 {
    public static void main(String[] args) {
        // A25클래스에 만든 메소드를 사용할 수 있습니다.
        int result = A25MySampleMethod.sumMToN(10,13);
        System.out.println(result);

        // 메소드가 private로 정의되면 다른 클래스에서 사용 못합니다.
        // A25MySampleMethod.checkJumsu(67);   
    }
    
}
