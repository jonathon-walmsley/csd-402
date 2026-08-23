/*
Jonathon Walmsley
08/23/2026
Module 3.3
Description: Generates a pyramid of numbers with each row containing ascending and descending powers of 2, centered and formatted with spaces, ending with an '@' symbol.
Output:
              1                @
            1 2 1              @
          1 2 4 2 1            @
        1 2 4 8 4 2 1          @
      1 2 4 8 16 8 4 2 1       @
   1 2 4 8 16 32 16 8 4 2 1    @
1 2 4 8 16 32 64 32 16 8 4 2 1 @
*/

public class Pyramid {
    public static void main(String[] args) {
        // Total number of rows in the pyramid
        int rows = 7; 

        // The last row of the pyramid, used to determine the maximum width for centering
        String lastRow = " 1 2 4 8 16 32 64 32 16 8 4 2 1 @"; 
        
        // Exclude the '@' for centering
        int maxRowWidth = lastRow.length() - 1; 

        // Loop through each row to build and print the pyramid
        for (int i = 0; i < rows; i++) {
            StringBuilder rowContent = new StringBuilder();

            // Loop to calculate ascending numbers (1, 2, 4, 8, ...)
            int currentNumber = 1; // Always starts with 1 for each row
            for (int j = 0; j <= i; j++) {
                rowContent.append(currentNumber);
                if (j < i) {
                    rowContent.append(" ");
                }
                currentNumber *= 2; // Step up to the next power of 2 for the next iteration
            }

            // Loop to calculate descending numbers (..., 4, 2, 1)
            currentNumber /= 4; // Step down by 4 to get the correct starting point for descending numbers
            for (int j = 0; j < i; j++) {
                rowContent.append(" ").append(currentNumber);
                currentNumber /= 2; // Step down to the next power of 2 for the next iteration
            }

            String numbers = rowContent.toString();

            // Loop to calculate leading spaces for centering
            int leadingSpaces = (maxRowWidth - numbers.length()) / 2;
            for (int s = 0; s < leadingSpaces; s++) {
                System.out.print(" ");
            }

            // Print numbers
            System.out.print(numbers);

            // Loop to apply trailing spacing to push '@' to column 32
            int trailingSpaces = maxRowWidth - numbers.length() - leadingSpaces;
            for (int s = 0; s < trailingSpaces; s++) {
                System.out.print(" ");
            }

            // Output terminating character '@'
            System.out.println("@");
        }
    }
}