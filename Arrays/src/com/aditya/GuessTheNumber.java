package com.aditya;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1;
        int upperBound = 100;
        int secretNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        int attempts = 0;

        System.out.println("Welcome to the Guess the Number game!");
        System.out.println("I'm thinking of a number between 1 and 100.");

        while (true) {
            System.out.print("Enter your guess: ");

            if (scanner.hasNextInt()) {
                int guess = scanner.nextInt();
                attempts++;

                if (guess < secretNumber) {
                    System.out.println("Too low! Try again.");
                } else if (guess > secretNumber) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You guessed the number " + secretNumber + " in " + attempts + " attempts!");
                    break;
                }
            } else {
                System.out.println("Please enter a valid number.");
                scanner.next(); // Clear the invalid input
            }
        }

        scanner.close();
    }
}
