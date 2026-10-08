public class book {
    public String title;
    public String name;
   public double  price;

   //Null constructor
   public  book() {
    this.title= "Untitled";
    this.name = "Unknown";
    this.price = 0.0;
   }
   //Parameterized constructor 
   public book (String title , String name,double price ){
   this.title = title   ;
   this.name= name;
   this.price= price;
   }
   //Copy constructor 
   public book (book b){
   this.title=b.title;
   this.name=b.name;
   this.price=b.price;
}
 

    public String toString(){
        return this.title+","+this.name +","+ this.price;
    }
}


public class Main {
    public static void main(String[] args) {
      book b1 = new book();
      book b2 = new book("Java","Programming",500.00);
      book b3= new book (b2);

System.out.println(b1);
System.out.println(b2);
System.out.println(b3);

    }
}
