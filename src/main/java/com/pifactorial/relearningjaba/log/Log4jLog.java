package com.pifactorial.relearningjaba.log;

import org.apache.log4j.Logger;

public class Log4jLog implements ILogger {
    
    public Log4jLog() {
    }

    public static Logger make() {
        // Throwable t = new Throwable();
        // StackTraceElement directCaller = t.getStackTrace()[1];
        // System.out.println(directCaller.getClassName().toString());
        // return Logger.getLogger(directCaller.getClassName());
        return Logger.getLogger("ola");
    }

    @Override
    public void debug(String string) {
        System.out.println("Logging");
        // logger.debug(string);
    }
}
