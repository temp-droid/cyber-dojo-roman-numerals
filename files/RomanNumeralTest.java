// A simple example to get you started
// JUnit assertion - the default Java assertion library
// https://junit.org/junit5/

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class RomanNumeralTest {

    @Test
    void should_return_I_when_value_is_1() {
        RomanNumeral romanNumeral = new RomanNumeral(1);
        assertEquals("I", romanNumeral.toString());
    }
    
    @Test
    void should_return_II_when_value_is_2() {
        RomanNumeral romanNumeral = new RomanNumeral(2);
        assertEquals("II", romanNumeral.toString());
    }
    
    @Test
    void should_return_IV_when_value_is_4() {
        RomanNumeral romanNumeral = new RomanNumeral(4);
        assertEquals("IV", romanNumeral.toString());
    }
    
    @Test
    void should_return_V_when_value_is_5() {
        RomanNumeral romanNumeral = new RomanNumeral(5);
        assertEquals("V", romanNumeral.toString());
    }
    
    @Test
    void should_return_VI_when_value_is_6() {
        RomanNumeral romanNumeral = new RomanNumeral(6);
        assertEquals("VI", romanNumeral.toString());
    }
    
    @Test
    void should_return_VII_when_value_is_7() {
        RomanNumeral romanNumeral = new RomanNumeral(7);
        assertEquals("VII", romanNumeral.toString());
    }
    
    @Test
    void should_return_VIII_when_value_is_8() {
        RomanNumeral romanNumeral = new RomanNumeral(8);
        assertEquals("VIII", romanNumeral.toString());
    }
    
    @Test
    void should_return_IX_when_value_is_9() {
        RomanNumeral romanNumeral = new RomanNumeral(9);
        assertEquals("IX", romanNumeral.toString());
    }
    
    @Test
    void should_return_X_when_value_is_10() {
        RomanNumeral romanNumeral = new RomanNumeral(10);
        assertEquals("X", romanNumeral.toString());
    }
    
    @Test
    void should_return_XI_when_value_is_11() {
        RomanNumeral romanNumeral = new RomanNumeral(11);
        assertEquals("XI", romanNumeral.toString());
    }
    
    @Test
    void should_return_XII_when_value_is_12() {
        RomanNumeral romanNumeral = new RomanNumeral(12);
        assertEquals("XII", romanNumeral.toString());
    }
    
    @Test
    void should_return_XIII_when_value_is_13() {
        RomanNumeral romanNumeral = new RomanNumeral(13);
        assertEquals("XIII", romanNumeral.toString());
    }
    
    @Test
    void should_return_XIV_when_value_is_14() {
        RomanNumeral romanNumeral = new RomanNumeral(14);
        assertEquals("XIV", romanNumeral.toString());
    }
    
    @Test
    void should_return_XX_when_value_is_20() {
        RomanNumeral romanNumeral = new RomanNumeral(20);
        assertEquals("XX", romanNumeral.toString());
    }
    
    @Test
    void should_return_XXX_when_value_is_30() {
        RomanNumeral romanNumeral = new RomanNumeral(30);
        assertEquals("XXX", romanNumeral.toString());
    }
    
    @Test
    void should_return_XL_when_value_is_40() {
        RomanNumeral romanNumeral = new RomanNumeral(40);
        assertEquals("XL", romanNumeral.toString());
    }
    
    @Test
    void should_return_L_when_value_is_50() {
        RomanNumeral romanNumeral = new RomanNumeral(50);
        assertEquals("L", romanNumeral.toString());
    }
    
    @Test
    void should_return_LX_when_value_is_60() {
        RomanNumeral romanNumeral = new RomanNumeral(60);
        assertEquals("LX", romanNumeral.toString());
    }
    
    @Test
    void should_return_LXX_when_value_is_70() {
        RomanNumeral romanNumeral = new RomanNumeral(70);
        assertEquals("LXX", romanNumeral.toString());
    }
    
    @Test
    void should_return_LXXX_when_value_is_80() {
        RomanNumeral romanNumeral = new RomanNumeral(80);
        assertEquals("LXXX", romanNumeral.toString());
    }
    
    @Test
    void should_return_C_when_value_is_100() {
        RomanNumeral romanNumeral = new RomanNumeral(100);
        assertEquals("C", romanNumeral.toString());
    }
    
    @Test
    void should_return_CC_when_value_is_200() {
        RomanNumeral romanNumeral = new RomanNumeral(200);
        assertEquals("CC", romanNumeral.toString());
    }
    
    @Test
    void should_return_CCC_when_value_is_300() {
        RomanNumeral romanNumeral = new RomanNumeral(300);
        assertEquals("CCC", romanNumeral.toString());
    }

}
