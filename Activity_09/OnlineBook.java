/**
 * OnlineBook class inherits from the OnlineTextItem class
 * and has an author.
 *
 * Activity_09
 *
 * @author Chase Tillman - COMP 1210 - 010
 * @version 11/3/2020
 */
public class OnlineBook extends OnlineTextItem {
   protected String author;
   
   /**
    * Creates an instance of the OnlineBook class.
    * @param nameIn - The name of the book.
    * @param priceIn - The price of the Book.
    */
   public OnlineBook(String nameIn, double priceIn) {
      super(nameIn, priceIn);
      author = "Author Not Listed";
   }
   
   /**
    * Overides the toString to include name, author, and price.
    * @return - The information of the book.
    */
   @Override
   public String toString() {
      return name + " - " + author + ": $" + price;
   }
   
   /** 
    * Sets the author of the book.
    * @param authorIn - Author of the book.
    */
   public void setAuthor(String authorIn) {
      author = authorIn;
   }
      
}