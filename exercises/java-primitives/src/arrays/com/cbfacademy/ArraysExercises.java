package com.cbfacademy;

/** The ArrayExercises method creates various arrays
 * and prints the 5th element of each array.
*/
public class ArraysExercises {
    public static void main (String... args) {
        Integer[] eightIntegers = {10, 11, 12, 13, 14, 15, 16, 17, 18};
        Float[] twelveFloats = {1.1f, 2.2f, 3.3f, 4.4f, 5.5f, 6.6f, 7.7f, 8.8f, 9.9f, 10.0f, 11.1f, 12.2f};
        Double[] fiveDoubles = {2.1d, 2.2d, 2.3d, 2.4d, 2.5d};
        Boolean[] sixBooleans = {1 > 2, !true, 6 == 12/2, 8 % 3 == 3, true, 9 > 3};
    
        System.out.println(eightIntegers[4]);
        System.out.println(twelveFloats[4]);
        System.out.println(fiveDoubles[4]);
        System.out.println(sixBooleans[4]);

        Object[] matrixOfArrays = {
            eightIntegers,
            twelveFloats,
            fiveDoubles,
            sixBooleans
        };
    }
}