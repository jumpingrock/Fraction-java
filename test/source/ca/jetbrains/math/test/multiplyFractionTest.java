package ca.jetbrains.math.test;

import ca.jetbrains.math.Fraction;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class multiplyFractionTest {
    @Test
    public void shouldMultiplyOnewithOne() {

        assertEquals(new Fraction(1), new Fraction(1).multiply(1));
    }

    @Test
    public void shouldMultipleIntegerWithInteger() {
        assertEquals(new Fraction(10), new Fraction(2).multiply(5));
    }

    @Test
    public void shouldMultiplyFractionWithInteger() {
        assertEquals(new Fraction(7,3), new Fraction(1,3).multiply(2));
    }
}
