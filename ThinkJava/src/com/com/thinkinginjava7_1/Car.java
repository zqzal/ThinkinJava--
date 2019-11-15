package com.com.thinkinginjava7_1;

/**
 * Created by xuxi on 2019/2/22.
 */

/**
 * 组合和继承都允许在新的类中放置子对象，组合是显式地这样做，而继承是隐式地做。读者或许想知道二者间的区别何在，以及怎样在二者之间做出选择。
 * 组合技术通常用于想在新类中使用现有类的功能而非它的接口这种情形。即，在新类中嵌入某个对象，让其实现所需要的功能，但新类的用户看到的只是为新类所
 * 定义的接口，而非所嵌入对象的接口。为取得此效果，需要在新类中嵌入一个现有类的private对象。
 * 有时，允许类的用户直接访问新类中得的组合成分是极具意义的；也就是说，将成员对象声明为public。
 * 如果成员对象自身都隐藏了具体是实现，那么这种做法是安全的。当用户能够了解到你正在组装一组部件时，会使得端口更加易于理解。car对象即为一个很好的例子：
 */
class Engine{
    public void start(){}
    public void rev(){}
    public void stoo(){}
}

class Wheel{
    public void inflate(int psi){}
}

class Window{
    public void rollup(){}
    public void rolldown(){}
}

class Door{
    public Window window = new Window();
    public void open(){}
    public void close(){}
}

public class Car {

    public Engine engine = new Engine();
    public Wheel[] wheels = new Wheel[4];
    public Door
            left = new Door(),
            right = new Door();
    public Car(){
        for (int i = 0; i < 4; i++) {
            wheels[i] = new Wheel();
        }
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.left.window.rollup();
        car.wheels[0].inflate(10);
    }


}

/**
 * 由于这个例子中car的组合也是问题分析的一部分（而不仅仅是底层设计的一部分），所以
 * 使成员成为public将有助于客户端程序员了解怎样去使用类，而且也降低了类开发者所面临的
 * 代码复杂度。但务必要记得这仅仅是一个特例，一般情况下应该使域成为private。
 * 在继承的时候，使用某个现有类，并开发一个它的特殊版本。通常，这意味着你在使用一个通用类，
 * 并为了某种特殊需要而将其特殊化。略微思考一下就会发现，用一个"交通工具"对象来构成一部"车子"是
 * 毫无意义的，因为"车子"并不包含"交通工具"，它仅是一种交通工具（is-a关系）。"is-a"（是一个）的
 * 关系是用继承来表达的，而"has-a"（有一个）的关系则是用组合来表达的。
 */
