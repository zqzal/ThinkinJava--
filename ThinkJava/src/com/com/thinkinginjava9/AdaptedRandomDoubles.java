package com.com.thinkinginjava9;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Scanner;

/**
 * Created by xuxi on 2019/11/12.
 */
public class AdaptedRandomDoubles extends RandomDoubles implements Readable{

    private int count;
    public AdaptedRandomDoubles(int count){
        this.count = count;
    }

    @Override
    public int read(CharBuffer cb) throws IOException {
        if (count-- == 0)
            return -1;
        String result = Double.toString(next()) + " ";
        cb.append(result);

        return result.length();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(new AdaptedRandomDoubles(7));
        while (s.hasNextDouble()){
            System.out.println(s.nextDouble() + " ");
        }
    }
    /**
     * 我们再次使用了适配器模式，但是在本例中，被适配的类可以通过继承和实现Readable接口
     * 来创建。因此，通过使用interface关键字提供的伪多重继承机制，我们可以生成既是既是RandomDoubles
     * 又是Readable的新类。
     * 因为之中方式中。我们可以在任何现有类之上添加新的接口，所以意味着让方法接受接口类型，是一种让任何
     * 类都可以对该方法进行适配的方式。这就是使用接口而不是类的强大之处。
     */
}
