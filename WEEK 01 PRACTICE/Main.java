 public class Main {
    public static void main(String[] args) {
        // Parameterized constructor
        Book b1 = new Book("Java Programming", "John Doe", 5000);

        // Copy constructor
        Book b2 = new Book(b1);

        // Null constructor
        Book b3 = new Book();

        System.out.println("Book 1: " + b1.title + " by " + b1.name + " - Rs." + b1.price);
        System.out.println("Book 2 (Copy): " + b2.title + " by " + b2.name + " - Rs." + b2.price);
        System.out.println("Book 3 (Default): " + b3.title + " by " + b3.name + " - Rs." + b3.price);
    }
}