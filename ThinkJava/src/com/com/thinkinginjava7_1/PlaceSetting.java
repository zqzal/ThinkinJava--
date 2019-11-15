package com.com.thinkinginjava7_1;

/**
 * Created by xuxi on 2019/2/22.
 */
//同时使用组合和继承是很常见的事。下例就展示了同时使用这两种技术，并配以必要的构造器初始化，来创建更加复杂的类：

class Plate{
    Plate(int i){
        System.out.println("Plate constructor");
    }
}

class DinnerPlate extends  Plate{
    DinnerPlate(int i){
        super(i);
        System.out.println("DinnerPlate constructor");
    }
}

class Utensil{
    Utensil(int i){
        System.out.println("Utensil constructor");
    }
}

class Spoon extends Utensil{
    Spoon(int i){
        super(i);
        System.out.println("Spoon constructor");
    }
}

class Fork extends Utensil{
    Fork(int i){
        super(i);
        System.out.println("Fork constructor");
    }
}

class Knife extends Utensil{
    Knife(int i){
        super(i);
        System.out.println("Knife constructor");
    }
}

//A cultural way of doing something
class Custom{
    Custom(int i){
        System.out.println("Custom constructor");
    }
}

public class PlaceSetting extends Custom{

    private Spoon sp;
    private Fork frk;
    private Knife kn;
    private DinnerPlate pl;

    public PlaceSetting(int i){
        super(i + 1);
        sp = new Spoon(i + 2);
        frk = new Fork(i + 3);
        kn = new Knife(i + 4);
        pl = new DinnerPlate(i + 5);
        System.out.println("PlaceSetting constructor");
    }

    public static void main(String[] args) {
        PlaceSetting x = new PlaceSetting(9);
    }
}
//虽然编译器强制你去初始化基类，并且要求你要在构造器起始处就要这么做，但是它并不
//监督你必须将成员对象也初始化，因此在这一点上你自己必须时刻注意。
//这些类如此清晰地分离着实使人惊讶。甚至不需要这些方法的源代码就可以复用这些代码，我们
//至多只需要倒入一个包。（对于继承和组合来说都是如此。）