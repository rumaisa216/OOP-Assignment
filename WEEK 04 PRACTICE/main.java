// Main class testing ke liye
public class Main {
    public static void main(String[] args) {
       
        Car deep1 = new Car(150);
        try {
            Car deep2 = (Car) deep1.clone();
            System.out.println("--- DEEP COPY TEST ---");
            System.out.print("Original: ");
            deep1.showDetails();
            System.out.print("Cloned:   ");
            deep2.showDetails();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println();

        Vector v1 = new Vector(5, 10);
        Vector v2 = new Vector(5, 10);
        
        System.out.println("--- EQUALS TEST ---");
        System.out.println("v1.equals(v2): " + v1.equals(v2)); // Output: true
    }
}