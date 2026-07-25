
public class Calculator {

    public double add(double first, double second) {
        return first + second;
    }

    public double subtract(double first, double second) {
        return first - second;
    }

    public double multiply(double first, double second) {
        return first * second;
    }

    public double divide(double first, double second) {
        if (second == 0) {
            System.err.println("Error: Division by zero is undefined!");
            return Double.NaN; // Not a Number
        }
        return first / second;
    }

   
    public double modulus(double first, double second) {
        if (second == 0) {
            System.err.println("Error: Modulus by zero is undefined!");
            return Double.NaN;
        }
        return first % second;
    }

   
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    
    public double add(double... numbers) {
        double total = 0;
        for (double num : numbers) {
            total += num;
        }
        return total;
    }
}