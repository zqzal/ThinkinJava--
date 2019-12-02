package com.com.thinkinginjava12;

import sun.rmi.runtime.Log;

/**
 * Created by xuxi on 2019/12/2.
 */
public class LoggingExceptions {

    public static void main(String[] args) {
        try {
            throw  new LoggingException();
        } catch (LoggingException e) {
//            e.printStackTrace();
            System.err.println("Caught " + e);
        }
        try {
            throw new LoggingException();
        } catch (LoggingException e) {
            e.printStackTrace();
        }
        /**
         *
         */
    }

}
