package laba2.geometry2d;


import laba2.exceptions.IllegalCircleException;

public class Circle implements Figure {
    private final double radius;

    public Circle(double radius) throws IllegalCircleException {
        if (radius <= 0) {
            throw new IllegalCircleException("Radius must be greater than 0");
        }
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return Math.PI * 2 * radius;
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius +"]";
    }
}
