package com.com.thinkinginjava11;

import com.com.thinkinginjava11.pettest.pets1.Pet;
import com.com.thinkinginjava11.pettest.pets1.Pets;

import java.util.List;
import java.util.ListIterator;

/**
 * Created by xuxi on 2019/11/29.
 */
public class ListIteration {


    public static void main(String[] args) {

        List<Pet> pets = Pets.arrayList(8);
        ListIterator<Pet> it = pets.listIterator();
        while (it.hasNext()){
            System.out.println(it.next() + ", " + it.nextIndex() + ", " + it.previousIndex() + "; ");
        }
        System.out.println("\n \n");

        //Backwards 向后
        while (it.hasPrevious()){
            System.out.println(it.previous().id() + " ");
        }
        System.out.println("\n \n");
        System.out.println(pets);

        it = pets.listIterator(3);
        while (it.hasNext()){
            it.next();
            it.set(Pets.randomPet());
        }
        System.out.println(pets);
    }
    /**
     * Pets.randomPet()方法用来替换在列表中从位置3开始向前的所有Pet对象。
     */
}
