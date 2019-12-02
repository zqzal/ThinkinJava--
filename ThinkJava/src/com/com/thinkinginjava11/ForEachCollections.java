package com.com.thinkinginjava11;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

/**
 * Created by xuxi on 2019/12/2.
 */
public class ForEachCollections {

    public static void main(String[] args) {
        Collection<String> cs = new LinkedList<>();
        Collections.addAll(cs,"Take the long way home".split(" "));
        for (String s : cs){
            System.out.print("'" + s + "'");
        }
    }
}
