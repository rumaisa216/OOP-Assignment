public class Main {
    public static void main(String[] args) {
        
        // 1. Null Constructor
        CustomerAccount acc1 = new CustomerAccount();
        System.out.println("--- Account 1 (Default Constructor) ---");
        acc1.printAccountDetails();

        //  Parameterized Constructor 
        CustomerAccount acc2 = new CustomerAccount("PK123", "Ali", 2000.0, 0);
        System.out.println("\n--- Account 2 (Parameterized Constructor) ---");
        acc2.printAccountDetails();

        
        System.out.println("\n--- Performing Transactions on Account 2 ---");
        acc2.deposit(1000.0);   // Balance ho jayega 3000
        acc2.withdraw(500.0);   // Balance ho jayega 2500
        acc2.printAccountDetails();

        //  Copy Constructor
        CustomerAccount acc3 = new CustomerAccount(acc2);
        System.out.println("\n--- Account 3 (Copy of Account 2) ---");
        acc3.printAccountDetails();

       
        System.out.println("\n--- toString() Output ---");
        System.out.println(acc2.toString());
    }
}