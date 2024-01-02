package basic.day3;

public class A15MinValue {
    public static void main(String[] args) {
        int n1 = 40; int n2 = 36; int n3 = 50;
        int min;

        if (n1>n2){
            min = n2;
        }else {
            min = n1;
        }

        if (min>n3){
            min = n3;
        }
            System.out.println("min은 " + min);

        n1 = 99; n2 = 88; n3 = 77;
        System.out.println(" :: 조건삼항연산으로 다시 구해보기 ::");
        min = 0;
        min = (n1<n2? n1:n2);
        min = (min>n3? n3:min);
        System.out.println("n1: " + n1 + "  n2: " + n2 + "  n3: " + n3);
        System.out.println("min = " + min);
        

        
    }

}
