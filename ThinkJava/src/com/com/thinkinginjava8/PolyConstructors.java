package com.com.thinkinginjava8;

/**
 * 构造器内部的多态方法的行为
 *    构造器调用的层次结构带来了一个有趣的两难问题。如果在一个构造器的内部调用正在构造
 * 的对象的某个动态绑定方法，那会发生什么情况呢？
 *   在一般的方法内部，动态绑定的调用是在运行时才决定的，因为对象无法知道它是属于方法所
 * 在的那个类，还是属于那个类的导出类。
 *   如果要调用构造器内部的一个动态绑定方法，就要用到那个方法的被覆盖后的定义。然而，这
 * 个调用的效果可能相当难于预料，因为被覆盖的方法在对象被完全构造之前就会被调用。这可能
 * 会造成一些难于发现的隐藏错误。
 *   从概念上讲，构造器的工作实际上是创建对象（这并不是一件平常的工作）。在任何构造器内
 * 部，整个对象可能只是部分形成————我们只知道基类对象已经进行初始化。如果构造器只是在构
 * 造对象过程中的一个步骤，并且该对象所属的类是从这个构造器所属的类导出的，那么导出部分在
 * 当前构造器正在被调用的时刻仍旧是没有初始化的。然而，一个动态绑定的方法调用却会向外深入
 * 到继承层次结构内部，它可以调用导出类里的方法。如果我们是在构造器内部这样做，那么就可能
 * 会调用某个方法，而这个方法所操作的成员可能还未进行初始化————这肯定会招致灾难。
 */
/**
 * Created by xuxi on 2019/3/11.
 */

class Glyph{
    void draw(){
        System.out.println("Glyph.draw()");
    }
    Glyph(){
        System.out.println("Glyph() before draw()");
        draw();
        System.out.println("Glyph() afert draw()");
    }
}

class RoundGlyph extends Glyph{
    private int radius = 1;
    RoundGlyph(int r){
        radius = r;
        System.out.println("RoundGlyph.RoundGlyph().radius = " + radius);
    }
    void draw(){
        System.out.println("RoundGlyph.draw().radius = " + radius);
    }
}

public class PolyConstructors {
    public static void main(String[] args) {
        new RoundGlyph(5);
    }
}
/**
 * Glyph.draw()方法设计为将要覆盖，这种覆盖是在RoundGlyph中发生的。但是Glyph
 */
