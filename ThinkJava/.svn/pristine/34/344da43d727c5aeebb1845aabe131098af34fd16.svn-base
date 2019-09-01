package com.com.thinkinginjava5;

/**
 * Created by xuxi on 2019/2/13.
 */

import com.xuxi.Bool;

/**
 * 无论创造多少个对象，静态数据只占有一份存储区域。static关键字不能应用于局部变量，因此它只能
 * 作用于域。如果一个域是静态的基本类型域，且也没有对它进行初始化，那么它就会获得基本类型的标准
 * 初值；如果它是一个对象引用，那么它的默认初始值就是null。
 */

class Bowl{
    Bowl(int marker){
        System.out.println("Bowl("+ marker + ")");
    }
    void f1(int marker){
        System.out.println("f1(" + marker + ")");
    }
}
class Table{
    static Bowl bowl1 = new Bowl(1);
    Table(){
        System.out.println("Table()");
        bowl2.f1(1);
    }
    void f2(int marker){
        System.out.println("f2(" + marker + ")");
    }
    static Bowl bowl2 = new Bowl(2);
}
class Cupboard{
    Bowl bowl3 = new Bowl(4);
    static Bowl bowl4 = new Bowl(4);
    Cupboard(){
        System.out.println("Cupboard()");
        bowl4.f1(2);
    }
    void f3(int marker){
        System.out.println("f3(" + marker + ")");
    }
    static Bowl bowl5 = new Bowl(5);
}

public class StaticInitilization {
    public static void main(String[] args) {
        System.out.println("Creating new Cupboard() in main");
        new Cupboard();
        System.out.println("Creating new Cupboard() in main");
        new Cupboard();
        table.f2(1);
        cupboard.f3(1);
    }
    static Table table = new Table();
    static Cupboard cupboard =new Cupboard();
}
