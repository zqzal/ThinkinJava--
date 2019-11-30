package com.com.thinkinginjava11;

import java.util.LinkedList;

/**
 * Created by xuxi on 2019/11/29.
 */
public class Stack<T> {

    private LinkedList<T> storage = new LinkedList<T>();

    public void push(T v){
        storage.addFirst(v);
    }

    public T peek(){
        return storage.getFirst();
    }

    public T pop(){
        return storage.removeFirst();
    }

    public boolean empty(){
        return storage.isEmpty();
    }

    @Override
    public String toString() {
        return storage.toString();
    }
}
