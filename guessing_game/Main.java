package guessing_game;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(0, 100);

        boolean programRunning = true;
        while (programRunning) {
            try {
                System.out.println("-------- Welcome to the guessing game! ---------");
                System.out.println("[>> Your mission is to guess a random number <<]");
                System.out.print("Type a random number (0 to 100): ");
                int numberGuess = input.nextInt();
                while (numberGuess != randomNumber) {
                    if (numberGuess < randomNumber) {
                        System.out.println("Wrong, the random number is greater than the guessed one! ");
                        System.out.print("Your guess: ");
                        numberGuess = input.nextInt();
                    } else {
                        System.out.println("Wrong, the random number is less than the guessed one! ");
                        System.out.print("Your guess: ");
                        numberGuess = input.nextInt();
                    }
                }
                programRunning = false;

            } catch (Exception e) {
                System.out.println("Error: Try running the program again!");
            }
        }
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
        System.out.println("Congratulations! You've won the game!");
        System.out.println("The random number was [>> " + randomNumber + " <<]");
    }
}
