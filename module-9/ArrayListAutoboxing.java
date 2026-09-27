/*
    Jonathon Walmsley
    09/27/2026
    Module 9.2
    Description: Autoboxing/Auto-Unboxing example using ArrayList.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListAutoboxing {

    public static void main(String[] args) {

		// 1. Create ArrayList
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Hello");
        myList.add("World!");
        myList.add("This");
        myList.add("Is");
        myList.add("Autoboxing/Auto-Unboxing");
        myList.add("Example");
        myList.add("Using");
        myList.add("ArrayList");
        myList.add("In");
        myList.add("Java!");

        // 2. Use a 'for-each' loop to print the ArrayList collection
        System.out.println("--- Current Elements in ArrayList ---");
		
        for (String str : myList) {
		
            System.out.println(str);
			
        }
		
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        // 3. Prompt user for an index, read as a String, and retrieve via try/catch
        try {
		
            System.out.print("Enter the index of the element you would like to see again (0-9): ");
            String input = scanner.nextLine();

            // Autoboxing
            Integer boxedIndex = Integer.valueOf(input);

            // Auto-Unboxing
            String selectedElement = myList.get(boxedIndex);

            System.out.println("You selected: " + selectedElement);

        } catch (IndexOutOfBoundsException e) {
		
            // Display an Exception message showing "Out of Bounds"
            System.out.println("Exception has been thrown: Out of Bounds");
			
        } catch (Exception e) {
		
            // Catches all other exceptions
            System.out.println("Exception has been thrown: " + e.getMessage());
        }

        scanner.close();
    }
}