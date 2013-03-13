package com.pifactorial.relearningjava;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.pifactorial.relearningjava.module.SomeServiceModule;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    final Logger log = LoggerFactory.getLogger(SomeServiceModule.class);
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        log.debug("Testing");
        
    }
}
