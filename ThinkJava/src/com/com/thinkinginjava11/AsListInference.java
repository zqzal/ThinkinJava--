package com.com.thinkinginjava11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by xuxi on 2019/11/27.
 */
public class AsListInference {
    public static void main(String[] args) {
        List<Snow> snow1 = Arrays.asList(new Crusty(),new Slush(),new Powder());

        List<Snow> snows2 = Arrays.asList(new Light(),new Heavy());

        List<Snow> snows3 = new ArrayList<>();
        Collections.addAll(snows3,new Light(),new Heavy());
        List<Snow> snows4 = Arrays.<Snow>asList(new Light(),new Heavy());
        /**
         * 当试图创建snow2 时间
         */
    }
}
