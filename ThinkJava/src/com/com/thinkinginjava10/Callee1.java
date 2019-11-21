package com.com.thinkinginjava10;

/**
 * Created by xuxi on 2019/11/21.
 */
public class Callee1 implements Incrementable {

    private int i = 0;

    @Override
    public void increment() {

        i++;
        System.out.println(i);

    }
}
