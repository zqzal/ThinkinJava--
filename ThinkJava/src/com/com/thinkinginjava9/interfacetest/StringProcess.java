package com.com.thinkinginjava9.interfacetest;

import java.util.Arrays;

/**
 * Created by xuxi on 2019/11/8.
 */
public abstract class StringProcess implements Processor{

    //复用代码的第一种方式是客户端程序员遵循该接口来编写他们自己的类，就像下面这样：

    public String name(){
        return getClass().getSimpleName();
    }

    public abstract String process(Object input);

    public static String s = "If she weighs the same as a duck,she is made of wood";

    public static void main(String[] args) {
        Apply.process(new Upcase(),s);
        Apply.process(new Downcase(),s);
        Apply.process(new Splitter(),s);
    }

}

class Upcase extends StringProcess{
    @Override
    public String process(Object input) {
        return ((String) input).toUpperCase();
    }
}


class Downcase extends StringProcess{

    @Override
    public String process(Object input) {
        return ((String) input).toLowerCase();
    }
}

class Splitter extends StringProcess{

    @Override
    public String process(Object input) {
        return Arrays.toString(((String)input).split(" "));
    }
}
