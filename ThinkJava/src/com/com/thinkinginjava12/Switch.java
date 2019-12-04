package com.com.thinkinginjava12;

/**
 * Created by xuxi on 2019/12/4.
 */
/**
 * 对于没有垃圾回收和析构函数自动调用机制的语言来说，finally非常重要。它能使
 * 程序员保证：无论try块里发生了什么，内存总能得到释放。但Java有垃圾回收机制，
 * 所以内存释放不再是问题。而且，Java也没有析够函数可供调用。那么，Java在什么
 * 情况下才能用到finally呢？
 * 当要把除内存之外的资源恢复到它们的初始状态时，就要用到finally子句。这种需要
 * 清理的资源包括：已经打开的文件或网络连接，在屏幕上画的图形，甚至可以是外部世界
 * 的某个开关，
 */

public class Switch {
    private boolean state = false;
    public boolean read(){
        return state;
    }

    public void on(){
        state = true;
        System.out.println(this);
    }

    public void off(){
        state = false;
        System.out.println(this);
    }

    @Override
    public String toString() {
        return state ? "on" : "off";
    }
}
