package com.com.thinkinginjava9;

/**
 * Created by xuxi on 2019/11/12.
 */
public class Adventure {
    public static void t(CanFight x){
        x.fight();
    }

    public static void u(CanSwim x){
        x.swim();
    }

    public static void v(CanFly x){
        x.fly();
    }

    public static void w(ActionCharacter x){
        x.fight();
    }

    public static void main(String[] args) {
        Hero h = new Hero();
//        Adventure.t(h);
//        Adventure.u(h);
//        Adventure.v(h);
//        Adventure.w(h);
        t(h);
        u(h);
        v(h);
        w(h);
    }
}
