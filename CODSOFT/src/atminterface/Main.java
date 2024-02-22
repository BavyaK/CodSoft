package atminterface;
import atminterface.BankAccount;
import atminterface.Atm;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        BankAccount userAccount = new BankAccount(1000); 
        Atm atm = new Atm(userAccount);
        try (Scanner scanner = new Scanner(System.in)) {
			while (true) {
			    atm.displayMenu();
			    System.out.println("Enter your choice:");
			    int choice = scanner.nextInt();
			    atm.performAction(choice);
			}
		}
    }
}
