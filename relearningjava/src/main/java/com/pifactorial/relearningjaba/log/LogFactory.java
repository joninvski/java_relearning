package com.pifactorial.relearningjaba.log;

import org.apache.log4j.Logger;

public class LogFactory {
    public static Logger make() {
        Throwable t = new Throwable();
        StackTraceElement directCaller = t.getStackTrace()[1];
        return Logger.getLogger(directCaller.getClassName());
    }
}
