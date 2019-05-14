package com.AbstractFactoryPattern;

import com.AbstractFactoryPattern.Shape;

public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("is "+this.getClass().getName());
    }
}
