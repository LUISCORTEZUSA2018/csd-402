/*
 * Name: Luis Cortez
 * Date: September 27, 2026
 * Assignment: Module 9.2 Programming Assignment
 * Course: CSD402 - Java for Programmers
 *
 * Program 2 Description:
 * This program creates a file named data.file if the file does not already
 * exist. It generates 10 random integers and writes them to the file,
 * separating each integer with a space. If the file already exists, the
 * program appends 10 additional random integers. The program then closes
 * the file, reopens it, reads all stored data, and displays the contents.
 * File-related exceptions are handled and displayed to the console.
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Cortez_Mod9_2_Program2 {

    public static void main(String[] args) {

        File dataFile = new File("data.file");
        Random random = new Random();

        // Write or append 10 randomly generated integers to the file.
        try (FileWriter writer = new FileWriter(dataFile, true)) {

            for (int i = 0; i < 10; i++) {
                int randomNumber = random.nextInt(100);
                writer.write(randomNumber + " ");
            }

            System.out.println("10 random numbers were written to data.file.");

        } catch (IOException e) {
            System.out.println("Exception while writing to the file: "
                    + e.getMessage());
            return;
        }

        // Reopen the file, read its contents, and display the stored data.
        System.out.println("\nContents of data.file:");

        try (Scanner fileReader = new Scanner(dataFile)) {

            while (fileReader.hasNext()) {
                System.out.print(fileReader.next() + " ");
            }

            System.out.println();

        } catch (IOException e) {
            System.out.println("Exception while reading the file: "
                    + e.getMessage());
        }
    }
}