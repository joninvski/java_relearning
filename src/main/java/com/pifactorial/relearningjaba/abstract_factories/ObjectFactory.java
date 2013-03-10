package com.pifactorial.relearningjaba.abstract_factories;

import com.pifactorial.relearningjaba.abstract_factories.IObjectFactory;
import com.pifactorial.relearningjaba.model.ConcreteObject;
import com.pifactorial.relearningjaba.model.IObject;

public class ObjectFactory implements IObjectFactory {

   public IObject create(String name){
        return new ConcreteObject(name);
   }
}
