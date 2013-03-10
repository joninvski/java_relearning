package com.pifactorial.relearningjaba.abstract_factories;

import com.pifactorial.relearningjaba.model.IObject;

/**
 * Hello world!
 *
 */
public interface IObjectFactory 
{
    public IObject create(String objectName);
}

