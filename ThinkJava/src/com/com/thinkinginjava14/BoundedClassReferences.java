package com.com.thinkinginjava14;

/**
 * Created by xuxi on 2019/12/27.
 */
//BoundedClassReferences 有界的类引用
public class BoundedClassReferences {
    public static void main(String[] args) {
        Class<? extends Number> bounded = int.class;
        bounded = double.class;
        bounded = Number.class;
        //Or anything else derived from Number 或从Number衍生的其他任何东西
    }
}
/**
   向Class引用添加泛型语法的原因仅仅是为了提供编译期类型检查，因此如果你操作有无，
 稍后立即就会发现这一点。在使用普通Class引用，你不会误入歧途，但是如果你确实犯了错误，'
 那么直到运行时你才会发现它，而这显得很不方便。
   下面的示例使用了泛型类语法。它储存了一个类引用，稍候又产生了一个List，填充这个List
 的对象是使用newInstance()方法，通过该引用生成的：
 */