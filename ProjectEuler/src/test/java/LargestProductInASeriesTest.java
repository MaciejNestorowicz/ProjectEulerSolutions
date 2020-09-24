import org.junit.Test;

import static org.junit.Assert.*;

public class LargestProductInASeriesTest {

    @Test
    public void shouldReturnLargestProduct() {
        Long actual = LargestProductInASeries.largestProductInASeries();
        Long expected = 23514624000L;

        assertEquals(expected, actual);
    }
}