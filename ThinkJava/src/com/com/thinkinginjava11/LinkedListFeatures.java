package com.com.thinkinginjava11;

/**
 * Created by xuxi on 2019/11/29.
 */

import com.com.thinkinginjava11.pettest.pets1.Hamster;
import com.com.thinkinginjava11.pettest.pets1.Pet;
import com.com.thinkinginjava11.pettest.pets1.Pets;
import com.com.thinkinginjava11.pettest.pets1.Rat;

import java.util.LinkedList;

/**
 * LinkedList也像ArrayList一样实现了基本的List接口，但是它执行某些操作（在List的中间插入和移除）
 * 时比ArrayList更高效，但在随机访问操作方面确要逊色一些。
 * LinkedList还添加了可以使其用作栈、队列或双端队列的方法。、
 */
public class LinkedListFeatures {

    public static void main(String[] args) {
        LinkedList<Pet> pets = new LinkedList<>(Pets.arrayList(5));
        System.out.println(pets);
        //Identical 相同
        System.out.println("pets.getFirst(): " + pets.getFirst());
        System.out.println("pets.element(): " + pets.element());
        //Only differs in empty-list behavior 只有空列表行为有所不同
        System.out.println("pets.peek(): " + pets.peek());

        //Indetical; remove and return the first element 相同;删除并返回第一个元素
        System.out.println("pets.remove():" + pets.remove());

        System.out.println("pets.removeFirst():" + pets.removeFirst());
        //Only differs in empty-list behavior 仅空列表行为有所不同
        System.out.println("pets.poll(): "+ pets.poll());

        System.out.println(pets);

        pets.addFirst(new Rat());
        System.out.println("After addFirst():" + pets);

        System.out.println(Pets.randomPet());

        pets.offer(Pets.randomPet());
        System.out.println("After offer(): " + pets);

        pets.add(Pets.randomPet());
        System.out.println("After add():" + pets);

        pets.addLast(new Hamster());
        System.out.println("After addLast():" + pets );

        System.out.println("pets.removeLast(): " + pets.removeLast());
        /**
         * Pets.arrayList()结果交给了LinkedList的构造器，以便使用它来组装LinkedList.
         * 如果你浏览一下Queue接口就会发现，它在LinkedList的基础上添加了element()、offer()、
         * peek()、poll()和remove()方法，以使其可以称为一个Queue的实现。Q
         */
    }


}
