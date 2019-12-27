package com.com.thinkinginjava14;

/**
 * Created by xuxi on 2019/12/27.
 */

import com.com.thinkinginjava11.pettest.pets1.Individual;

/**
 14.3 类型转换前先做检查
 迄今为止，我们已知的RTTI形式包括:
 1.传统的类型转换，如"（Shape）"，由RTTI确保类型转换的正确性，如果执行了一个错误
 的类型转换，就会抛出一个ClassCastException异常。
 2.代表对象的类型的Class对象。通过查询Class对象可以获取运行时所需的信息。
 在C++中，经典的类型转换"(Shape)"并不实用RTTI。它只是简单地告诉编译器将这个对象
 作为新的类型对待。而Java要执行类型检查，这通常被称为"类型安全的向下转型"。之所以
 叫"向下转型"，是由于类层次结构图从来都是这个排列的。如果将Circle类型转换为Shape类型
 被称作向上转型，那么将Shape转型为Circle，就被称为向下转型。但是，由于知道Circle肯定
 是一个Shape，所以编译器允许自由地做向上转型的赋值操作，而不需要任何显示的转型操作。
 编译器无法知道对于给定的Shape到底是什么Shape--它可能是Shape，或者是Shape的字类型，
 例如Circle、Square、Triangle或某种其他的类型。在编译器。编译器只能知道它是Shape。因此，
 如果不实用显式的类型转换，编译器就不允许你执行向下转型赋值，以告知编译器你拥有额外的信息，
 这些信息使你知道该类型是某种特定类型（编译器将检查向下转型是否合理，因此它不允许向下转型
 到实际上不是待转型类的子类的类型上）。
 RTTI在Java中还有第三种形式，就是关键字instanceof。它返回一个布尔值，告诉我们对象
 是不是某个特定类型的实例。可以用提问的方式使用它，就像这样
 if(x instaceof Dog)
 ((Dog)x).bark();
 在将x转型称一个Dog前，上面的if语句会检查对象x是否从属于Dog类。进行向下转型前，
 如果没有其他信息可以告诉你这个对象是什么类型，那么使用instanceof是非常重要的，否则会
 得到一个ClassCastException异常。
 一般，可能想要查找某种类型（比如要找三角形，并填充成紫色），这时可以轻松地使用instanceof
 来计数所有对象。例如，假设你有一个类的继承体系，描述了Pet(以及它们的主人，这是在后面的示例中
 出现的一个非常方便的特性)。在这个继承体系中每个Individual都有一个id和一个可选的名字。尽管
 下面的类都继承自Individual，但是Individual类复杂性较高，因此其代码将放到底17章中进行说明
 与解释。正如你可以看到的，此处并不需要去了解Individual的代码--你只需了解你可以创建其具名和
 不具名的对象，并且每个Individual都有一个id()方法，可以返回其唯一的标识符（通过对每个对象计数
 而创建的）。还有一个toSting()方法，如果你没有为Individual提供名字，toString()方法只产生类型名。
 */
public class Person extends Individual {
    public Person(String name){
        super(name);
    }
}
