package com.com.thinkinginjava9;

/**
 * Created by xuxi on 2019/10/29.
 */

import com.com.thinkinginjava8.Note;

/**
 * 第9章  接口
 *
 * 接口和内部类为我们提供了一种将接口和实现分离的更加结构化的方法。
 *
 * 这种机制在编程语言中并不通用。例如，C++对这些概念只有间接的支持。在Java中存在语言关键子
 * 这个事实表明人们认为这些思想是很重要的，以至于要提供对它们的直接支持。
 *
 * 首先，我们将学习抽象类，它是普通的类与接口之间的一种中庸之道。尽管在构建具有某些未实现方法
 * 的类时，你的第一想法可能是创建接口，但是抽象类仍旧是用于此目的的一种重要而必须的工具。因为
 * 你不可能总是使用纯接口。
 *
 * 我们创建抽象类是希望通过这个通用接口操纵一系列类。因此，Instrument只是表示了一个接口，没有
 * 具体的实现内容；因此，创建一个Instrument对象没有什么意义，并且我们可能还想阻止使用者这样做。
 * 通过让Instrument中的所有方都产生错误，就可以实现这个目的。但是这样做会将错误信息延迟道运行
 * 时才获得，并且需要在客户端进行可靠、详尽的测试。所以最好是在编译时捕获这些问题。
 * 为此，Java提供了一个叫做抽象方法的机制，这中方法是不完整的；仅有声明而没有方法体。
 * abstact void f();
 */
abstract class Instrument {

    private int i;
    public abstract void play(Note n);
    public java.lang.String what(){
        return "Instrument";
    }

    public abstract void adjust();

}

class Wind extends Instrument{

    @Override
    public void play(Note n) {
        System.out.println("Wind.play()" + n);
    }

    @Override
    public String what() {
        return "wind";
    }

    @Override
    public void adjust() {

    }
}

class Percussing extends Instrument{

    @Override
    public void play(Note n) {
        System.out.println("Percussing.play()" + n);
    }

    @Override
    public String what() {
        return "Percussing";
    }

    @Override
    public void adjust() {

    }
}

class Stringed extends Instrument{

    @Override
    public void play(Note n) {
        System.out.println("Stringed.play()" + n);
    }

    @Override
    public String what() {
        return "Stringed";
    }

    @Override
    public void adjust() {

    }
}

class Brass extends Wind{
    @Override
    public void play(Note n) {
        System.out.println("Brass.play()" + n);
    }

    @Override
    public void adjust() {
        System.out.println("Barss.adjust()");
    }
}

class Woodwind extends Wind{
    @Override
    public void play(Note n) {
        System.out.println("Woodwind.play()" + n);
    }

    @Override
    public String what() {
        return "Woodwind";
    }
}

