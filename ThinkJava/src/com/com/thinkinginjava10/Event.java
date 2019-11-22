package com.com.thinkinginjava10;

/**
 * Created by xuxi on 2019/11/22.
 */
public abstract class Event {
    private long eventTime; //活动时间
    protected final long delayTime; //延迟时间

    protected Event(long delayTime) {
        this.delayTime = delayTime;
        start();
    }

    public void start(){ //纳米时间
        eventTime = System.nanoTime() + delayTime;
    }

    public boolean ready(){
        return System.nanoTime() >= eventTime;
    }

    public abstract void action();

}
