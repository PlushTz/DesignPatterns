package com.exercise.factory.simple.impl;

import com.exercise.factory.simple.Chart;

/**
 * Desc:
 *
 * @author lijt
 * Created on 2024/2/5
 * Email: lijt@eetrust.com
 */
public class HistogramChart implements Chart {

    public HistogramChart() {
        System.out.println("创建柱状图");
    }

    @Override
    public void display() {
        System.out.println("显示柱状图");
    }
}
