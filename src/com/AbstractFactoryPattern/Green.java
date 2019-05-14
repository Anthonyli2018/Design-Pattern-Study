package com.AbstractFactoryPattern;

public class Green implements Color {
    @Override
    public void fill(){
        System.out.println("is "+this.getClass().getName());
    }
}
