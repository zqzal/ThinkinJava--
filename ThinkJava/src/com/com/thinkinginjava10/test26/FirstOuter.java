package com.com.thinkinginjava10.test26;

/**
 * Created by xuxi on 2019/11/22.
 */
public class FirstOuter {
    public class FirstInner{
        FirstInner(String s){
            System.out.println("FirstOuter.FirstInner() " + s);
        }
    }
}
