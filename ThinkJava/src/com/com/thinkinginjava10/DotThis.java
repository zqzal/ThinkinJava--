package com.com.thinkinginjava10;

/**
 * Created by xuxi on 2019/11/20.
 */

/**
 * 10.3 使用.this与.new
 * 如果你需要生成对外部类对象的引用，可以使用外部类的名字后面紧跟圆点和this。这样产生
 * 的引用自动地具有正确的类型，这一点在编译器就被知晓并受到检查，因此没有任何运行时开销。
 * 下面的例子展示了如何使用.this
 */
public class DotThis {
    void f(){
        System.out.println("DotThis.f()");
    }

    public class Inner{
       public DotThis outer(){
           return DotThis.this;
           //A plain "this" would be Inner is "this"
       }
    }

    public Inner inner(){
        return new Inner();
    }

    public static void main(String[] args) {
        DotThis dt = new DotThis();
        DotThis.Inner dti = dt.inner();
        dti.outer().f();
        dt.f();
    }
}
