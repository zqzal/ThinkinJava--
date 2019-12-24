package com.com.thinkinginjava13;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by xuxi on 2019/12/24.
 */

/**
 * 类型信息
 * 运行时类型信息使得你可以在程序运行时发现和使用类型信息。
 *    它使你从只能在编译期执行面向类型的操作的禁锢中解脱了出来，并且可以使用某些非常强大的程序。
 * 对RTTI的需要，揭示了面向对象设计中许多有趣（并且复杂）的问题，同时也提出了如何组织程序的
 * 问题。
 *    本章将讨论Java是如何让我们在运行时识别对象和类的信息的。主要有两种方式：一种是"传统的"RTTI
 * 它假定我们在编译时已经知道了所有的类型；另一种是"发射"机制，它允许我们在运行时发现和使用类的信息。
 *
 *    在这个例子中，当把Shape对象放入List<Shape>的数组时会向上转型。但在向上转型为Shape的时候也丢失了
 * Shape对象的具体类型。对于数组而言，它们只是Shape类的对象。
 *    当从数组中取出元素时，这种容器--实际上它将所有的事物当作Object持用
 */
public class ReplacingStringTokenizer {

    public static void main(String[] args) {
        String input = "But I an not dead yet! I feel happy!";
        StringTokenizer stoke = new StringTokenizer(input);
        while (stoke.hasMoreElements())
            System.out.println(stoke.nextToken() + " ");

        System.out.println();

        System.out.println(Arrays.toString(input.split(" ")));

        Scanner scanner = new Scanner(input);
        while (scanner.hasNext())
            System.out.print(scanner.next() + " ");
    }

}
