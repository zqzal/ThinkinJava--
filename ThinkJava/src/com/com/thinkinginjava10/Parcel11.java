package com.com.thinkinginjava10;

/**
 * Created by xuxi on 2019/11/21.
 */

/**
 * 10.7 嵌套类
 * 如果不需要内部类对象与其外围类对象之间有联系，那么可以将内部类声明为static。这通常
 * 称为嵌套类。想要理解static应用于内部类时的含义，就必须记住，普通的内部类对象隐式地
 * 保存了一个引用，指向创建它的外围类对象。然而，当内部类是static时。就不是这样了。
 * 嵌套类意味着
 * 1.要创建嵌套类的对象，并不需要其外围类的对象。
 * 2.不能从嵌套类的对象中访问非静态的外围类对象。
 * 嵌套类与普通的内部类还有一个区别。普通内部类的字段和方法，只能放在类的外部层次上，所
 * 以普通的内部类不能有static数据和static字段，也不能包含嵌套类。但是嵌套类可以包含所有
 * 这些东西
 */
public class Parcel11 {

    private static class ParcelContents implements Contents{
        private int i = 11;
        @Override
        public int value() {
            return i;
        }
    }

    protected static class ParcelDestination implements Destination{
        private String label;
        private ParcelDestination(String whereTo){
            label = whereTo;
        }

        @Override
        public String readLabel() {
            return label;
        }
        //Nester classes can contain other static elements
        public static void f(){

        }

        static int x = 10;
        static class AnotherLevel{
            public static void f(){

            }
            static int x = 10;
        }


    }

    public static Destination destination(String s){
        return new ParcelDestination(s);
    }


    public static Contents contents(){
        return new ParcelContents();
    }

    public static void main(String[] args) {
        Contents c = contents();
        Destination d = destination("Tasmania");
        ParcelDestination.AnotherLevel.f();
    }

}
