package com.com.thinkinginjava7;

/**
 * Created by xuxi on 2019/2/21.
 */



class Art {
    Art(){
        System.out.println("Art constructor");
    }
}

class Drawing extends Art {
    Drawing(){
        System.out.println("Drwing constructor");
    }
}

public class Cartoon extends Drawing{
    public Cartoon(){
        System.out.println("Cartoon constructor");

    }

    public static void main(String[] args) {
        Cartoon x = new Cartoon();
    }


}
