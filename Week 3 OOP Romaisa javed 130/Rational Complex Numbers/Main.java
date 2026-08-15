public class Main{

    public static void main(String[] args) {

        // =========================
        // COMPLEX NUMBER
        // =========================

        ComplexNumber c1 = new ComplexNumber(4.5, 2.0);
        ComplexNumber c2 = new ComplexNumber(-1.5, 3.0);

        System.out.println("=== Complex Numbers ===");

        System.out.println("C1: " + c1);
        System.out.println("C2: " + c2);

        // Addition
        System.out.println("Addition: " + c1.add(c2));

        // Subtraction
        System.out.println("Subtraction: " + c1.subtract(c2));

        // Multiplication
        System.out.println("Multiplication: " + c1.multiply(c2));

        // Copy constructor
        ComplexNumber cCopy = new ComplexNumber(c1);

        // Setters
        cCopy.setReal(9.5);
        cCopy.setImaginary(-4.0);

        System.out.println("Copied then changed: " + cCopy);

        // Original remains unchanged
        System.out.println("Original C1: " + c1);


        // =========================
        // RATIONAL NUMBER
        // =========================

        System.out.println("\n=== Rational Numbers ===");

        RationalNumber r1 = new RationalNumber(18, 24);
        RationalNumber r2 = new RationalNumber(-5, 12);

        System.out.println("R1 simplified: " + r1);
        System.out.println("R2: " + r2);

        // Addition
        System.out.println("R1 + R2: " + r1.add(r2));

        // Subtraction
        System.out.println("R1 - R2: " + r1.subtract(r2));

        // Copy constructor
        RationalNumber rCopy = new RationalNumber(r1);

        System.out.println("R1 copy: " + rCopy);

        // Zero numerator
        RationalNumber zero = new RationalNumber(0, 15);

        System.out.println("Zero numerator: " + zero);

        // Zero denominator validation
        try {
            RationalNumber invalid = new RationalNumber(3, 0);
        }
        catch (IllegalArgumentException e) {
            System.out.println(
                    "Zero denominator validation: "
                    + e.getMessage()
            );
        }
    }
}