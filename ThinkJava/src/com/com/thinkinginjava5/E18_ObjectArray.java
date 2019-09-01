package com.com.thinkinginjava5;

/**
 * Created by xuxi on 2019/2/14.
 */



public class E18_ObjectArray {
    public static void main(String[] args) {
        Test[] array = new Test[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Test(Integer.toString(i));
        }
        InitTest[] it = new InitTest[5];
        for (int i = 0; i < it.length ; i++) {
            it[i] = new InitTest(Integer.toString(i));
        }
    }
}
