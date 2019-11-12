package com.com.thinkingjava9;

/**
 * Created by xuxi on 2019/11/6.
 */
public class BandPass extends Filter {
    double lowCutoff,highCutoff;
    public BandPass(double lowCutoff,double highCutoff){
        this.lowCutoff = lowCutoff;
        this.highCutoff = highCutoff;
    }
    public Waveform process(Waveform input){
        return input;
    }
}
