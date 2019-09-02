package com.com.thinkinginjava12;

/**
 * Created by xuxi on 2019/9/2.
 */

class SimpleException extends Exception{

}

public class InheritingExceptions {
    public void f() throws SimpleException{
        System.out.println("Throw SimpleException from f()");
        throw new SimpleException();
    }

    public static void main(String[] args) {
        InheritingExceptions sed = new InheritingExceptions();
//        try {
//            sed.f();
//        }catch (SimpleException e){
//            System.out.println("Caught ft!");
//        }
        try {
            sed.f();
        } catch (SimpleException e) {
            e.printStackTrace();
        }
    }

}
