
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
            return digit(arabicNumeral / 10, "X", "L", "C") + digit(arabicNumeral - 10, "I", "V", "X");
        }
        
        return digit(arabicNumeral, "I", "V", "X");
    }
    
    private String digit(int arabicNumeral, String digit, String five, String ten) {
        switch (arabicNumeral) {
            case 1: case 2: case 3:
                return digit.repeat(arabicNumeral);
            case 4:
                return digit + five;
            case 5:
                return five;
            case 6: case 7: case 8:
                return five + digit.repeat(arabicNumeral - 5);
            case 9:
                return digit + ten;
            default:
                return "";
        }
    }
}
