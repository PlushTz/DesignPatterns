package com.exercise.singleton;

/**
 * Desc:
 * 1.饿汉式（静态常量）【可用】
 * 优点：这种写法比较简单，就是在类装载的时候就完成实例化。避免了线程同步问题。
 * 缺点：在类装载的时候就完成实例化，没有达到Lazy Loading的效果。如果从始至终从未使用过这个实例，则会造成内存的浪费。
 * @author Coco
 * Created on 2022/9/20 23:34
 * Email:
 */
public class Singleton1 {
    private final static Singleton1 INSTANCE = new Singleton1();
    private Singleton1(){

    }

    public static Singleton1 getInstance(){
        return INSTANCE;
    }
}
