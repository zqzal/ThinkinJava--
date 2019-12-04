package com.com.thinkinginjava12;

/**
 * Created by xuxi on 2019/12/4.
 */
public class NeverCaught {
    static void f(){
        throw new RuntimeException("From f()");
    }
    static void g(){
        f();
    }

    public static void main(String[] args) {
        g();
    }
    //请务必记住：只能在代码中忽略RuntimeException
}
