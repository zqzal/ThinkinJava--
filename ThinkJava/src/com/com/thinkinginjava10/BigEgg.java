package com.com.thinkinginjava10;

/**
 * Created by xuxi on 2019/11/22.
 */
public class BigEgg extends Egg {
    public class Yolk{
        public Yolk(){
            System.out.println("BigEgg.Yolk()");
        }
    }

    public static void main(String[] args) {
        new BigEgg();
    }
}
