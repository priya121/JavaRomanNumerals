import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumeralsTest {
    RomanNumerals romanNumerals = new RomanNumerals();

    @Test
    public void convertsEmptyToEmptyString() {
        assertEquals("", romanNumerals.convert(0));
    }

    @Test
    public void converts1toI() {
        assertEquals("I", romanNumerals.convert(1));
    }

    @Test
    public void converts2toII() {
        assertEquals("II", romanNumerals.convert(2));
    }

    @Test
    public void converts3toIII() {
        assertEquals("III", romanNumerals.convert(3));
    }
}
