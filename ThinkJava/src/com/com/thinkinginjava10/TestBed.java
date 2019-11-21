package com.com.thinkinginjava10;

/**
 * Created by xuxi on 2019/11/21.
 */
public class TestBed {

    public void f(){
        System.out.println("f()");
    }

    public static class Tester{

        public static void main(String[] args) {
            TestBed t = new TestBed();
            t.f();
        }

    }
}
