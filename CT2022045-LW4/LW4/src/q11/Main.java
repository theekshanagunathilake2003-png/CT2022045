package q11;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(100) + 1;
        int guess;
        int attempts = 0;

        System.out.println("I have picked a number between 1 and 100.");
        System.out.println("Can you guess it?");

        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < secretNumber) {
                System.out.println("Too Low! Try again.");
            } else if (guess > secretNumber) {
                System.out.println("Too High! Try again.");
            } else {
                System.out.println("Correct! You guessed it in " + attempts + " attempt(s)!");
            }

        } while (guess != secretNumber);

        scanner.close();
    }
}
