package com.exercise.factory.simple.impl;

import com.exercise.factory.simple.Car;

/**
 * Desc:奔驰
 *
 * @author Coco
 * Created on 2022/9/20 22:56
 * Email:
 */
public class MercedesCar implements Car {
    @Override
    public void makeCar() {
        System.out.println("制造奔驰汽车");
    }
}
