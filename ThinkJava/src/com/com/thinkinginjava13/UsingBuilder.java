package com.com.thinkinginjava13;

import java.util.Random;

/**
 * Created by xuxi on 2019/12/19.
 */
public class UsingBuilder {

    public static Random random = new Random(47);

    @Override
    public String toString() {

        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < 25; i++) {
            result.append(random.nextInt(100));
            result.append(", ");
        }
        result.delete(result.length()-2,result.length());
        result.append("]");

        return result.toString();
    }

    public static void main(String[] args) {
        UsingBuilder usb = new UsingBuilder();
        System.out.println(usb);
    }
}
