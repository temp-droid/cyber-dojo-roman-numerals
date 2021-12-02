
public class RomanNumeral {
    
    private int arabicNumeral;

    public RomanNumeral(int arabicNumeral) {
        this.arabicNumeral = arabicNumeral;
    }
    
    public String toString() {
        if (arabicNumeral < 4) {
            return "I".repeat(arabicNumeral);
        }
        if (arabicNumeral == 5) {
            return "V";
        }
        if (arabicNumeral == 9) {
            return "IX";
        }
        if (arabicNumeral > 5) {
            return "V" + "I".repeat(arabicNumeral - 5);
        }
        return "IV";
    }
}
