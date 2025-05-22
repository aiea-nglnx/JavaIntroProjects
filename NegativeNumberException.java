import java.util.Scanner;

/**
 * An interactive program Java program that models
 * an environment by creating classes for 2 related objects.
 * Negative Number exception ensures if a number is negtiave or not.
 * 
 * @author     Pao, Angelina
 * @thing      Custom Exception
 * @bugs       Short description of bugs in the program, if any.
 */
 
public class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message); // Passes the message to the Exception superclass
    }
}
