package com.pifactorial.relearningjaba;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.pifactorial.relearningjaba.module.SomeServiceModule;
import com.pifactorial.relearningjaba.service.SomeService;

public class App 
{

    public App() {
    }

    public void test() {
        System.out.println("Testing!");
        Injector injector = Guice.createInjector(new SomeServiceModule());
        SomeService service = injector.getInstance(SomeService.class);
        service.doStuff();
    }

    public static void main( String[] args )
    {
        App app = new App();
        app.test();
    }
}
