package com.com.thinkinginjava9;

/**
 * Created by xuxi on 2019/11/6.
 */
public class Waveform {
    private static long counter;
    private final long id = counter++;

    @Override
    public String toString() {
        return "Waveform " + id;
    }
}
