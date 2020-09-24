import org.junit.Test;

import static org.junit.Assert.*;

public class TenThousandFirstPrimeTest {

    @Test
    public void shouldReturnTenThousandFirstPrimeNumber() {
        int actual = TenThousandFirstPrime.tenThousandFirstPrime(10001);
        int expected = 104743;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnTrueForPrimeNumber() {
        boolean isPrime = TenThousandFirstPrime.isPrime(7);
        assertTrue(isPrime);
    }

    @Test
    public void shouldReturnFalseForNonPrimeNumber() {
        boolean isPrime = TenThousandFirstPrime.isPrime(8);
        assertFalse(isPrime);
    }
}