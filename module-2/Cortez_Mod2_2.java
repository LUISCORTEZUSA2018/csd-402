/*
 * Name: Luis Cortez
 * Date: August 20, 2026
 * Assignment: Module 2.2 Rock-Paper-Scissors
 * Course: CSD 402 - Java for Programmers
 */

import java.util.Scanner;
import java.util.Random;

public class Cortez_Mod2_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        // Generate a random number from 1 to 3 for the computer
        int computerChoice = random.nextInt(3) + 1;

        // Display game instructions
        System.out.println("Rock-Paper-Scissors");
        System.out.println("1 = Rock");
        System.out.println("2 = Paper");
        System.out.println("3 = Scissors");
        System.out.print("Enter your choice (1, 2, or 3): ");

        int userChoice = input.nextInt();

        // Check for invalid input
        if (userChoice < 1 || userChoice > 3) {
            System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            input.close();
            return;
        }

        String computerSelection = "";
        String userSelection = "";

        // Determine the computer's selection
        if (computerChoice == 1) {
            computerSelection = "Rock";
        } else if (computerChoice == 2) {
            computerSelection = "Paper";
        } else {
            computerSelection = "Scissors";
        }

        // Determine the user's selection
        if (userChoice == 1) {
            userSelection = "Rock";
        } else if (userChoice == 2) {
            userSelection = "Paper";
        } else {
            userSelection = "Scissors";
        }

        // Display both selections
        System.out.println();
        System.out.println("Computer selected: " + computerSelection);
        System.out.println("You selected: " + userSelection);

        // Determine the winner
        if (userChoice == computerChoice) {
            System.out.println("The game is a tie!");
        } else if ((userChoice == 1 && computerChoice == 3)
                || (userChoice == 2 && computerChoice == 1)
                || (userChoice == 3 && computerChoice == 2)) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }

        input.close();
    }
}