package ua.com.sourceit.kravchenko.tasks.task2;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class SubTask3 {
    private static boolean playGame = true;
    private static int targetNumber;
    private static String lineSeparator = "=============================================";

    public static void guessingGame(int bound) {

        Random random = new Random();
        targetNumber = random.nextInt(bound);

        System.out.println("Welcome to the guessing game!");
        System.out.printf("I'm thinking of a number between 0 and %d. Try to guess it!\n", bound);

        while (playGame) {
            try {
                Scanner scanner = new Scanner(System.in);
                int userGuess = scanner.nextInt();

                if (userGuess == targetNumber) {
                    System.out.println("Congratulations! You won!");
                    playGame = false;
                } else if (userGuess < targetNumber) {
                    System.out.println("Higher." + "\n" + lineSeparator);
                } else {
                    System.out.println("Lower." + "\n" + lineSeparator);
                }
            } catch (InputMismatchException e) {
                System.out.println("Wrong input. Try again with a number!");
            }
        }
    }
}
