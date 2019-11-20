package com.com.thinkinginjava10;

/**
 * Created by xuxi on 2019/11/20.
 */

/**
 * 在这个匿名内部类中，使用了默认的构造器来生成Contents。下面的代码展示的是，如果
 * 你的基类需要一个有参数的构造器，应该怎么办：
 */
public class Parcel8 {
    /**
     * 只需简单地传递合适的参数给基类的构造器即可，这
     * @param x
     * @return
     */
    public Wrapping wrapping(int x){
        return new Wrapping(x){
            public int value(){
                return super.value() * 47;
            }
        };
    }

    public static void main(String[] args) {
        Parcel8 p = new Parcel8();
        Wrapping w = p.wrapping(10);
    }

}
