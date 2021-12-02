// A simple example to get you started
// JUnit assertion - the default Java assertion library
// https://junit.org/junit5/

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class RomanNumeralTest {

    @Test
    void test() {
        RomanNumeral romanNumeral = new RomanNumeral(1);
        assertEquals("I", romanNumeral.toString());
    }
}
