package com.com.thinkinginjava8;

import com.sun.tools.corba.se.idl.constExpr.Not;

/**
 * Created by xuxi on 2019/3/4.
 */

/**
 * 这样做行的通，但有一个主要特点：必须为添加的每一个新Instrument类编写特定类型的方法。
 * 这意味着在开始时需要更多的编程，这也意味着如果以后想添加tune()的新方法，或者添加自
 * Instrument导出的新类，仍需要做大量的工作。此外，如果我们忘记重载某个方法，编译器不会
 * 返回任何错误信息，这样关于类型的整个处理过程变得难以操纵。
 * 如果我们只写这样一个简单方法，它仅接收基类作为参数，而不是那些特殊的导出类。这样做情况
 * 会变的更好吗？也就是说，如果我们不管导出类的存在，编写的代码只是与基类打交道，会不会更
 * 好呢？
 * 这正是多态所允许的。然而，大多数程序员具有面向过程程序设计的背景，对多态的运作方式可能
 * 会有一点的疑惑。
 */
public class Music2 {
    public static void tune(Wind i){
        i.play(Note.MIDDLE_C);
    }
    public static void tune(Stringed i){
        i.play(Note.MIDDLE_C);
    }
    public static void tune(Brass i){
        i.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind flute = new Wind();
        Stringed violin = new Stringed();
        Brass frenchHorn = new Brass();
        tune(flute);
        tune(violin);
        tune(frenchHorn);
    }
}
