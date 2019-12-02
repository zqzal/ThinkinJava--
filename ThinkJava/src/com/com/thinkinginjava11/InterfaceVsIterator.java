package com.com.thinkinginjava11;

import com.com.thinkinginjava11.pettest.pets1.Pet;
import com.com.thinkinginjava11.pettest.pets1.Pets;

import java.util.*;

/**
 * Created by xuxi on 2019/12/2.
 */
public class InterfaceVsIterator {

    public static void display(Iterator<Pet> it){
        while (it.hasNext()){
            Pet p = it.next();
            System.out.print(p.id() + ":" + p + " ");
        }
        System.out.println();
    }


    public static void display(Collection<Pet> pets){
        for (Pet p : pets){
            System.out.print(p.id() + ":" + p + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {

        List<Pet> petList = Pets.arrayList(8);
        Set<Pet> petSet = new HashSet<>(petList);
        Map<String,Pet> petMap = new LinkedHashMap<>();
        String[] names = ("Ralph, Eric, Robin, Lacey, " + "Britney, San, Spot, Fluffy").split(", ");
        for (int i = 0; i < names.length; i++) {
            petMap.put(names[i],petList.get(i));
        }

        display(petList);
        display(petSet);
        display(petList.iterator());
        display(petSet.iterator());

        System.out.println(petMap);
        System.out.println(petMap.keySet());

        display(petMap.values());
        display(petMap.values().iterator());

        /**
         * 两个版本的display()方法都可以使用Map或Collection的子类型来工作，而且Collection接口
         * 和Iterator都可以将display()方法与底层容器的特定实现解藕。
         * 在本例中，这两种方式都可以凑效。事实上，Collection要更方便一点，因为它是Iterable类型，
         * 因此，在display(Collection)实现中，可以使用foreach结构，从而使代码更加清晰。
         *
         */
    }

}
