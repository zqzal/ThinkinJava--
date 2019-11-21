package com.com.thinkinginjava10;

/**
 * Created by xuxi on 2019/11/21.
 */
public class Games {
    public static void playGame(GameFactory factory){
        Game s = factory.getGame();
        while (s.move());
    }

    public static void main(String[] args) {
        playGame(Checkers.factory);
        playGame(Chess.factory);
    }
}
