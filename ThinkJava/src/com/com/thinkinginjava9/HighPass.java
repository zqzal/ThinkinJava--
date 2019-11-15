package com.com.thinkinginjava9;

/**
 * Created by xuxi on 2019/11/6.
 */
public class HighPass extends Filter {

    double cutoff;
    public HighPass(double cutoff){
        this.cutoff = cutoff;
    }
    public Waveform process(Waveform input){
        return input;
    }
}
