package com.exercise.singleton;

/**
 * Desc:
 * 4.懒汉式（线程安全，同步方法）【不推荐用】
 * 解决上面第三种实现方式的线程不安全问题，做个线程同步就可以了，于是就对getInstance()方法进行了线程同步。
 * 缺点：效率太低了，每个线程在想获得类的实例时候，执行getInstance()方法都要进行同步。而其实这个方法只执行一次实例化代码就够了，
 * 后面的想获得该类实例，直接return就行了。方法进行同步效率太低要改进。
 *
 * @author Coco
 * Created on 2022/9/20 23:43
 * Email:
 */
public class Singleton4 {
    private Singleton4() {

    }

    private static Singleton4 instance;

    public static synchronized Singleton4 getInstance() {
        if (instance == null) {
            instance = new Singleton4();
        }
        return instance;
    }
}
