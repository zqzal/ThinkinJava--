package com.com.thinkinginjava10.test26;

/**
 * Created by xuxi on 2019/11/22.
 */
public class E26_InnerClassInheritance {

    class Inner2 extends WithNonDefault.Inner{
        public Inner2(WithNonDefault wnd,int i){
            wnd.super(i);
        }
        public void f(){
            System.out.println("Inner2.f");
            super.f();
        }

    }

    public static void main(String[] args) {
        WithNonDefault wnd = new WithNonDefault();
        E26_InnerClassInheritance ici = new E26_InnerClassInheritance();
        Inner2 i2 = ici.new Inner2(wnd,47);
        i2.f();
    }
}
