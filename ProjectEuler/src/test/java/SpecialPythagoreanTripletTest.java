import org.junit.Test;

import static org.junit.Assert.*;

public class SpecialPythagoreanTripletTest {

    @Test
    public void shouldReturnProductOfThePythagoreanTriplet() {
        int actual = SpecialPythagoreanTriplet.specialPythagoreanTriplet();
        int expected = 31875000;
        assertEquals(expected, actual);
    }
}