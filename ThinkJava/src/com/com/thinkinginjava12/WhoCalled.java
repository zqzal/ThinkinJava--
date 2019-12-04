package com.com.thinkinginjava12;

/**
 * Created by xuxi on 2019/12/3.
 */
public class WhoCalled {
    static void f(){
        //Generate an exception to fill in the stack trace生成异常以填充堆栈跟踪
        try {
            throw new Exception();
        } catch (Exception e) {
//            e.printStackTrace();
            for (StackTraceElement ste : e.getStackTrace()) {
                System.out.println(ste.getMethodName());
            }
        }
    }

    static void g(){
        f();
    }

    static void h(){
        g();
    }

    public static void main(String[] args) {
        f();
        System.out.println("---------");
        g();
        System.out.println("---------");
        h();
        System.out.println("---------");
        //这里我们只打印了方法名，但实际上还可以打印整个StackTraceElement，它包含其他附件的信息。
    }
}
