package com.com.thinkinginjava7_1;

/**
 * Created by xuxi on 2019/2/22.
 */
//现在，我们已介绍完了继承，关键字protected最终具有了意义。在理想世界中，仅靠关键字private就已经足够了。但在实际项目中，经常会想要将某些事物尽可能对这个世界隐藏起来，但任然允许导出类的成员访问它们。
//关键字protected就是起这个作用的。它指明“就类用户而言，这是private的，但对于任何继承于此类的导出类或其他任何位于同一个包内的类来说，它确实可以访问的。”（protected也提供了包内访问权限）
//尽管可以创建protected域，但是最好的方式还是将域保持为private；你应当一直保留“改底层实现”的权利。然后通过protected方法来控制类的继承者的访问权限。
class Villain{
    private String name;
    protected void set(String nm){
        name = nm;
    }
    public Villain(String name){
        this.name = name;
    }
    public String toString(){
        return "I am a Villain and my name is " + name;
    }
}

public class Orc extends Villain{

    private int orcNumber;
    Orc(String name,int orcNumer){
        super(name);
        this.orcNumber = orcNumer;
    }

    public void change(String name,int orcNumber){
        set(name); // Available because it is protected
        this.orcNumber = orcNumber;
    }

    public static void main(String[] args) {
        Orc orc = new Orc("Limburger",12);
        System.out.println(orc);
        orc.change("Bob",19);
        System.out.println(orc);
    }
//可以发现，change()可以访问set(),这是因为它是protected的。还应注意Orc的
//toString()方法的定义方式，它依据toString()的基类版本而定义。

}
