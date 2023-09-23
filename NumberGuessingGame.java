import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int lowerLimit = 1;
        int upperLimit = 100;
        int maxAttempts = 10;
        int score = 0;
        
        System.out.println("Welcome to the Number Guessing Game!");
        boolean playAgain = true;

        while (playAgain) {
            int targetNumber = random.nextInt(upperLimit - lowerLimit + 1) + lowerLimit;
            int attempts = 0;

            System.out.println("I've picked a random number between " + lowerLimit + " and " + upperLimit + ". Try to guess it.");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess (" + (attempts + 1) + " of " + maxAttempts + "): ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess < lowerLimit || userGuess > upperLimit) {
                    System.out.println("Please enter a number within the valid range.");
                } else if (userGuess < targetNumber) {
                    System.out.println("Too low! Try again.");
                } else if (userGuess > targetNumber) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You've guessed the number " + targetNumber + " correctly in " + attempts + " attempts.");
                    score++;
                    break;
                }
            }

            if (attempts == maxAttempts) {
                System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was " + targetNumber + ".");
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainChoice = scanner.next().toLowerCase();
            if (!playAgainChoice.equals("yes")) {
                playAgain = false;
            }
        }

        System.out.println("Game Over!");
        System.out.println("Your Score: " + score);

        scanner.close();
    }
}
