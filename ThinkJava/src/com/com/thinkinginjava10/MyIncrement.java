package com.com.thinkinginjava10;

/**
 * Created by xuxi on 2019/11/21.
 */
public class MyIncrement {

    public void increment(){
        System.out.println("other operation");
    }

    static void f(MyIncrement mi){
        mi.increment();
    }

}
