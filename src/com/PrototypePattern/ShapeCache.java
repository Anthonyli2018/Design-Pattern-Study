package com.PrototypePattern;

import java.util.HashMap;

public class ShapeCache {
    private static HashMap<String, Shape> shapeHashMap = new HashMap<String, Shape>();

    public static Shape getShape(String shapeId) {
        Shape cacheShape = shapeHashMap.get(shapeId);
        return (Shape) cacheShape.clone();
    }

    //对每种形状都运行数据库查询，并创建该形状
    //shapeMap.put(shapeKey, shape)
    //例如，添加三种形状
    public static void loadCache(){
        Circle circle = new Circle();
        circle.setId("1");
        shapeHashMap.put(circle.getId(), circle);
        Square square = new Square();
        square.setId("2");
        shapeHashMap.put(square.getId(),square);
        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeHashMap.put(rectangle.getId(), rectangle);
    }


}
