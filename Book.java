/**
 * An interactive program Java program that models
 * an environment by creating classes for 2 related objects.
 * 
 * @author     Pao, Angelina
 * @thing      Object 2
 * @bugs       Short description of bugs in the program, if any.
 */
 
public class Book {
   // Instance variables that represent Object 2's characteristics   
   private String title = ""; // Stores the title of the book
   private String author = ""; // Stores the author of the book
   private String type = ""; // Stores the type of book
   private int pageCount = 0; // Stores the page count of the book
   private int stock = 0; // Stores the amount of the book that is in stock
   
   /**
    * Constructs a Book object with specified attributes.
    *
    * @param title     The title of the book (must be at least 3 characters long).
    * @param author    The name of the book's author (must be at least 3 characters long).
    * @param type      The type/genre of the book, restricted to "Fiction" or "Non-Fiction".
    * @param pageCount The number of pages in the book (must be a positive integer).
    * @param stock     The available stock of the book (cannot be negative).
    * @throws IllegalArgumentException   If the title or author is too short, or the type is invalid.
    * @throws NegativeNumberException    If pageCount or stock is negative.
    */
   
   // Constructor that allows you to create the Book object
   public Book(String title, String author, String type, int pageCount, int stock) throws NegativeNumberException { 
      setTitle(title);
      setAuthor(author);
      setType(type);
      setPageCount(pageCount);
      setStock(stock);

      this.title = title;
      this.author = author;
      this.type = type;
      this.pageCount = pageCount;
      this.stock = stock;
   }
   
/**
 * Returns a string representation of the Book object.
 *
 * @return A formatted string containing the book's title, author, type, page count, and stock.
 *         Example format:
 *         Book Title: [title]
 *         Author of Book: [author]
 *         Book Type: [type]
 *         Page Count: [pageCount]
 *         Book Stock: [stock]
 */
   // toString method
   public String toString() {
      String output = "";
      output += "\tBook Title: " + this.title; // Adds the book title to output
      output += "\n\tAuthor of Book: " + this.author; // Adds book's author to output    
      output += "\n\tBook Type: " + this.type; // Adds the book type to output
      output += "\n\tPage Count: " + this.pageCount; // Adds the page count of the book to output
      output += "\n\tBook Stock: " + this.stock; // Adds the book's stock to output
           
      return output;
   }
   
   // Accessor Methods to FoodItem class that retrieves the book's attributes
   public String getTitle() {
      return this.title;
   }
   public String getAuthor() {
      return this.author;
   }
   public String getType() {
      return this.type;
   }
   public int getPageCount() {
      return this.pageCount;
   }
   public int getStock() {
      return this.stock;
   }
   
   // Adding Mutator methods to Book class that allows modification
   public void setTitle(String newTitle) throws IllegalArgumentException { // Checks if the word length of the title is at least 3 characters
     if (newTitle.length() >= 2) {
      this.title = newTitle;
     }
     else {
      throw new IllegalArgumentException("ERROR! Book title must be at least 2 characters long!!");
     }
   }
   public void setAuthor(String newAuthor) throws IllegalArgumentException { // Checks if the word length of the author's name is at least 3 characters
      if (newAuthor.length() >= 2) {
         this.author = newAuthor;
      }
      else { 
         throw new IllegalArgumentException("ERROR! Author's name must be at least 2 characters long!!");
      }
   }
   public void setType(String newType) throws IllegalArgumentException { // Checks if the book type is either Fiction or Non-Fiction
      if (newType.equals("Fiction") || newType.equals("Non-Fiction")) {
         this.type = newType;
      }
      else {
         System.out.println("Throwing exception: Invalid book type!");
         throw new IllegalArgumentException("ERROR! Sorry but " + newType + " is an invalid book type. Book type must be Fiction or Non-Fiction!");
      }
   }
   public void setPageCount(int newPageCount) throws NegativeNumberException { // Checks if the page count is less than or equal to 0
      if (newPageCount > 0) { 
         this.pageCount = newPageCount;
      }
      else {
         throw new NegativeNumberException("ERROR! Sorry but the page count must be a proper & positive numerical value.");
      }
   }
   public void setStock(int newStock) throws NegativeNumberException { // Checks if the stock of the book is less than or equal to 0
      if (newStock >= 0) {
         this.stock = newStock;
      }
      else {
         throw new NegativeNumberException("ERROR! Sorry but the stock/availability cannot be negative.");
      }
   } 
}
