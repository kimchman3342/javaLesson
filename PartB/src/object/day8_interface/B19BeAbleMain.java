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
        for(BeAble able : beAbles)
            System.out.println(able.beAble());
            if() {

                // 다운 캐스팅
                System.out.println("계산해 주세요. - " + able.);
            }
        Thinkable[] thinks = new Thinkable[2];


    }
    
}
