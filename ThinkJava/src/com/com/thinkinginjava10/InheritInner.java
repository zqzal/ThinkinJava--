package com.com.thinkinginjava10;

/**
 * Created by xuxi on 2019/11/22.
 */
public class InheritInner extends WithInner.Inner {

    InheritInner(WithInner wi){
        wi.super();
    }

    public static void main(String[] args) {
        WithInner wi = new WithInner();
        InheritInner ii = new InheritInner(wi);
    }
    /**
     * 可以看到，InheritInner只继承自内部类，而不是外围类。但是当要生成一个构造器时，默认
     * 的构造器并不算好，而且不能只是传递一个指向外围类对象的引用。此外，必须在构造器内使用
     * 如下语法:  enclosingClassReference.super(); //封闭类参考
     * 这样才提供了必要的引用，然后程序才能编译通过。
     */
}
