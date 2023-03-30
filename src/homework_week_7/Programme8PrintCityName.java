package homework_week_7;

import java.util.Scanner;

/**
 * Input any alphabet from “A to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 */

public class Programme8PrintCityName {
    public static void main(String[] args) {
        // scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter alphabet betweem A to F : ");
        char city = scanner.next().charAt(0);
        //object creation
        Programme8PrintCityName cityName = new Programme8PrintCityName();
        cityName.printcityName(city);
        // closing the scanner object
        scanner.close();
    }

    //printing city name
    public void printcityName(char city) {
        if (city == 'A' || city == 'a') {
            System.out.println("Austria");
        } else if (city == 'B' || city == 'b') {
            System.out.println("Belgium");
        } else if (city == 'c' || city == 'c') {
            System.out.println("Chicago");
        } else if (city == 'D' || city == 'd') {
            System.out.println("Dubai");
        } else if (city == 'E' || city == 'e') {
            System.out.println("Edmonton");
        } else if (city == 'F' || city == 'f') {
            System.out.println("France");
        } else {
            System.out.println("The alphabet you enter is not between A to F");
        }
    }
}
