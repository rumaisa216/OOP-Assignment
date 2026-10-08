
public class Vector {
    int x, y;

    Vector(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /
    public boolean equals(Object obj) {
       
        if (this == obj) return true;
        
   
        if (obj == null || getClass() != obj.getClass()) return false;
        
        Vector other = (Vector) obj;
        return this.x == other.x && this.y == other.y;
    }
}

public class Main {
    public static void main(String[] args) {
        Vector v1 = new Vector(5, 10);
        Vector v2 = new Vector(5, 10);
        Vector v3 = new Vector(3, 7);

        System.out.println("v1.equals(v2): " + v1.equals(v2)); // true
        System.out.println("v1.equals(v3): " + v1.equals(v3)); // false
    }
}