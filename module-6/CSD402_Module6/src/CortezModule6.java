/*
 * Luis Cortez
 * CSD 402 - Java for Programmers
 * Module 6.2 Programming Assignment
 *
 * This program demonstrates object-oriented programming by creating
 * a Fan class with constants, private fields, constructors, getters,
 * setters, and a toString() method. Two Fan objects are created to
 * demonstrate the functionality of the Fan class.
 */

public class CortezModule6 {

    public static void main(String[] args) {

        try {
            // Create the first Fan using the no-argument constructor.
            Fan fan1 = new Fan();

            // Create the second Fan using the argument constructor.
            Fan fan2 = new Fan(Fan.FAST, true, 10.0, "blue");

            // Display the initial state of both Fan objects.
            System.out.println("Fan 1 - Default Constructor");
            System.out.println(fan1);

            System.out.println("\nFan 2 - Argument Constructor");
            System.out.println(fan2);

            // Demonstrate the setter methods using fan1.
            fan1.setSpeed(Fan.MEDIUM);
            fan1.setOn(true);
            fan1.setRadius(8.0);
            fan1.setColor("red");

            // Display fan1 after modifications.
            System.out.println("\nFan 1 - After Using Setter Methods");
            System.out.println(fan1);

            // Demonstrate the getter methods.
            System.out.println("\nFan 1 - Getter Method Results");
            System.out.println("Speed: " + fan1.getSpeed());
            System.out.println("On: " + fan1.isOn());
            System.out.println("Radius: " + fan1.getRadius());
            System.out.println("Color: " + fan1.getColor());

        } catch (IllegalArgumentException e) {
            // Display any validation error to the console.
            System.out.println("Error: " + e.getMessage());
        }
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
        speed = STOPPED;
        on = false;
        radius = 6.0;
        color = "white";
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
        setSpeed(speed);
        setOn(on);
        setRadius(radius);
        setColor(color);
    }

    /**
     * Returns the current fan speed.
     *
     * @return the fan speed
     */
    public int getSpeed() {
        return speed;
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
        return on;
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
        return radius;
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
        return color;
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
                + "\nSpeed: " + getSpeedDescription()
                + "\nOn: " + on
                + "\nRadius: " + radius
                + "\nColor: " + color;
    }

    /**
     * Converts the numeric speed value into a descriptive name.
     *
     * @return the descriptive fan speed
     */
    private String getSpeedDescription() {
        switch (speed) {
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