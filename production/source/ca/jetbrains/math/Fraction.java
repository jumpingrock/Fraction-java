package ca.jetbrains.math;

import java.util.Objects;

public class Fraction {
    private int denominator;
    private int numerator;

    public Fraction(int integerValue) {
        this(integerValue, 1);
    }

    public Fraction(int numerator, int denominator) {
        final int signOfDenominator = denominator < 0 ? -1: 1;
        // CONTRACT: gcd() never returns 0
        final int gcd = NumberTheory.gcd(numerator,denominator) * signOfDenominator;

        this.numerator = numerator / gcd;
        this.denominator = denominator / gcd;
    }

    public Fraction plus(Fraction that) {

        return new Fraction(this.numerator * that.denominator + that.numerator * this.denominator, this.denominator * that.denominator);
    }

    public Fraction plus (int numerator, int denominator) {

        this.numerator += numerator;
        return new Fraction(this.numerator, denominator);
    }

    public Fraction multiply(Fraction that) {
        if (this.denominator != 1){
            return new Fraction(this.numerator + that.numerator * this.denominator, denominator);
        }else {
            return new Fraction(this.numerator * that.numerator);
        }
    }

    public Fraction multiply(int numerator, int denominator) {
        numerator *= this.numerator;
        denominator *= this.denominator;
        final int gcd = NumberTheory.gcd(numerator, denominator);
        return new Fraction(numerator / gcd,denominator / gcd);
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
