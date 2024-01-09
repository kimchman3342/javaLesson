package object.day8_interface;

import object.day8_interface.beable.AI;
import object.day8_interface.beable.BeAble;
import object.day8_interface.beable.Cookable;
import object.day8_interface.beable.Human;
import object.day8_interface.beable.Dog;
import object.day8_interface.beable.Runnable;
import object.day8_interface.beable.Thinkable;

public class B19BeAbleMain {
    
    public static void main(String[] args) {
    
        Thinkable th1 = new AI();
        AI ai = (AI)th1; ai.setOp('*');

        Thinkable th2 = new Human();
        // Thinkable th3 = new Dog();

        Runnable run1 = new Human();
        Runnable run2 = new Dog();
        // Runnable run3 = new AI();

        Cookable cook = new Human();
        
        BeAble[] beAbles = new BeAble[3];
        beAbles[0] = th1;
        beAbles[1] = th2;
        beAbles[2] = run2;

        System.out.println("bealbe 테스트");
        for(BeAble able : beAbles){
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println(able.beAble());
            if(able instanceof Thinkable) {

                // 다운 캐스팅
                Thinkable temp = (Thinkable) able;
                System.out.println(able.getClass().getName() + "이 계산합니다.");
                char op = temp instanceof AI ? ((AI)temp).getOp() : '+';
                System.out.println("\t 연산 : " + op);
                System.out.println("\t 정답 : " + temp.calculate(2024, 3));
                
                System.out.println("\t계산해 주세요. - " + temp.calculate(2024, 3));
            }else {
                System.out.println(able.getClass().getName()+ "은 계산 못합니다.");
            }
        }
        Thinkable[] thinks = new Thinkable[2];


    }
    
}

