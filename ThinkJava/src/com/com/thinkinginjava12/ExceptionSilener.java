package com.com.thinkinginjava12;

/**
 * Created by xuxi on 2019/12/4.
 */
public class ExceptionSilener { //异常消音器
    public static void main(String[] args) {
        try{
            throw new RuntimeException();
        }finally {
            //Using 'return' inside the finally block
            //will silence any thrown exception
            //在finally块中使用“ return”将使所有抛出的异常静音
            return;
        }
    }
}
