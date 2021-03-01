/**
 * The NumberOperations class represents a number.
 * It can give the value of the number, the odd numbers under it's value,
 * powers of two under the number, whether a given number is greater, and
 * the string of the number.
 * 
 * Activity_05 
 *
 * @author Chase Tillman - COMP 1210 - 010
 * @version 9/22/2020
 */
public class NumberOperations {
   private int number;
   
   /**
    * Creates an instance of the NumberOperation class and sets its number.
    * @param numberIn - The number for the NumberOperations
    */
   public NumberOperations(int numberIn) {
      number = numberIn;
   }
   
   /**
    * Gets the value of the number.
    * @return - The value of the number.
    */
   public int getValue() {
      return number;
   }
   
   /**
    * Finds all the odd numbers under the number.
    * @return - All of the odd numbers under the numbers.
    */
   public String oddsUnder() {
      String output = "";
      int i = 0;
      while (i < number) {
         if (i % 2 != 0) {
            output += i + "\t";
         }
         i++;
      }
      return output;
   }
   
   /**
    * Finds all the powers of two that are under the number.
    * @return - All of the powers of two under the number.
    */
   public String powersTwoUnder() {
      String output = "";
      int powers = 1;
      while (powers < number) {
         output += powers + "\t";
         powers *= 2;
      }
      return output;
   }
   
   /**
    * Compares a given number with the original number and determines
    * which is greater.
    * @param compareNumber - The number to be compared with the original number.
    * @return - 1: Original Number greater, -1: Given Number is greater,
    *    0: Equal Numbers.
    */
   public int isGreater(int compareNumber) {
      if (number > compareNumber) {
         return 1;
      }
      else if (number < compareNumber) {
         return -1;
      }
      else {
         return 0;
      }
   }
   
   /**
    * Gives the number as a String.
    * @return - The number as a String.
    */
   public String toString() {
      return number + "";
   }
   
   

}