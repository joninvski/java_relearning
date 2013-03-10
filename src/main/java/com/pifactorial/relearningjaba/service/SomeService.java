package com.pifactorial.relearningjaba.service;

import com.google.inject.Inject;
import com.pifactorial.relearningjaba.log.ILogger;

public class SomeService implements ISomeService {
    private final ILogger logger;
    
    /**
     * @param someObject
     */
    @Inject
    public SomeService(ILogger logger) {
        this.logger = logger;
    }

    @Override
    public void doStuff() {
        System.out.println("Doing stuff");
        this.logger.debug("DEBUGGING");
    }

}
