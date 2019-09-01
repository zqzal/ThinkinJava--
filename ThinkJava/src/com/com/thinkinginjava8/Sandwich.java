package com.com.thinkinginjava8;

/**
 * Created by xuxi on 2019/3/11.
 */
/**
 * 构造器和多态
 * 通常，构造器不同于其他种类的方法。涉及到多态时仍是如此。尽管构造器并不具有多态性
 * （它们实际上是static方法，只不过该static声明是隐式的），但还是非常必要理解构造器
 * 怎样通过多态在复杂的层次结构中运作，这一理解将有助于大家避免一些令人不快的困扰。
 *
 * 8.3.1 构造器的调用顺序
 * 构造器的调用顺序已在第5章进行了简要说明，并在第7章再次提到，但那些都是在多态引入
 * 之前介绍的。
 *   基类的构造器总是在导出类的构造过程中被调用，而且按照继承层次逐渐向上链接，以使
 * 每个基类的构造器都能得到调用。这样做是有意义的，因为构造器具有一项特殊任务：检查
 * 对象是否被正确地构造。导出类只能访问它自己的成员，不能访问基类中的成员（基类成员
 * 通常是private类型）。只有基类的构造器才具有恰当的知识和权限来对自己的元素进行初
 * 始化。因此，必须令所有构造器都得到调用，否则就不可能正确构造完整对象。这正是编译器
 * 为什么要强制每个导出类部分都必须调用构造器的原因。在导出类的构造器主体中，如果没有
 * 明确指定调用每个基类构造器，它就会"默默"地调用默认构造器。如果不存在默认构造器，编译
 * 器就会报错（若某个类没有构造器，编译器会自动合成一个默认构造器）。
 *
 */

class Meal{
    Meal(){
        System.out.println("Meal()");
    }
}

class Bread{
    Bread(){
        System.out.println("Bread()");
    }
}

class Cheese{
    Cheese(){
        System.out.println("Cheese()");
    }
}

class Lettuce{
    Lettuce(){
        System.out.println("Lettuce()");
    }
}

class Lunch extends Meal{
    Lunch(){
        System.out.println("Lunch()");
    }
}

class PortableLunch extends Lunch{
    PortableLunch(){
        System.out.println("PortableLunch()");
    }
}

public class Sandwich extends PortableLunch{

    private Bread b = new Bread();
    private Cheese c = new Cheese();
    private Lettuce l = new Lettuce();
    public Sandwich(){
        System.out.println("Sandwich()");
    }

    public static void main(String[] args) {
        new Sandwich();
    }
}

/**
 * 在这个例子中，用其他类创建了一个复杂的类，而且每个类都有一个声明它自己的构造器。
 * 其中最重要的类是Sandwich，它反映了三重继承（若将子Object的隐含继承也算在内，就是
 * 四层），以及三个成员对象。当在main()里创建了一个Sandwich对象后，就可以看到输出结果。
 * 这也表明了这个一复杂对象调用构造器要遵照下面的顺序：
 *   1) 调用其类构造器。这个步骤会不断地反复递归下去，首先是构造这种层次结构的根，然后
 *   是下一层导出类，等等，直到最底层的导出类。
 *   2) 按声明顺序调用成员的初始化方法。
 *   3) 调用导出类构造器的主体。
 * 构造器的调用顺序是很重要的。当进行继承时，我们已经知道基类的一切，并且可以访问基类中
 * 任何声明为public和protected的成员。这意味着导出类中。必须假定基类的所有成员都是有
 * 效的。一种标准方法是，构造动作一经发生，那么对象所有部分的全体成员都会得到构建。然而
 * ，在构造器内部，我们必须确保所要使用的成员都已经构建完毕。为确保这一目的，唯一的办法
 * 就是首先调用基类构造器。那么在进入导出类构造器时，在基类中可供我们访问的成员已得到初
 * 始化。此外，知道构造器中的所有成员都有效也是因为，当成员对象在类内进行定义的时候（比
 * 如上例中的b、c和l），只要有可能，就应该对他们进行初始化（也就是说，通过组合方法将对
 * 象置于类内）。若遵循这一规则，那么就能保证所有基类成员以及当前对象的成员对象都被初始
 * 化了。但遗憾的是，这种做法并不使用于所有情况，这一点我们会在下一节中看到。
 */
