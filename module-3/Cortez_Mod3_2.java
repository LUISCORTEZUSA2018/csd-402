/*
 * Name: Luis Cortez
 * Date: August 21, 2026
 * Assignment: Module 3.2 Pyramid
 * Course: CSD 402 - Java for Programmers
 *
 * Purpose:
 * This program uses nested for loops to display a pyramid
 * of powers of two. Each line ends with the @ symbol.
 */

public class Cortez_Mod3_2 {

    public static void main(String[] args) {

        // Controls the seven rows of the pyramid
        for (int row = 0; row < 7; row++) {

            // Print spaces before the numbers
            for (int space = 0; space < 6 - row; space++) {
                System.out.print("   ");
            }

            // Print increasing powers of two
            for (int column = 0; column <= row; column++) {
                System.out.printf("%3d", (int) Math.pow(2, column));
            }

            // Print decreasing powers of two
            for (int column = row - 1; column >= 0; column--) {
                System.out.printf("%3d", (int) Math.pow(2, column));
            }

            // Print spaces after the numbers so @ symbols align
            for (int space = 0; space < 6 - row; space++) {
                System.out.print("   ");
            }

            // Print @ at the end of each line
            System.out.println(" @");
        }
    }
}