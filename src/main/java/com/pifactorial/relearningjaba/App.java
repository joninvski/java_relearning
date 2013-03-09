package com.pifactorial.relearningjaba;

import org.apache.log4j.Logger;

import com.pifactorial.relearningjaba.log.LogFactory;

public class App 
{
    private final static Logger log = LogFactory.make();

    public App(){
    }

    public void test(){
        System.out.println( "Hello World!" );
        log.error("Test teste");
    }

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        App app = new App();
        app.test();
    }
}
