// Luis Cortez
// CSD 402 - Java for Programmers
// Module 5.2 Programming Assignment

/*
 * Author: Luis Cortez
 * Course: CSD 402 - Java for Programmers
 * Module: 5.2 Programming Assignment
 *
 * This program demonstrates the use of two-dimensional arrays
 * and overloaded methods to locate the largest and smallest
 * elements in integer and double arrays.
 */

public class CortezModule5 {

    public static void main(String[] args) {

        // Test integer array.
        int[][] integerArray = {
            {4, 8, 2},
            {7, 1, 9},
            {5, 3, 6}
        };

        // Test double array.
        double[][] doubleArray = {
            {2.5, 7.8, 1.2},
            {9.4, 3.6, 5.1},
            {4.7, 0.8, 6.3}
        };

        try {
            int[] largestInteger = locateLargest(integerArray);
            int[] smallestInteger = locateSmallest(integerArray);
            int[] largestDouble = locateLargest(doubleArray);
            int[] smallestDouble = locateSmallest(doubleArray);

            System.out.println("INTEGER ARRAY");
            System.out.println("Largest element location: [" +
                    largestInteger[0] + "][" + largestInteger[1] + "]");
            System.out.println("Largest value: " +
                    integerArray[largestInteger[0]][largestInteger[1]]);

            System.out.println("Smallest element location: [" +
                    smallestInteger[0] + "][" + smallestInteger[1] + "]");
            System.out.println("Smallest value: " +
                    integerArray[smallestInteger[0]][smallestInteger[1]]);

            System.out.println();

            System.out.println("DOUBLE ARRAY");
            System.out.println("Largest element location: [" +
                    largestDouble[0] + "][" + largestDouble[1] + "]");
            System.out.println("Largest value: " +
                    doubleArray[largestDouble[0]][largestDouble[1]]);

            System.out.println("Smallest element location: [" +
                    smallestDouble[0] + "][" + smallestDouble[1] + "]");
            System.out.println("Smallest value: " +
                    doubleArray[smallestDouble[0]][smallestDouble[1]]);

        } catch (IllegalArgumentException exception) {
            System.out.println("Error: " + exception.getMessage());
        }
    }

    /**
     * Locates the largest element in a two-dimensional double array.
     *
     * @param arrayParam the array to search
     * @return an integer array containing the row and column location
     */
    public static int[] locateLargest(double[][] arrayParam) {

        validateArray(arrayParam);

        int rowIndex = 0;
        int columnIndex = 0;
        double largestValue = arrayParam[0][0];

        for (int row = 0; row < arrayParam.length; row++) {
            for (int column = 0; column < arrayParam[row].length; column++) {
                if (arrayParam[row][column] > largestValue) {
                    largestValue = arrayParam[row][column];
                    rowIndex = row;
                    columnIndex = column;
                }
            }
        }

        return new int[]{rowIndex, columnIndex};
    }

    /**
     * Locates the largest element in a two-dimensional integer array.
     *
     * @param arrayParam the array to search
     * @return an integer array containing the row and column location
     */
    public static int[] locateLargest(int[][] arrayParam) {

        validateArray(arrayParam);

        int rowIndex = 0;
        int columnIndex = 0;
        int largestValue = arrayParam[0][0];

        for (int row = 0; row < arrayParam.length; row++) {
            for (int column = 0; column < arrayParam[row].length; column++) {
                if (arrayParam[row][column] > largestValue) {
                    largestValue = arrayParam[row][column];
                    rowIndex = row;
                    columnIndex = column;
                }
            }
        }

        return new int[]{rowIndex, columnIndex};
    }

    /**
     * Locates the smallest element in a two-dimensional double array.
     *
     * @param arrayParam the array to search
     * @return an integer array containing the row and column location
     */
    public static int[] locateSmallest(double[][] arrayParam) {

        validateArray(arrayParam);

        int rowIndex = 0;
        int columnIndex = 0;
        double smallestValue = arrayParam[0][0];

        for (int row = 0; row < arrayParam.length; row++) {
            for (int column = 0; column < arrayParam[row].length; column++) {
                if (arrayParam[row][column] < smallestValue) {
                    smallestValue = arrayParam[row][column];
                    rowIndex = row;
                    columnIndex = column;
                }
            }
        }

        return new int[]{rowIndex, columnIndex};
    }

    /**
     * Locates the smallest element in a two-dimensional integer array.
     *
     * @param arrayParam the array to search
     * @return an integer array containing the row and column location
     */
    public static int[] locateSmallest(int[][] arrayParam) {

        validateArray(arrayParam);

        int rowIndex = 0;
        int columnIndex = 0;
        int smallestValue = arrayParam[0][0];

        for (int row = 0; row < arrayParam.length; row++) {
            for (int column = 0; column < arrayParam[row].length; column++) {
                if (arrayParam[row][column] < smallestValue) {
                    smallestValue = arrayParam[row][column];
                    rowIndex = row;
                    columnIndex = column;
                }
            }
        }

        return new int[]{rowIndex, columnIndex};
    }

    /**
     * Validates a two-dimensional integer array before it is searched.
     *
     * @param arrayParam the array to validate
     */
    private static void validateArray(int[][] arrayParam) {

        if (arrayParam == null || arrayParam.length == 0) {
            throw new IllegalArgumentException(
                    "Integer array must not be null or empty.");
        }

        for (int[] row : arrayParam) {
            if (row == null || row.length == 0) {
                throw new IllegalArgumentException(
                        "Integer array rows must not be null or empty.");
            }
        }
    }

    /**
     * Validates a two-dimensional double array before it is searched.
     *
     * @param arrayParam the array to validate
     */
    private static void validateArray(double[][] arrayParam) {

        if (arrayParam == null || arrayParam.length == 0) {
            throw new IllegalArgumentException(
                    "Double array must not be null or empty.");
        }

        for (double[] row : arrayParam) {
            if (row == null || row.length == 0) {
                throw new IllegalArgumentException(
                        "Double array rows must not be null or empty.");
            }
        }
    }
}