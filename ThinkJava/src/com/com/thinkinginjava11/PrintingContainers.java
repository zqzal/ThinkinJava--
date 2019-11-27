package com.com.thinkinginjava11;

/**
 * Created by xuxi on 2019/11/27.
 */

import java.util.*;

/**
 * 11.4 容器的打印
 */
public class PrintingContainers {

    static Collection fill(Collection<String> collection){
        collection.add("rat");
        collection.add("cat");
        collection.add("dog");
        collection.add("dog");
        return collection;
    }


    static Map fill(Map<String,String> map){
        map.put("rat","Fuzzy");
        map.put("cat","Rags");
        map.put("dog","Bosco");
        map.put("dog","Spot");
        return map;
    }


    public static void main(String[] args) {

        System.out.println(fill(new ArrayList<String>()));

        System.out.println(fill(new LinkedList<String>()));

        System.out.println(fill(new HashSet<String>()));

        System.out.println(fill(new TreeSet<String>()));

        System.out.println(fill(new LinkedHashSet<String>()));

        ////////


        System.out.println(fill(new HashMap<String, String>()));

        System.out.println(fill(new TreeMap<String, String>()));

        System.out.println(fill(new LinkedHashMap<String, String>()));
        /**
         * 这里展示了Java容器类库中的两种主要类型，它们的区别在于容器中每个"槽"保存的元素个数。
         * Collection在每个槽中只能保存一个元素。此类容器包括:List,它以特定的顺序保存一组元素；
         * Set,元素不能重复；Queue，只允许在容器一"端"插入对象，并从另外一"端"移除对象（对于本例
         * 来说，这只是另外一种观察序列的方式，因此并没有展示它）。Map在每个槽内保存了两个对象，即
         * 键和与之相关联的值。
         * ArrayList和LinkerList都是List类型，它们都按照被插入的顺序保存元素，两者的不同之处
         * 不仅在于执行某些类型的操作时的性能，而且LinkerList包含的操作也多余ArrayList
         * HashSet、TreeSet和LinkedHashSet都是Set类型，输出显示在Set中，每个相同的项只有保存一次，
         * 但是输出也显示了不同的Set实现存储元素的方式也不同。HashSet使用的的是相当复杂的方式存储元素的，
         * 这种方式将在17章提到，你只需要知道这中技术是最快的获取元素方式，因此，存储的顺序看起来并无
         * 实际意义。TreeSet是有顺序的，按照比较结果的升序保存对象；使用LinkedHashSet，它按照被添加的
         * 顺序保存对象
         */
        /**
         * 三种Map：HashMap、TreeMap和LinkerHashMap。与HashSet一样，HashMap也提供了最快的查找技术，
         * 也没有按照任何明显的顺序来保存其元素。TreeMap按照比较结果的升序保存键，而LinkedHashMap则按照
         * 插入顺序保存键，同时还保留了HashMap的查询速度
         */
    }

}
