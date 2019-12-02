package com.com.thinkinginjava12;

/**
 * Created by xuxi on 2019/12/2.
 */
public class MyException2 extends Exception {
    private int x ;
    public MyException2(){

    }
    public MyException2(String msg){
        super(msg);
    }

    public MyException2(String msg,int x){
        super(msg);
        this.x = x;
    }
    public int val(){
        return x;
    }

    @Override
    public String getMessage() {
        return "Detail Message:" + x + " " + super.getMessage();
    }
}
