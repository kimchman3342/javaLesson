package object.test;

import object.day7.Shape;
 
public class Square extends Shape {
    // etc setter
        public void setEtc(String etc){
            this.etc = etc;     // Shape의 상속 클래스는 etc 필드 직접 사용
        }
    
    
        public void draw() {
            System.out.println("직사각형 " + this.getShapeName() + "  을 그립니다.");
        }
    //round setter
    /* public void setRound(int round){
        this.round = round;
        // Shape과 같은 패키지 아니므로 직접 사용 못함.
    } 
     */     
}       
      

 