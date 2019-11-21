package com.com.thinkinginjava10;

/**
 * Created by xuxi on 2019/11/21.
 */
public class MultiNestingAccess {
    public static void main(String[] args) {
        MNA mna = new MNA();
        MNA.A mnaa = mna.new A();
        MNA.A.B mnaab = mnaa.new B();
        mnaab.h();
        /**
         * 可以看到在MNA.A.B中，调用方法g()和f()不需要任何条件（既是它们被定义为private）
         * 这个例子同时展示了如何从不同的类里创建多层嵌套的内部类对象的基本语法。".new"语法能
         * 产生正确的作用域，所以不必在调用构造器时限定类名。
         */
    }
}
