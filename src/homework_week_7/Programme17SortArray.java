package homework_week_7;

import java.util.Arrays;

/**
 * Write a Java program to sort a numeric array and a string array.
 */

public class Programme17SortArray {
    public static void main(String[] args) {
        //numeric Array Declaration
        int[] numArray = {
                1789, 2054, 2546, 1200, 1300, 1400, 1500, 124, 1478};
        //string array declation
        String[] strArray = {
                "Alpha", "Bravo", "Delta", "Hotel", "Mike", "Sierra", "Peter", "kilo"};
        System.out.println("Actual numerical array was:" + Arrays.toString(numArray));
        //sorting the array
        Arrays.sort(numArray);
        System.out.println("Sorted numerical Array is " + Arrays.toString(numArray));
        System.out.println("");
        System.out.println("Actual String Array was:" + Arrays.toString(strArray));
        //sorting the array
        Arrays.sort(strArray);
        System.out.println("Sorted String Array is : " + Arrays.toString(strArray));
    }
}