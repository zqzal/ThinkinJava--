package com.com.thinkinginjava10;

/**
 * Created by xuxi on 2019/11/21.
 */
public class Chess implements Game {

    private Chess(){

    }

    private int moves = 0;
    private static final int MOVES = 4;

    @Override
    public boolean move() {
        System.out.println("Chess move " + moves);
        return ++moves != MOVES;
    }

    public static GameFactory factory = new GameFactory() {
        @Override
        public Game getGame() {
            return new Chess();
        }
    };
}
