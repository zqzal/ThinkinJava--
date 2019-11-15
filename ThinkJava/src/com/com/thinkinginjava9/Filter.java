package com.com.thinkinginjava9;

/**
 * Created by xuxi on 2019/11/6.
 */
public class Filter {

    public String name(){
        return getClass().getSimpleName();
    }

    public Waveform process(Waveform input){
        return input;
    }

}
