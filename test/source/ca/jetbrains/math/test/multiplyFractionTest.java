package ca.jetbrains.math.test;

import ca.jetbrains.math.Fraction;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class multiplyFractionTest {
    @Test
    public void shouldMultiplyOnewithOne() {

        assertEquals(new Fraction(1), new Fraction(1).multiply(new Fraction(1)));
    }

    @Test
    public void shouldMultipleIntegerWithInteger() {
        assertEquals(new Fraction(10), new Fraction(2).multiply(new Fraction(5)));
        assertEquals(new Fraction(50), new Fraction(10).multiply(new Fraction(5)));
        assertEquals(new Fraction(2), new Fraction(1).multiply(new Fraction(2)));
    }

    @Test
    public void shouldMultiplyNegativeIntegerWithInteger() {
        assertEquals(new Fraction(-10), new Fraction(10).multiply(new Fraction(-1)));
    }

    @Test
    public void shouldMultiplyNegativeIntegerWithNegativeInteger() {
        assertEquals(new Fraction(10), new Fraction(-10).multiply(new Fraction(-1)));
    }

    @Test
    public void shouldMultiplyFractionWithInteger() {
        assertEquals(new Fraction(7,3), new Fraction(1,3).multiply(new Fraction(2)));
        assertEquals(new Fraction(12,5), new Fraction(2,5).multiply(new Fraction(2)));
    }

    @Test
//    @Ignore("to refactor multiplication to use Fraction before implementing")
    public void shouldMultiplyFractionWithFraction() {
        assertEquals(new Fraction(1,1), new Fraction(5,4).multiply(4,5));
        assertEquals(new Fraction(1,1), new Fraction(10,3).multiply(3,10));
        assertEquals(new Fraction(5,3), new Fraction(5,3).multiply(3,3));

    }
}
