package ca.jetbrains.math.test;

import ca.jetbrains.math.Fraction;
import com.sun.xml.internal.ws.api.addressing.OneWayFeature;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class addFractionTest {

    private void checkAddFractionsAsInteger(int addend, int augend, int expectedResult) {
        Fraction sum = new Fraction(addend).plus(new Fraction(augend));
        assertEquals(new Fraction(expectedResult), sum);
    }

    @Test
    public void zeroPlusZero() throws Exception {
        checkAddFractionsAsInteger(0, 0, 0);
    }

    @Test
    public void nonZeroPlusZero() throws Exception {
        checkAddFractionsAsInteger(3, 0, 3);
    }

    @Test
    public void zeroPlueNonZero() throws Exception {
        checkAddFractionsAsInteger(5, 0, 5);
    }

    @Test
    public void nonNegativeNonZeroOperands() throws Exception{
        checkAddFractionsAsInteger(3, 4, 7);
    }

    @Test
    public void negativeInputAndNegativeOutput() throws Exception{
        checkAddFractionsAsInteger(-3, 1, -2);
    }

    @Test
    public void nonTrivialDenominator() throws Exception{
        final Fraction sum = new Fraction(1,5).plus(2,5);
        assertEquals(new Fraction(3,5), sum);
    }

    @Test
    public void differentDenominatorWithoutReducing() throws Exception {

        final Fraction sum = new Fraction(1,2).plus(new Fraction(1,3));
        assertEquals(new Fraction(5,6), sum);
    }
}
