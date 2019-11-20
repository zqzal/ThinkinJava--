package com.com.thinkinginjava10;

/**
 * Created by xuxi on 2019/11/20.
 */
public class Parcel7b {
    class MyContents implements Contents{
        private int i = 11;
        @Override
        public int value() {
            return i;
        }
    }

    public Contents contents(){
        return new MyContents();
    }

    public static void main(String[] args) {
        Parcel7b p = new Parcel7b();
        Contents c = p.contents();
    }
}
