package ca.jetbrains.math.test;

import ca.jetbrains.math.Fraction;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class fractionsEqualTest {
    @Test
    public void sameNumeratorAndDenominator() {

        assertEquals(new Fraction(3,5), new Fraction(3,5));
    }

    @Test
    public void differentNumerator() {

        assertNotEquals(new Fraction(1,5), new Fraction(3,5));
    }

    @Test
    public void differentDenominator() {

        assertNotEquals(new Fraction(3,5), new Fraction(3,7));
    }

    @Test
    public void wholeNumberEqualSameFraction() {

        assertEquals(new Fraction(5,1), new Fraction(5));
    }

    @Test
    public void wholeNumberNotEqualToDifferentWholeNumber() {

        assertNotEquals(new Fraction(5), new Fraction(2));
    }
}
