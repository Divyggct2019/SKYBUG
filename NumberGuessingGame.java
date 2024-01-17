import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        Random randomGenerator = new Random();

        int minRange = 1;
        int maxRange = 100;
        int maxAttempts = 10;
        int totalRounds = 0;
        int totalScore = 0;

        System.out.println("Welcome to the Number Guessing Game!");

        do {
            int targetNumber = randomGenerator.nextInt(maxRange - minRange + 1) + minRange;
            int attempts = 0;
            int userGuess;

            System.out.println("\nRound " + (totalRounds + 1) + " - Guess the number between " + minRange + " and " + maxRange);

            do {
                System.out.print("Enter your guess: ");
                userGuess = inputScanner.nextInt();
                attempts++;

                if (userGuess == targetNumber) {
                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                    totalScore += maxAttempts - attempts + 1;
                } else if (userGuess < targetNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }

            } while (userGuess != targetNumber && attempts < maxAttempts);

            totalRounds++;

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = inputScanner.next().toLowerCase();

            if (!playAgain.equals("yes")) {
                System.out.println("\nGame Over! Your total score is: " + totalScore);
            }

        } while (totalRounds > 0 && inputScanner.next().toLowerCase().equals("yes"));

        inputScanner.close();
    }
}
