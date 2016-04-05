import java.util.Arrays;
import java.util.List;

public class RomanNumerals {
    List<Integer> digits = Arrays.asList(4, 1);
    List<String> numerals = Arrays.asList("IV", "I");


    public String convert(int digit) {
        String numeral = "";
        int number = digit;
        for (int i = 0; i < digits.size(); i++) {
            while (number >= digits.get(i)) {
                numeral += numerals.get(i);
                number -= digits.get(i);
            }
        }
        return numeral;
    }
}
