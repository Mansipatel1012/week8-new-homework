package homework_week_7;

/**
 * Write a Java program to test if an array contains a specific
 * value.
 */

public class Programme20FindValueInArray {
    // This method will find the if array contains value or not
    public static boolean isArrayContains(int[] arr, int item) {
        boolean isContain = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item) {
                isContain = true;
                break;
            }
        }
        return isContain;
    }
    public static void main(String[] args) {
        // Declaring the numeric array
        int[] numArray = {1754, 2785, 1099, 2045, 7850, 2255, 4500, 1455, 787};
        System.out.println(isArrayContains(numArray, 2045));
        System.out.println(isArrayContains(numArray, 4589));
    }
}








