
public class RomanNumeral {
    
    private int arabicNumeral;

    public RomanNumeral(int arabicNumeral) {
        this.arabicNumeral = arabicNumeral;
    }
    
    public String toString() {
        if (arabicNumeral == 10) {
            return "X";
        }
        if (arabicNumeral > 10) {
            return "X" + digit(arabicNumeral - 10);
        }
        
        return digit(arabicNumeral);
    }
    
    private String digit(int arabicNumeral) {
        if (arabicNumeral == 9) {
            return "IX";
        }
        if (arabicNumeral < 4) {
            return "I".repeat(arabicNumeral);
        }
        if (arabicNumeral == 5) {
            return "V";
        }
        if (arabicNumeral > 5) {
            return "V" + "I".repeat(arabicNumeral - 5);
        }
        return "IV";
    }
}
