package com.com.thinkinginjava12;

/**
 * Created by xuxi on 2019/12/4.
 */
public class OnOffSwitch {

    private static Switch sw = new Switch();

    public static void f() throws OnOffException1,OnOffException2{

    }

    public static void main(String[] args) {
        try {
            sw.on();
            //code that can throw exceptions 可能引发异常的代码
            f();
            sw.off();
        } catch (OnOffException1 onOffException1) {
            onOffException1.printStackTrace();
            sw.off();
        } catch (OnOffException2 onOffException2) {
            onOffException2.printStackTrace();
            sw.off();
        }
        /**
         * 程序的目的是要确保main()结束的时候开关必须是关闭的，
         */
    }

}
