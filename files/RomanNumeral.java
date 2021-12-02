
public class RomanNumeral {
    
    private int arabicNumeral;

    public RomanNumeral(int arabicNumeral) {
        this.arabicNumeral = arabicNumeral;
    }
    
    public String toString() {
        if (arabicNumeral > 50) {
            return "L" + "X".repeat((arabicNumber - 50) / 10);
        }
        if (arabicNumeral == 70) {
            return "LXX";
        }
        if (arabicNumeral == 60) {
            return "LX";
        }
        if (arabicNumeral == 50) {
            return "L";
        }
        if (arabicNumeral == 40) {
            return "XL";
        }
        if (arabicNumeral % 10 == 0) {
            return "X".repeat(arabicNumeral / 10);
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
