package com.com.thinkinginjava14;

/**
 * Created by xuxi on 2019/12/27.
 */
/**
 14.2 泛化的Class引用
 Class引用总是指向某个Class对象，它可以制造类的实例，并包含可作用于这些实例的所有
 方法代码。它还包含该类的静态成员，因此，Class引用表示的就是它所指向的对象的确切类型，
 而该对象便是Class类的一个对象。
 但是，Java SE5的设计者们看准机会，将它的类型变得更具体了一些，而这是通过允许你对
 Class引用所指向的Class对象的类型进行限定而实现的，这里用到了泛型语法。在下面的实例中。
 两种语法都是正确的：
 Generic Class References (通用类参考)
 */
public class GenericClassReferences {
    public static void main(String[] args) {
        Class intClass = int.class;
        Class<Integer> genericIntClass = int.class;
        genericIntClass = Integer.class; // Same thing 一样
        intClass = double.class;
        // genericIntClass = double.class; //Illegal 非法
    }
}
/**
    普通的类引用不会产生警告信息，你可以看到，尽管泛型类引用只能赋值为指向器声明的
 类型，但是普通的类引用可以被重载赋值为指向任何其他的Class对象。通过使用泛型语法，可以
 让编译器强制执行额外的类型检查。
    如果你希望稍微放松一些这种限制，应该怎么办呢？咋一看，好像你应该能够执行类似下面
 这样的操作：
    Class<Number> genericNumberClass = int.class;
 这看起来似乎是起作用的，因为Integer继承自Number。但是它无法工作，因为 Integer Class
 对象不是Number Class对象的子类（这种差异看起来可能有些诡异，我们将在第15章中深入讨论它）
    为了在使用泛化的Class引用时放松限制，我使用了通配符，它是Java泛型的一部分。通配符就是
 " ？"，表示"任何事物"。因此，我们可以在上列的普通Class引用中添加通配符，并产生相同的结果：
 */