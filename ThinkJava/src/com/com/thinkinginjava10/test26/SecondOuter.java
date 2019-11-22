package com.com.thinkinginjava10.test26;

/**
 * Created by xuxi on 2019/11/22.
 */
public class SecondOuter {

    public class SecondInner extends FirstOuter.FirstInner{
        SecondInner(FirstOuter x){
            x.super("hello");
            System.out.println("SecondOuter.SecondInner()");
        }
    }


    public static void main(String[] args) {
        FirstOuter fo = new FirstOuter();
        SecondOuter so = new SecondOuter();
        SecondInner si = so.new SecondInner(fo);
    }
}
