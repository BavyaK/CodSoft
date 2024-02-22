package quiz;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Task4 {
	private static final int QUESTION_COUNT = 5;
    private static final int TIME_LIMIT_PER_QUESTION_SECONDS = 10;

    private static String[] questions = {
        "What is the capital of France?",
        "Which planet is known as the Red Planet?",
        "Who wrote 'Romeo and Juliet'?",
        "What is the chemical symbol for water?",
        "What is the tallest mammal?"
    };
    private static String[][] options = {
            {"A. London", "B. Paris", "C. Rome", "D. Berlin"},
            {"A. Venus", "B. Mars", "C. Jupiter", "D. Saturn"},
            {"A. William Shakespeare", "B. Jane Austen", "C. Charles Dickens", "D. Mark Twain"},
            {"A. Wa", "B. H2O", "C. Ho", "D. H2O2"},
            {"A. Elephant", "B. Giraffe", "C. Kangaroo", "D. Whale"}
        };

        private static char[] correctAnswers = {'B', 'B', 'A', 'B', 'B'};

        private static int score = 0;
        private static int currentQuestionIndex = 0;

        public static void main(String[] args) {
           // Timer timer = new Timer();
            try (Scanner scanner = new Scanner(System.in)) {
				System.out.println("Welcome to the Quiz!");

				for (int i = 0; i < QUESTION_COUNT; i++) {
				    displayQuestion(i);
				    Timer timer = new Timer();
				    TimerTask task = new TimerTask() {
				        @Override
				        public void run() {
				            System.out.println("\nTime's up!");
				            timer.cancel();
				            displayNextQuestion();
				        }
				    };
				    timer.schedule(task, TIME_LIMIT_PER_QUESTION_SECONDS * 1000);

				    System.out.print("Enter your choice: ");
				    char userChoice = scanner.next().toUpperCase().charAt(0);
				    timer.cancel(); // Cancel the timer since the user submitted their answer
				    if (userChoice == correctAnswers[i]) {
				        System.out.println("Correct!");
				        score++;
				    } else {
				        System.out.println("Incorrect!");
				    }
				    displayNextQuestion();
				}
			}

            System.out.println("\nQuiz ended!");
            System.out.println("Your final score is: " + score + "/" + QUESTION_COUNT);
        }

        private static void displayQuestion(int index) {
            System.out.println("\nQuestion " + (index + 1) + ": " + questions[index]);
            for (String option : options[index]) {
                System.out.println(option);
            }
        }

        private static void displayNextQuestion() {
            currentQuestionIndex++;
            if (currentQuestionIndex < QUESTION_COUNT) {
                displayQuestion(currentQuestionIndex);
            }
        }
    }


