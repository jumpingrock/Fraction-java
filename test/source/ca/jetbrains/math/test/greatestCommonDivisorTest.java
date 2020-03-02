package ca.jetbrains.math.test;

import org.junit.Test;

import static java.lang.Math.abs;
import static org.junit.Assert.assertEquals;

public class greatestCommonDivisorTest {

    @Test
    public void reflexiveExamples() {
        assertEquals(9, gcd(9,18));
        assertEquals(2, gcd(2,2));
        assertEquals(1, gcd(-1,-1));
    }

    @Test
    public void relativelyPrime() {
        assertEquals(1, gcd(2,3));
        assertEquals(1, gcd(4,7));
        assertEquals(1, gcd(-2,-3));
    }

    @Test
    public void oneIsMultipleOfTheOther() {
        assertEquals(3, gcd(3,9));
        assertEquals(5, gcd(5,30));

    }

    @Test
    public void commonFactor() {
        assertEquals(2,gcd(6,8));
        assertEquals(7,gcd(49,315));
        assertEquals(4,gcd(-24,-28));

    }

    @Test
    public void negatives() {
        assertEquals(4,gcd(-24,28));
        assertEquals(4,gcd(24,-28));

    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % t;
            a = t;
        }
        return Math.abs(a);
    }
}
