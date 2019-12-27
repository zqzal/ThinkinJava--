package com.com.thinkinginjava14;

/**
 * Created by xuxi on 2019/12/26.
 */

interface HasBatteries{}

interface Waterproof{}

interface Shoots{}

class Toy{
    //Comment out the following default constructor  注释掉以下默认构造函数\
    //to see NoSuchMehtodError form (*1*) 查看NoSuchMehtodError形式（* 1 *）
    Toy(){}
    Toy(int i){}
}

class FancyToy extends Toy implements HasBatteries,Waterproof,Shoots{
     FancyToy(){
         super(1);
     }
}

public class ToyTest {

    static void printInfo(Class cc){
        System.out.println("Class name: " + cc.getName() + " is interface? [" + cc.isInterface() + "]");
        System.out.println("Simple name: " + cc.getSimpleName());
        System.out.println("Canonical name : " + cc.getCanonicalName());
        System.out.println();
    }

    public static void main(String[] args) {
        Class c = null;
        try {
            c = Class.forName("com.com.thinkinginjava14.FancyToy");
        } catch (ClassNotFoundException e) {
            System.out.println("can not find FancyToy");
            System.exit(1);
        }
        printInfo(c);

        for (Class face : c.getInterfaces())
         printInfo(face);

        Class up = c.getSuperclass();
        Object obj = null;
        try {
            //Requires default constructor 需要默认构造函数
            obj = up.newInstance();
        } catch (InstantiationException e) {
            System.out.println("Cannot instantiate");
            System.exit(1);
        } catch (IllegalAccessException e) {
            System.out.println("Cannot access");
            System.exit(1);
        }
        printInfo(obj.getClass());

    }

}
/**
 FancyToy继承自Toy并实现了HasBatteries、Waterproof和Shoots接口。在main()中，用
 forName()方法在适当的try语句中，创建了一个Class引用，并将其初始化为指向FancyToyClass
 注意，在传递给forName的字符串中，你必须使用全限定名（包含包名）
   printInfo()使用getName()来产生全限定的类名，并分别使用getSimpleName()和getCanonicalName()
 （在Java SE5中引入的）来产生不包含包名的类名和全限定的类名。isInterface()方法如同其名，可以告诉
 你这个Class对象是否表示某个接口。因此，通过Class对象，你可以发现你想要了解的类型的所有信息。
  在main()中调用的Class.getInterfaces()方法返回的是Class对象，它们表示在感兴趣的Class对象
 中所包含的接口。
 如果你有一个Class对象，还可以使用getSuperclass()方法查询其直接基类，这将返回你可以用来进一步
 查询的Class对象。因此，你可以在运行时发现一个对象完整的类继承结构。
  Class的newInstance()方法是实现"虚拟构造器"的一种途径，虚拟构造器允许你声明："我不知道你的确切
 类型，但是无论如何要正确地创建你自己。"在前面的示例中，up仅仅只是一个Class引用，在编译期不具备任何
 更进一步的类型信息。当你创建新实例时，会得到Object引用，但是这个引用指向的是Toy对象。当然，在你可以
 发送Object能够接受的消息之外的任何消息之前，你必须更多地了解它，并执行某种转型。另外，使用newInstance()
 来创建的类，必须带有默认的构造器。在本章稍后部分，你将会看到如何通过使用Java的反射API，用任意的构造器
 来动态地创建类的对象。













































 */