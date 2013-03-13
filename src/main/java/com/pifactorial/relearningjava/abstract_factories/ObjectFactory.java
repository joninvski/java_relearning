package com.pifactorial.relearningjava.abstract_factories;

import com.pifactorial.relearningjava.abstract_factories.IObjectFactory;
import com.pifactorial.relearningjava.model.ConcreteObject;
import com.pifactorial.relearningjava.model.IObject;

public class ObjectFactory implements IObjectFactory {

   public IObject create(String name){
        return new ConcreteObject(name);
   }
}
