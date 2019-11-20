package com.com.thinkinginjava10;

/**
 * Created by xuxi on 2019/11/20.
 */

/**
 * 在匿名中定义字段时，还能够对其执行初始化操作
 */
public class Parcel9 {

    public Destination destination(final String dest){
        return new Destination() {

            private String label = dest;

            @Override
            public String readLabel() {
                return label;
            }
        };
    }

    public static void main(String[] args) {
        Parcel9 p = new Parcel9();
        Destination d = p.destination("T");
    }

}
