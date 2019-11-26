package com.com.thinkinginjava11;

import java.util.ArrayList;

/**
 * Created by xuxi on 2019/11/25.
 */
public class ApplesAndOrangesWithoutGenerics {
    @SuppressWarnings("uncheckde")
    public static void main(String[] args) {

        ArrayList apples = new ArrayList();
        //for循环后如果只有一条执行语句可以省略大括号（但是如果for循环后面如果是变量定义，没有
        //可执行语句就会报错），所谓的可执行语句就是有输出结果的语句
        for (int i = 0; i < 3; i++)
            apples.add(new Apple());
            //Not prevented from adding an orange to apples没有阻止向苹果添加橙子
//            apples.add(new Orange());

        for (int i = 0; i < apples.size(); i++) {
            ((Apple)apples.get(i)).id();
            //Orange is detected only at run time 仅在运行时检测到橙色
        }

    }
}
