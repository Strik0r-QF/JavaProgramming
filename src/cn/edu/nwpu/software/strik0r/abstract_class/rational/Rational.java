package cn.edu.nwpu.software.strik0r.abstract_class.rational;

import org.jetbrains.annotations.NotNull;

import static Mathematic.IntRing.gcd;

public class Rational extends java.lang.Number implements java.lang.Comparable<Rational> {

    private int numerator = 0;
    private int denominator = 1;

    public Rational() {
        this(0, 1);
    }

    public Rational(int numerator, int denominator) {
        int gcd = gcd(numerator, denominator);
        this.numerator = (denominator > 0 ? 1 : -1) * numerator / gcd;
        this.denominator = Math.abs(denominator) / gcd;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public Rational add(Rational secondRational) {
        int n = this.numerator*secondRational.getDenominator()
                + this.denominator*secondRational.getNumerator();
        int d = this.denominator*secondRational.getDenominator();
        return new Rational(n, d);
    }

    public Rational subtract(Rational secondRational) {
        Rational inverseOfSecondRational = new Rational(
                -secondRational.getNumerator(),
                secondRational.getDenominator()
        );
        return this.add(inverseOfSecondRational);
    }

    public Rational multiply(Rational secondRational) {
        int n = this.numerator * secondRational.getNumerator();
        int d = this.denominator * secondRational.getDenominator();
        return new Rational(n, d);
    }

    public Rational devide(Rational secondRational) {
        Rational inverseOfSecondRational = new Rational(
                secondRational.getDenominator(),
                secondRational.getNumerator()
        );
        return this.multiply(inverseOfSecondRational);
    }

    @Override
    public int compareTo(@NotNull Rational o) {
        if (this.subtract(o).getNumerator() > 0) {
            return 1;
        } else if (this.subtract(o).getNumerator() < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public int intValue() {
        return (int)doubleValue();
    }

    @Override
    public long longValue() {
        return (long) doubleValue();
    }

    @Override
    public float floatValue() {
        return (float) doubleValue();
    }

    @Override
    public double doubleValue() {
        return numerator * 1.0 / denominator;
    }

    @Override
    public String toString() {
        if (denominator == 1) {
            return numerator+"";
        } else {
            return numerator + "/" + denominator;
        }
    }

    @Override
    public boolean equals (Object other) {
        if ((this.subtract((Rational) other)).getNumerator() == 0) {
            return true;
        } else {
            return false;
        }
    }


}
