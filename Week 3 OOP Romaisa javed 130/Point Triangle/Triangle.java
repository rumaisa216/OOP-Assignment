public class Triangle {

  
    private Point p1;
    private Point p2;
    private Point p3;

    // Null constructor
    public Triangle() {
        this(
            new Point(0, 0),
            new Point(3, 0),
            new Point(0, 4)
        );
    }

    // Parameterized constructor
    public Triangle(Point p1, Point p2, Point p3) {
        // Copies are used to keep the Triangle independent
        this.p1 = new Point(p1);
        this.p2 = new Point(p2);
        this.p3 = new Point(p3);
    }

    // Copy constructor
    public Triangle(Triangle other) {
        this(other.p1, other.p2, other.p3);
    }

    // Getters
    public Point getP1() {
        return new Point(p1);
    }

    public Point getP2() {
        return new Point(p2);
    }

    public Point getP3() {
        return new Point(p3);
    }

    // Setters
    public void setP1(Point p1) {
        this.p1 = new Point(p1);
    }

    public void setP2(Point p2) {
        this.p2 = new Point(p2);
    }

    public void setP3(Point p3) {
        this.p3 = new Point(p3);
    }

    // First side
    private double sideA() {
        return p1.distanceFrom(p2);
    }

    // Second side
    private double sideB() {
        return p2.distanceFrom(p3);
    }

    // Third side
    private double sideC() {
        return p3.distanceFrom(p1);
    }

    // Calculates perimeter
    public double perimeter() {
        return sideA() + sideB() + sideC();
    }

 
    public double area() {
        double a = sideA();
        double b = sideB();
        double c = sideC();

        double s = perimeter() / 2.0;

        double value = s * (s - a) * (s - b) * (s - c);

        if (value <= 0) {
            return 0;
        }

        return Math.sqrt(value);
    }

    // Checks whether two sides are approximately equal
    private boolean equal(double a, double b) {
        return Math.abs(a - b) < 0.000000001;
    }

    // Finds triangle type
    public String type() {
        double a = sideA();
        double b = sideB();
        double c = sideC();

        // Triangle inequality
        if (a + b <= c || a + c <= b || b + c <= a) {
            return "Invalid Triangle";
        }

        if (equal(a, b) && equal(b, c)) {
            return "Equilateral";
        }

        if (equal(a, b) || equal(b, c) || equal(a, c)) {
            return "Isosceles";
        }

        return "Scalene";
    }

    // Converts Triangle into String
    @Override
    public String toString() {
        return "Triangle{" +
                "p1=" + p1 +
                ", p2=" + p2 +
                ", p3=" + p3 +
                "}";
    }
}