package com.com.thinkinginjava9;

/**
 * Created by xuxi on 2019/11/14.
 */
public class Implementation2Factory implements ServiceFactory{

    @Override
    public Service getService() {
        return new Implementation2();
    }
}
