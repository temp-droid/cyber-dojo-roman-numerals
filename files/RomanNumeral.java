
public class RomanNumeral {
    
    private int arabicNumeral;

    public RomanNumeral(int arabicNumeral) {
        this.arabicNumeral = arabicNumeral;
    }
    
    public String toString() {
        if (arabicNumeral < 4) {
            return "I".repeat(arabicNumeral);
        }
        return "IV";   
    }
}
