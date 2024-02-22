package atminterface;
import java.util.Scanner;
public class Atm {
	private BankAccount account;
    public Atm(BankAccount account) {
        this.account = account;
    }
    public void displayMenu() {
        System.out.println("Welcome to the ATM!");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
    }
    public void performAction(int choice) {
        try (Scanner scanner = new Scanner(System.in)) {
			switch (choice) {
			    case 1:
			        System.out.println("Enter amount to withdraw:");
			        double withdrawAmount = scanner.nextDouble();
			        account.withdraw(withdrawAmount);
			        break;
			    case 2:
			        System.out.println("Enter amount to deposit:");
			        double depositAmount = scanner.nextDouble();
			        account.deposit(depositAmount);
			        break;
			    case 3:
			        System.out.println("Your balance is: " + account.checkBalance());
			        break;
			    case 4:
			        System.out.println("Thank you for using the ATM!");
			        System.exit(0);
			        break;
			    default:
			        System.out.println("Invalid choice.");
			        break;
			}
		}
    }
}


