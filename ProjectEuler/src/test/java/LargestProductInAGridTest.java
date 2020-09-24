import org.junit.Test;

import static org.junit.Assert.*;

public class LargestProductInAGridTest {

    @Test
    public void shouldReturnLargestProductInGrid() {
        int actual = LargestProductInAGrid.largestProductInAGrid();
        int expected = 70600674;
        assertEquals(expected, actual);
    }
}