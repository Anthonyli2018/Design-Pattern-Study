package com.SingletonPattern;

/**
 * 懒汉式，第一次调用才初始化，避免内存浪费，效率较低
 */
public class SingleLazyLoad {
    private static SingleLazyLoad instance;

    private SingleLazyLoad(){}

    public static synchronized SingleLazyLoad getInstance(){
        if(instance == null) {
            instance = new SingleLazyLoad();
        }
        return instance;
    }

}
