import org.junit.Test;

import static org.junit.Assert.*;

public class LargestPalindromeProductTest {

    @Test
    public void shouldReturnLargestPalindrome() {
        int actual = LargestPalindromeProduct.largestPalindromeProduct();
        int expected = 906609;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnTrueForPalindrome() {
        boolean actual = LargestPalindromeProduct.checkForPalindrome(222);
        assertTrue(actual);
    }

    @Test
    public void shouldReturnFalseForPalindrome() {
        boolean actual = LargestPalindromeProduct.checkForPalindrome(256);
        assertFalse(actual);
    }
}