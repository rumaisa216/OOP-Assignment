public class Main {

    public static void main(String[] args) {

        // Creating two Point objects
        Point first = new Point(4, 3);
        Point second = new Point(2, 5);

        System.out.println("===== POINT DEMO =====");

        System.out.println("First Point: " + first);
        System.out.println("Second Point: " + second);

        // Point addition
        Point sum = first.add(second);
        System.out.println("Addition: " + sum);

        // Point subtraction
        Point difference = first.subtract(second);
        System.out.println("Subtraction: " + difference);

        // Copy constructor
        Point copy = new Point(first);

        System.out.println("Copied Point: " + copy);

        // Changing copied object
        copy.setX(100);
        copy.setY(200);

        System.out.println("Changed Copy: " + copy);

        // Original object remains unchanged
        System.out.println("Original Point: " + first);

        // Creating Triangle
        Triangle triangle = new Triangle(
                new Point(0, 0),
                new Point(4, 0),
                new Point(0, 3)
        );

        System.out.println("\n===== TRIANGLE DEMO =====");

        System.out.println("Triangle: " + triangle);

        System.out.printf(
                "Perimeter: %.2f%n",
                triangle.perimeter()
        );

        System.out.printf(
                "Area: %.2f%n",
                triangle.area()
        );

        System.out.println("Type: " + triangle.type());
    }
}