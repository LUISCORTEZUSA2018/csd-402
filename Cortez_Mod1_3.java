/*
 * Name: Luis Cortez
 * Date: August 16, 2026
 * Assignment: Module 1.3 Programming Assignment
 * Course: CSD 402 - Java for Programmers
 */

import java.util.Scanner;

public class Cortez_Mod1_3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount of water in kilograms: ");
        double waterMass = input.nextDouble();

        System.out.print("Enter the initial temperature in Celsius: ");
        double initialTemperature = input.nextDouble();

        System.out.print("Enter the final temperature in Celsius: ");
        double finalTemperature = input.nextDouble();

        double energy = waterMass * (finalTemperature - initialTemperature) * 4184;

        System.out.println("The energy needed is " + energy + " joules.");

        input.close();
    }
}