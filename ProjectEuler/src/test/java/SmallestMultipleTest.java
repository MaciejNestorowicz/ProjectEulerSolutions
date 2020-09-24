import org.junit.Test;

import static org.junit.Assert.*;

public class SmallestMultipleTest {

    @Test
    public void shouldReturnSmallestNumberDivisibleByNumbersFrom1To20(){
        int actual = SmallestMultiple.smallestMultiple();
        assertEquals(232792560, actual);
    }
}