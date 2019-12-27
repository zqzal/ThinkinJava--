package com.com.thinkinginjava14;

/**
 * Created by xuxi on 2019/12/27.
 */

import java.util.ArrayList;
import java.util.List;

/**

 */

class CountedInteger{
    private static long counter;
    private final long id = counter++;

    @Override
    public String toString() {
        return Long.toString(id);
    }
}
public class FilledList <T> {

    private Class<T> type;
    public FilledList(Class<T> type){
        this.type = type;
    }

    public List<T> create(int nElements){
        List<T> result = new ArrayList<>();
        try {
          for (int i = 0; i < nElements; i++) {
            result.add(type.newInstance());
          }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static void main(String[] args) {
        FilledList<CountedInteger> fl = new FilledList<>(CountedInteger.class);
        System.out.println(fl.create(15));
    }

}
/**
   注意，这个类必须假设与它一同工作的任何类型都具有一个默认的构造器（无参构造器），
 并且如果不符合该条件，你将得到一个异常。编译器对该程序不会产生任何警告信息。
   当你将泛型语法用于Class对象是，会发生一件很有趣的事情：newInstance()将返回该对象
 的确切类型，而不仅仅只是在ToyTest.java中看到的基本的Object。这在某种程度上有些受限：

 */