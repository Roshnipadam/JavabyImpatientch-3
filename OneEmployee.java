package com.random.kafka;

interface Measurablee{
    double getMeasure();
}
public class OneEmployee implements Measurablee {
    private String name = "";
    private double salary;

    public OneEmployee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getMeasure() {
        return salary;
    }

    public static double average(Measurablee[] objects) {
        double sum = 0;
        int count = 0;

        for (Measurablee obj : objects)
            if (obj != null) {
                sum += obj.getMeasure();
                count++;
            }

        return sum / count;
    }

    public static void main(String[] args) {
        OneEmployee[] employees = new OneEmployee[10];

        employees[0] = new OneEmployee("Fred", 1255);
        employees[1] = new OneEmployee("Helen", 1150);
        employees[2] = new OneEmployee("Mark", 1120);

        System.out.println(average(employees));
    }
}
