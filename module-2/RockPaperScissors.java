/*
Jonathon Walmsley
08/23/2026
Module 2.2
Description: Rock-Paper-Scissors game.
*/

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] options = {"Rock", "Paper", "Scissors"};
        int userChoice;
        int computerChoice;
        boolean playAgain = false;

        // Track Game Stats
        int gamesPlayed = 0;
        int userWins = 0;
        int computerWins = 0;
        int ties = 0;

        do {
            // Get user choice
            WriteLine("Choose Rock (1), Paper (2), or Scissors (3): ");
            switch (scanner.nextLine().toLowerCase()) {
                case "1", "rock" -> userChoice = 1;
                case "2", "paper" -> userChoice = 2;
                case "3", "scissors" -> userChoice = 3;
                default -> {
                    WriteLine("Invalid input. Please enter 1, 2, or 3.");
                    continue; 
                }
            }

            WriteLine("You chose: " + options[userChoice - 1] + " (" + userChoice + ")");

            // Get computer choice
            computerChoice = random.nextInt(3) + 1;
            WriteLine("Computer chose: " + options[computerChoice - 1] + " (" + computerChoice + ")");

            // Determine winner
            if (userChoice == computerChoice) {
                WriteLine("It's a tie!");
                ties++;

            } else if ((userChoice == 1 && computerChoice == 3) ||
                       (userChoice == 2 && computerChoice == 1) ||
                       (userChoice == 3 && computerChoice == 2)) {
                WriteLine("You win!");
                userWins++;

            } else {
                WriteLine("Computer wins!");
                computerWins++;
                
            }

            // Ask to play again
            WriteLine("Do you want to play again? (yes/no): ");

            switch (scanner.nextLine().toLowerCase()) {
                case "yes", "y" -> playAgain = true;
                default -> playAgain = false;
            }

            gamesPlayed++;

        } while (playAgain);

        WriteLine("Thanks for playing!");
        WriteLine("Games played: " + gamesPlayed);
        WriteLine("Your wins: " + userWins);
        WriteLine("Computer wins: " + computerWins);
        WriteLine("Ties: " + ties);
        scanner.close();
    }

    public static String WriteLine(String message) {
        System.out.println(message);
        return message;
    }
}