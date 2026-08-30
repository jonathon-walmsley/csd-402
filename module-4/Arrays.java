/*
Jonathon Walmsley
08/30/2026
Module 4.2
Description: Creates an overloaded method called average that takes in an array of numbers and returns the average of the numbers in the array.
    public static short average (short [ ] array)
    public static int average (int [ ] array)
    public static long average (long [ ] array)
    public static double average (double [ ] array)
*/


public class Arrays {
    
    public static short average(short[] array) {
        short arrayLength = (short) array.length;
        if (arrayLength == 0) return 0;
        short sum = 0;
        for (short num : array) {
            sum += num;
        }
        return (short) (sum / arrayLength);
    }

    public static int average(int[] array) {
        int arrayLength = array.length;
        if (arrayLength == 0) return 0;
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (sum / arrayLength);
    }

    public static long average(long[] array) {
        long arrayLength = (long) array.length;
        if (arrayLength == 0) return 0;
        long sum = 0;
        for (long num : array) {
            sum += num;
        }
        return sum / arrayLength;
    }

    public static double average(double[] array) {
        double arrayLength = (double) array.length;
        if (arrayLength == 0) return 0.0;
        double sum = 0.0;
        for (double num : array) {
            sum += num;
        }
        return sum / arrayLength;
    }

    public static void main(String[] args) {

        // Test Short Array Average Overload Method
        short[] shortArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Short array elements: " + java.util.Arrays.toString(shortArray));
        short shortAverage = average(shortArray);
        System.out.println("The average is: " + shortAverage);
        
        // Test Int Array Average Overload Method
        int[] intArray = {11,22, 33, 44, 55, 66, 77};
        System.out.println("Int array elements: " + java.util.Arrays.toString(intArray));
        int intAverage = average(intArray);
        System.out.println("The average is: " + intAverage);
        
        // Test Long Array Average Overload Method
        long[] longArray = {1L, 2L, 3L};
        System.out.println("Long array elements: " + java.util.Arrays.toString(longArray));
        long longAverage = average(longArray);
        System.out.println("The average is: " + longAverage);
        
        // Test Double Array Average Overload Method
        double[] doubleArray = {1.2, 2.5, 3.7, 4.1, 5.6, 6.8, 7.2, 8.5, 9.7, 10.1};
        System.out.println("Double array elements: " + java.util.Arrays.toString(doubleArray));
        double doubleAverage = average(doubleArray);
        System.out.println("The average is: " + doubleAverage);

    }

}