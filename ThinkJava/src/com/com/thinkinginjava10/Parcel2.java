package com.com.thinkinginjava10;

/**
 * Created by xuxi on 2019/11/20.
 */
public class Parcel2 {
    class Content{
        private int i = 11;
        public int value(){
            return i;
        }
    }

    class Destination{
        private String label;
        Destination(String whereTo){
            label = whereTo;
        }

        String readLabel(){
            return label;
        }

    }

    public Destination to(String s){
        return new Destination(s);
    }

    public Content content(){
        return new Content();
    }

    public void ship(String dest){
        Content c = content();
        Destination d = to(dest);
        System.out.println(d.readLabel());
    }

    public static void main(String[] args) {
        Parcel2 p = new Parcel2();
        p.ship("Tasmainia");
        Parcel2 q = new Parcel2();

        Parcel2.Content c = q.content();
        Parcel2.Destination d = q.to("Borneo");
        /**
         * 如果想从外部类的非静态方法之外的任意位置创建某个内部类的对象，那么必须像在main()方法
         * 中那样，具体地指明这个对象的类型: OuterClassName.InnerClassName.
         */

    }

}
