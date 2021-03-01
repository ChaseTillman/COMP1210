/**
 * The InvalidCategoryException is a subclass of the Exception class.
 * It gives the proper error message when an invalid category is chosen.
 *
 * Project_11
 *
 * @author Chase Tillman - COMP 1210 - 010
 * @version 11/20/2020
 */
public class InvalidCategoryException extends Exception {
   /**
    * Creates an instance of the InvalidCategoryException with error message
    * containing the improper category.
    * @param categoryIn - The invalid category causing exception.
    */
   public InvalidCategoryException(String categoryIn) { 
      super("For category: " + categoryIn);
   }
}