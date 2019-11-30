package com.com.thinkinginjava11;

/**
 * Created by xuxi on 2019/11/30.
 */
public class StackCollision {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        for (String s : "My dog has fleas".split(" "))
            stack.push(s);


        while (!stack.empty())
            System.out.print(stack.pop() + " ");

        System.out.println();


        java.util.Stack<String> stack2 = new java.util.Stack<>();
        for (String s : "My dog has fleas".split(" "))
            stack2.push(s);

        while (!stack2.empty())
            System.out.print(stack2.pop() + " ");

        /**
         * 这个两个Stack具有相同的接口，但是在java.util中没有任何公共的Stack接口,这可能是
         * 因为在Java1.0中的设计欠佳的最初的java.util.Stack类占用了这个名字.尽管已经有了
         * java.util.Stack,但是LinkedList可以产生更好的Stack,因此自己写的Stack所采用的方式
         * 更是可取的.
         */


    }
}
