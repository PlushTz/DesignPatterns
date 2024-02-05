package com.exercise.factory.simple.factory;

import com.exercise.factory.simple.Car;
import com.exercise.factory.simple.impl.BMWCar;
import com.exercise.factory.simple.impl.MercedesCar;

/**
 * Desc:
 *
 * @author Coco
 * Created on 2022/9/20 22:57
 * Email:
 */
public class CarFactory {

    public static final String BMW = "BMW";
    public static final String MERCEDES = "Mercedes";

    public static Car makeCar(String type) {
        if (type.equals(BMW)) {
            return new BMWCar();
        }
        if (type.equals(MERCEDES)) {
            return new MercedesCar();
        }
        return null;
    }
}
