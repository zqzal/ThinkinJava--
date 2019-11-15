package com.com.thinkinginjava9;

/**
 * Created by xuxi on 2019/11/15.
 */
public class Checkers implements Game {

    private int moves = 0;
    private static final int MOVES = 3;

    @Override
    public boolean move() {
        System.out.println("Checkers move " + moves );
        return ++moves != MOVES;
    }
}
