public class Point {
    public int x;
    public int y;

    // Null constructor
    public Point() {
        this.x = 0;
        this.y = 0;
    }

    // Parameterized constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Copy constructor
    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

   
    @Override
    public String toString() {
        return "Point [X = " + this.x + ", Y = " + this.y + "]";
    }
}