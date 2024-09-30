import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int minRange = 1;
        int maxRange = 100;
        int maxAttempts = 10;
        int rounds = 0;
        int score = 0;

        System.out.println("Welcome to the Number Guessing Game!");

        do {
            int targetNumber = getRandomNumber(minRange, maxRange);
            int attempts = 0;
            boolean guessedCorrectly = false;

            System.out.println("\nRound " + (rounds + 1) + ": Guess the number between "
                    + minRange + " and " + maxRange);

            while (attempts < maxAttempts && !guessedCorrectly) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == targetNumber) {
                    System.out.println("Congratulations! You guessed the correct number in "
                            + attempts + " attempts.");
                    guessedCorrectly = true;
                    score += maxAttempts - attempts + 1; // Adjust the scoring as needed
                } else if (userGuess < targetNumber) {
                    System.out.println("Too low. Try again!");
                } else {
                    System.out.println("Too high. Try again!");
                }
            }

            if (!guessedCorrectly) {
                System.out.println("Sorry! You've run out of attempts. The correct number was: " + targetNumber);
            }

            System.out.println("Your current score: " + score);
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.next().toLowerCase();
            if (playAgain.equals("yes")) {
                rounds++;
            } else {
                System.out.println("Thanks for playing! Your final score: " + score);
                break;
            }
        } while (true);

        scanner.close();
    }

    private static int getRandomNumber(int min, int max) {
        return new Random().nextInt(max - min + 1) + min;
    }
}
