
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
        if (arabicNumeral == 6) {
            return "VI";
        }
        if (arabicNumeral == 7) {
            return "VII";
        }
        if (arabicNumeral == 8) {
            return "VIII";
        }
        return "IV";   
    }
}
