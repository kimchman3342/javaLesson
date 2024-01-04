package object.day5;

import java.util.Arrays;

public class Score {

    private String name;    // 이름
    private int grade;      // 학년
    private int[] jumsues;  // 점수들이 저장될 배열
                            // 배열의 크기는 학년마다 다를 수 있음.



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


    //setternayeon
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

}
