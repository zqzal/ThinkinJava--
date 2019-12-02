package com.com.thinkinginjava11;

import com.com.thinkinginjava11.pettest.pets1.Pet;
import com.com.thinkinginjava11.pettest.pets1.Pets;

import java.util.AbstractCollection;
import java.util.Collections;
import java.util.Iterator;

/**
 * Created by xuxi on 2019/12/2.
 */
public class CollectionSequence extends AbstractCollection<Pet> {
    private Pet[] pets = Pets.createArray(8);
    @Override
    public Iterator<Pet> iterator() {

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

            @Override
            public void remove() { //不必实现
                throw new UnsupportedOperationException();
            }
        };
    }

    @Override
    public int size() {
        return pets.length;
    }

    public static void main(String[] args) {
        CollectionSequence c = new CollectionSequence();
        InterfaceVsIterator.display(c);
        InterfaceVsIterator.display(c.iterator());
    }
}
