public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("=== CALCULATOR TESTING ===");
        
        // Basic Operations
        System.out.println("Addition (10 + 5): " + calc.add(10, 5));
        System.out.println("Subtraction (10 - 5): " + calc.subtract(10, 5));
        System.out.println("Multiplication (10 * 5): " + calc.multiply(10, 5));

        // Division Normal & Edge Case
        System.out.println("Division Normal (10 / 2): " + calc.divide(10, 2));
        System.out.print("Division Edge Case (10 / 0): ");
        System.out.println(calc.divide(10, 0));

        // Modulus Normal & Edge Case
        System.out.println("Modulus Normal (10 % 3): " + calc.modulus(10, 3));
        System.out.print("Modulus Edge Case (10 % 0): ");
        System.out.println(calc.modulus(10, 0));

        // Power
        System.out.println("Power (2^3): " + calc.power(2, 3));

        // Varargs Demonstration
        System.out.println("Varargs Add (10 + 20 + 30 + 40): " + calc.add(10, 20, 30, 40));
    }
}
