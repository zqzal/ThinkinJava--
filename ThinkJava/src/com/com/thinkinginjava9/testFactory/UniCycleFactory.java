package com.com.thinkinginjava9.testFactory;

/**
 * Created by xuxi on 2019/11/15.
 */
public class UniCycleFactory implements CycleFactory {
    @Override
    public Cycle getCycle() {
        return new UniCycle();
    }
}
