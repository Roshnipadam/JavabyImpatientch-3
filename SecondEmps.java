package com.random.kafka;

interface Measurable {
    double getMeasure();
}

public class SecondEmps implements Measurable {
    private String name = "";
    private double salary;

    public SecondEmps(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getMeasure() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public static double average(Measurable[] objects) {
        double sum = 0;
        int count = 0;

        for (Measurable obj : objects)
            if (obj != null) {
                sum += obj.getMeasure();
                count++;
            }

        return sum / count;
    }

    public static Measurable largest(Measurable[] objects) {
        double largestMeasure = 0;
        Measurable largestObject = null;

        for (Measurable obj : objects)
            if (obj != null)
                if (largestMeasure < obj.getMeasure()) {
                    largestMeasure = obj.getMeasure();
                    largestObject = obj;
                }

        return largestObject;
    }

    public static void main(String[] args) {
        SecondEmps[] employees = new SecondEmps[10];

        employees[0] = new SecondEmps("Fred", 1255);
        employees[1] = new SecondEmps("Helen", 1150);
        employees[2] = new SecondEmps("Mark", 1120);

        System.out.println(average(employees));
        System.out.println(((SecondEmps)largest(employees)).getName());
    }
}