package com.com.thinkingjava9;


import com.com.thinkingjava9.interfacetest.Apply;

/**
 * Created by xuxi on 2019/11/12.
 */
public class FilterProcessor {
    public static void main(String[] args) {
        Waveform w = new Waveform();
        Apply.process(new FilterAdapter(new LowPass(1.0)),w);
        Apply.process(new FilterAdapter(new HighPass(2.0)),w);
        Apply.process(new FilterAdapter(new BandPass(3.0,4.0)),w);

    }
}
