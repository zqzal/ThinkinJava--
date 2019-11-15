package com.com.thinkingjava9;

/**
 * Created by xuxi on 2019/11/15.
 */
public class CheckersFactory implements GameFactory {
    @Override
    public Game getGame() {
        return new Checkers();
    }
}
