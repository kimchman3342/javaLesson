package object.day9;

import java.util.Arrays;

public class C24MemeberCompareTest {
    
    // Memeber 객체를 비교하고 Memeber 배열 정렬도 할 수 있습니다. 
    public static void main(String[] args) {
        Memeber momo = new Memeber("momoo", 23);
        Memeber nana = new Memeber("nana", 20);

        System.out.println("모모와 나나를 비교(나이 기준) : ");
        System.out.println("\t" + momo.compareTo(nana) + " -> 양수면 momoo가 nana보다 나이가 많습니다.");

        Memeber dahy = new Memeber("dahyeon", 21);
        Memeber sana = new Memeber("sana", 22);
        
        
        
        Memeber[] memebers= new Memeber[4];
        memebers[0] = momo;     
        memebers[1] = nana;     
        memebers[2] = dahy;     
        memebers[3] = sana;
        
        System.out.println("members 배열 : " + Arrays.toString(memebers));
        System.out.println("정렬 후 members 배열 : " + Arrays.toString(memebers));
        
    }
    
}
