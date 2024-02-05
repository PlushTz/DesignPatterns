package com.exercise.factory.simple.impl;

import com.exercise.factory.simple.Chart;

/**
 * Desc:
 *
 * @author lijt
 * Created on 2024/2/5
 * Email: lijt@eetrust.com
 */
public class LineChart implements Chart {
    public LineChart() {
        System.out.println("创建折线图");
    }

    @Override
    public void display() {
        System.out.println("显示折线图");
    }
}
