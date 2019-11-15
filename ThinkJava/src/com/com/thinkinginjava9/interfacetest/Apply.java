package com.com.thinkinginjava9.interfacetest;

/**
 * Created by xuxi on 2019/11/8.
 */
public class Apply {

    public static void process(Processor p,Object s){
        System.out.println("Using Porcessor " + p.name());
        System.out.println(p.process(s));
    }


}
