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
 *    在这个例子中，RTTI类型转换并不彻底：Object被转型为Shape，而不是转型为Circle、Square或者Triangle。
 * 这是因为目前我们只知道这个List<Shape> 保存的都是Shape。在编译时，将由容器和java的泛型系统来强制确保这一点
 * 而在运行时，由类型转换操作来确保这一点。
 *    接下来就是多态机制的事情了，Shape对象实际执行什么样的代码，是由引用所指向的具体对象Circle、Square或者
 *    Triangle而决定的。通常，也正是这样要求的；你希望大部分代码尽可能少地了解对象的具体类型，而是只与对象家族中的
 * 一个通用表示打交道（在这个例子中是Shape）。这样代码会更容易写，更容易读，且更便于维护；设计也更容易实现、理解和
 * 改变。所以"多态"是面向对象编程的基本目标。
 *    但是，假如你碰到了一个特殊的编程问题--如果能够知道某个泛化引用的确切类型，就可以使用最简单的方式去解决它，那么
 * 此时该怎么办呢？假设我们允许用户将某一具体类型的几何形状全都变成某种特殊的颜色，以突出显示它们。通过这种方法，用户
 * 就能找出屏幕上所有被突出显示的三角形。或者，可能要用某个方法来旋转列出的所有图形，但想跳过圆形，因为对圆形进行旋转没有
 * 意义。使用RTTI，可以查询某个Shape引用所指向的对象的确切类型，然后选择或者剔除特例。
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
