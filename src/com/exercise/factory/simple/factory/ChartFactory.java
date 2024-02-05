package com.exercise.factory.simple.factory;

import com.exercise.factory.simple.Chart;
import com.exercise.factory.simple.impl.PieChart;
import com.exercise.factory.simple.impl.HistogramChart;
import com.exercise.factory.simple.impl.LineChart;

/**
 * Desc:
 *
 * @author lijt
 * Created on 2024/2/5
 * Email: lijt@eetrust.com
 */
public class ChartFactory {
    public static Chart createChart(String type) {
        Chart chart = null;
        if (type.equalsIgnoreCase("histogram")) {
            chart = new HistogramChart();
        } else if (type.equalsIgnoreCase("pie")) {
            chart = new PieChart();
        } else if (type.equalsIgnoreCase("line")) {
            chart = new LineChart();
        }
        return chart;
    }
}
