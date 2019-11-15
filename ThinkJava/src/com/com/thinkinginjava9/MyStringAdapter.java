package com.com.thinkinginjava9;

/**
 * Created by xuxi on 2019/11/12.
 */
public class MyStringAdapter implements com.com.thinkinginjava9.interfacetest.Processor {
    MyString myString;

    public MyStringAdapter(MyString myString){
        this.myString = myString;
    }

    @Override
    public String name() {
        return null;
    }

    @Override
    public String  process(Object input) {
        return myString.changeString((String) input);
    }
}
