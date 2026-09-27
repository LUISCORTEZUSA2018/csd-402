/*
 * Name: Luis Cortez
 * Date: September 27, 2026
 * Assignment: Module 9.2 Programming Assignment
 * Course: CSD402 - Java for Programmers
 *
 * Program 1 Description:
 * This program creates an ArrayList containing at least ten String values
 * and displays the collection using a for-each loop. The user is then asked
 * to enter the number of an element they would like to see again. The program
 * uses autoboxing and auto-unboxing and handles an invalid ArrayList index
 * with a try/catch block that displays an "Out of Bounds" message.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Cortez_Mod9_2 {

    public static void main(String[] args) {

        ArrayList<String> items = new ArrayList<>();

        items.add("Apple");
        items.add("Banana");
        items.add("Orange");
        items.add("Mango");
        items.add("Grapes");
        items.add("Strawberry");
        items.add("Pineapple");
        items.add("Watermelon");
        items.add("Blueberry");
        items.add("Peach");

        System.out.println("ArrayList Elements:");

        // Display all elements using a for-each loop.
        for (String item : items) {
            System.out.println(item);
        }

        Scanner input = new Scanner(System.in);

        System.out.print("\nEnter the index of the element you would like to see again: ");
        String userInput = input.nextLine();

        try {
            // Convert the user's String input to an Integer.
            // This demonstrates autoboxing.
            Integer selectedIndex = Integer.valueOf(userInput);

            // Passing Integer to get() causes auto-unboxing to int.
            String selectedItem = items.get(selectedIndex);

            System.out.println("Selected element: " + selectedItem);

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception thrown: Out of Bounds");

        } catch (NumberFormatException e) {
            System.out.println("Exception thrown: Invalid number entered");
        }

        input.close();
    }
}