package com.com.thinkinginjava11;

import com.com.thinkinginjava11.pettest.pets1.Pet;
import com.com.thinkinginjava11.pettest.pets1.Pets;

import java.util.Iterator;
import java.util.List;

/**
 * Created by xuxi on 2019/11/29.
 */
public class SimpleIteration {

    public static void main(String[] args) {
        List<Pet> pets = Pets.arrayList(12);
        Iterator<Pet> it = pets.iterator();
        while (it.hasNext()){
            Pet p = it.next();
            System.out.println(p.id() + ":" + p + " ");
        }
        System.out.println();
        //A simpler approach,when possible 如果可能，采用更简单的方法
        for (Pet p : pets) {
            System.out.println(p.id() + ":" + p + "");
        }
        it = pets.iterator();
        for (int i = 0; i < 6; i++) {
            it.next();
            it.remove();
        }
        System.out.println(pets);
        /**
         * 有了Iterator就不必为容器中元素的数量操心了，那是有hasNext()和next()关心的事情。
         * 如果你只是向前遍历List,并不打算修改List对象本身，那么你可以看到foreach语法会显得更加简洁
         * Iterator还可以移除有next()产生的最后一个元素，这意味着在调用remove()之前必须先调用next();.
         * 接受对象容器并传递它，从而在每个对象上都执行操作，这种思想十分强大，并且贯穿于本书。
         */

    }

}
