package com.com.thinkinginjava10;

/**
 * Created by xuxi on 2019/11/21.
 */
public class Factories {

    public static void serviceConsumer(ServiceFactory fact){
        Service s = fact.getService();
        s.method1();
        s.method2();
    }

    public static void main(String[] args) {
        serviceConsumer(Implementation1.factory);
        serviceConsumer(Implementation2.factory);
    }
}
