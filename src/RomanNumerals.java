import java.util.Arrays;
import java.util.List;

public class RomanNumerals {
    List<Integer> digits = Arrays.asList(1, 2, 3, 4);
    List<String> numerals = Arrays.asList("I", "II", "III", "IV");


    public String convert(int digit) {
        for (int i = 0; i < digits.size(); i++) {
            if (digits.get(i) == digit) {
                return numerals.get(i);
            }
        }
        return "";
    }
}
