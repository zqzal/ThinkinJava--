package com.com.thinkinginjava8;

/**
 * Created by xuxi on 2019/3/5.
 */
public class Shapes {
    private static RandomShapeGenerator gen = new RandomShapeGenerator();

    public static void main(String[] args) {
        Shape[] s = new Shape[9];
        for (int i = 0; i < s.length; i++) {
            s[i] = gen.next();
        }
        for (Shape shp :
                s) {
            shp.draw();
        }
    }
}
