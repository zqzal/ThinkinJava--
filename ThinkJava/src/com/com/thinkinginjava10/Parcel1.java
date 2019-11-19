package com.com.thinkinginjava10;

/**
 * Created by xuxi on 2019/11/15.
 */
public class Parcel1 {

    class Contents{
        private int i = 11;

        public int value(){
            return i;
        }
    }

    class Destination{
        private String label;
        Destination(String whereTo){
            label = whereTo;
        }
    }




}
