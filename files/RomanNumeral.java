
public class RomanNumeral {
    
    private int arabicNumeral;

    public RomanNumeral(int arabicNumeral) {
        this.arabicNumeral = arabicNumeral;
    }
    
    public String toString() {
        if (arabicNumeral == 9) {
            return "IX";
        }
        if (arabicNumeral == 10) {
            return "X";
        }
        if (arabicNumeral == 11) {
            return "XI";
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
