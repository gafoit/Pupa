package laba2.geometry3d;

import laba2.exceptions.IllegalCircleException;
import laba2.geometry2d.Circle;
import laba2.geometry2d.Figure;
import laba2.geometry2d.Rectangle;

public class Cylinder {
    Figure base;
    double height;

    public Cylinder(Figure base, double height) {
        this.base = base;
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        this.height = height;
        try {
            this.base = new Circle(radius);
        } catch (IllegalCircleException e) {
            throw new RuntimeException(e);
        }
    }

    public Cylinder(double width, double length, double height) {
        this.height = height;
        this.base = new Rectangle(width, length);
    }

    public double volume() {
        return this.base.area() * this.height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "base=" + base.toString() +
                ", height=" + height +
                '}';
    }
}
