package com.com.thinkinginjava11;

import java.util.*;

/**
 * Created by xuxi on 2019/11/25.
 */
public class Apple {
    private static long counter;

    private final long id = counter++;

    public long id(){
        return id;
    }
}
