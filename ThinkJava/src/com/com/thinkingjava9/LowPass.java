package com.com.thinkingjava9;

/**
 * Created by xuxi on 2019/11/6.
 */
public class LowPass extends Filter {

    double cutoff;
    public LowPass(double cutoff){
        this.cutoff = cutoff;
    }

    public Waveform process(Waveform input){
        return input;
    }
}
