package com.com.thinkinginjava10;

/**
 * Created by xuxi on 2019/11/21.
 */
public class MultiImplementation {
    static void takesD(D d){

    }

    static void takesE(E e){

    }

    public static void main(String[] args) {
        Z z = new Z();
        takesD(z);
        takesE(z.makeE());
    }

}
