package assignment;

abstract class BankAccount {
 protected String accountNumber;
 protected String accountHolderName;
 protected double balance;

 public BankAccount(String accountNumber, String accountHolderName, double balance) {
     this.accountNumber = accountNumber;
     this.accountHolderName = accountHolderName;
     this.balance = balance;
 }

 public abstract String getAccountNumber();
 public abstract String getAccountHolderName();
 public abstract double getBalance();
 public abstract void deposit(double amount);
 public abstract void withdraw(double amount);
}

class SavingsAccount extends BankAccount {
 public SavingsAccount(String accountNumber, String accountHolderName, double balance, double interestRate) {
     super(accountNumber, accountHolderName, balance);
 }

 @Override
 public String getAccountNumber() {
     return super.accountNumber;
 }

 @Override
 public String getAccountHolderName() {
     return super.accountHolderName;
 }

 @Override
 public double getBalance() {
     return super.balance;
 }

 @Override
 public void deposit(double amount) {
     super.balance += amount;
 }

 @Override
 public void withdraw(double amount) {
     if (super.balance - amount >= 0) {
         super.balance -= amount;
     } else {
         System.out.println("Insufficient balance");
     }
 }
}

//CheckingAccount.java
class CheckingAccount extends BankAccount {
 private double overdraftLimit;

 public CheckingAccount(String accountNumber, String accountHolderName, double balance, double overdraftLimit) {
     super(accountNumber, accountHolderName, balance);
     this.overdraftLimit = overdraftLimit;
 }

 @Override
 public String getAccountNumber() {
     return super.accountNumber;
 }

 @Override
 public String getAccountHolderName() {
     return super.accountHolderName;
 }

 @Override
 public double getBalance() {
     return super.balance;
 }

 @Override
 public void deposit(double amount) {
     super.balance += amount;
 }

 @Override
 public void withdraw(double amount) {
     if (super.balance - amount >= -overdraftLimit) {
         super.balance -= amount;
     } else {
         System.out.println("Exceeds overdraft limit");
     }
 }
}

public class Main {
 public static void main(String[] args) {
     SavingsAccount savingsAccount = new SavingsAccount("SA123", "John Doe", 1000.0, 0.05);
     CheckingAccount checkingAccount = new CheckingAccount("CA456", "Jane Smith", 500.0, 100.0);

     System.out.println("Initial Balances:");
     System.out.println("Savings Account Balance: " + savingsAccount.getBalance());
     System.out.println("Checking Account Balance: " + checkingAccount.getBalance());

     savingsAccount.deposit(500.0);
     checkingAccount.deposit(300.0);

     savingsAccount.withdraw(200.0);
     checkingAccount.withdraw(700.0);

     System.out.println("\nFinal Balances:");
     System.out.println("Savings Account Balance: " + savingsAccount.getBalance());
     System.out.println("Checking Account Balance: " + checkingAccount.getBalance());
 }
}

