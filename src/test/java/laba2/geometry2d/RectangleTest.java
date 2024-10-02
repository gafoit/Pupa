package laba2.geometry2d;

import laba2.exceptions.IllegalRectException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    Rectangle rectangle;
    @BeforeEach
    void setUp() {
        try {
            rectangle = new Rectangle(3,4);
        } catch (IllegalRectException e) {
            throw new RuntimeException(e);
        }

    }

    @Test
    void area() {
        assertEquals(12.0, rectangle.area());
    }

    @Test
    void perimeter() {
        assertEquals(14.0, rectangle.perimeter());
    }

    @Test
    void testToString() {
        assertEquals(rectangle.toString(), "Rectangle [width=3.0, height=4.0]");
    }
}