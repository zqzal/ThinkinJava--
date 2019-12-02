package com.com.thinkinginjava12;

/**
 * Created by xuxi on 2019/12/2.
 */
public class InhertingExceptions {
    public void f() throws SimpleException{
        System.out.println("Throw SimpleException from f()");
        throw new SimpleException();
    }

    public static void main(String[] args) throws SimpleException {
        InhertingExceptions sed = new InhertingExceptions();
        sed.f();
        try{
            sed.f();
        }catch (SimpleException e){
            System.out.println("Caught it!"); //抓住它
        }
    }
    /**
     * 编译器创建了默认构造器，它将自动调用基类的默认构造器。本例中不会得到像SimpleException这样的
     * 构造器，这种构造器也不实用。你将看到，对异常来说，最重要的部分就是类名，所以本例中建立的异常类
     * 在大多数情况下已经够用了。
     *
     */
}
