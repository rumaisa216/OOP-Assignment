public class CustomerAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;
    private int totalTransactions;

    // Null Constructor 
    public CustomerAccount() {
        this.accountNumber = "0000";
        this.accountHolder = "Unknown";
        this.balance = 0.0;
        this.totalTransactions = 0;
    }

    //  Parameterized Constructor
    public CustomerAccount(String accountNumber, String accountHolder, double balance, int totalTransactions) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.totalTransactions = totalTransactions;
    }

    // Copy Constructor 
    public CustomerAccount(CustomerAccount other) {
        this.accountNumber = other.accountNumber;
        this.accountHolder = other.accountHolder;
        this.balance = other.balance;
        this.totalTransactions = other.totalTransactions;
    }

    public boolean deposit(double amount) {
        if (amount <= 0) {
            return false;
        }
        this.balance += amount;
        this.totalTransactions++;
        return true;
    }



}

















    public boolean withdraw(double amount) {
        if (amount > 0 && (this.balance - amount) >= 500) {
            this.balance -= amount;
            this.totalTransactions++;
            return true;
        }
        return false;
    }


    public void printAccountDetails() {
        System.out.println("Acc No: " + this.accountNumber + 
      "  Holder: " + this.accountHolder + 
      "  Balance: RS " + this.balance + 
      " Total : " + this.totalTransactions);
    }

   
    @Override
    public String toString() {
        return "CustomerAccount [AccNo=" + this.accountNumber + 
         ", Holder=" + this.accountHolder + 
         ", Balance=" + this.balance + 
         ", Txns=" + this.totalTransactions + "]";
    }
}





































public class Account {
    private String accountNumber, accountHolder;
    private double balance;
    private int totalTransactions;

    // Constructors
    public Account() { 
        this("0000", "Unknown", 0.0, 0); 
    }

    public Account(String accountNumber, String accountHolder, double balance, int totalTransactions) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.totalTransactions = totalTransactions;
    }

    public Account(Account other) {
        this(other.accountNumber, other.accountHolder, other.balance, other.totalTransactions);
    }

    // Methods
    public boolean deposit(double amount) {
        if (amount <= 0) return false;
        this.balance += amount;
        this.totalTransactions++;
        return true;
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && (this.balance - amount) >= 500) {
            this.balance -= amount;
            this.totalTransactions++;
            return true;
        }
        return false;
    }
 public void printAccountDetails() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "AccNo: " + accountNumber + " | Holder: " + accountHolder + " | Balance: RS " + balance + " | Txns: " + totalTransactions;
    }
}









