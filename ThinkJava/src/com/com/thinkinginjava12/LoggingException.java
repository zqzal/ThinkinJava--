package com.com.thinkinginjava12;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * Created by xuxi on 2019/12/2.
 */
public class LoggingException extends Exception {
    private static Logger logger = Logger.getLogger("LoggingException");
    public LoggingException(){
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
    /**
     * 静态的Logger.getLogger()方法创建了一个String参数的相关联的Logger对象(通常与错误相关
     * 的包名和类名)，这个Logger对象会将其输出发送到System.err。向Logger写入的最简单的方式就是直接调用
     */
}
