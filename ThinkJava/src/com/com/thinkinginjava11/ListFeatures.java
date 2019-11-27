package com.com.thinkinginjava11;

/**
 * Created by xuxi on 2019/11/27.
 */

import com.com.thinkinginjava11.pettest.pets1.Pet;
import com.com.thinkinginjava11.pettest.pets1.Pets;
import com.sun.scenario.effect.impl.state.PerspectiveTransformState;

import java.util.List;
import java.util.Random;

/**
 * 11.5 List
 * List承诺可以将元素维护在特定的序列中。List接口在Collection的基础上添加了大量的方法，
 * 使得可以在List的中间插入和移除元素。
 * 有两种类型的List
 */
public class ListFeatures {


    public static void main(String[] args) {
        Random rand = new Random(47);
        List<Pet> pets = Pets.arrayList(7);
        System.out.println("1: " + pets);
    }
}
