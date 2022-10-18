package edu.geometry;

public class Triangle implements Shape {
    private double height;
    private double base;

    //ctor
    public Triangle (double height, double base) {
        setBase(base);
        setHeight(height);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double area() {
        return (getHeight() * getBase()) / 2;
    }
}

