package homework_week_7;

import java.util.Scanner;

/**
 * Input any alphabet from “A to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry USING SWITCH STATEMENT
 */

public class Programme9PrintCitySwitch {
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter alphabet between A to F : ");
        String city = scanner.next().toUpperCase();
        //Create object and call instance method
        Programme9PrintCitySwitch cityName = new Programme9PrintCitySwitch();
        cityName.printcityName(city);
        //Closing the scanner object
        scanner.close();
    }
    // printing city name
    public void printcityName(String city) {
        switch (city) {
            case "A":
                System.out.println("Austria");
                break;
            case "B":
                System.out.println("Belgium");
                break;
            case "C":
                System.out.println("Chicago");
                break;
            case "D":
                System.out.println("Dubai");
                break;
            case "E":
                System.out.println("Edmonton");
                break;
            case "F":
                System.out.println("France");
                break;
            default:
                System.out.println("The alphabet you enter is not between A to F");
        }

    }
}