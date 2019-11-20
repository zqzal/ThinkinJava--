package com.com.thinkinginjava10;

/**
 * Created by xuxi on 2019/11/20.
 */

/**
 * 有时你可能想要告知某些其他对象，去创建其某个内部类的对象。要实现此目的，你必须在new表达式中
 * 提供对其他外部类对象的引用，这是需要使用.new语法，就像下面这样
 */
public class DotNew {
    public class Inner{

    }

    public static void main(String[] args) {
        DotNew dn = new DotNew();
        DotNew.Inner dni = dn.new Inner(); //这里利用DotNEW的对象生成内部类Inner的对象
        //! DotNew.Inner dni = DotNew.new Inner(); //这样不允许(allow)
    }
}
