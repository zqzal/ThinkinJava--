package com.com.thinkinginjava10;

/**
 * Created by xuxi on 2019/11/21.
 */
public class Caller {
    private Incrementable callbackReference;
    Caller(Incrementable cbh){
        callbackReference = cbh;
    }

    void go(){
        callbackReference.increment();
    }
}
