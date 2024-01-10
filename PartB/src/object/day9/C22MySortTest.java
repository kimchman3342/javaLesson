package object.day9;

import java.util.Arrays;

public class C22MySortTest {
    public static void main(String[] args) {
        int[] numbers = { 67, 34, 65, 89, 54};
        System.out.println("\n초기 numbers : " + Arrays.toString(numbers) + "\n");
        for(int i = 0; i < numbers.length-1; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                // 비교 조건과 맞지 않으면 numbers[i] 와 numbers[j]를 교환하기
                if (numbers[i]>numbers[j]) {    // i가 크면 자리를 바꿔라.
                    int temp = numbers[j];  // 최종적으로 앉아있는 사람
                    numbers[j] = numbers[i];
                    numbers[i] = temp;

                    System.out.println(String.format("중간 상태 : i = %d, j = %d 배열 : %s", i,j,Arrays.toString(numbers)));

                }
            }
        }
        System.out.println("\n-----------------------------------------");
        System.out.println("오름차순 정렬 후 numbers : " + Arrays.toString(numbers));
        System.out.println("-----------------------------------------\n");

        for(int i = 0; i < numbers.length-1; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                // 비교 조건과 맞지 않으면 numbers[i] 와 numbers[j]를 교환하기
                if (numbers[i]<numbers[j]) {    // i가 크면 자리를 바꿔라.
                    int temp = numbers[j];  // 최종적으로 앉아있는 사람
                    numbers[j] = numbers[i];
                    numbers[i] = temp;

                    System.out.println(String.format("중간 상태 : i = %d, j = %d 배열 : %s", i,j,Arrays.toString(numbers)));
                }
            }
        }
        System.out.println("\n-----------------------------------------");
        System.out.println("내림차순 정렬 후 numbers : " + Arrays.toString(numbers));
        System.out.println("-----------------------------------------\n");

    }
}
