package com.com.thinkinginjava11;

import java.util.Map;

/**
 * Created by xuxi on 2019/12/2.
 */
public class EnvironmentVariables {
    public static void main(String[] args) {
        for (Map.Entry entry:System.getenv().entrySet()){
            System.out.println(entry.getKey() + "  :  " + entry.getValue());
        }
    }
    /**
     * foreach语句可以用于数组或其他任何Iterable，但是这并不意味这数组肯定也是一个Iterable，
     */
}
