package object.day5;

public class B03ScoreMain {
    public static void main(String[] args) {
        
    // re : 객체 이름,  na = name , gr = grade, ju = jumsues 

        Score momo = new Score();
        Score dahyun = new Score();
        Score nayeon = new Score();
        Score zzui = new Score();

           
        
        
        // 학생 4명의 성적을 저장해보세요.
        momo.setName("모모");
        momo.setGrade(1);
        int[] momoGrade1 = {70,80,90};
        momo.setjumsues(momoGrade1);
        momo.printScore();
      
        
        
        dahyun.setName("다현");
        dahyun.setGrade(1);
        int[] dahyunGrade1 = {75,85,95};
        dahyun.setjumsues(dahyunGrade1);
        dahyun.printScore();
        
        
        nayeon.setName("나연");
        nayeon.setGrade(2);
        int[] nayeonGrade1 = {55,80,75,65};
        nayeon.setjumsues(nayeonGrade1);
        nayeon.printScore();
       
        zzui.setName("쯔위");
        zzui.setGrade(2);
        int[] zzuiGrade1 = {95,100,85,75};
        zzui.setjumsues(zzuiGrade1);
        zzui.printScore();
        
        System.out.println("\n\n점수 결과 >>>>>>>>>>");
        
        System.out.println("\n모모의 합계점수 : " + momo.sum() + "\n모모의 평균 : " + momo.averave() + "\n\n다현의 합계점수" + dahyun.sum() + "\n다현의 평균 : " + dahyun.averave() + "\n\n나연의 합계점수 : " + nayeon.sum() + "\n나연의 평균 : " + nayeon.averave() + "\n\n쯔위의 합계점수" +  zzui.sum() + "\n쯔위의 평균 : " + zzui.averave() + "\n" );
        
        
        
       
    
        // 1학년 2명(모모,다현) 3과목   2학년 2명(나연,쯔위) 4과목
    }
    
}
