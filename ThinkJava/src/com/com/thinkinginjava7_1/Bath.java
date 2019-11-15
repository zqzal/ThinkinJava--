package com.com.thinkinginjava7_1;

/**
 * Created by xuxi on 2019/2/21.
 */

class Soap{
    private String s;
    Soap(){
        System.out.println("Soap()");
        s = "Constructed";
    }
//    public String toString(){
//        return s;
//    }

    @Override
    public String toString() {
        return super.toString();
    }
}

public class Bath {

    private String
            s1 = "Happy",
            s2 = "Happy",
            s3 , s4;
    private Soap castitle;
    private int i;
    private float toy;
    public Bath(){
        System.out.println("Inside Bath()");
        s3 = "Joy";
        toy = 3.14f;
        castitle = new Soap();
    }

    public String toString(){
        if (s4 == null){
            s4 = "Joy";
        }
        return
                "s1 = " + s1 + "\n" +
                "s2 = " + s2 + "\n" +
                "s3 = " + s3 + "\n" +
                "s4 = " + s4 + "\n" +
                "i = " + i + "\n" +
                "toy = " + toy + "\n" +
                "castille = " + castitle;
    }

    public static void main(String[] args) {
        Bath b = new Bath();
        System.out.println(b);
    }
    /**
     * 请注意，在Bath的构造器中，有一行语句在所有初始化产生之前就已经执行了。如果没有
     * 在定义初始化，那么除非发生了不可避免的运行期异常，否则将不能保证信息在发送给对象
     * 引用之前已经被初始化。
     * 当toString()被调用时，它将填充s4的值，以确保所有的域在使用之时已被妥善初始化。
     */

}
