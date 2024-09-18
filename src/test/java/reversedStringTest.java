import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class reversedStringTest {

    @Test
    void reverseString() {
        assertEquals("llatsnI ekaM", reversedString.reverseString("Make Install"));
        assertEquals("123",reversedString.reverseString("321"));
    }
}