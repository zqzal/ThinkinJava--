package com.com.thinkinginjava14;

/**
 * Created by xuxi on 2019/12/27.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 接下来，我们需要一种方法，通过它可以随机地创建不同类型的宠物，并且为方便起见，
 还可以创建宠物数组和List。为了使该工具能够适应多种不同的实现，我们将其定义为抽象类：
 */
public abstract class PetCreator {

    private Random rand = new Random(47);
    //The List of the different types of Pet to create 要创建的不同类型宠物的列表
    public abstract List<Class<? extends Pet>> types();

    public Pet randomPet(){ //Create one random Pet 随机创建一只宠物
        int n = rand.nextInt(types().size());
        try {
            return types().get(n).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Pet[] createArray(int size){
        Pet[] result = new Pet[size];
        for (int i = 0; i < size; i++) {
            result[i] = randomPet();
        }
        return result;
    }

    public ArrayList<Pet> arrayList(int size){
        ArrayList<Pet> result = new ArrayList<>();
        Collections.addAll(result,createArray(size));
        return result;
    }
}
/**
  抽象的getTypes()方法在导出类中实现，以获取由Class对象构成的List(这是模版方法设计模式的
 一种变体)。注意，其中类的类型被指定为"任何从Pet导出的类"，因此nexInstanc()不需要转型就可以
 产生Pet。randomPet()随机地产生List中的索引，并使用
 */