package com.AbstractFactoryPattern;

public class Red implements Color {
    @Override
    public void fill(){
        System.out.println("is "+this.getClass().getName());
    }
    
}
