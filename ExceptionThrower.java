/* An interactive program Java program that models
 * an environment by creating classes for 2 related objects.
 * 
 * @author     Pao, Angelina
 *@thing       Custom Exception
 * @bugs       Short description of bugs in the program, if any.
 */
 
public class ExceptionThrower {
   public static void main(String[] args) {
      try {
         NegativeNumberException nne = new NegativeNumberException("This is an error!");
         throw nne;
      }
      catch (NegativeNumberException nne) { 
         System.out.println("Caught NegativeNumberException: " + nne.getMessage());
      }
      try {
         // Throwing IllegalArgumentException
         throw new IllegalArgumentException("Invalid argument detected.");
      } 
      catch (IllegalArgumentException iae) {
         System.out.println("Caught IllegalArgumentException: " + iae.getMessage());
      }

   }
}
