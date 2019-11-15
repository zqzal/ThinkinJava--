package com.com.thinkinginjava9.testFactory;

/**
 * Created by xuxi on 2019/11/15.
 */
public class BicycleFactory implements CycleFactory {
    @Override
    public Cycle getCycle() {
        return new Bicycle();
    }
}
