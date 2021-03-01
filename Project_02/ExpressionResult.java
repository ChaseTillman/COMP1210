import java.util.Scanner;
/**
 * Simple program that calculates the result of a specific forumula 
 * from a given x, y, and z input.
 *
 * Project_02
 * @author Chase Tillman - COMP 1210 - 010
 * @version 9/2/2020
 */
public class ExpressionResult {
/**
 * Recieves user input for x, y, and z then calculates and prints the result.
 *
 * @param args Command line arguments - not used
 */
   public static void main(String[] args) {
      
      Scanner userInput = new Scanner(System.in);
      double result = 0;
      double xInput = 0;
      double yInput = 0;
      double zInput = 0;
      double divisor = 0;
      
      //Display operation and receive inputs:
      System.out.println("result = (x - 1.1) (2y + 2.2) (4z + 4.4) / xyz");
      System.out.print("\tx = ");
      xInput = userInput.nextDouble();
      System.out.print("\ty = ");
      yInput = userInput.nextDouble();
      System.out.print("\tz = ");
      zInput = userInput.nextDouble();
      
      //Calculate divisor:
      divisor = xInput * yInput * zInput;
      
      //Determine if answer is undefined:
      if (divisor == 0) { //result is undefined
         System.out.println("result is \"undefined\"");
      }
      else { //calculate and display result:
         result = (xInput - 1.1) * (2 * yInput + 2.2) 
                  * (4  * zInput + 4.4) / divisor;
         
         System.out.println("result = " + result);
      }
   }
}