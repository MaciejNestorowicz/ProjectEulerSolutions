import org.junit.Test;

import static org.junit.Assert.*;

public class EvenFibonacciNumbersTest {

    @Test
    public void shouldReturnValidAnswer() {
        int actual = EvenFibonacciNumbers.evenFibonacciNumbers();
        int expected = 4613732;

        assertEquals(expected, actual);
    }
}