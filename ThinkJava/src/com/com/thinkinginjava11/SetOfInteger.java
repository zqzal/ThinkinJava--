package com.com.thinkinginjava11;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Created by xuxi on 2019/11/30.
 */
public class SetOfInteger {

    public static void main(String[] args) {

        Random rand = new Random(47);
        Set<Integer> intset = new HashSet<Integer>();
        for (int i = 0; i < 10000; i++)
            intset.add(rand.nextInt(30));

        System.out.println(intset);
        System.out.println(intset.size());
        /**
         * 你还可以看到，输出的顺序没有任何规律可循，这是因为出于速度原因的考虑，
         * HashSet使用了散列————散列将在17章中介绍。HashSet所维护的顺序与TreeSet
         * 或LinkedHashSet都不同，因为它们的实现具有不同的元素存储方式。TreeSet将
         * 元素存储在红-黑数数据结构中，而HashSet使用的是散列函数。LinkedHashList
         * 因为查询速度的原因也使用了散列，但是看起来它使用了链表来维护元素的插入顺序。
         * 如果你想对结果排序，一种方式是使用TreeSet来代替HashSet：
         */
    }

}
