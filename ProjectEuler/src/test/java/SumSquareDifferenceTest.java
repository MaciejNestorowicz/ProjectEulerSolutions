import org.junit.Test;

import static org.junit.Assert.*;

public class SumSquareDifferenceTest {

    @Test
    public void shouldReturnDifferenceBetweenSumOfTheSquaresAndSquareOfTheSums() {
        int actual = SumSquareDifference.sumSquareDifference();
        int expected = 25164150;
        assertEquals(expected, actual);
    }
}