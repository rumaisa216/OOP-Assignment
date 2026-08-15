public class RationalNumber {

    // Private attributes
    private int numerator;
    private int denominator;

    // Null constructor
    public RationalNumber() {
        this.numerator = 0;
        this.denominator = 1;
    }

    // Parameterized constructor
    public RationalNumber(int numerator, int denominator) {

        if (denominator == 0) {
            throw new IllegalArgumentException(
                    "Denominator cannot be zero."
            );
        }

        this.numerator = numerator;
        this.denominator = denominator;

        simplify();
    }

    // Copy constructor
    public RationalNumber(RationalNumber other) {
        this.numerator = other.numerator;
        this.denominator = other.denominator;
    }

    // Getters
    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    // Setter for numerator
    public void setNumerator(int numerator) {
        this.numerator = numerator;
        simplify();
    }

    // Setter for denominator
    public void setDenominator(int denominator) {

        if (denominator == 0) {
            throw new IllegalArgumentException(
                    "Denominator cannot be zero."
            );
        }

        this.denominator = denominator;
        simplify();
    }

    // Private helper method for GCD
    private int gcd(int a, int b) {

        a = Math.abs(a);
        b = Math.abs(b);

        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }

        if (a == 0) {
            return 1;
        }

        return a;
    }

    // Simplifies the fraction
    public void simplify() {

        // Zero numerator is always represented as 0/1
        if (numerator == 0) {
            denominator = 1;
            return;
        }

        // Keep negative sign in numerator
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }

        int common = gcd(numerator, denominator);

        numerator = numerator / common;
        denominator = denominator / common;
    }

    // Adds two rational numbers
    public RationalNumber add(RationalNumber other) {

        int newNumerator =
                this.numerator * other.denominator
                + other.numerator * this.denominator;

        int newDenominator =
                this.denominator * other.denominator;

        return new RationalNumber(
                newNumerator,
                newDenominator
        );
    }

    // Subtracts two rational numbers
    public RationalNumber subtract(RationalNumber other) {

        int newNumerator =
                this.numerator * other.denominator
                - other.numerator * this.denominator;

        int newDenominator =
                this.denominator * other.denominator;

        return new RationalNumber(
                newNumerator,
                newDenominator
        );
    }

    // Converts RationalNumber into String
    @Override
    public String toString() {

        if (numerator == 0) {
            return "0";
        }

        if (denominator == 1) {
            return Integer.toString(numerator);
        }

        return numerator + "/" + denominator;
    }
}