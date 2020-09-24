import org.junit.Test;

import static org.junit.Assert.*;

public class LargestPrimeFactorTest {

    @Test
    public void shouldReturnValidAnswer() {
        Long actual = LargestPrimeFactor.largestPrimeFactor(600851475143L);
        Long expected = 6857L;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnZeroForNegativeOrZeroOrOneValue() {
        Long negative = LargestPrimeFactor.largestPrimeFactor(-1L);
        Long zero = LargestPrimeFactor.largestPrimeFactor(0L);
        Long one = LargestPrimeFactor.largestPrimeFactor(1L);
        Long expected = 0L;

        assertEquals(expected, negative);
        assertEquals(expected, zero);
        assertEquals(expected, one);
    }
}