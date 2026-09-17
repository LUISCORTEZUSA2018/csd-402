/*
 * Luis Cortez
 * CSD 402 - Java for Programmers
 * Module 7.2 Programming Assignment
 *
 * This program demonstrates object-oriented programming by creating
 * a collection of Fan instances. It includes methods for displaying
 * a collection of Fans and a single Fan without using the toString()
 * method. The Fan class uses the this reference where allowed.
 */

import java.util.ArrayList;

public class UseFans {

    public static void main(String[] args) {

        try {
            // Create a collection of Fan instances.
            ArrayList<Fan> fans = new ArrayList<>();

            // Add Fan objects using both constructors.
            fans.add(new Fan());
            fans.add(new Fan(Fan.SLOW, true, 7.0, "black"));
            fans.add(new Fan(Fan.MEDIUM, true, 8.0, "red"));
            fans.add(new Fan(Fan.FAST, true, 10.0, "blue"));

            // Display all Fan instances in the collection.
            System.out.println("All Fan Instances");
            System.out.println("-----------------");
            displayFans(fans);

            // Modify the first Fan to demonstrate setter functionality.
            fans.get(0).setSpeed(Fan.MEDIUM);
            fans.get(0).setOn(true);
            fans.get(0).setRadius(9.0);
            fans.get(0).setColor("green");

            // Display the modified Fan using the single Fan method.
            System.out.println("\nModified First Fan");
            System.out.println("------------------");
            displayFan(fans.get(0));
            
            // Demonstrate error handling with an invalid Fan speed.
            System.out.println("\nValidation Test");
            System.out.println("---------------");
            
            try {
                Fan invalidFan = new Fan(5, true, 6.0, "white");
                displayFan(invalidFan);
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }

        } catch (IllegalArgumentException e) {
            // Display validation errors to the console.
            System.out.println("Error: " + e.getMessage());
        }
    }

    /**
     * Displays every Fan instance in a collection without using toString().
     *
     * @param fans the collection of Fan instances to display
     */
    public static void displayFans(ArrayList<Fan> fans) {
        for (int i = 0; i < fans.size(); i++) {
            System.out.println("\nFan " + (i + 1));
            displayFan(fans.get(i));
        }
    }

    /**
     * Displays one Fan instance without using toString().
     *
     * @param fan the Fan instance to display
     */
    public static void displayFan(Fan fan) {
        System.out.println("Speed: " + fan.getSpeedDescription());
        System.out.println("On: " + fan.isOn());
        System.out.println("Radius: " + fan.getRadius());
        System.out.println("Color: " + fan.getColor());
    }
}


/**
 * Represents a fan with a speed, power state, radius, and color.
 */
class Fan {

    // Constants representing the available fan speeds.
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Private fields with the required default values.
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    /**
     * Creates a Fan object using the required default values.
     */
    public Fan() {
        this.speed = STOPPED;
        this.on = false;
        this.radius = 6.0;
        this.color = "white";
    }

    /**
     * Creates a Fan object using specified values.
     *
     * @param speed the speed of the fan
     * @param on whether the fan is on or off
     * @param radius the radius of the fan
     * @param color the color of the fan
     */
    public Fan(int speed, boolean on, double radius, String color) {
        this.setSpeed(speed);
        this.setOn(on);
        this.setRadius(radius);
        this.setColor(color);
    }

    /**
     * Returns the current fan speed.
     *
     * @return the fan speed
     */
    public int getSpeed() {
        return this.speed;
    }

    /**
     * Sets the fan speed.
     *
     * @param speed the new fan speed
     */
    public void setSpeed(int speed) {
        if (speed < STOPPED || speed > FAST) {
            throw new IllegalArgumentException(
                    "Speed must be between STOPPED (0) and FAST (3).");
        }

        this.speed = speed;
    }

    /**
     * Returns whether the fan is on.
     *
     * @return true if the fan is on; otherwise false
     */
    public boolean isOn() {
        return this.on;
    }

    /**
     * Sets whether the fan is on or off.
     *
     * @param on the new power state
     */
    public void setOn(boolean on) {
        this.on = on;
    }

    /**
     * Returns the radius of the fan.
     *
     * @return the fan radius
     */
    public double getRadius() {
        return this.radius;
    }

    /**
     * Sets the radius of the fan.
     *
     * @param radius the new fan radius
     */
    public void setRadius(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException(
                    "Radius must be greater than zero.");
        }

        this.radius = radius;
    }

    /**
     * Returns the color of the fan.
     *
     * @return the fan color
     */
    public String getColor() {
        return this.color;
    }

    /**
     * Sets the color of the fan.
     *
     * @param color the new fan color
     */
    public void setColor(String color) {
        if (color == null || color.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Color cannot be empty.");
        }

        this.color = color;
    }

    /**
     * Returns a description of the Fan object's current state.
     *
     * @return a formatted description of the fan
     */
    @Override
    public String toString() {
        return "Fan State:"
                + "\nSpeed: " + this.getSpeedDescription()
                + "\nOn: " + this.on
                + "\nRadius: " + this.radius
                + "\nColor: " + this.color;
    }

    /**
     * Converts the numeric speed value into a descriptive name.
     *
     * @return the descriptive fan speed
     */
    public String getSpeedDescription() {
        switch (this.speed) {
            case STOPPED:
                return "STOPPED";
            case SLOW:
                return "SLOW";
            case MEDIUM:
                return "MEDIUM";
            case FAST:
                return "FAST";
            default:
                return "UNKNOWN";
        }
    }
}