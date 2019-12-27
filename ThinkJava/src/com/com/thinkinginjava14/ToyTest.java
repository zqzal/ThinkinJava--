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

 14.2.1 类字面常量
    Java还提供了另一种方法来生成对Class对象的引用，即使用类字面常量。对上述程序来说，就像下面这样：
    FancyToy.class;
 这样做不仅更简单，而且更安全，因为它在编译时就会受到检查（因此不需要置于tyr语句块中）。并且它根除了对
 forName()方法的调用，所以也更高效。
    类字面常量不仅可以应用于普通的类，也可以应用于接口、数组以及基本数据类型。另外，对于基本数据类型的
 包装器类，还有一个标准字段TYPE。TYPE字段是一个引用，指向对应的基本数据类型的Class对象。如下所示：
 boolean.clas  --等价于--   Boolean.TYPE
 char.class  --等价于--   Character.TYPE
 byte.class  --等价于--   Byte.TYPE
 short.class --等价于--   Short.TYPE
 int.class   --等价于--   Integer.TYPE
 long.class  --等价于--   Long.TYPE
 float.class --等价于--   Float.TYPE
 double.class --等价于--  Double.TYPE
 void.class  --等价于--   Void.TYPE
   我建议使用".class"的形式，以保持于普通类的一致性。
   注意，有一点很有趣，但使用".class"来创建对Class对象的引用时，不会自动地初始化该Class
 对象。为了使用类而做的准备工作实际包含三个步骤：
  1.加载，这是有类加载器执行的。该步骤将查找字节码（通常在classpath所指定的路径中查找，但
 这并非是必须的），并从这些字节码中创建一个Class对象。
  2.链接。在链接阶段将验证类中的字节码，为静态域分配储存空间，并且如果必需的话，将解析这个类
 创建的对其他累的所有引用。
  3.初始化。如果该类具有超类，则对其初始化，执行静态初始化器和静态初始化块。











































 */