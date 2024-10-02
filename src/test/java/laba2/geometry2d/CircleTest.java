package laba2.geometry2d;

import laba2.exceptions.IllegalCircleException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    Circle circle;
    @BeforeEach
    void setUp() {
        try {
            circle = new Circle(5);
        } catch (IllegalCircleException e) {
            throw new RuntimeException(e);
        }

    }

    @Test
    void area() {
        assertEquals(78.53981633974483, circle.area());
    }

    @Test
    void perimeter() {
        assertEquals(31.41592653589793, circle.perimeter());
    }

    @Test
    void testToString() {
        assertEquals("Circle [radius=5.0]",circle.toString());
    }
}