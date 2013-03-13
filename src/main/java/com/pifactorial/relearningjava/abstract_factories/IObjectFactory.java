package com.pifactorial.relearningjava.abstract_factories;

import com.pifactorial.relearningjava.model.IObject;

/**
 * Hello world!
 *
 */
public interface IObjectFactory 
{
    public IObject create(String objectName);
}

