package ca.jetbrains.math.test;

import ca.jetbrains.math.Fraction;
import com.sun.xml.internal.ws.api.addressing.OneWayFeature;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class addFractionTest {
    @Test
    public void zeroPlusZero() throws Exception {
        Fraction sum = new Fraction(0).plus(new Fraction(0));
        assertEquals(0, sum.intValue());
    }

    @Test
    public void nonZeroPlusZero() throws Exception {
        final Fraction sum = new Fraction(3).plus(new Fraction(0));
        assertEquals(3, sum.intValue());
    }

    @Test
    public void zeroPlueNonZero() throws Exception {
        final Fraction sum = new Fraction(0).plus(new Fraction(5));
        assertEquals(5, sum.intValue());
    }

    @Test
    public void nonNegativeNonZeroOperands() throws Exception{
        final Fraction sum = new Fraction(3).plus(new Fraction(4));
        assertEquals(7, sum.intValue());
    }

    @Test
    public void negativeInputAndNegativeOutput() throws Exception{
        final Fraction sum = new Fraction(-3).plus(new Fraction(1));
        assertEquals(-2, sum.intValue());
    }

    @Test
    public void nonTrivialDenominator() throws Exception{
        final Fraction sum = new Fraction(1,5).plus(2,5);
        assertEquals(3, sum.getNumerator());
        assertEquals(5, sum.getDenominator());
    }
}
