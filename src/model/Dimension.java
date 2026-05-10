package model;

import java.util.ArrayList;

public class Dimension {

    private String name;
    private int coefficient;
    private ArrayList<Metric> metrics;

    public Dimension(String name, int coefficient) {

        this.name = name;
        this.coefficient = coefficient;

        metrics = new ArrayList<>();
    }

    public void addMetric(Metric metric) {
        metrics.add(metric);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Metric> getMetrics() {
        return metrics;
    }

    public double calculateAverage() {

        double total = 0;
        int totalCoeff = 0;

        for(Metric m : metrics) {

            total += m.calculateScore() * m.getCoefficient();

            totalCoeff += m.getCoefficient();
        }

        return total / totalCoeff;
    }
}