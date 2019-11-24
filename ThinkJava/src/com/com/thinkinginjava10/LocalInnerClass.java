package com.com.thinkinginjava10;

public class LocalInnerClass {

    private int count = 0;

    /**
     * 前面提到过可以在代码块里创建内部类，典型的方式是在一个方法体的里面创建。
     * 局部内部类不能有访问说明符，因为它不是外围类的一部分,但是它可以访问当前代码
     * 快内的常量，以及此外围类的所有成员。
     * 下面的例子对局部内部类和匿名内部类的创建进行了比较
     * @param name
     * @return
     */
    Counters getCounter(final String name){ //局部内部类
        //局部内部类
        class LocalCounter implements Counters{

            public LocalCounter(){
                System.out.println("LocalCounter");
            }
            @Override
            public int next() {
                System.out.println(name); //访问本地最终字符串
                return count++;
            }
        }
        return new LocalCounter();
    }

    Counters getCounter2(final String name){ //匿名内部类也是如此
        return new Counters() {
            {
                System.out.println("Counter"); // 匿名内部类不能有一个命名的构造函数
                                               // ，只能有一个实例初始化器
            }
            @Override
            public int next() {
                System.out.println(name); //访问本地最终字符串
                return count++;
            }
        };
    }

    public static void main(String[] args) {
        System.out.println("fe");
        LocalInnerClass lic= new LocalInnerClass();
        Counters
                c1 = lic.getCounter("局部内部类"),
                c2 = lic.getCounter2("匿名内部类");
        for (int i = 0; i < 5; i++) {
            System.out.println(c1.next());
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(c2.next());
        }

    }
    /**
     * 局部内部类和匿名内部类具有相同的行为和能力。
     * 既然局部类的名字在方法外是不可见的，那为什么我们
     * 仍然使用局部内部类而不是匿名内部类呢？唯一的理由是，我们需要
     * 一个已命名的构造器，或者需要重载构造器，而匿名内部类只能用于实例初始化。
     * 所以使用局部内部类而不使用匿名内部类的另一个理由就是，需要不止一个改内部类对象
     */
}
