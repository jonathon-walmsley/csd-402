/*
    Jonathon Walmsley
    09/27/2026
    Module 9.2
    Description: Create a new file and add numbers or append numbers to an existing file.
*/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Random;

public class CreateNewFile {

    public static void main(String[] args) {

        Path filePath = Paths.get("data.file");
        Random random = new Random();

        try {

            // Generate 10 random numbers separated by spaces
            StringBuilder numbersBuilder = new StringBuilder();
            for (int i = 0; i < 10; i++) {
                // Generate a random number between 0 and 100
                int randomNum = random.nextInt(101);
                numbersBuilder.append(randomNum).append(" ");
            }
            String contentToWrite = numbersBuilder.toString();

            // Check if the file exists: Create or Append
            if (Files.notExists(filePath)) {

                // File does not exist, create the file and write the initial 10 numbers
                Files.writeString(filePath, contentToWrite);
                System.out.println("File created and initial 10 numbers written.");

            } else {

                // File already exists, append the 10 numbers to the end
                Files.writeString(filePath, contentToWrite, StandardOpenOption.APPEND);
                System.out.println("File exists. Appended 10 additional numbers.");
            }

            // 3. Read the data from the file and display it
            System.out.println("\nFile Contents:");
            String fileContents = Files.readString(filePath);
            System.out.println(fileContents);

        } catch (IOException e) {
            System.out.println("An error occurred during file operations: " + e.getMessage());
        }
    }
}