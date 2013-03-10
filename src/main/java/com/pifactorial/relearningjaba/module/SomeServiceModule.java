package com.pifactorial.relearningjaba.module;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import com.pifactorial.relearningjaba.abstract_factories.IObjectFactory;
import com.pifactorial.relearningjaba.abstract_factories.ObjectFactory;
import com.pifactorial.relearningjaba.log.ILogger;
import com.pifactorial.relearningjaba.log.Log4jLog;

public class SomeServiceModule extends AbstractModule { 
    @Override
    protected void configure() {
        bind(IObjectFactory.class).to(ObjectFactory.class);
        bind(ILogger.class).to(Log4jLog.class);
    }
}
