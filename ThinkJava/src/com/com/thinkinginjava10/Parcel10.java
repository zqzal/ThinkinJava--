package com.com.thinkinginjava10;

import com.xuxi.Main;

/**
 * Created by xuxi on 2019/11/20.
 */
public class Parcel10 {


    public Destination destination(final String dest,final float price){
        return new Destination() {

            private int cost;
            //Instance initialization for each object
            {
                cost = Math.round(price);
                if (cost > 100)
                    System.out.println("Over budget!");
            }

            private String label = dest;

            @Override
            public String readLabel() {
                return label;
            }
        };
    }


    public static void main(String[] args) {
        Parcel10 p = new Parcel10();
        Destination d = p.destination("t",101.395F);
    }

}
