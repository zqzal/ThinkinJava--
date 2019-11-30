package com.com.thinkinginjava11;

import com.com.thinkinginjava11.pettest.pets1.Cat;
import com.com.thinkinginjava11.pettest.pets1.Dog;
import com.com.thinkinginjava11.pettest.pets1.Hamster;
import com.com.thinkinginjava11.pettest.pets1.Pet;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by xuxi on 2019/11/30.
 */
public class PetMap {
    public static void main(String[] args) {
        Map<String,Pet> petMap = new HashMap<>();
        petMap.put("My Cat",new Cat("Molly"));
        petMap.put("My Dog",new Dog("Ginger"));
        petMap.put("My Hamster",new Hamster("Bosco"));
        System.out.println(petMap);

        Pet dog = petMap.get("My Dog");
        System.out.println(dog);

        System.out.println(petMap.containsKey("My Dog"));
        System.out.println(petMap.containsValue(dog));

    }
}
