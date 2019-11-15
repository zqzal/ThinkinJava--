package com.com.thinkinginjava9;

/**
 * Created by xuxi on 2019/11/15.
 */
public class ChessFactory implements GameFactory {
    @Override
    public Game getGame() {
        return new Chess();
    }
}
