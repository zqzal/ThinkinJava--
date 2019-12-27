package com.com.thinkinginjava14;

import java.util.Random;

/**
 * Created by xuxi on 2019/12/27.
 */

/**
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
class Initable{
    static final int staticFinal = 47;
    static final int staticFinal2 = ClassInitialization.rand.nextInt(1000);
    static {
        System.out.println("Initializing Initable");
    }
}

class Initable2{
    static int staticNonFinal = 147;
    static {
        System.out.println("Initializing Initable2");
    }
}

class Initable3{
    static int staticNonFinal = 74;
    static {
        System.out.println("Initializing Initable3");
    }
}


public class ClassInitialization {
    public static Random rand = new Random(47);

    public static void main(String[] args) throws Exception{
        Class initable = Initable.class;
        System.out.println("After creating Initable ref");
        //Does not trigger initializationg 不触发初始化
        System.out.println(Initable.staticFinal);
        //Does trigger initializationg 是否触发初始化
        System.out.println(Initable.staticFinal2);

        //Does trigger initializationg 是否触发初始化
        System.out.println(Initable2.staticNonFinal);

        Class initable3 = Class.forName("com.com.thinkinginjava14.Initable3");
        System.out.println("After creating Initable3 ref");
        System.out.println(Initable3.staticNonFinal);

    }
}
/**
 初始化有效地实现了尽可能的"惰性"。从对initable引用的创建中可以看到，仅使用.class
 语法来获得对象的引用不会引发初始化。但是，为了产生Class引用，Class.forName()立即
 就进行了初始化，就像在对initable3引用的创建中所看到的。
 如果一个static final值是"编译期常量"，就像Initable.staticFinal那样，那么这个值
 不需要对Initable类进行初始化就可以被读取。但是，如果只是将一个域设置为static和final
 的，还不足以确保这种行为，例如，Initable.staticFinal2的访问将强制进行类的初始化，因为他不是
 一个编译期常量。
   如果一个static域不是final的，那么在对它访问时，总是要求在它被读取之前，要先进行链接（为这个
 域分配存储空间）和初始化（初始化该存储空间），就像在对Initable2.staticNonFinal的访问中看到
 的那样。
 */
