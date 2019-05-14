package com.BuilderPattern;

/**
 * 表示食物条目和包装的接口
 */
public interface Item {
    public String name();

    public Packing packing();

    public float price();

}
