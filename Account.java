package atm;

public class Account implements ATMOperations {
    private String accountNumber;
    private String accountHolderName;
    private String password;
    private double balance;
    private int failedAttempts;
    private boolean isLocked;

    // Constructor
    public Account(String accountNumber, String accountHolderName, String password, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.password = password;
        this.balance = initialBalance;
        this.failedAttempts = 0;
        this.isLocked = false;
    }

    // Getter and Setter methods for encapsulation
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    private void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean validatePassword(String inputPassword) {
        if (isLocked) {
            System.out.println("Account is locked due to too many failed login attempts.");
            return false;
        }

        if (this.password.equals(inputPassword)) {
            failedAttempts = 0; // Reset failed attempts on successful login
            return true;
        } else {
            failedAttempts++;
            if (failedAttempts >= 5) {
                isLocked = true;
                System.out.println("Account locked due to too many failed login attempts.");
            }
            return false;
        }
    }

    // Implementing ATMOperations interface methods
    public void checkBalance() {
        System.out.println("Balance: " + this.balance);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println(amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    public void transfer(Account recipient, double amount) {
        if (recipient != null && amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            recipient.setBalance(recipient.getBalance() + amount);
            System.out.println(amount + " transferred to " + recipient.getAccountHolderName() + " successfully.");
        } else {
            System.out.println("Invalid transfer amount or insufficient funds.");
        }
    }
}
