package ca.jetbrains.math;

import java.util.Objects;

public class Fraction {
    private int denominator;
    private int numerator;

    public Fraction(int integerValue) {
        this(integerValue, 1);
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction plus(Fraction that) {
        if (this.denominator != that.denominator) {

            return new Fraction(this.numerator * that.denominator + that.numerator * this.denominator, this.denominator * that.denominator);
        }else {
            
            return new Fraction(  this.numerator + that.numerator, denominator);
        }
    }

    public Fraction plus (int numerator, int denominator) {

            this.numerator += numerator;
            return new Fraction(this.numerator, denominator);
    }

    public int intValue() {
        return numerator;
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof Fraction) {
            Fraction that = (Fraction) other;
            return this.numerator == that.numerator && this.denominator == that.denominator;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return numerator * 19 + denominator;
    }

    @Override
    public String toString() {
        return String.format("%d/%d", numerator, denominator);
    }
}
