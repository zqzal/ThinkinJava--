package com.com.thinkinginjava10;

/**
 * Created by xuxi on 2019/11/15.
 */

/***
 * 可以将一个类的定义放在另一个类的定义内部，这就是内部类
 * 内部类和与组合是完全不同的概念，这一点很重要
 */
public class Parcel1 {

    class Contents{
        private int i = 11;

        public int value(){
            return i;
        }
    }

    class Destination{
        private String label;
        Destination(String whereTo){
            label = whereTo;
        }
        String readlabe(){
            return label;
        }
    }

    public void ship(String dest){
        Contents c = new Contents();
        Destination d = new Destination(dest);
        System.out.println(d.readlabe());
    }

    public static void main(String[] args) {
        Parcel1 p = new Parcel1();
        p.ship("Tasmaina");
        /**
         * 当我们在ship()方法里面使用内部类的时候，与使用普通类没什么不同。在这里，实际的区别只是内部类的名字是
         * 嵌套在Parcel1里面的。不过你将会看到，这并不是唯一的区别。
         * 更典型的情况是，外部类将有一个方法，该方法返回一个指向内部类的引用，就像在to()和contend()方法中看到的那样
         */
    }
}
