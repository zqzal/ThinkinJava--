package com.com.thinkingjava9;

/**
 * Created by xuxi on 2019/11/15.
 */
public class Games {

    public static void playGame(GameFactory factory){
        Game s = factory.getGame();
        while (s.move());
    }

    public static void main(String[] args) {
        playGame(new CheckersFactory());
        playGame(new ChessFactory());
    }
}
