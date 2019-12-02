package com.com.thinkinginjava12;

/**
 * Created by xuxi on 2019/12/2.
 */
public class FullConstructors  {
    public static void f() throws MyException{
        System.out.println("Throwing MyException from f()");
        throw new MyException();
    }

    public static void g() throws MyException{
        System.out.println("Throwing MyException from g()");
        throw new MyException("Originated in g()");
    }

    public static void main(String[] args) {
        try {
            f();
        }catch (MyException e){
            e.printStackTrace();
        }

        try {
            g();
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
    /**
     * 新增的代码不长：两个构造器定义了MyException类型对象的创建方式。对于第二个构造器，
     * 使用super关键字明确调用了其基类构造器，它接受一个字符串作为参数。
     * 在异常处理程序中，调用了在Throwable类声明（Exception即从此类继承）的printStackTrace()
     * 方法。就像从输出中看到的，它将打印"从方法调用处直到异常抛出处"的方法调用序列。这里，信息被
     * 发送到了System.out，并自动地被捕获和显示在输出中。但是，如果调用默认版本：
     *   e.printStackTrace();
     * 者信息将被输出到标准错误流。
     */
}
