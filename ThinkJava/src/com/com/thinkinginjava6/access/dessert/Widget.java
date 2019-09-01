package com.com.thinkinginjava6.access.dessert;

/**
 * Created by xuxi on 2019/2/19.
 */
class Soup1{
    private Soup1(){

    }
    public static Soup1 makeSoup(){
        return new Soup1();
    }
}

class Soup2{
    private Soup2(){}
    private static Soup2 ps1 = new Soup2();
    public static Soup2 access(){
        return ps1;
    }
    public void f(){}
}



public class Widget {

    void testPrivate(){
//        Soup1 soup1 = new Soup1();
    }

    void testStatic(){
        Soup1 soup1 = Soup1.makeSoup();
    }

    void testSingleton(){
        Soup2.access().f();
    }

}
