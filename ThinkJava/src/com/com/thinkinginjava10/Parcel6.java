package com.com.thinkinginjava10;

/**
 * Created by xuxi on 2019/11/20.
 */

/**
 * 下面的例子展示了如何在任意的作用域内嵌入一个内部类
 */
public class Parcel6 {
    Destination d = new Destination() {
        @Override
        public String readLabel() {
            return null;
        }
    };
    private void internalTracking(boolean b){
        if (b){
            class TrackingSlip{
                private String id;
                TrackingSlip(String s){
                    id = s;
                }
                String getSlip(){
                    return id;
                }
            }
            TrackingSlip ts = new TrackingSlip("slip");
            String s = ts.getSlip();
        }
    }

    public void track(){
        internalTracking(true);
    }

    public static void main(String[] args) {
        Parcel6 p = new Parcel6();
        p.track();
    }


}
