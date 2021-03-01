/**
* A simple program that divides two numbers and return's their int
* and decimal result.
*
* Activity_11
*
* @author Chase Tillman - COMP 1210 - 010
* @version 11/17/2020
*/
public class Division {
   /**
    * Calculates the integer value of the division.
    * @param numerator - Numerator of Division.
    * @param denominator - Denominator of Division.
    * @return - Integer of the two divided numbers.
    */
   public static int intDivide(int numerator, int denominator) {
      try {
         return numerator / denominator;
      }
      catch (ArithmeticException e) {
         return 0;
      }
   }
   
   
   /**
    * Calculates the decimal value of the division.
    * @param numerator - Numerator of Division.
    * @param denominator - Denominator of Division.
    * @return - Decimal of the two divided numbers.
    * @throws IllegalArgumentException - Zero is invalid argument.
    */
   public static double decimalDivide(int numerator, int denominator) {
      if (denominator == 0) {
         throw new IllegalArgumentException("The denominator"
            + " cannot be zero.");
      }
   
      return (double) numerator / (double) denominator;
      
   }  
}