import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EquationTest {

    @Test
    void quad() {
        assertEquals("x= 0.5",Equation.Quad(0,6,-3));
        assertEquals("Нет вещественных корней",Equation.Quad(4,2,1));
        assertEquals("x1 = x2 = -1.0",Equation.Quad(1,2,1));
        assertEquals("x1 = -1.0\tx2 = -3.0",Equation.Quad(1,4,3));
    }
}