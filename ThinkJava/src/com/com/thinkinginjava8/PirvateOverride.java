package com.com.thinkinginjava8;

/**
 * Created by xuxi on 2019/3/5.
 */

/**
 * 缺陷："覆盖"私有方法
 */
public class PirvateOverride {
    private void f(){
        System.out.println("private f()");
    }

    public static void main(String[] args) {
        PirvateOverride po = new PirvateOverride();
        po.f();
    }
}
class Derived extends PirvateOverride{
    public void f(){
        System.out.println("public f()");
    }
}
/**
 * 我们所期望输出是public f(),但是由于private方法被自动认为是final方法，
 * 而且对导出类是屏蔽的。因此，在这种情况下，Derived类中的f()方法就是一个
 * 全新的方法，既然基类中的f()方法在子类Derived中不可见，因此甚至也不能被
 * 重载。
 * 结论就是：只有非private方法才可以被覆盖；但是还需要密切注意覆盖private
 * 方法的现象，这是虽然编译器不会报错，但是也不会按照我们所期望的来执行。确切
 * 地说，在导出类中，对于基类中的private方法，最好采用不同的名字。
*/