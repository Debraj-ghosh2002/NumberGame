import java.util.Scanner;
import java.util.Random;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int lowerBound = 1, upperBound = 100, maxAttempts = 5;
        boolean playAgain;

        do {
            int numberToGuess = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
            int attempts = 0;
            boolean guessedCorrectly = false;

            System.out.println("Guess a number between 1 and 100:");

            while (attempts < maxAttempts) {
                System.out.print("Attempt " + (attempts + 1) + ": ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == numberToGuess) {
                    System.out.println("Correct! You guessed it in " + attempts + " attempts.");
                    guessedCorrectly = true;
                    break;
                } else if (userGuess < numberToGuess) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Too high!");
                }
            }

            if (!guessedCorrectly) {
                System.out.println("Out of attempts! The correct number was " + numberToGuess);
            }

            System.out.print("Do you want to play again? (true/false): ");
            playAgain = scanner.nextBoolean();
        } while (playAgain);

        scanner.close();
    }
}