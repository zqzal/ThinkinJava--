package com.com.thinkinginjava11;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by xuxi on 2019/12/2.
 */
public class AdapterMethodIdiom {

    public static void main(String[] args) {
        ReversibleArrayList<String> ral = new ReversibleArrayList<>(Arrays.asList("To be or not to be".split(" ")));
        for (String s : ral)
            System.out.print(s + " ");
        System.out.println();
        for (String s : ral.reversed())
            System.out.print(s + " ");
    }

    /**
     * 如果直接将ral对象置于foreach语句中，将得到（默认的）前向迭代器。但是如果在该对象上调用reversed()方法，就会产生不同的行为。
     */
}
