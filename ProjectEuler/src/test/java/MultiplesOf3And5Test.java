import org.junit.Test;

import static org.junit.Assert.*;

public class MultiplesOf3And5Test {

    @Test
    public void shouldReturnValidAnswer() {
        int actual = MultiplesOf3And5.multiplesOf3And5(1000);
        int expected = 233168;

        assertEquals(expected, actual);
    }
}