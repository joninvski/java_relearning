package com.pifactorial.relearningjava.module;

import com.google.inject.AbstractModule;
import com.pifactorial.relearningjava.abstract_factories.IObjectFactory;
import com.pifactorial.relearningjava.abstract_factories.ObjectFactory;
import com.pifactorial.relearningjava.service.ISomeOtherService;
import com.pifactorial.relearningjava.service.SomeOtherService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SomeServiceModule extends AbstractModule { 
    @Override
    protected void configure() {
    	final Logger log = LoggerFactory.getLogger(SomeServiceModule.class);
    	log.debug("Login at configure of some service module");
    	
        bind(ISomeOtherService.class).to(SomeOtherService.class);
    }
}
