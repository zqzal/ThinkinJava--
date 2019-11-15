package com.com.thinkinginjava9;

/**
 * Created by xuxi on 2019/11/12.
 */
public class FilterAdapter implements com.com.thinkinginjava9.interfacetest.Processor{
    Filter filter;
    public FilterAdapter(Filter filter){
        this.filter = filter;
    }

    @Override
    public String name() {
        return filter.name();
    }

    @Override
    public Waveform process(Object input) {
        return filter.process((Waveform) input);
    }
}
