public class ComplexNumber {

    // Private attributes
    private double real;
    private double imaginary;

    // Default constructor
    public ComplexNumber() {
        this.real = 0;
        this.imaginary = 0;
    }

    // Parameterized constructor
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Copy constructor
    public ComplexNumber(ComplexNumber other) {
        this.real = other.real;
        this.imaginary = other.imaginary;
    }

    // Getters
    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    // Setters
    public void setReal(double real) {
        this.real = real;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    // Addition
    public ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(
                this.real + other.real,
                this.imaginary + other.imaginary
        );
    }

    // Subtraction
    public ComplexNumber subtract(ComplexNumber other) {
        return new ComplexNumber(
                this.real - other.real,
                this.imaginary - other.imaginary
        );
    }

    // Multiplication
    public ComplexNumber multiply(ComplexNumber other) {

        double newReal =
                this.real * other.real
                - this.imaginary * other.imaginary;

        double newImaginary =
                this.real * other.imaginary
                + this.imaginary * other.real;

        return new ComplexNumber(newReal, newImaginary);
    }

    // Converts object into String
    @Override
    public String toString() {

        if (imaginary >= 0) {
            return real + " + " + imaginary + "i";
        }

        return real + " - " + Math.abs(imaginary) + "i";
    }
}