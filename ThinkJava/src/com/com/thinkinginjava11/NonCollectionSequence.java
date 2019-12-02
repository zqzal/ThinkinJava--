package com.com.thinkinginjava11;

import com.com.thinkinginjava11.pettest.pets1.Pet;

import java.util.Iterator;

/**
 * Created by xuxi on 2019/12/2.
 */
public class NonCollectionSequence extends PetSequence {

    public Iterator<Pet> iterator(){
        return new Iterator<Pet>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < pets.length;
            }

            @Override
            public Pet next() {
                return pets[index++];
            }
        };
    }

    public static void main(String[] args) {
        NonCollectionSequence nc = new NonCollectionSequence();
        InterfaceVsIterator.display(nc.iterator());
        /**
         * 生成Iterator是将队列与消费队列的方法连接在一起耦合度最小的方式，并且与实现Collection相比，
         * 它在序列类上所施加的约束也少的多
         */
    }
}
