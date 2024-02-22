package atminterface;

public class BankAccount {
    private double balance;
	    public BankAccount(double initialBalance) {
	        balance = initialBalance;
	    }
	    public void deposit(double amount) {
	        balance += amount;
	        System.out.println(amount + " deposited successfully.");
	    }
	    public void withdraw(double amount) {
	        if (balance >= amount) {
	            balance -= amount;
	            System.out.println(amount + " withdrawn successfully.");
	        } else {
	            System.out.println("Insufficient balance.");
	        }
	    }
	    public double checkBalance() {
	        return balance;  
	    }
	}


