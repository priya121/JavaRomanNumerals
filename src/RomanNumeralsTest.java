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

    @Test
    public void convert4toIV() {
        assertEquals("IV", romanNumerals.convert(4));
    }
    
    @Test
    public void converts5toV() {
        assertEquals("V", romanNumerals.convert(5));
    }

    @Test
    public void converts6toVI() {
        assertEquals("VI", romanNumerals.convert(6));
    }

    @Test
    public void converts8toVIII() {
        assertEquals("VIII", romanNumerals.convert(8));
    }

    @Test
    public void converts9toIX() {
        assertEquals("IX", romanNumerals.convert(9));
    }

    @Test
    public void converts10toX() {
        assertEquals("X", romanNumerals.convert(10));
    }
}
