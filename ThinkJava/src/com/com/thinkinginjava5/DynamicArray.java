package com.com.thinkinginjava5;

import javax.print.attribute.standard.MediaSize;

/**
 * Created by xuxi on 2019/2/14.
 */
public class DynamicArray {
    public static void main(String[] args) {
        Other.main(new String[]{"fiddle","de","dum"});
    }
}
class Other{
    public static void main(String[] args){
        for (String s : args){
            System.out.print(s+ " ");
        }
    }
}