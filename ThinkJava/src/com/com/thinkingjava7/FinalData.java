package com.com.thinkingjava7;

/**
 * Created by xuxi on 2019/2/25.
 */

import java.util.Random;

/**
 * 1.final数据
 * 许多编程语言都有某种方法，来向编译器告知一块数据是恒定不变的。有时数据的恒定
 * 不变是很有用的，比如：
 * 1.一个永不改变的编译时常量。
 * 2.一个在运行时被初始化的值，而你不希望它被改变。
 * 对于编译器常量这种情况，编译器可以将该常量值代入任何可能用到它的计算式中，也就是说，
 * 可以在编译时执行计算式，这减轻了一些运行定义的时候，在Java中，这类常量必须式基本数据
 * 类型，并且以关键字final表示。在对这个常量进行定义的时候，必须对其进行赋值。

 * 一个即是static又是final的域只占据一段不能改变的存储空间。

 * 当对对象引用而不是基本类型运用final时，其含义会有一点令人迷惑。对于基本类型，final使
 * 数值恒定不变；而用于对象引用，final使引用恒定不变。一旦引用被初始化指向一个对象，就无法
 * 在把它的改为指向另一个对象。然而，对象其自身确实可以被修改的，Java并未提供使任何对象
 * 恒定不变的途径（但可以自己编写类以取得使对象恒定不变的效果）。这一限制同样适用数组，
 * 它也是对象。
 * 下面的示例示范了final域的情况。注意，根据惯例，即是static又是final的域（即编译器常量）
 * 将用大写表示，并使用下划线分隔各个单词：
 */
class Value{
    int i;
    public Value(int i){
        this.i = i;
    }
}

public class FinalData {

    private static Random rand = new Random(47);
    private String id;
    public FinalData(String id){
        this.id = id;
    }
    //Can be compile-time constants:
    private final int valueOne = 9;
    private static final int VALUE_TWO = 99;
    //Typical public constant:
    public static final int VALUE_THREE = 39;
    //Cannot be complite-time constants;
    private final int i4 = rand.nextInt(20);
    static final int INT_5 = rand.nextInt(22);
    private Value v1 = new Value(11);
    private final Value v2 = new Value(22);
    private static final Value VAL_3 = new Value(33);
    //Arrays:
    private final int[] a = {1,2,3,4,5,6};
    public String  toString(){
        return id + ": " + "i4 = "+ i4 + ", INT_5 = " + INT_5;
    }

    public static void main(String[] args) {
        FinalData fd1 = new FinalData("fd1");
        //! fd1,valueOne++;  //Error; cannot change value
        fd1.v2.i++; //Object isnot constant!
        fd1.v1 = new Value(9); //OK  --  not final
        for (int i = 0; i < fd1.a.length; i++) {
            fd1.a[i]++; //Object isnot constant!
//            fd1.v2 = new Value(0); //Error Can not
//            fd1.VAL_3 = new Value(1); //change reference
//            fd1.a = new int[3];
        }
        System.out.println(fd1);
        System.out.println("Creating new FinalData");
        FinalData fd2 = new FinalData("fd2");
        System.out.println(fd1);
        System.out.println(fd2);
    }
}
/**
 * 由于valueOne和VALUE_TWO都是带有编译时数值的final基本类型，所以它们二者均可以用做编译期常量，
 * 并且没有重大区别。VALUE_THREE是一种更加典型的对常量进行定义的方式：定义为public，则可以被用于
 * 包之外；定义为static，则强调只有一份；定义为final，则说明它是一个常量。请注意，带有恒定初始值
 * （即，编译器常量）的final static基本类型全用大写字母命名，并且字与字之间用下划线隔开（这就像C
 * 常量一样，C常量是这一命名的传统的发源地）。
 * 我们不能因为某数据是final的就认为在编译时可以知道它的值。在运行时使用随机生成的数值来初始化
 * i4和INT_5就说明了这一点。示例部分也展示了将final数值定义为静态和非静态的区别。此区别只有当
 * 数值在运行时才会显现，这是因为编译器对编译时数值一视同仁（并且它们可能因优化而消失）。当运行
 * 程序时就会看到这个区别。请注意，在fd1和fd2中i4的值是唯一的，但INT_5的值是不可以通过创建
 * 第二个FinalData对象而加以改变的。这是因为它是static的，在装载时已被初始化，而不是每次创建
 * 对象时都初始化。
 * v1和VAL_3这些变量说明了final引用的意义。正如在main()中所看到的，不能因为v2是final的，就
 * 认为无法改变它的值。由于它是一个引用，final意味着无法将v2再次指向另一个新的对象。这对数组具有
 * 同样的意义，数组只不过是另一种引用（我还不知道有什么办法能使数组引用本身成为final）。看起来，
 * 使引用成为final没有使基本类型成为final的用处大。
 */
