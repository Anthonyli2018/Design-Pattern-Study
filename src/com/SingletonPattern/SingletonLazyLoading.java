package com.SingletonPattern;

/**
 * 最基本实现方式，不支持多线程
 */
public class SingletonLazyLoading {
    private static SingletonLazyLoading instance;

    private SingletonLazyLoading(){};

    public static  SingletonLazyLoading getInstance() {
        if(instance == null){
            instance = new SingletonLazyLoading();
        }
        return instance;
    }

}
