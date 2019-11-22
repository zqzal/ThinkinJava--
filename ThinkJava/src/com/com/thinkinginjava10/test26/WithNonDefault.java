package com.com.thinkinginjava10.test26;

/**
 * Created by xuxi on 2019/11/22.
 */
public class WithNonDefault {

    class Inner{
        int i;
        public Inner(int i){
            this.i = i;
        }

        public Inner(){
            i = 47;
        }

        public void f(){
            System.out.println("Inner.f");
        }

    }

}
