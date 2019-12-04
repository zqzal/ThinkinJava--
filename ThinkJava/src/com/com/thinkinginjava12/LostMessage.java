package com.com.thinkinginjava12;

/**
 * Created by xuxi on 2019/12/4.
 */
class VeryImportantException extends Exception{
    @Override
    public String toString() {
        return "A very important exception";
    }
}

class HoHumException extends Exception{
    @Override
    public String toString() {
        return "A trivial exception";
    }
}

public class LostMessage {

    void f() throws VeryImportantException{
        throw new VeryImportantException();
    }
    void dipose() throws HoHumException{
        throw new HoHumException();
    }

    public static void main(String[] args) {

        try {
            LostMessage lm = new LostMessage();
            try {
                lm.f();
            }finally {
                lm.dipose();
            }
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
    }

}
