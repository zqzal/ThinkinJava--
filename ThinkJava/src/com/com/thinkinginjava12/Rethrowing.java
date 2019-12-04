package com.com.thinkinginjava12;

/**
 * Created by xuxi on 2019/12/3.
 */
public class Rethrowing {

    public static void f() throws Exception{
        System.out.println("originating the exception in f()");
        throw new Exception("throw from f()");
    }

    public static void g() throws Exception{
        try {
            f();
        }catch (Exception e){
            System.out.println("Inside g() ,e.printStackTrace()");
            e.printStackTrace(System.out);
            throw e;
        }
    }

    public static void h() throws Exception{
        try {
            f();
        }catch (Exception e){
            System.out.println("Inside h(),e.printStackTrace()");
            e.printStackTrace(System.out);
            throw (Exception) e.fillInStackTrace();
        }
    }



    public static void main(String[] args) {
        try {
            g();
        } catch (Exception e) {
            System.out.println("main: printStackTrace()");
            e.printStackTrace(System.out);
        }

        try {
            h();
        } catch (Exception e) {
            System.out.println("main: printStackTrace()");
            e.printStackTrace();
        }
//调用fillInStackTrace()的哪一行就成为了异常的新发生地了
    }

}
