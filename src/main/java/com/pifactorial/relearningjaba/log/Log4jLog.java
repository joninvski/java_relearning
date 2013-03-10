package com.pifactorial.relearningjaba.log;

import org.apache.log4j.Logger;

public class Log4jLog implements ILogger {
    // private final Logger logger;
    
    public Log4jLog() {
        // this.logger = make();
    }

    public static Logger make() {
        return Logger.getLogger("class");
    }

    @Override
    public void debug(String string) {
        System.out.println("Logging");
        // logger.debug(string);
    }
}
