package com.com.thinkinginjava11;

import com.com.thinkinginjava11.pettest.pets1.Pet;
import com.com.thinkinginjava11.pettest.pets1.Pets;

import java.util.*;

/**
 * Created by xuxi on 2019/11/29.
 */
public class CrossContainerIteration {

    public static void display(Iterator<Pet> it){
        while (it.hasNext()){
            Pet p= it.next();
            System.out.print(p.id() + ":" + p + "");
        }
        System.out.println("\n");
    }


    public static void main(String[] args) {
        ArrayList<Pet> pets = Pets.arrayList(8);
        display(pets.iterator());

        LinkedList<Pet> petsLL = new LinkedList<>(pets);
        display(petsLL.iterator());

        HashSet<Pet> petHS = new HashSet<>(pets);
        display(petHS.iterator());

        TreeSet<Pet> petsTS = new TreeSet<>(pets);
        display(petsTS.iterator());
        /**
         * 请注意，display()方法不包含任何有关它所遍历的序列的类型信息，而这也展示了Iterator的
         * 真正威力：能够将遍历序列的操作与序列底层的结构分离。正由于此，我们有时会说：迭代器统一
         * 了对容器的访问方式
         */
    }
}
