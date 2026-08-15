public class Point {

    // Private attributes
    private double x;
    private double y;

    // Null constructor
    public Point() {
        this.x = 0;
        this.y = 0;
    }

    // Parameterized constructor
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Copy constructor
    public Point(Point other) {
        this.x = other.x;
        this.y = other.y;
    }

    // Getter for x
    public double getX() {
        return x;
    }

    // Getter for y
    public double getY() {
        return y;
    }

    // Setter for x
    public void setX(double x) {
        this.x = x;
    }

    // Setter for y
    public void setY(double y) {
        this.y = y;
    }

    
    public Point add(Point other) {
        return new Point(this.x + other.x, this.y + other.y);
    }

    
    public Point subtract(Point other) {
        return new Point(this.x - other.x, this.y - other.y);
    }

    public double distanceFrom(Point other) {
        double dx = this.x - other.x;
        double dy = this.y - other.y;

        return Math.sqrt(dx * dx + dy * dy);
    }

    //toString
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}