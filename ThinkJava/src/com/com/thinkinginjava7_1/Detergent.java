package com.com.thinkinginjava7_1;

/**
 * Created by xuxi on 2019/2/21.
 */

class Cleanser {
    private String s = "Cleanser";
    public void append(String a){
        s += a;
    }
    public void dilute() {
        append(" dilute()");
    }
    public void apply(){
        append(" apply()");
    }
    public void scrub() {
        append(" scrub()");
    }
    public String toString(){
        return s;
    }

    public static void main(String[] args) {
        Cleanser x = new Cleanser();
        x.dilute();
        x.apply();
        x.scrub();
        System.out.println(x);
    }

}

public class Detergent extends Cleanser{

    public void scrub(){
        append(" Detergert.scrub() ");
        super.scrub();
    }

    public void foam(){
        append(" foam() ");
    }

    public static void main(String[] args) {
        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.println(x);
        System.out.println("Testing base class:");
        Cleanser.main(args);
    }

    /**
     * 这个程序示范了Java的许多特性。首先，在Cleanser的append（）方法中，我们用 "+="操作符
     * 将几个String对象连接成s，此操作符是被Java设计者重载用以处理String对象的操作符之一（另一个是"+"）
     * Cleanser中所有的方法都必须是public的，这一点非常重要。请记住，如果没有加任何访问权限修饰词
     * ，那么成员默认的访问权限是包访问权限，它仅允许包内的成员访问。因此，在此包中，如果没有访问权限修饰词，
     * 任何人都可以使用这些方法。例如，Detergent就不成问题。但是，其他包中的某个类若要从Cleanser中继承，则
     * 只能访问public成员。所以，为了继承，一般的规则是将所有的数据成员都指定为private，将所有的方法指定为
     * public（稍后将会学到，protected成员也可以借助导出类来访问）。当然，在特殊情况下，必须做出调整，但上述方法
     * 的确是一个很有用的规则。
     */


}
