package task10OOPS;
public class Account {
    private double balance;

    // No-argument constructor
    public Account() {
        this.balance = 0.0;
    }

    // Constructor with two arguments
    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

     // Method to withdraw balance
     public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Current balance: " + balance);
        } else {
            System.out.println("Withdrawal failed. Insufficient balance.");
        }
    }

    // Method to deposit balance
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. Current balance: " + balance);
        } else {
            System.out.println("Deposit failed. Invalid amount.");
        }
    }

    // Method to get current balance
    public double getBalance() {
        return balance;
    }

    // Main method for testing
    public static void main(String[] args) {
        Account account1 = new Account(); // Create account with default balance
        Account account2 = new Account(100.0); // Create account with initial balance of 100
        

        account1.deposit(50.0); // Deposit 50 to account1        
        account1.withdraw(30.0); // Withdraw 30 from account1  
        System.out.println("Account 1 balance: " + account1.getBalance()); // Print account1 balance
    
        account2.withdraw(200.0); // Try to withdraw more than balance from account2        
        account2.deposit(-20.0); // Try to deposit negative amount to account2        
        System.out.println("Account 2 balance: " + account2.getBalance()); // Print account2 balance    
    }

}


