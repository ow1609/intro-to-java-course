package com.cbfacademy;

/** The ArrayExercises method creates various arrays
 * and prints the 5th element of each array.
*/
public class ArraysExercises {
    public static void main (String... args) {
        int[] eightIntegers = {1, 2, 3, 4, 5, 6, 7, 8};
        float[] twelveFloats = {0.1f, 0.2f, 0.3f, 0.4f, 0.5f, 0.6f, 0.7f, 0.8f, 0.9f, 1.0f, 1.1f, 1.2f};
        double[] fiveDoubles = {0.1d, 0.2d, 0.3d, 0.4d, 0.5d};
        boolean[] sixBooleans = {1 > 2, !true, 6 == 12/2, 8 % 3 == 3, true, 9 > 3};
    
        System.out.println(eightIntegers[4]);
        System.out.println(twelveFloats[4]);
        System.out.println(fiveDoubles[4]);
        System.out.println(sixBooleans[4]);
    }
}