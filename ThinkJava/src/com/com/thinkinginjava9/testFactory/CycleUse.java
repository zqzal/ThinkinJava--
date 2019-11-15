package com.com.thinkinginjava9.testFactory;

/**
 * Created by xuxi on 2019/11/15.
 */
public class CycleUse {

    public static void getSpeed(CycleFactory factory){
        Cycle c = factory.getCycle();

        System.out.println(c.getClass().getName() + "最高速度:" + c.speed());
    }

    public static void main(String[] args) {
        getSpeed(new BicycleFactory());
        getSpeed(new TricycleFactory());
        getSpeed(new UniCycleFactory());
    }


}
