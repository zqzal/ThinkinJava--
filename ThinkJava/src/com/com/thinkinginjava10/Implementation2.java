package com.com.thinkinginjava10;

/**
 * Created by xuxi on 2019/11/21.
 */
public class Implementation2 implements Service {

    private Implementation2(){

    }

    @Override
    public void method1() {
        System.out.println("Implementation2 mehtod1");
    }

    @Override
    public void method2() {
        System.out.println("Implementation2 method2");
    }

    public static ServiceFactory factory = new ServiceFactory() {
        @Override
        public Service getService() {
            return new Implementation2();
        }
    };
}
