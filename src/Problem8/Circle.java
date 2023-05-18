package Problem8;

import Problem5.Seat;

public class Circle implements Shape {
//    field
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println ("Circle with radius " + radius);
    }

    @Override
    public double getArea() {
        return Math.floor(radius * radius * PI);
    }
}