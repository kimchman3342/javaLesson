package basic.day3;

public class A14MaximinValue {
    public static void main(String[] args) {
        int n1 = 40;
        int n2 = 36;
        int n3 = 50;
        int max;

        if (n1>n2){
            max = n1;
        }else {
            max = n2;
        }

        if (max<n3){
            max = n3;
            System.out.println("max는 " + max);

        n1 = 99; n2 = 88; n3 = 77;
        System.out.println(" :: 조건삼항연산으로 다시 구해보기 ::");
        max = 0;
        max = (n1>n2? n1:n2);
        max = (max<n3? n3:max);
        System.out.println("n1: " + n1 + "  n2: " + n2 + "  n3: " + n3);
        System.out.println("max = " + max);
        }



    }

}
