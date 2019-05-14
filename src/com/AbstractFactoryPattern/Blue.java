package com.AbstractFactoryPattern;

public class Blue implements Color{
    @Override
    public void fill(){
        System.out.println("is "+this.getClass().getName());
    };
}
