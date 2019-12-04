package com.com.thinkinginjava12;

/**
 * Created by xuxi on 2019/12/4.
 */
public class MultipleReturns {
    public static void f(int i){
        System.out.println("Initialization that requires cleanup");
        try {
            System.out.println("Point 1");
            if (i==1)
                return;
            System.out.println("Point 2");
            if (i==2)
                return;
            System.out.println("Point 3");
            if (i==3)
                return;
            System.out.println("End");
            return;
        }finally {
            System.out.println("Performing cleanup"); //执行清理
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            f(i);
        }
    }
    /**
     * 从输出中可以看出，在finally类内部，从何处返回无关紧要。
     */
}
