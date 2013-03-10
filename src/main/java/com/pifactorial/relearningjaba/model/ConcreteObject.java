package com.pifactorial.relearningjaba.model;

public class ConcreteObject implements IObject {

    private final String name;

    /**
     * @param name
     */
    public ConcreteObject(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
    
}
