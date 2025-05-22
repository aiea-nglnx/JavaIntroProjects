import java.util.Scanner;

/**
 * An interactive program Java program that models
 * an environment by creating classes for 2 related objects.
 * 
 * @author     Pao, Angelina
 * @thing      Object 1
 * @bugs       Short description of bugs in the program, if any.
 */
 
public class LibraryMember {
   // Instance variables that represent Object 1's characteristics   
   private String name = ""; // Stores the member's name
   private String gender = ""; // Stores the member's gender
   private int memberID = 0; // Stores the member's ID
   private int borrowedBooks = 0; // Stores the amount of books borrowed
   
/**
 * Constructs a LibraryMember object with specified details.
 *
 * @param name          The name of the library member (must be at least 2 characters long).
 * @param gender        The gender of the library member ("Male", "Female", or "Other" only).
 * @param memberID      The unique 5-digit ID of the library member (must be positive and 5 digits).
 * @param borrowedBooks The number of books the member has borrowed (cannot be negative).
 * @throws IllegalArgumentException If the name is too short, gender is invalid, or memberID is not a 5-digit number.
 * @throws NegativeNumberException  If borrowedBooks is a negative number.
 */        
   // Constructor that allows you to create the Library Member object
   public LibraryMember(String name, String gender, int memberID, int borrowedBooks) throws NegativeNumberException {      
      setName(name);
      setGender(gender);
      setMemberID(memberID);
      setBorrowedBooks(borrowedBooks);
      
      this.name = name;
      this.gender = gender;
      this.memberID = memberID;
      this.borrowedBooks = borrowedBooks;
   }
   
   /**
    * Returns a string representation of the LibraryMember object.
    *
    * @return A formatted string containing the library member's name, gender, member ID, and number of borrowed books.
    *         Example format:
    *         Name: [name]
    *         Gender: [gender]
    *         Member ID: [memberID]
    *         Borrowed Books: [borrowedBooks]
    */
   // toString method
   public String toString() {
      String output = "";
      output += "\tName: " + this.name; // Adds the member's name to output
      output += "\n\tGender: " + this.gender; // Adds the member's gender to output
      output += "\n\tMember ID: " + this.memberID; // Adds the member ID to output
      output += "\n\tBorrowed Books: " + this.borrowedBooks; // Adds the amount of books borrowed size to output
           
      return output;
   }
   
   // Accessor Methods to Library Member class that retrieves the member's attributes
   public String getName() {
      return this.name;
   }
   public String getGender() {
      return this.gender;
   }
   public int getMemberID() {
      return this.memberID;
   }
   public int getBorrowedBooks() {
      return this.borrowedBooks;
   }
   
   // Adding Mutator methods to Drink Item class that allows modification
   public void setName(String newName) throws IllegalArgumentException {
      if (newName.length() >= 2) {
         this.name = newName;
      }
      else {         
         throw new IllegalArgumentException("ERROR! Sorry but member name must be at least 2 characters long.");
      }
   }
   public void setGender(String newGender) throws IllegalArgumentException {
      if (newGender.equals("Male") || newGender.equals("Female") || newGender.equals("Other")) {
         this.gender = newGender;
      }
      else {
         throw new IllegalArgumentException("ERROR! Sorry but " + newGender + " is an invalid gender. Gender should be either male, female, or other.");
      }
   }
   public void setMemberID(int newMemberID) throws NegativeNumberException {
      if (newMemberID >= 10000 && newMemberID <= 99999) {
         this.memberID = newMemberID;
      }
      else {
          throw new NegativeNumberException("ERROR! Sorry but " + newMemberID + " must be a positive 5-digit long number.");
      }
   }
   public void setBorrowedBooks(int newBorrowedBooks) throws NegativeNumberException {
      if (newBorrowedBooks >= 0) {
         this.borrowedBooks = newBorrowedBooks;
      }
      else {
         throw new NegativeNumberException("ERROR! Sorry but the stock/availability cannot be negative.");
      }
   }
}
