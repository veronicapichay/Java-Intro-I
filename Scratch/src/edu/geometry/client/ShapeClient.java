package edu.geometry.client;

import edu.geometry.*;
import edu.geometry.Rectangle;
import edu.geometry.Shape;

import java.awt.*;

public class ShapeClient {

    public static void main(String[] args) {
        Shape circle = new Circle(3);
        Shape rectangle = new Rectangle(3, 6);
        Shape triangle = new Triangle(8, 2);

        System.out.println("Area of circle is " + circle.area());
        System.out.println("Area of rectangle is " + rectangle.area());
        System.out.println("Area of triangle is " + triangle.area());
    }
}
