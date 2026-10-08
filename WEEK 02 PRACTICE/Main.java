public class Main {
    public static void main(String[] args) {
        //Null constructor call
        Point p1 = new Point();

        // Parameterized constructor 
        Point p2 = new Point(5, 8);

        // Copy constructor
        Point p3 = new Point(p2);

       
        System.out.println("Null Point: " + p1);
        System.out.println("Parameterized Point: " + p2);
        System.out.println("Copied Point: " + p3);
    }
}