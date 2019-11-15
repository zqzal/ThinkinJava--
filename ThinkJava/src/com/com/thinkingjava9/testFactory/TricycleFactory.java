package com.com.thinkingjava9.testFactory;

/**
 * Created by xuxi on 2019/11/15.
 */
public class TricycleFactory implements CycleFactory {
    @Override
    public Cycle getCycle() {
        return new Tricycle();
    }
}
