package com.com.thinkinginjava5;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by xuxi on 2019/2/14.
 */
public class ArrayNew {
    public static void main(String[] args) {
        int[] a;
        Random random = new Random(47);
        a = new int[random.nextInt(20)];
        System.out.println("length of a = " + a.length);
        System.out.println(Arrays.toString(a));
    }
}
