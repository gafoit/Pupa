package laba2.geometry3d;

import laba2.exceptions.IllegalCircleException;
import laba2.exceptions.IllegalRectException;
import laba2.geometry2d.Circle;
import laba2.geometry2d.Rectangle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {
    Cylinder CircleCylinder;
    Cylinder NewCircleCylinder;
    Cylinder RectCylinder;
    Cylinder NewRectCylinder;

    @BeforeEach
    void setUp() {
        Rectangle rectBase;
        try {
            rectBase = new Rectangle(3, 4);
        } catch (IllegalRectException e) {
            throw new RuntimeException(e);
        }
        RectCylinder = new Cylinder(rectBase, 5);
        try {
            NewRectCylinder = new Cylinder(3, 4, 5);
        } catch (IllegalRectException e) {
            throw new RuntimeException(e);
        }
        Circle circleBase;
        try {
            circleBase = new Circle(5.0);
        } catch (IllegalCircleException e) {
            throw new RuntimeException(e);
        }
        CircleCylinder = new Cylinder(circleBase,5.0);
        NewCircleCylinder = new Cylinder(5.0,5.0);
    }

    @Test
    void volume() {
        assertEquals(392.69908169872417, CircleCylinder.volume());
        assertEquals(392.69908169872417, NewCircleCylinder.volume());

        assertEquals(60.0, RectCylinder.volume());
        assertEquals(60.0, NewRectCylinder.volume());
    }

    @Test
    void CylinderToString() {
        assertEquals("Cylinder{base=Circle [radius=5.0], height=5.0}", CircleCylinder.toString());
        assertEquals("Cylinder{base=Circle [radius=5.0], height=5.0}", NewCircleCylinder.toString());

        assertEquals("Cylinder{base=Rectangle [width=3.0, height=4.0], height=5.0}", RectCylinder.toString());
        assertEquals("Cylinder{base=Rectangle [width=3.0, height=4.0], height=5.0}", NewRectCylinder.toString());
    }
}