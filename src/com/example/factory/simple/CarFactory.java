package com.example.factory.simple;

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
