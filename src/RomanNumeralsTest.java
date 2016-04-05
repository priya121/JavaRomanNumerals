import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumeralsTest {

    @Test
    public void convertsEmptyToEmptyString() {
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals(0, romanNumerals.convert(""));
    }
}
