package com.com.thinkinginjava9.music5;

import com.com.thinkinginjava8.Note;

/**
 * Created by xuxi on 2019/11/6.
 */
public interface Instrument {

    int VALUE = 5; //staic & final
    void play(Note n); //Automatically public
    void adjust();

}


class Wind implements Instrument {

    @Override
    public void play(Note n) {
        System.out.println(this + ".play()" + n);
    }

    @Override
    public String toString() {
        return "Wind";
    }

    @Override
    public void adjust() {
        System.out.println(this + ".adjust()");
    }
}

class Percussion implements Instrument{

    @Override
    public void play(Note n) {
        System.out.println(this + ".play()" + n);
    }

    @Override
    public String toString() {
        return "Percussion";
    }

    @Override
    public void adjust() {
        System.out.println(this + ".adjust()");
    }
}

class Stringed implements Instrument{

    @Override
    public void play(Note n) {
        System.out.println(this + ".play()" + n);
    }

    @Override
    public String toString() {
        return "Stringed";
    }

    @Override
    public void adjust() {
        System.out.println(this + ".adjust()");
    }
}

class Brass extends Wind{
    @Override
    public String toString() {
        return "Brass";
    }
}

class Woodwind extends Wind{
    @Override
    public String toString() {
        return "Woodwind";
    }
}