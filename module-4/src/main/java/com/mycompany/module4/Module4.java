/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.module4;

import java.util.Arrays;

/**
 * Module 4.2 Programming Assignment.
 *
 * This program demonstrates method overloading by calculating the average
 * of four arrays containing different numeric data types. Each array has
 * a different size. The program displays the original array elements and
 * the average returned by the corresponding overloaded average method.
 *
 * @author luisc
 */
public class Module4 {

    /**
     * Tests each overloaded average method and displays the results.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        // Create arrays of different sizes as required by the assignment.
        short[] shortArray = {10, 20, 30, 40};
        int[] intArray = {5, 10, 15, 20, 25};
        long[] longArray = {100, 200, 300, 400, 500, 600};
        double[] doubleArray = {2.5, 4.5, 6.5, 8.5, 10.5, 12.5, 14.5};

        // Display each original array and the average returned by its method.
        System.out.println("SHORT ARRAY");
        System.out.println("Original array: " + Arrays.toString(shortArray));
        System.out.println("Average: " + average(shortArray));
        System.out.println();

        System.out.println("INTEGER ARRAY");
        System.out.println("Original array: " + Arrays.toString(intArray));
        System.out.println("Average: " + average(intArray));
        System.out.println();

        System.out.println("LONG ARRAY");
        System.out.println("Original array: " + Arrays.toString(longArray));
        System.out.println("Average: " + average(longArray));
        System.out.println();

        System.out.println("DOUBLE ARRAY");
        System.out.println("Original array: " + Arrays.toString(doubleArray));
        System.out.println("Average: " + average(doubleArray));
    }

    /**
     * Calculates and returns the average of a short array.
     *
     * @param array the array of short values
     * @return the average of the array values
     * @throws IllegalArgumentException if the array is null or empty
     */
    public static short average(short[] array) {

        if (array == null || array.length == 0) {
            throw new IllegalArgumentException(
                    "Short array cannot be null or empty.");
        }

        int sum = 0;

        for (short value : array) {
            sum += value;
        }

        return (short) (sum / array.length);
    }

    /**
     * Calculates and returns the average of an int array.
     *
     * @param array the array of int values
     * @return the average of the array values
     * @throws IllegalArgumentException if the array is null or empty
     */
    public static int average(int[] array) {

        if (array == null || array.length == 0) {
            throw new IllegalArgumentException(
                    "Integer array cannot be null or empty.");
        }

        long sum = 0;

        for (int value : array) {
            sum += value;
        }

        return (int) (sum / array.length);
    }

    /**
     * Calculates and returns the average of a long array.
     *
     * @param array the array of long values
     * @return the average of the array values
     * @throws IllegalArgumentException if the array is null or empty
     */
    public static long average(long[] array) {

        if (array == null || array.length == 0) {
            throw new IllegalArgumentException(
                    "Long array cannot be null or empty.");
        }

        long sum = 0;

        for (long value : array) {
            sum += value;
        }

        return sum / array.length;
    }

    /**
     * Calculates and returns the average of a double array.
     *
     * @param array the array of double values
     * @return the average of the array values
     * @throws IllegalArgumentException if the array is null or empty
     */
    public static double average(double[] array) {

        if (array == null || array.length == 0) {
            throw new IllegalArgumentException(
                    "Double array cannot be null or empty.");
        }

        double sum = 0.0;

        for (double value : array) {
            sum += value;
        }

        return sum / array.length;
    }
}