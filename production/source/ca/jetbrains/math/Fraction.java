package ca.jetbrains.math;

public class Fraction {
    private int integerValue;
    private int denominator;
    private int numerator;



    public int getNumerator() {
        return numerator;
    }
    public int getDenominator() {
        return denominator;
    }

    public Fraction(int integerValue) {

        this.integerValue = integerValue;
    }
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction plus(Fraction that) {

        return new Fraction(  this.integerValue + that.integerValue);
    }
    public Fraction plus (int numerator, int denominator) {
        this.numerator += numerator;
        return new Fraction(this.numerator, denominator);
    }

    public int intValue() {
        return integerValue;
    }


}
