package basic.day5;

public class A30HashCodeTest {
    public static void main(String[] args) {
        int[] iArray = new int[10];
        String message = "Hello~ World~~";

        //hashcode는 참조(식별) 값을 만드는 해쉬함수로 생성된 결과입니다.
        System.out.println("\n1.결과 >>> " + iArray);     //배열의 식별 값을 보여줍니다.(16진수)
        System.out.println("\n2. 결과 >>>" + iArray.hashCode());  // 해쉬코드 값을 가져옵니다.
        System.out.println("\n3. 결과 >>>" + (Integer.toHexString(iArray.hashCode()))); // 10진수를 16진수로 변환

        iArray[3] = 99;
        System.out.println("\n4. 결과 >>>" + iArray.hashCode() + "(배열 요소 값을 변경한 후 해시코드)");
        System.out.println("\n결론 : 배열 값이 변경되어도 메모리의 위치는 동일");

        System.out.println("\n String 배열 message의 해시코드 값 : " + message.hashCode());
        message = message + "~Good";
        System.out.println("\n message를 변경한 후 해시코드 값 : " + message.hashCode());
    }
    
}
