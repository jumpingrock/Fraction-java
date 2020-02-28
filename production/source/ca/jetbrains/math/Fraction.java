package ca.jetbrains.math;

public class Fraction {
    private int integerValue;

    public Fraction(int integerValue) {

        this.integerValue = integerValue;
    }

    public Fraction plus(Fraction that) {
        if (that.integerValue != 0) {
            return that;
        }else {
            return this;
        }

    }

    public int intValue() {
        return integerValue;
    }


}
