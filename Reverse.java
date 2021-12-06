/*
* The "Reverse" program reverses strings
*
* @author  Myles Trump
* @version 1.0
* @since   2021-12-01
*/

import java.util.Scanner;

/**
* This is a program that reverses strings.
*/
final class Reverse {

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Reverse() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The reversing() function reverses strings.
    *
    * @return
    */
    public static String reversing(String someString) {
        if (someString.length() == 0) {
            return (someString);

        } else {
            return reversing(someString.substring(1)) + someString.charAt(0);
        }

    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        // variables
        final String someString;
        String reversedString;

        final Scanner input = new Scanner(System.in);
        System.out.print("Input a string: ");

        someString = input.nextLine();

        reversedString = reversing(someString);

        System.out.println("\nThe original string is : " + someString);
        System.out.println("\nThe reversed string is : " + reversedString);
        System.out.println("\nDone.");
    }
}
