package codewars.tasks;

import java.util.stream.IntStream;


/*
 * Complete the function that
 * - accepts two integer arrays of equal length
 * - compares the value each member in one array to the corresponding member in the other
 * - squares the absolute value difference between those two values
 * and returns the average of those squared absolute value difference between each member pair.
 */
public class MeanSquareError {
    public static double solution(int[] arr1, int... arr2) {
        return IntStream.range(0, arr1.length)
                .mapToDouble(i -> Math.pow(arr1[i] - arr2[i], 2))
                .average()
                .getAsDouble();
    }
}
