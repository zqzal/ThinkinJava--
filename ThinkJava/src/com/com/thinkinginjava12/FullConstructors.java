package com.com.thinkinginjava12;

/**
 * Created by xuxi on 2019/9/2.
 */

/**
 * 在异常处理程序中，调用了在Throwable类声明的printStackTrace()方法。就像从输出中看到的，
 * 它将打印"从方法调用处直接抛出的处"的方法调用序列。这里，信息被发送到了System.out,并自动
 * 地被捕获和显示在输出中。但是如果调用默认版本:
 *  e.printStackTrace();
 * 则信息将被输出到标准错误流。
 *
 */

class MyException extends Exception{
    public MyException(){

    }

    public MyException(String msg){
        super(msg);
    }
}
public class FullConstructors {

    public static void f() throws MyException{
        System.out.println("Throwing MyException from f()");
        throw new MyException();
    }

    public static void g() throws MyException{
        System.out.println("Throwing MyException from g()");
        throw new MyException("Originate in g()");
    }

    public static void main(String[] args) {
        try {
            f();
        } catch (MyException e) {
            e.printStackTrace();
        }
        try {
            g();
        } catch (MyException e) {
            e.printStackTrace();
        }


    }

}
