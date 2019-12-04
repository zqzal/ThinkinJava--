package com.com.thinkinginjava12;

/**
 * Created by xuxi on 2019/12/4.
 */

class FourException extends Exception{}


public class AlwaysFinally {

    public static void main(String[] args) {
        System.out.println("进入第一个尝试块");
        try{
            System.out.println("进入第二个尝试块");
            try{
                throw new FourException();
            }finally {
                System.out.println("finally in 2nd try block");
            }
        }catch (FourException e){
            System.out.println("Caught FourException in 1st try block");
        }finally {
            System.out.println("finally in 1st try block");
        }
    }

}
