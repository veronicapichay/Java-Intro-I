package edu.geometry;

public class Circle implements Shape {
    private double radius;

    //ctor
    public Circle (double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override //interface shape
    public double area() {
        return Math.PI * (Math.pow(getRadius(), 2));
    }
}