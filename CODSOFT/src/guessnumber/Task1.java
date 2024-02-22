package guessnumber;
import java.util.Scanner;
public class Task1 {
	public static void guessingNumber() {
        try (Scanner sc = new Scanner(System.in)) {
			int totalRounds = 3; 
			int round = 1;
			int score = 0;
			boolean playAgain = true;

			while (playAgain) {
			    System.out.println("Round " + round + ":");
			    int number = 1 + (int) (100 * Math.random());
			    int T = 3;
			    int i, guess;
			    System.out.println("The number is chosen between 1 and 100."
			    		+ " Guess the number within " + T + " trails!");

			    for (i = 0; i < T; i++) {
			        System.out.println("Guess The number:");
			        guess = sc.nextInt();
			        if (number == guess) {
			            System.out.println("Hurray!! You guessed the number.");
			            score++;
			            break;
			        } else if (number > guess && i != T - 1) {
			             System.out.println("The number is greater than " + guess);
			        } else if (number < guess && i != T - 1) {
			            System.out.println("The number is less than " + guess);
			        }
			    }

			    if (i == T) {
			        System.out.println("You have exhausted " + T + " trails.");
			        System.out.println("The number was " + number);
			    }

			    round++;

			    if (round <= totalRounds) {
			        System.out.println("Do you want to play again? (yes/no)");
			        String choice = sc.next();
			        playAgain = choice.equalsIgnoreCase("yes");
			    } else {
			        playAgain = false;
			    }
			}

			System.out.println("Game Over!");
			System.out.println("Your final score is: " + score + "/" + totalRounds);
		}
    }

    public static void main(String[] args) {
        guessingNumber();
    }
}


