package com.PrototypePattern;

public class Circle extends Shape {
    public Circle(){
        type = "Circle";
    }
    @Override
    public void draw(){
        System.out.println("hello "+this.getClass().getName());
    }

}
