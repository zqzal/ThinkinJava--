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

/**
 * 14.2 Class对象
 *     要理解RTTI在Java中的工作原理，首先必须知道类型信息在运行时时如何表示的。这项工作
 * 时由称为Class对象的特殊对象完成的，它包含里与类有关的信息。事实上，Class对象就是用来
 * 创建类的所有的"常规"对象的。Java使用Class对象来执行其RTTI，即使你正在执行的时类似转
 * 型这样的操作。Class类还拥有大量的使用RTTI的其他方式。
 *    类是程序的一部分，每个类都是一个Class对象。换言之，每当编写并且编译了一个新类，就
 * 会产生一个Class对象（更恰当地说，是被保存在一个同名的.class文件中）。为了生成这个类
 * 的对象，运行这个程序的Java虚拟机（JVM）将使用被称为"类加载器"的子系统。
 *    类加载器子系统实际上可以包含一条类加载器链，但是只有一个原生类加载器，它是Jvm实现
 * 的一部分。原生类加载器加载的是所谓的可信类，包括Java API类，它们通常是从本地盘加载的。
 * 在这条链汇总，通常不需要添加额外的类加载器，但是如果你由特殊需求（例如以某种特殊的方式
 * 加载类，以支持Web服务器应用，或者在网络中下载类），那么你有一种方式可以挂接额外的类加
 * 载器。
 *   所有的类都是在对其第一次使用时，动态加载到JVM中的。当程序创建第一个对类的静态成员
 * 的引用时，就会加载这个类。这个证明构造器也是类的静态方法，即使在构造器之前并没有使用
 * static关键字。因此，使用new操作符创建类的新对象也会被当作对类的静态成员的引用。
 *   因此，Java程序在它开始运行之前并非被完全加载，其各个部分是在必需时才加载的。这一点
 * 与许多传统语言不同。动态加载使能的行为，在诸如C++这样的静态加载语言中是很难或者根本
 * 不可能复制的。
 *   类加载器首先检查这个类的Class对象是否已经加载。如果尚未加载，默认的类加载器就会根据
 * 类名查找.class文件（例如，某个附加类加载器可能会在数据库中查找字节码）。在这个类的字节码
 * 被加载时，它们会接受验证，以确保其没有被破坏，并且不把包含不良Java代码（这是Java中用于
 * 安全防范目的的措施之一）。
 *   一旦某个类的Class对象被载入内存，它就被用来创建这个类的所有对象。下面的示范程序可以
 * 证明这一点。
 *
 */

/**
 *  这里的每个类Candy、Gum和Cookie，都有一个static子句，该子句在类第一次被加载时执行。
 * 这时会有相应的信息打印出来，告诉我么这个类什么时候被加载了。在main()中，创建对象的代码
 * 被置于打印语句之间，以帮助我们判断加载的时间点。
 *  从输出中可以看到，Class对象仅在需要的时候才被加载，static初始化是在类加载时进行的。
 *  特别有趣的一行是
 *  Class.forName("com.com.thinkinginjava14.Gum");
 *  这个方法Class类（所有Class对象都属于这个类）的一个static成员。Class对象就和其他对象
 *  一样，我们可以获取并操作它的引用（这也就是类加载器的工作）。forName()的调用是为了它
 *  产生的"副作用"：如果类Gum还没有被加载就加载它。在加载的过程中，Gum的static子句被执行。
 *    在前面的例子里，如果Class.forName()找不到你要加载的类，它会抛出异常ClassNotFoundException
 *  这里我们只需要简单报告问题，但在更严密的程序里，可能要在异常处理程序中解决这个问题。
 *    无论何时，只要你想在运行时使用类型信息，就必须首先获得对恰当的Class对象的引用。Class.
 *  forName()就是实现此功能的便捷途径，因为你不需要为了获得Class引用而持有该类型的对象。
 *  但是，如果你已经拥有了一个感兴趣的类型的对象，那就可以通过调用getClass()方法来获取Class
 *  引用了，这个方法属于根类Object的一部分，它将返回表示该对象的实际类型的Class引用。Class
 *  包含很多有用的方法，下面是其中的一部分：
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
        System.out.println("inside main");
        new Candy();
        System.out.println("After creating Candy");
        try {
            Class.forName("com.com.thinkinginjava14.Gum");
        } catch (ClassNotFoundException e) {
            System.out.println("could not find Gum");
        }

        System.out.println("After Class.forName(\"Gum\")");

        new Cookie();
        System.out.println("After creating Cookie");

//        //第一种
//        Candy c = new Candy();
//        System.out.println("创建的对象Candy的信息:" + c.getClass());
//        //第二种
//        try {
//            Class.forName("com.com.thinkinginjava14.Gum");
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        //第三种
//        Class cc = Cookie.class;
//        System.out.println(cc);
    }
}
