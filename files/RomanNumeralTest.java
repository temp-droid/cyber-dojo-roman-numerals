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

}
