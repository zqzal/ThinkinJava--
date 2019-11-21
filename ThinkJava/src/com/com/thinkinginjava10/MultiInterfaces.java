package com.com.thinkinginjava10;

/**
 * Created by xuxi on 2019/11/21.
 */
public class MultiInterfaces {
    static void takesA(A a){

    }

    static void takesB(B b){

    }

    public static void main(String[] args) {
        X x = new X();
        Y y = new Y();
        takesA(x);
        takesA(y);

        takesB(x);
        takesB(y.makeB());
    }

}
