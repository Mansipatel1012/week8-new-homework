package homework_week_7;

import java.util.Arrays;

/**
 * Write a Java program to calculate the average value of array
 */
public class Programme19AverageOfArray {
    public static void main(String[] args) {
        //Numeric array declaration
        int[] numArray = {
                1785, 2544, 2545, 1200, 1544, 1894, 1356, 254, 236};
        int sum = 0;
        //calculating the sum of array value
        for (int i = 0; i < numArray.length; i++) {
            sum = sum + numArray[i];
        }
        //finding the average of arrays value
        int average = sum / numArray.length;
        System.out.println("value of the elements of the array are:" + Arrays.toString(numArray));
        System.out.println("Average of all the values of the array are:" + average);
    }
}
