package homework_week_7;

import java.util.Scanner;

/**
 * Write a program that tells us input value is number or an alphabet or symbol.
 */

public class Programme12FindInputValue {
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any character : ");
        char ch = scanner.next().charAt(0);
        //Object creation
        Programme12FindInputValue inputValue = new Programme12FindInputValue();
        inputValue.checkInputIsAlphabetNumberOrSymbol(ch);
        //Closing the scanner object
        scanner.close();

    }
    // find the input value is ALPHABET , DIGIT AND SYMBOL
      public void checkInputIsAlphabetNumberOrSymbol(char ch){
        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
              System.out.println(ch + " is an ALPHABET");
          }else if (ch >= '0' && ch <='9') {
              System.out.println(ch + "is a DIGIT");
          }else {
              System.out.println(ch + "is a SYMBOL");
          }
      }
}
