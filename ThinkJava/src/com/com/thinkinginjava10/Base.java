package com.com.thinkinginjava10;

/**
 * Created by xuxi on 2019/11/20.
 */
/**
 * 如果定义一个匿名内部类，并且希望它使用一个在其外部定义的对象，那么编译器会要求
 * 其参数引用是final的，就是在detination()的参数中看到的那样。如果你忘记了，将会
 * 得到一个编译时错误消息
 * 如果只是简单地给一个字段赋值，那么比例中的方法时很好的。但是，如果想做一些类似
 * 构造器的行为，该怎么办呢？在匿名类中不可能有命名构造器（因为它根本没名字！）。但
 * 通过实例初始化，就能够达到为匿名类创建一个构造器的效果，就像这样
 * 在此例中，不要求变量i 一定是final的。因为i被传递给匿名类的基类的构造器，它并不会
 * 在匿名类内部被直接使用。
 *
 */

public abstract class Base {
    public Base(int i){
        System.out.println("Base constructor ,i = " + i);
    }
    public abstract void f();
}
