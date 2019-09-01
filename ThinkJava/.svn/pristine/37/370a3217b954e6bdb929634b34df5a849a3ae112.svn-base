package com.com.thinkingjava7;

/**
 * Created by xuxi on 2019/2/21.
 */

/**
 * 本书到目前为止，已多次使用组合技术。只需将对象引用置于新类中即可。例如，假设你需要某个对象
 * ，它要具有多个String对象、几个基本类型数据，以及另一个类的对象。对于非基本类型的对象，必须
 * 将其引用置于新的类中，但可以直接定义基本类型数据：
 */
class WaterSource {
    private String s;
    WaterSource(){
        System.out.println("WaterSource()");
        s = "Constructed";
    }
    public String toString(){
        return s;
    }

//    @Override
//    public String toString() {
//        return super.toString();
//    }
}

public class SprinklerSystem {

    private String value1,value2,value3,value4;
    private WaterSource source = new WaterSource();
    private int i;
    private float f;
    public String toString(){

       return "valve1 = " + value1 + " " +
              "valve2 = " + value2 + " " +
              "valve3 = " + value3 + " " +
              "valve4 = " + value4 + " " +
              "i = " + i + " " + "f = " + f + " " +
              "source = " + source ;

    }

    public static void main(String[] args) {
        SprinklerSystem sprinklerSystem = new SprinklerSystem();
        System.out.println(sprinklerSystem);
    }
    /**
     * 在上面两个类所定义的方法中，有一个很特殊：toString()。每一个非基本类型的对象都有
     * 一个toString()方法，而且当编译器需要一个String而你却只有一个对象时，该方法便会被调用。
     * 所以在SprinklerSytem.toString的表达式中：
     *  "source" + source
     * 编译器将会得知你想要一个String对象("source=")同WaterSource相加。由于只能将一个
     * String对象和另一个String对象相加，因此编译器会告诉你："我将调用toString(),把source转换
     * 成为一个String！"这样做之后，它就能够将两个String连接到一起并将结果传递给System.out.println()
     * (或者使用此等价的本书中静态的print()和printnb()方法).每当想要所创建的类具有这样的行为时，仅需要
     * 编写一个toString()方法即可。
     * 编译器并不是简单地为每一个引用都创建默认对象，这一点是很有意义的，因为若真要那样做的话，就会在许多
     * 情况下增减不必要的负担。如果想初始化这些引用，可以在代码中的下列位置进行：
     * 1.在定义对象的地方。这意味着它们总是能够在构造器调用之前被初始化。
     * 2.在类的构造器中。
     * 3.就在正要使用这些对象之前，这种方式称为惰性初始化。在生成对象不值得及不必每次都生成对象的情况下，
     * 这种方式可以减少额外的负担。
     * 4.使用实例初始化。
     *
     */

}
