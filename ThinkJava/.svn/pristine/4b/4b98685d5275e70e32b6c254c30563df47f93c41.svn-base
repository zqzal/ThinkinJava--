package com.com.thinkinginjava7;

/**
 * Created by xuxi on 2019/2/25.
 */

/**
 *  2.final方法
 *  使用final方法的原因有两个。第一个原因是把方法锁定，以防任何继承类修改它的含义。
 *  这是出于设计的考虑：想要确保在继承使方法行为保持不变，并且不会被覆盖。
 *
 *  过去建议使用final方法的第二个原因是效率。在Java的早期实现中，如果将一个方法
 *  指明为final，就是同意编译器将针对该方法的所有调用都转为内嵌调用。当编译器发现
 *  一个final方法调用命令时，它会根据自己的谨慎判断，跳过插入程序代码这种正常方式
 *  而执行方法调用机制（将参数压入栈，跳至方法代码处并执行，然后跳回并清理栈中的参数，
 *  处理返回值），并且以方法体中的实际代码的副本来替换方法调用。这将消除方法调用的开销。
 *  当然，如果一个方法很大，你的程序代码就会膨胀，因此可能看不到内嵌带来的任何性能提高，
 *  因为，所带来的性能提高会因为花费于方法内的时间量而被缩减。
 *
 *  在最近的Java版本中，虚拟机（特别是hotspot技术）可以探测到这些情况，并优化去掉这些
 *  效率反而降低的额外的内嵌调用，因此不再需要使用final方法来进行优化了。事实上，这种做法
 *  正在逐渐地受到劝阻。在使用Java SE5/6时，应该让编译器和JVM去处理效率问题，只有在想要
 *  明确禁止覆盖时，才将方法设置为final的。
 *
 *  final和private关键字
 *  类中所有的private方法都隐式地指定为是final的。由于无法取用private方法，所以也就无法覆盖它。
 *  可以对private方法添加final修饰词，但这并不能给该方法增加任何额外的意义。
 */

class WithFinals{
    private final void f(){
        System.out.println("WithFinals.f()");
    }
    private void g(){
        System.out.println("WithFinals.g()");
    }
}

class OverridingPrivate extends WithFinals{
    private final void f(){
        System.out.println("OverridingPrivate.f()");
    }
    private void g(){
        System.out.println("OverridingPirvate.g()");
    }
}

class OverridingPrivate2 extends OverridingPrivate{
    public final void f(){
        System.out.println("OverridingPrivate2.f()");
    }
    public void g(){
        System.out.println("OverridingPrivate2.g()");
    }
}

//class OverridingPrivateE20 extends WithFinals{
//    @Override private final void f(){
//        System.out.println("OverridingPrivateE20.f()");
//    }
//    @Override private void g(){
//        System.out.println("OverridingPrivateE20.g()");
//    }
//}
//class OverridingPrivate2E20 extends OverridingPrivateE20 {
//    @Override public final void f() {
//        System.out.println("OverridingPrivate2E20.f()");
//    }
//    @Override public void g() {
//        System.out.println("OverridingPrivate2E20.g()");
//    }
//}

public class FinalOverridingIllusion {
    public static void main(String[] args) {
        OverridingPrivate2 op2 = new OverridingPrivate2();
        op2.f();
        op2.g();
        //You can upcast;
        OverridingPrivate op = op2;
        //But you cannot call the methods:
//        op.f();
//        op.g();
        //Same here:
        WithFinals wf = op2;
//        wf.f();
//        wf.g();

//        OverridingPrivate2E20 op3 = new OverridingPrivate2E20();
//        op3.f();
//        op3.g();
    }
}
/**
 * "覆盖"只有在某个方法是基类的接口的一部分时才会出现。即，必须能将一个对象向上转型
 * 为它的基本类型并调用相同的方法（这一点在下一章阐明）。如果某方法为private，它就
 * 不是基类的接口的一部分。它仅是一些隐藏于类中的程序代码，只不过是具有相同的名称而已。
 * 但如果在导出类以相同的"仅具有相同名称"的情况。此时你并没有覆盖该方法，仅有生成一个新
 * 的方法。由于private方法无法触及而且能有效隐藏，所以除了把它看成是因为它所归属的类的
 * 组织结构的原因而存在外，其他任何事物都不需要考虑到它。
 */
