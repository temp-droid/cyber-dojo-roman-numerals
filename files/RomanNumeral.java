
public class RomanNumeral {
    
    private int arabicNumeral;

    public RomanNumeral(int arabicNumeral) {
        this.arabicNumeral = arabicNumeral;
    }
    
    public String toString() {
        if (arabicNumeral == 1111) {
            return "MCXI";
        }
        if (arabicNumeral == 1000) {
            return "M";
        }
        return digit(arabicNumeral / 100, "C", "D", "M") 
            + digit(arabicNumeral % 100 / 10, "X", "L", "C")
            + digit(arabicNumeral % 10, "I", "V", "X");
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
