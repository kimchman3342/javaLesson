package object.day5;

import java.util.Arrays;

public class Score {
    // 인스턴스 필드
    private String name;    // 이름
    private int grade;      // 학년
    private int[] jumsues;  // 점수들이 저장될 배열
                            // 배열의 크기는 학년마다 다를 수 있음.


    // 인스턴스 메소드 : 인스턴스 필드를 사용하는 처리를 합니다    (get부터 입력하면 순식간에 끝남)
    //getter
    public String getName(){
        return name;
    }
    
    public int getGrade(){
        return grade;
    }

    public int[] getjumsues() {
        return jumsues;
    }

    

    //setter
    public void setName(String na){
        name = na;
    }
    
    public void setGrade(int gr){
        grade = gr;
    }
    
    public void setjumsues(int[] ju){
        jumsues = new int[ju.length];
        for(int i = 0; i < ju.length; i++)
             jumsues[i] = ju[i];
    }

    
    // 점수의 합계를 리턴하는 sum() 메소드

    public int sum(){
       int sumJumsues = 0;
        for(int i = 0; i < jumsues.length; i++)
            sumJumsues += jumsues[i];
            return sumJumsues;     
    }
    

    // 점수의 평균 double 리턴하는 averave() 메소드

    public int averave(){
       int sumJumsues = 0;
        for(int i = 0; i < jumsues.length; i++)
            sumJumsues += jumsues[i];
            return sumJumsues/jumsues.length;     
    }
    // 모든 인스턴스 필드 값을 확인 & 출력하는 printScore()
    public void printScore(){
        System.out.println("\n이름 = " + name + ", 학년 = " + grade + ", 점수 : "+ Arrays.toString(jumsues));
    }

    /*
     * public void printScore()
     *      System.out.prinln("총점 : " + sum())
     *      System.out.prinln("평균 : " + average())
     *      System.out.prinln("과목개수 : " + jumses.length())
     * 
     */
}
