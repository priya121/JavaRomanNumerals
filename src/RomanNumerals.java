public class RomanNumerals {
    public String convert(int digit) {
        if (digit == 1) {
            return "I";
        } else if (digit == 2) {
            return "II";
        }
        return "";
    }
}
