package com.com.thinkinginjava14;

/**
 * Created by xuxi on 2019/12/27.
 */
public class WildcardClassReferences {
    public static void main(String[] args) {
        Class<?> intClass = int.class;
        intClass = double.class;
    }
}
/**
    在Java SE5中，Class<?>优于平凡的Class，即便它们是等价的，并且平凡的Class如你所见，
 不会产生编译器警告信息。Class<?>的好处是它表示你并非是碰巧或者由于疏忽，而使用了一个非
 具体的类引用，你就是选择了非具体的版本。
    为了创建一个Class引用，它被限定为某种类型，或该类型的任何子类型，你需要将通配符与
 extends关键字相结合，创建一个范围。因此，与仅仅声明Class<Number>不同，现在做如下
 声明：
 */