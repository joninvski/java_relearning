package com.pifactorial.relearningjava;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.pifactorial.relearningjava.model.ConcreteObject;
import com.pifactorial.relearningjava.module.SomeServiceModule;
import com.pifactorial.relearningjava.service.SomeService;

public class App 
{

    public App() {
    }

    public void test() {
        System.out.println("Testing!");
        Injector injector = Guice.createInjector(new SomeServiceModule());
        SomeService service = injector.getInstance(SomeService.class);
        service.doStuff(new ConcreteObject("Some name"));
    }

    public static void main( String[] args )
    {
        App app = new App();
        app.test();
    }
}
