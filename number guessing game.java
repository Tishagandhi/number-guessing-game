 import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        int lowerBound = 1;
        int upperBound = 100;
        int secretNumber;
        int maxAttempts = 10;
        int attempts = 0;

        Random random = new Random();
        secretNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have chosen a number between " + lowerBound + " and " + upperBound + ".");
        System.out.println("You have " + maxAttempts + " attempts to guess the number.");

        while (attempts < maxAttempts) {
            System.out.print("Attempt " + (attempts + 1) + ": Enter your guess: ");
            int guess = scanner.nextInt();
            scanner.nextLine();

            if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > secretNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the correct number (" + secretNumber + ") in " + (attempts + 1) + " attempts.");
                break;
            }

            attempts++;
        }

        if (attempts == maxAttempts) {
            System.out.println("Sorry, you've run out of attempts. The correct number was: " + secretNumber);
        }

        scanner.close();
    }
}
