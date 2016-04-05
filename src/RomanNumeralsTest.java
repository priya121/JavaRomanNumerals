import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumeralsTest {

    @Test
    public void convertsEmptyToEmptyString() {
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("", romanNumerals.convert(0));
    }

    @Test
    public void converts1toI() {
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("I", romanNumerals.convert(1));
    }
}
