package com.exercise.factory.simple;

import com.exercise.factory.simple.factory.CarFactory;
import com.exercise.factory.simple.factory.ChartFactory;

/**
 * Desc:简单工厂模式
 *
 * @author Coco
 * Created on 2022/9/20 23:00
 * Email:
 */
public class Main {
    public static void main(String[] args) {
        Car car = CarFactory.makeCar(CarFactory.BMW);
        if (car != null) {
            car.makeCar();
        }
        Chart pie = ChartFactory.createChart("pie");
        pie.display();
    }
}
