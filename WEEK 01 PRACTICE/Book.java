public class Book {
    public String title;
    public String name;
    public double price;

    // Null constructor
    public Book() {
        this.title = "Untitled";
        this.name = "Unknown";
        this.price = 0.0;
    }

    // Parameterized constructor
    public Book(String title, String name, double price) {
        this.title = title;
        this.name = author;
        this.price = price;
    }

    // Copy constructor
    public Book(Book b) {
        this.title = b.title;
        this.name = b.name;
        this.price = b.price;
    }
}