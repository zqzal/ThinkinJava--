package com.com.thinkinginjava5;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by xuxi on 2019/2/14.
 */
public class ArrayClassObj {
    public static void main(String[] args) {

        Random random = new Random(47);
        Integer[] a = new Integer[random.nextInt(20)];
        System.out.println("length of a = "+a.length);
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(500);
        }


        System.out.println(Arrays.toString(a));
    }
}
