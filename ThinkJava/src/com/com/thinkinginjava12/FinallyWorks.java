package com.com.thinkinginjava12;

/**
 * Created by xuxi on 2019/12/4.
 */
class ThreeException extends Exception{

}
public class FinallyWorks {
    static int count = 0;

    public static void main(String[] args) {
        while (true){
            try{
                if (count++ == 0)
                    throw new ThreeException();
            }catch (ThreeException e){
                e.printStackTrace(System.out);
                System.out.println("ThreeException");
            }finally {
                System.out.println("In finally clause");
                if (count == 2)
                    break;  //结束while
            }

        }
    }
    /**
     * 可以从输出发现，无论异常是否被抛出，finally子句总能被执行。
     * 这个程序也给了我们一些思路，当Java中的异常不允许我们回到异常抛出的地点时，那么
     * 我们该如果应对呢？如果把try块放到循环里，就建立了一个"程序继续执行之前必须要达到"的
     * 条件。还可以加入一个static类型的计数器或者别的设置，使循环在放弃以前能尝试一定的
     * 次数。这将使程序的健壮性更上一个台阶。
     */

}
