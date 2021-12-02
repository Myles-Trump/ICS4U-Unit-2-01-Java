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
final class Template {

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Template() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        // variables
        int someInt;

        final Scanner input = new Scanner(System.in);
        System.out.print("Input a integer: ");

        int someInt = input.nextInt();

        if (someInt == 0) {
             return someInt;

        } else {
             return someInt + (someInt - 1);
        }

        System.out.println("\nDone.");
    }
}
