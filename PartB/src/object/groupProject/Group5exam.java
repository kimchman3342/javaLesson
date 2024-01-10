package object.groupProject;

import java.util.Arrays;
import java.util.Comparator;

import object.day9.Student;

public class Group5exam {
    public static void main(String[] args) {
    
    // 1. 빈칸을 채우시오. (한글사용)
    /* @FunctionalInterface는 자바의 OOOOO 이며, 
      ooo ooooo를 정의할 때 사용된다. 
    */

    // 2.  OX 퀴즈
    
    /* 1) Comparator는 <> 제너릭타입에 기본형을 사용할 수 있다. 정답 X
       2) '함수'의 형식으로 표현되는 인터페이스는 추상메소드가 여러 개 필요하다. 정답 X
       3) 메소드 정렬 알고리즘은 비교결과 리턴 값이 양수이면 교환한다. 정답 O 
     */ 
       
       
       
       
    
    // 3. 밑줄 친 빈 칸에 공통으로 들어갈 단어를 고르시오. 또한 해당 결과도 쓰시오.(2개 모두)
        
        /* String na ="hi";   String you = "bye";	
        System.out.println(na._______(you));    			
        System.out.println(you._______(na));		 
        1)CompareTo
        2)compareTo
        3)Compareto
        4)compareToo 

        정답 : 2)compareTo , 6, -6
                
    */
    
    // 4. 다음 주어진 배열을 sort와 Comparator를 사용해 내림차순으로 출력하시오. 
    Integer[] numbers = { 4, 1, 2, 5, 3};   
    
    
    
    
    
    // 5. 아래 코드를 람다식으로 바꿔쓰시오. (Student.java 클래스 필요)

      /*   Student[] students = new Student[4];
        students[0] = new Student("김태완",30);
        students[1] = new Student("한진만",23);
        students[2] = new Student("이광원",31);
        students[3] = new Student("황병훈",29);

        Comparator<Student> ageDecending = new Comparator<Student>() {
            
            @Override
            public int compare(Student o1, Student o2) {
                
                return o2.getAge() - o1.getAge();       
            }

        };
        Arrays.sort(students,ageDecending);
        System.out.println(Arrays.toString(students)); 

 */
    }
}

    
    
    
