import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @Test
    void isPalindrome() {
        assertTrue(Palindrome.isPalindrome("101"));
        assertTrue(Palindrome.isPalindrome("1111"));
        assertFalse(Palindrome.isPalindrome("5151"));
    }
}