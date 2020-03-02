package ca.jetbrains.math.test;

import ca.jetbrains.math.NumberTheory;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class greatestCommonDivisorTest {

    @Test
    public void reflexiveExamples() {
        assertEquals(9, NumberTheory.gcd(9,18));
        assertEquals(2, NumberTheory.gcd(2,2));
        assertEquals(1, NumberTheory.gcd(-1,-1));
    }

    @Test
    public void relativelyPrime() {
        assertEquals(1, NumberTheory.gcd(2,3));
        assertEquals(1, NumberTheory.gcd(4,7));
        assertEquals(1, NumberTheory.gcd(-2,-3));
    }

    @Test
    public void oneIsMultipleOfTheOther() {
        assertEquals(3, NumberTheory.gcd(3,9));
        assertEquals(5, NumberTheory.gcd(5,30));

    }

    @Test
    public void commonFactor() {
        assertEquals(2, NumberTheory.gcd(6,8));
        assertEquals(7, NumberTheory.gcd(49,315));
        assertEquals(4, NumberTheory.gcd(-24,-28));

    }

    @Test
    public void negatives() {
        assertEquals(4, NumberTheory.gcd(-24,28));
        assertEquals(4, NumberTheory.gcd(24,-28));

    }



}
