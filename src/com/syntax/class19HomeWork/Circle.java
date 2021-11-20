package com.syntax.class19HomeWork;

public class Circle extends Shape{
    private double area;

    Circle(double radius, double area) {
        super(radius);
        this.area=area;

    }

    public void areaOfCircle() {
        System.out.println(radius*(area*area));
    }
}
