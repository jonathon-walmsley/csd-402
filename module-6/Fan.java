/*
Jonathon Walmsley
09/06/2026
Module 6.2
Description: Fan simulation program that creates two Fan objects, one with default values and one with custom values. 
*/

public class Fan {

    public static void main(String[] args) {
        // Fan 1: default
        Fan defaultFan = new Fan();
        
        // Fan 2: custom
        Fan customFan = new Fan(FAST, true, 10.0, "green");

        // Print fan details
        System.out.println(defaultFan.toString());
        System.out.println(customFan.toString());

    }

    // Constant speed values
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Fields
    private int speed = STOPPED;
    private boolean on = false;
    private double radius = 6.0;
    private String color = "white";
    
    public int getSpeed() {
        return speed;
    }

    public String getSpeedString() {
        switch (speed) {
            case STOPPED:
                return "stopped";
            case SLOW:
                return "slow";
            case MEDIUM:
                return "medium";
            case FAST:
                return "fast";
            default:
                return "UNKNOWN";
        }
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fan() {
        this.speed = STOPPED;
        this.on = false;
        this.radius = 6.0;
        this.color = "white";
    }
    
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    // Override the toString method with custom message of Fan State and properties
    @Override
    public String toString() {
        if (isOn()) {
            return "Fan is on and running at a " + getSpeedString() + " speed with a radius of " + getRadius() + " and the color is " + getColor() + ".";
        } else {
            return "Fan is off and " + getSpeedString() + " with a radius of " + getRadius() + " and the color is " + getColor() + ".";
        }
    }

}