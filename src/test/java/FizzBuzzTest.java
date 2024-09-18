import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void fizzBuzz() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(35));
        assertEquals("Fizz", FizzBuzz.fizzBuzz(55));
        assertEquals("Buzz", FizzBuzz.fizzBuzz(56));
        assertEquals("", FizzBuzz.fizzBuzz(57));
    }
}