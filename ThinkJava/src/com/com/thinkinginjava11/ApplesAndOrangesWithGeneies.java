package com.com.thinkinginjava11;

import java.util.ArrayList;

/**
 * Created by xuxi on 2019/11/25.
 */
public class ApplesAndOrangesWithGeneies {

    public static void main(String[] args) {

        ArrayList<Apple> apples = new ArrayList<>();

        for (int i = 0; i < 3; i++)
            apples.add(new Apple());
//            apples.add(new Orange());

        //在将元素从List中取出来时，类型转换也不再是必需的了。因为List知道
        //它保存的是什么类型，因此它会在调用get()时替你执行转型。这样，通过
        //使用泛型，你不仅知道编译器将会检查你放置在容器中的对象类型，而且在
        //使用容器中的对象时，可以使用更加清晰的语法。
        //这个实例还表明，如果不需要使用每个元素的索引，你可以使用foreach语法
        //来选择List中的每个元素。
        //当你指定了某个类型作为泛型参数时，你并不仅限于只能将该确切类型的对象
        //放置到容器中。向上转型也可以像作用于其他类型一样作用于泛型：
        for (int i = 0; i < apples.size(); i++)
            System.out.println(apples.get(i).id());


        for (Apple c : apples)
            System.out.println(c.id());

    //这个实例还表明，如果不需要使用
    }
}
