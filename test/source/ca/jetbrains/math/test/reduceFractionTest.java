package ca.jetbrains.math.test;

import ca.jetbrains.math.Fraction;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class reduceFractionTest {
    @Test
    public void alreadyInLowestTerms() {
    assertEquals(new Fraction(3,4), new Fraction(3,4));
    //we already test this in fractionEqualTest
    }

    @Test
    public void reduceToNotWholeNumber() {
        assertEquals(new Fraction(3,4), new Fraction(6,8));
    }
}
