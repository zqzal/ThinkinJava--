package com.com.thinkinginjava11;

import com.com.thinkinginjava10.InheritInner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by xuxi on 2019/11/25.
 */
public class SimpleCollection {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            c.add(i);
            c.add(i);
        }
        for (Integer i : c) {
            System.out.print(i + ",");
        }
        Collection<Integer> c1 = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            c1.add(i);
            c1.add(i);
        }
        for (Integer i :c1){
            System.out.print(i+ ",");
        }
    }
}
