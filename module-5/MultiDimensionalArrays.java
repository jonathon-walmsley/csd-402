/*
Jonathon Walmsley
09/06/2026
Module 5.2
Description: Methods to find the location of the largest and smallest elements in two-dimensional arrays of doubles and ints, 
             returning their coordinates as a two-element int array.
*/

public class MultiDimensionalArrays {

    public static void main(String[] args) {
        
        // Initialize a 2D double test array
        double[][] doubleArray = {
            {6.62607, 1.61803, 2.71828, 3.14159},
            {-273.15, 2.99792, 1.41421},
            {7.8, 8.9, 9.80665}
        };
        
        // Test locateLargest method with double array
        int[] largestLocation = locateLargest(doubleArray);
        System.out.println("Double array elements: " + java.util.Arrays.deepToString(doubleArray));
        System.out.println("Location of largest element (double): [" + largestLocation[0] + ", " + largestLocation[1] + "] = " + doubleArray[largestLocation[0]][largestLocation[1]]);
        
        // Test locateSmallest method with double array
        int[] smallestLocation = locateSmallest(doubleArray);
        System.out.println("Location of smallest element (double): [" + smallestLocation[0] + ", " + smallestLocation[1] + "] = " + doubleArray[smallestLocation[0]][smallestLocation[1]]);
        
        System.out.println("");

        // Initialize a 2D int test array        
        int[][] intArray = {
            {1, 3},
            {4, 5, 67, 8, 9},
            {7, 8, 9}
        };

        // Test locateLargest method with int array
        int[] largestLocationInt = locateLargest(intArray);
        System.out.println("Int array elements: " + java.util.Arrays.deepToString(intArray));
        System.out.println("Location of largest element (int): [" + largestLocationInt[0] + ", " + largestLocationInt[1] + "] = " + intArray[largestLocationInt[0]][largestLocationInt[1]]);
        
        // Test locateSmallest method with int array
        int[] smallestLocationInt = locateSmallest(intArray);
        System.out.println("Location of smallest element (int): [" + smallestLocationInt[0] + ", " + smallestLocationInt[1] + "] = " + intArray[smallestLocationInt[0]][smallestLocationInt[1]]); 
    
        System.out.println("");
    }
    
    // Locates the largest value in a two-dimensional double array and returns its coordinates.
    public static int[] locateLargest(double[][] arrayParam) {
        int[] location = new int[2]; // Stores [row, col] coordinates, defaults to [0, 0]
        double largest = arrayParam[0][0]; // Assume the first element is the largest initially

        // Loop each row and column of the 2D array
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                // Update largest value and its coordinates when a larger element is found
                if (arrayParam[i][j] > largest) {
                    largest = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    // Locates the largest value in a two-dimensional int array and returns its coordinates.
    public static int[] locateLargest(int[][] arrayParam) {
        int[] location = new int[2]; // Stores [row, col] coordinates, defaults to [0, 0]
        int largest = arrayParam[0][0]; // Assume the first element is the largest initially

        // Loop each row and column of the 2D array
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                // Update largest value and its coordinates when a larger element is found
                if (arrayParam[i][j] > largest) {
                    largest = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    // Locates the smallest value in a two-dimensional double array and returns its coordinates.
    public static int[] locateSmallest(double[][] arrayParam) {
        int[] location = new int[2]; // Stores [row, col] coordinates, defaults to [0, 0]
        double smallest = arrayParam[0][0]; // Assume the first element is the smallest initially

        // Loop each row and column of the 2D array
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                // Update smallest value and its coordinates when a smaller element is found
                if (arrayParam[i][j] < smallest) {
                    smallest = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    // Locates the smallest value in a two-dimensional int array and returns its coordinates.
    public static int[] locateSmallest(int[][] arrayParam) {
        int[] location = new int[2]; // Stores [row, col] coordinates, defaults to [0, 0]
        int smallest = arrayParam[0][0]; // Assume the first element is the smallest initially

        // Loop each row and column of the 2D array
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                // Update smallest value and its coordinates when a smaller element is found
                if (arrayParam[i][j] < smallest) {
                    smallest = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }
}