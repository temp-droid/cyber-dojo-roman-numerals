
public class RomanNumeral {
    
    private int arabicNumeral;

    public RomanNumeral(int arabicNumeral) {
        this.arabicNumeral = arabicNumeral;
    }
    
    public String toString() {
        if (arabicNumeral > 50) {
            return "L" + "X".repeat((arabicNumeral - 50) / 10);
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
        switch (arabicNumeral) {
            case 1: case 2: case 3:
                return "I".repeat(arabicNumeral);
            case 4:
                return "IV";
            case 5:
                return "V";
            case 6: case 7: case 8:
                return "V" + "I".repeat(arabicNumeral - 5);
            case 9:
                return "IX";
            default:
                return "";
        }
    }
}
