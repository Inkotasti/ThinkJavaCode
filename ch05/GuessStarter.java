import java.util.Random;
import java.util.Scanner;

/**
 * Starter code for the "Guess My Number" exercise.
 */
public class GuessStarter {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        int guess;

        System.out.println("Can you guess what number I am thinking of?");
        System.out.println("I am thinking of a decimal number between 1 - 100, both included");
        System.out.print("Take a guess. Input your number: ");
        guess = in.nextInt();
        System.out.println("So your guess is " + guess + ". Interesting!");
        guessLoop(guess, number);
    }

    public static void decimalChecker(double x) {
        if ((x % 1) != 0) {
            System.out.println("This is not decimal. Please enter decimal number as your guess");
        }
    }

    public static void guessChecker(int guess, int number) {
        if (guess > number) {
            System.out.print("Your guess was too high. \nTry Again :");
        } else {
            System.out.print("Your guess was too low. \nTry Again: ");
        }
    }

    public static void guessLoop(int guess, int number) {
        Scanner in = new Scanner(System.in);
        if (guess != number) {
            guessChecker(guess, number);
            int newGuess = in.nextInt();
            guessLoop(newGuess, number);
        } else {
            System.out.println("Congrats. You got it right. I was indeed thinking of number " + number);
        }
    }
}