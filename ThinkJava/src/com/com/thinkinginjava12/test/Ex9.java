package com.com.thinkinginjava12.test;

/**
 * Created by xuxi on 2019/12/3.
 */
class ExceptionA extends Exception{
    ExceptionA(String msg){
        super(msg);
    }
}

class ExceptionB extends Exception{
    ExceptionB(String msg){
        super(msg);
    }
}

class ExceptionC extends Exception{
    ExceptionC(String msg){
        super(msg);
    }
}

public class Ex9 {

    public static void f(int x) throws ExceptionA,ExceptionB,ExceptionC{
        if (x < 0)
            throw new ExceptionA("x < 0");
        if (x == 0)
            throw new ExceptionB("x == 0");
        if (x > 0)
            throw new ExceptionC("x > 0");
    }

    public static void main(String[] args) {
        try {
//            f(0);
            f(1);
            f(-1);
        } catch (ExceptionA exceptionA) {
            exceptionA.printStackTrace();
        } catch (ExceptionB exceptionB) {
            exceptionB.printStackTrace();
        } catch (ExceptionC exceptionC) {
            exceptionC.printStackTrace();
        }
    }

}
