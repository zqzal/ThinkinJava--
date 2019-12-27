package com.com.thinkinginjava14;

/**
 * Created by xuxi on 2019/12/27.
 */
public class CenericToyTest {
    public static void main(String[] args) throws Exception{
        Class<FancyToy> ftClass = FancyToy.class;
        //Produces exact type 产生确切的类型
        FancyToy fancyToy = ftClass.newInstance();
        Class<? super FancyToy> up = ftClass.getSuperclass();
        //This will not compile 这不会编译
        //Class<Toy> up2 = ftClass.getSuperclass();
        //Only produces Object 只产生物件
        Object  obj = up.newInstance();

    }
}
/**
  如果你手头的是超类，那编译器将只允许你声明超类引用是"某个类，它是FancyToy超类"，
 就像在表达式Class<? Super FancyToy>中所看到的，而不会接受Class<Toy>这样的声明。这看
 上去显得有些怪，因为getSuperClass()方法返回的是基类（不是接口）。并且编译器在编译期就
 知道它是什么类型了--在本例中就是Toy.class--而不仅仅只是"某个类，他是FancyToy超类"。
 不管怎样，正式由于这中含糊性，up.neInstance()的返回值不是精确类型，而只是Object.
 */