package com.com.thinkingjava9;

/**
 * Created by xuxi on 2019/11/14.
 */
public class Implementation1Factory implements ServiceFactory {
    @Override
    public Service getService() {
        return new Implementation1();
    }
}
