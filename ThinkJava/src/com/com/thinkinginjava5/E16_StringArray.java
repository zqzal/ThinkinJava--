package com.com.thinkinginjava5;

/**
 * Created by xuxi on 2019/2/14.
 */
public class E16_StringArray {
    public static void main(String[] args) {

        String[] sa1 = new String[4];
        sa1[0] = "These";
        sa1[1] = "are";
        sa1[2] = "some";
        sa1[3] = "strings";
        for (int i = 0; i < sa1.length; i++) {
            System.out.println(sa1[i]);
        }

        String[] sa2 = {"These","are","some","strings"};
        for (int i = 0; i < sa2.length; i++) {
            System.out.println(sa2[i]);
        }
    }
}
