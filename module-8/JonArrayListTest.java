/*
    Jonathon Walmsley
    09/20/2026
    Module 8.2
    Description: Get list of integers from user, stop when 0 is entered, and return the largest number in the list.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class JonArrayListTest {

    public static Integer max(ArrayList<Integer> myList) {
        // Set starting point for comparison to smallest possible integer value
        Integer largest = Integer.MIN_VALUE;
        if (myList.isEmpty()) {
            // If the list is empty return 0
            return 0;
        } else {
            // Loop through the ArrayList to find the largest number
            for (Integer num : myList) {
                // When a number is larger than the current largest, update the largest
                if (num > largest) largest = num;
            }
        }
        // Return the largest number found
        return largest;
    }

    public static void main(String[] args) {

        // Get user input for the ArrayList
        System.out.println("Enter integers for the ArrayList (enter 0 to finish):");

        ArrayList<Integer> myList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean done = false;

        while (!done) {
            // Check if an integer was entered
            if (scanner.hasNextInt()) {
                int nextInt = scanner.nextInt();
                // Add the integer to the ArrayList
                myList.add(nextInt);
                // If the user enters 0, set done to true to exit the loop
                if (nextInt == 0) done = true;
            } else {
                // Ignore non-integer input and prompt the user again
                System.out.println("Invalid input. Please enter an integer.");
                // Clear the invalid input from the buffer
                scanner.next(); 
            }
        }
        // Call the method to find the largest number if list contains values
        System.out.println("The largest number in the ArrayList is: " + max(myList));
        scanner.close();
    }
}