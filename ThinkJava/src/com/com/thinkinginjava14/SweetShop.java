package com.com.thinkinginjava14;

/**
 * Created by xuxi on 2019/12/24.
 */

/**
 * RTTI(Run-Time-Type-Information)运行时类型信息 ，通过运行时类型信息程序能够使用基类的指针或引用来检查这些指针
 * 或引用所指的对象的实际派生类型。
 * RTTI提供了以下两个非常有用的操作符：
 * 1.typeId操作符，返回指针和引用所指的实际类型。
 * 2.dynamicCast操作符，将基类类型的指针或引用安全地转换为派生类型的指针或引用。
 *
 *
 * RTTI在java中的工作原理：
 *   在java中有一种称为Class对象的特殊对象，其包含与类有关的信息，RTTI既是通过Class对象来执行的，每当编写完了一个新类，
 * 然后进行编译，java虚拟机的'类加载器'子系统在运行程序时，在程序创建第一个对类的静态成员的引用时，就会加载这个类，（说明：
 * 即使在构造器前没有static关键字修饰，类的构造器也是类的静态方法，因此使用new操作符创建类对象时也可以看做是对类的静态成员的引用）
 *
 * 获得Class对象引用的方法：
 * 1.具体对象.getClass():持有此类型的对象时，可以使用此方法
 * 2.Class.forName():不需要为了获得Class引用而持有该类型的对象。但是需要注意：要放到try-cathc子句中，因为如果找不到这个类，
 * 会抛出ClassNotFoundException.获得对类的引用的同时进行初始化。
 * 3.
 */
class Candy{
  static {
      System.out.println("Loading Candy");
  }
}
class Gum{
    static {
        System.out.println("Loading Gum");
    }
}
class Cookie{
    static {
        System.out.println("Loading Cookie");
    }
}
public class SweetShop {
    public static void main(String[] args) {
        //第一种
        Candy c = new Candy();
        System.out.println("创建的对象Candy的信息:" + c.getClass());
        //第二种
        try {
            Class.forName("com.com.thinkinginjava14.Gum");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //第三种
        Class cc = Cookie.class;
        System.out.println(cc);
    }
}
