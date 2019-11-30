package com.com.thinkinginjava11;

/**
 * Created by xuxi on 2019/11/30.
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * 10.10 Map
 * 将对象映射到其他对象的能力是一种解决编程问题的杀手锏。例如，考虑一个程序，它将用来检查Java的
 * Random类的随机性。理想状态下，Random可以将产生理想的数字分布
 */
public class Statistics {
    public static void main(String[] args) {
        Random rand = new Random(47);
        Map<Integer,Integer> m = new HashMap<>();
        for (int i = 0; i < 100000; i++) {
            int r = rand.nextInt(20);
            Integer freq = m.get(r);
            m.put(r,freq == null ? 1 : freq + 1);
        }
        System.out.println(m);
    }
}
