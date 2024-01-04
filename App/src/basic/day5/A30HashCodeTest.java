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
        System.out.println("-----------------------------------------------------");


        System.out.println("\n5. String 배열 message의 해시코드 값 : " + message.hashCode());
        message = message + "~Good";
        System.out.println("\n6. message를 변경한 후 해시코드 값 : " + message.hashCode());
        System.out.println("\n결론 : 문자열 String은 내용이 변경되면 메모리의 위치가 바뀝니다.");
    }
    
}

/*  
 * 객체란 ? 여러 종류의 데이터가 모여있는 데이터 덩어리.(기본형은 데이터의 최소단위)
 * 객체는 참조형 변수를 사용합니다. (변수가 주소를 저장한다)
 * 객체를 메모리에 저장했어요 ----> 초기에 저장한 데이터를 바꿀 수 있다.(배열) : 가변객체
 *                          ----> 초기에 저장한 데이터를 바꿀 수 없다.(String) : 불변객체
 * 
 */