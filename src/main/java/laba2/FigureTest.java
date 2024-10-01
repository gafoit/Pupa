package laba2;

import laba2.exceptions.IllegalCircleException;
import laba2.geometry2d.Circle;
import laba2.geometry2d.Figure;
import laba2.geometry2d.Rectangle;
import laba2.geometry3d.Cylinder;

public class FigureTest {
    public static void main(String[] args) {
        Figure circle;
        try {
            circle = new Circle(5.0);
        } catch (IllegalCircleException e) {
            throw new RuntimeException(e);
        }
        System.out.println(circle + "\tS = " + circle.area() + "\tP = " + circle.perimeter());

        Figure rectangle = new Rectangle(3.0, 4.0);
        System.out.println(rectangle + "\tS = " + rectangle.area() + "\tP = " + rectangle.perimeter());

        Cylinder rectCylinder1 = new Cylinder(3.0, 4.0, 5.0);
        Cylinder rectCylinder2 = new Cylinder(rectangle, 5.0);
        System.out.println(rectCylinder1 + "\tV = " + rectCylinder1.volume());
        System.out.println(rectCylinder2 + "\tV = " + rectCylinder2.volume());

        Cylinder CircleCylinder1 = new Cylinder(circle, 5.0);
        Cylinder CircleCylinder2 = new Cylinder(5.0, 5.0);
        System.out.println(CircleCylinder1 + "\tV = " + CircleCylinder1.volume());
        System.out.println(CircleCylinder2 + "\tV = " + CircleCylinder2.volume());
    }
}
