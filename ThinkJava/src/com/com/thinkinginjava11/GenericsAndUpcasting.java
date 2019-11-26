package com.com.thinkinginjava11;

import java.util.ArrayList;

/**
 * Created by xuxi on 2019/11/25.
 */
public class GenericsAndUpcasting {
    /**
     * 当你指定了某个类型作为泛型参数时，你并不仅限于只能将该确切类型的对象
     * 放置到容器中。向上转型也可以像作用于其他类型一样作用于泛型：
     * 因此，你可以将Apple的子类型添加到被指定为保存Apple对象的容器中。
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<>();
        apples.add(new GrannySmith());
        apples.add(new Gala());
        apples.add(new Fuji());
        apples.add(new Braeburn());
        for (Apple c : apples) {
            System.out.println(c);
        }
        /**
         * 程序的输出是从Object默认的toString方法产生的，该方法将打印类名，后面跟随该对象
         * 的散列吗的无符号十六进制表示（这个散列码是通过hashCode()方法产生的）
         */
    }
}
