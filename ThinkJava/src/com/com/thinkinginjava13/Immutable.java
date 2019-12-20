package com.com.thinkinginjava13;

/**
 * Created by xuxi on 2019/12/19.
 */
public class Immutable {

    public static String upcase(String s){
        return s.toUpperCase();
    }

    public static void main(String[] args) {
        String q = "howdy";
        System.out.println(q);
        String qq = upcase(q);
        System.out.println(qq);
        System.out.println(q);
    }

}
