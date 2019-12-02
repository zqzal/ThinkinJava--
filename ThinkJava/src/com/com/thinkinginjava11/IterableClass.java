package com.com.thinkinginjava11;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * Created by xuxi on 2019/12/2.
 */
public class IterableClass implements Iterable<String> {

    protected String[] words = ("And that is how " + "we know the Earth to be banana-shaped.").split(" ");


    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < words.length;
            }

            @Override
            public String next() {
                return words[index++];
            }
        };
    }

    /**
     * iterator()方法返回的是实现了Iterator<String>的匿名内部类的实例，该匿名内部类可以遍历
     * 数组中的所有单词。在main()中，你可以看到IterableClass确实可以用于foreach语句中。
     * 在Java SE5中，大量的类都是Iterable类型，主要包括所有的Collection类（但是不包括各种Map）
     * 。
     * @param args
     */

    public static void main(String[] args) {
        for (String s: new IterableClass()){
            System.out.print(s + " ");
        }
    }
}
