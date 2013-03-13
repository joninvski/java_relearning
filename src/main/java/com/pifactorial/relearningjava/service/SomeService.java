package com.pifactorial.relearningjava.service;

import com.google.inject.Inject;
import com.pifactorial.relearningjava.model.IObject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class SomeService implements ISomeService {
    private	final Logger log = LoggerFactory.getLogger(SomeService.class);
    private final ISomeOtherService otherService;

    /**
     * @param someObject
     */
    @Inject
    public SomeService(ISomeOtherService otherService) {
    	log.warn("Consctruct");
        this.otherService = otherService;
    }
 
	@Override
	public void doStuff(IObject object) {
		 System.out.println("Doing stuff");
         otherService.work();
	     log.debug("DEBUGGING");
	}

}
