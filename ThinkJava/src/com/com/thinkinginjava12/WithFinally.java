package com.com.thinkinginjava12;

/**
 * Created by xuxi on 2019/12/4.
 */
public class WithFinally {

    static Switch sw = new Switch();

    public static void main(String[] args) {
        try {
            sw.on();
            OnOffSwitch.f();
        } catch (OnOffException1 onOffException1) {
            onOffException1.printStackTrace();
        } catch (OnOffException2 onOffException2) {
            onOffException2.printStackTrace();
        } finally {
            sw.off();
        }
    }

}
