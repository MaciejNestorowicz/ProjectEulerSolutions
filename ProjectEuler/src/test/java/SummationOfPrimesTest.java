import org.junit.Test;

import static org.junit.Assert.*;

public class SummationOfPrimesTest {

    @Test
    public void shouldReturnSumOfPrimesBelowTwoMillion() {
        Long expected = SummationOfPrimes.summationOfPrimes(2000000);
        Long actual = 142913828922L;
        assertEquals(expected, actual);
    }
}