package com.com.thinkinginjava9;

/**
 * Created by xuxi on 2019/11/15.
 */
public class Chess implements Game {

    private int moves = 0;
    private static final int MOVES = 4;


    @Override
    public boolean move() {
        System.out.println("Chess move " + moves);
        return ++moves != MOVES;
    }
}
