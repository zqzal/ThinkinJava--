package com.com.thinkingjava9;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;

/**
 * Created by xuxi on 2019/11/12.
 */
public class RandomWords implements Readable {

    private static Random rand = new Random(47);




    @Override
    public int read(CharBuffer cb) throws IOException {
        return 0;
    }
}
