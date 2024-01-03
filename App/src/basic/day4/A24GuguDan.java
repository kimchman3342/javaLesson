package basic.day4;

public class A24GuguDan {
    public static void main(String[] args) {
        /*
         * 구구단은 반복의 반복입니다.
         * 2 * 1 ~ 9
         * 3 * 1 ~ 9
         * 4 * 1 ~ 9
         *  .
         *  .
         * 9 * 1 ~ 9
         */
        

         for(int i = 2; i <= 9; i++)
         {

            System.out.println("지금 ..." + i + " 단을 출력합니다.");
            for(int j = 1; j <= 9; j++){    //(1부터 9까지 반복)
                System.out.println(String.format("%3d x %3d = %3d", i,j,i * j));
            }
         }

    }
    
}
