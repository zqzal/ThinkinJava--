package com.com.thinkinginjava14;

/**
 * Created by xuxi on 2019/12/27.
 */

/**
  14.2.3 新的转型语法
  Java SE5 还添加了用于Class引用的转型语法，即cast()方法：
 */
class Building{

}
class House extends Building{

}
public class ClassCasts {

    public static void main(String[] args) {
        Building b = new House();
        Class<House> houseType = House.class;
        House h = houseType.cast(b);
        h = (House) b; //...or just do this ...或者只是这样做
    }
}
/**
  cast()方法接受参数对象，并将其转型为Class引用的类型。当然，如果你观察上面的代码，
 则会发现，与实现了相同功能的main()中最后一行相比，这种转型好像做了很多额外的工作。
 新的转型语法对于无法使用普通转型的情况显得非常有用，在你编写泛型代码（你将在第15章
 中学习它）时，如果你村粗了Class引用，并希望以后通过这个引用来执行转型，这种情况就会
 时有发生。这被证明是一种罕见的情况--我发现在整个Java SE5类库中，只有一处使用了cast()
 在com.sun.mirror.util.DeclarationFilter中）。
   在Java SE5中另一个没有任何用处的新特性就是Class.asSubclass()，该方法允许你将一个类
 对象转型为更加具体的类型。
 */
