package ca.jetbrains.math;

public class Fraction {
    private int denominator;
    private int numerator;



    public int getNumerator() {
        return numerator;
    }
    public int getDenominator() {
        return denominator;
    }

    public Fraction(int numerator) {

        this.numerator = numerator;
        this.denominator = 1;
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction plus(Fraction that) {
        return new Fraction(  this.numerator + that.numerator, denominator);
    }

    public Fraction plus (int numerator, int denominator) {
        this.numerator += numerator;
        return new Fraction(this.numerator, denominator);
    }



}
