/*
Jonathon Walmsley
09/13/2026
Module 7.2
Description: Class that creates a collection of Fan objects and displays their details using getter methods.
*/

import java.util.ArrayList;
import java.util.List;

public class UseFans {


    // Display fan details using getter methods
    public static void displayFan(Fan fan) {
        if (fan.isOn()) {
            System.out.println("Fan is on and running at a "
                + fan.getSpeedString() + " speed with a radius of " 
                + fan.getRadius() + " and the color is " 
                + fan.getColor() + ".");
        } else {
            System.out.println("Fan is off and " 
                + fan.getSpeedString() + " with a radius of " 
                + fan.getRadius() + " and the color is " 
                + fan.getColor() + ".");
        }
    }

    // Displays an entire collection of Fan instances by iterating through 
    public static void displayFans(List<Fan> fanCollection) {
        int fanCount = 1;
        for (Fan fan : fanCollection) {
            System.out.print(fanCount + ": ");
            displayFan(fan);
            fanCount++;
        }
    }

    public static void main(String[] args) {
        
        // Create a list to hold Fan objects
        List<Fan> fanList = new ArrayList<>();

        // Create Fan 1: default
        System.out.println("Creating fans...");
        Fan fan1 = new Fan();
        Fan fan2 = new Fan(Fan.FAST, true, 10.0, "green");
        Fan fan3 = new Fan(Fan.STOPPED, false, 8.0, "blue");
        Fan fan4 = new Fan(Fan.SLOW, true, 12.0, "red");


        // Add fans to the list
        System.out.println("Adding fans to the list...");
        fanList.add(fan1);
        fanList.add(fan2);
        fanList.add(fan3);
        fanList.add(fan4);

        System.out.println("");

        // Display all fans in the list
        System.out.println("Displaying all fans in the list:");
        displayFans(fanList);

        System.out.println("");

        // Display a single fan
        System.out.println("Displaying a single fan:");
        displayFan(fanList.get(1)); // Display the second fan in the list

    }

}