package basic.day5;

public class A29ArrayVarTest {
    public static void main(String[] args) {
    int[] iArray = { 1, 2, 3, 4, 5 };
    double[] dArray = new double[5];
    char[] cArray = new char[5];
    cArray[0] = 'j';        
    cArray[1] = 'a';       
    cArray[2] = 'v';       
    cArray[3] = 'a';       
    cArray[4] = '!';
    
    System.out.print("\n1.  ");
    System.out.println(iArray);
    System.out.print("\n2.  ");
    System.out.println(dArray);
    System.out.print("\n3.  ");
    System.out.println(cArray);

    int[] temp;
    temp = iArray;
    System.out.print("\n4.  ");
    System.out.println(temp);
    
    }
    
}
