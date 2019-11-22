package com.com.thinkinginjava10;

/**
 * Created by xuxi on 2019/11/22.
 */
public class Egg {
    private Yolk y;
    protected class Yolk{
        public Yolk(){
            System.out.println("Egg.Yolk");
        }
    }

    public Egg(){
        System.out.println("New Egg()");
        y = new Yolk();
    }




}
