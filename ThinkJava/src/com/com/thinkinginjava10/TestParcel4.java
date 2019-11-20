package com.com.thinkinginjava10;

/**
 * Created by xuxi on 2019/11/20.
 */
public class TestParcel4 {
    public static void main(String[] args) {
        Parcel4 p = new Parcel4();
        Contents c = p.contents();
        Destination d = p.destination("T");

        //Illegal -- can not access private class
//        Parcel4.

    }
}
