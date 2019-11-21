package com.com.thinkinginjava10;

/**
 * Created by xuxi on 2019/11/21.
 */
public class Implementation1 implements Service {

    private Implementation1(){

    }

    @Override
    public void method1() {
        System.out.println("Implementation1 method1");
    }

    @Override
    public void method2() {
        System.out.println("Implementation1 method2");
    }

    public static ServiceFactory factory = new ServiceFactory() {
        @Override
        public Service getService() {
            return new Implementation1();
        }
    };

}
