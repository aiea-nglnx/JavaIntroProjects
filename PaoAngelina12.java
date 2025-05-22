import java.util.Scanner;
 
/**
 * An interactive program Java program that implements a complete system from scratch 
 * using two custom Java objects that are self-validating and a driver class to create those objects.
 * 
 * @author     Pao, Angelina
 * @bugs       Short description of bugs in the program, if any.
 */
 
public class PaoAngelina12 {
   public static void main(String[] args) {
   
      // Beginning program variables
      Scanner reader = new Scanner(System.in);
      String greetings = ""; // Stores the user's name
      
      // Prompt the user to enter their name and greet them when the program runs
      System.out.print("Greetings, what's your name? ");
      
      greetings = reader.nextLine();
      System.out.println("\nHey " + greetings.toUpperCase() + "!" + " This program models a Library." + 
      "\nThis model contains 2 objects: Book & LibraryMember.");
      
      try {
         // Create Book Object
         Book book = new Book("Pretentious", "Mei Nakamura", "Fiction", 282, 16);
         
         // Prompt the user that they are printing the Book object  
         System.out.println("\nI am printing the Book object with System.out.println(book.toString());");
         System.out.println(book.toString());
         
         // Modify and display updated book details
         System.out.println("\nDue to the new order of \'Pretentious\', I am using the set method to " +
         "change the Book object of book's stock to 50 then printing again: ");
         
         book.setStock(50);
         System.out.println(book);
         
         // Retrieve and print book title using a get method
         System.out.println("\nI am using a get method to print the Book object book's title " +
         "in this sentence: ");      
         System.out.println("The title of the book is: " + book.getTitle());

         // Create LibraryMember Object
         LibraryMember member = new LibraryMember("Kai", "Female", 70521, 15);
         
         // Prompt the user that they printing the LibraryMember object 
         System.out.println("\nI am printing the LibraryMember object with System.out.println(member);");
         System.out.println(member);
         
         // Modify and display updated borrowed book count
         System.out.println("\nKay has borrowed another book. Updating borrowed book count: ");
         member.setBorrowedBooks(member.getBorrowedBooks() + 1);
         System.out.println(member);
        
         // Attempt to create an invalid Book object
         System.out.println("\nThe type of book should be between \'Fiction\' & \'Non-Fiction\'.");
         System.out.println("I will try to create an invalid object: " + "A book object with a type of \'Drama\'");
        
         try {
            book.setType("Drama");         
         }
         catch (Exception e) {
            System.out.println("Error setting book type: " + e.getMessage());
         }
         
         // Attempt to modify LibraryMember gender incorrectly         
         System.out.println("\nLibrary Member's gender should either be entered as: Female, Male, or Other/Preferred to Not Say.");
         System.out.println("I will use a set method to try to change the member's gender to: \'Unknown\'");
         
         try {
            member.setGender("Unknown");
         } 
         catch (Exception e) {
            System.out.println("Error setting gender: " + e.getMessage());
         }
         
         // Attempt to create an invalid LibraryMember with an incorrect ID
         System.out.println("\nA Library Member ID should be a positive 5-digit number.");
         System.out.println("I will try to create an invalid member with an ID of 123");
         
         try {
            LibraryMember invalidMember = new LibraryMember("Kai", "Female", 123, 3);
         }
         catch (Exception e) {
            System.out.println("Error creating LibraryMember: " + e.getMessage());         
         }
      }
      catch (Exception e) {
         System.out.println("Unexpected error: " + e.getMessage());
      }
   }
}
