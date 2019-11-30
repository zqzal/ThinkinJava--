package com.com.thinkinginjava11;

import com.com.thinkinginjava11.pettest.pets1.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by xuxi on 2019/11/30.
 */
public class MapOfList {

    public static Map<Person,List<? extends Pet>> petPeople = new HashMap<>();

    static {
        petPeople.put(new Person("Dawn"), Arrays.asList(new Cymric("Mollu"),new Mutt("Spot")));
        petPeople.put(new Person("Kate"),Arrays.asList(new Pug("Louie"),new Cat("Stanford"),new Cat("Pinkola")));

    }


    public static void main(String[] args) {


        System.out.println("Peopel: " + petPeople.keySet());
        System.out.println("Pets:" + petPeople.values());
        for (Person person : petPeople.keySet()){
            System.out.println(person + "has:");
            for (Pet pet : petPeople.get(person)){
                System.out.println("   " + pet);
            }
        }
    }
}
