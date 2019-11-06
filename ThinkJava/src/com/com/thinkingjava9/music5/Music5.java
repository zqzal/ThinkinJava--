package com.com.thinkingjava9.music5;

import com.com.thinkinginjava8.Note;

/**
 * Created by xuxi on 2019/11/6.
 */
public class Music5 {
    static void tune(Instrument i){
        i.play(Note.MIDDLE_C);
    }

    static void tuneAll(Instrument[] e){
        for (Instrument i: e) {
            tune(i);
        }
    }

    public static void main(String[] args) {

        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };
        tuneAll(orchestra);

    }
}
