/*
Jonathon Walmsley
08/16/2026
Module 1.3
Description: This program calculates the energy needed to heat a given mass of water from an initial temperature to a final temperature.
*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Prompt for inputs
        double waterMass = getValidDoubleInput(input, "Enter the amount of water in kilograms: ");
        
        double initialTemperature = getValidDoubleInput(input, "Enter the initial temperature (in Celsius): ");
        
        double finalTemperature = getValidDoubleInput(input, "Enter the final temperature (in Celsius): ");
        
        // Calculate the energy needed
        double energy = calculateEnergy(waterMass, initialTemperature, finalTemperature);
        
        // Display results
        writeLine("The energy needed to heat the water is " + energy + " Joules.");
        
    }

    // Helper Method so I do not need to repeat System.out.println() multiple times
    public static void writeLine(String message) {
        System.out.println(message);
    }

    // Helper Method to get valid double input from the user
    public static double getValidDoubleInput(Scanner input, String prompt) {
        double value;
        while (true) {
            writeLine(prompt);
            if (input.hasNextDouble()) {
                value = input.nextDouble();
                break;
            } else {
                writeLine("Invalid input. Please enter a valid number.");
                input.next(); // Clear the invalid input
            }
        }
        return value;
    }

    // Method to calculate the energy needed to heat the water
    public static double calculateEnergy(double waterMass, double initialTemperature, double finalTemperature) {
        return waterMass * (finalTemperature - initialTemperature) * 4184;
    }
}

