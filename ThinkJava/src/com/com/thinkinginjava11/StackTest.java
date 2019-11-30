package com.com.thinkinginjava11;

/**
 * Created by xuxi on 2019/11/29.
 */
public class StackTest {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        String[] ww = "My dog has flea".split(" ");
//        for(String s : ww){
//            System.out.print(s+ "\n");
//        }
//        System.out.println("\n1");
        for (String s: ww){
            stack.push(s);
        }

//        for(String s : ww){
//            System.out.print(s+ "\n");
//        }
//        System.out.println("\n2");


        while (!stack.empty()){
            System.out.println(stack.pop() + "");
        }
    }
}
