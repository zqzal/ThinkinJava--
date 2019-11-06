package com.com.thinkingjava9;


import java.util.Arrays;
import java.util.Objects;

/**
 * Created by xuxi on 2019/11/6.
 */
public class Processor {

    public String name(){
        return getClass().getSimpleName();
    }

    Object process(Object input){
        return input;
    }

}

class Upcase extends Processor{
    String process(Object input){
     return ((String) input).toUpperCase();
    }
}

class Downcase extends Processor{
    String process(Object input){
        return ((String) input).toLowerCase();
    }
}

class Splitter extends Processor{
    String process(Object input){
        return Arrays.toString(((String)input).split(" "));
    }
}