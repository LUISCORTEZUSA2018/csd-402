/*
 * Luis Cortez
 * CSD 402 - Java for Programmers
 * Module 8.2 Programming Assignment
 * September 20, 2026
 *
 * This program accepts integer values from the user and stores them
 * in an ArrayList. Input continues until the user enters 0.
 * The program then calls the max method to find and return the
 * largest value contained in the ArrayList.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class LuisArrayListTest {

    /*
     * Returns the largest Integer contained in the ArrayList.
     * If the ArrayList is empty, the method returns 0.
     */
    public static Integer max(ArrayList list) {

        if (list.isEmpty()) {
            return 0;
        }

        Integer largest = (Integer) list.get(0);

        for (int i = 1; i < list.size(); i++) {
            Integer currentValue = (Integer) list.get(i);

            if (currentValue > largest) {
                largest = currentValue;
            }
        }

        return largest;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Module 8.2 - ArrayList Test");
        System.out.println("Enter integer values.");
        System.out.println("Enter 0 when you are finished.");
        System.out.println();

        while (true) {

            System.out.print("Enter an integer: ");

            try {
                int number = Integer.parseInt(input.nextLine());

                // Add every integer to the ArrayList, including 0.
                numbers.add(number);

                if (number == 0) {
                    break;
                }

            } catch (NumberFormatException e) {
                System.out.println(
                    "Invalid input. Please enter a whole number."
                );
            }
        }

        Integer largestValue = max(numbers);

        System.out.println();
        System.out.println("Numbers entered: " + numbers);
        System.out.println("Largest value: " + largestValue);

        // Test the max method with an empty ArrayList
        ArrayList<Integer> emptyList = new ArrayList<>();
        System.out.println("Empty ArrayList test: " + max(emptyList));

        input.close();
    }
}