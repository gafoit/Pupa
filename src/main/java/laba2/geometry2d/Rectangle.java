package laba2.geometry2d;

import laba2.exceptions.IllegalRectException;

public class Rectangle implements Figure {
    private final double width;
    private final double length;

    @Override
    public double area() {
        return width * length;
    }

    public Rectangle(double width, double length) throws IllegalRectException {
        if (width<=0 || length <=0) {
            throw new IllegalRectException("width and height must be greater than 0");
        }
        this.width = width;
        this.length = length;
    }

    @Override
    public double perimeter() {
        return 2*width+2* length;
    }

    @Override
    public String toString() {
        return "Rectangle [width=" + width + ", height=" + length + "]";
    }
}
