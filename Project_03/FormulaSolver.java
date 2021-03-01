import java.util.Scanner;
import java.text.DecimalFormat;
/**
 * Simple Program that takes an x input and plugs it into 
 * a mathematical formula, finds the number of characters to the left
 * and right of the decimal point, and formats the result.
 *
 * Project_03
 *
 * @author Chase Tillman - COMP 1210 - 010
 * @version 9/8/2020
 */
public class FormulaSolver {
   /**
    * Takes a user input x and find the result for the x, finds the number of
    * characters to the left and right of the decimal, and formats the result.
    * @param args Command Line arguments - not used
    */
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      double xInput;
      double result;
      String resultString = "";
      int decimalIndex;
      String pattern = "#,##0.0#####";
      DecimalFormat decimalFormat = new DecimalFormat(pattern);
      String formattedResult = "";
      
      //Prompt user for x value:
      System.out.print("Enter a value for x: ");
      xInput = userInput.nextDouble();
      
      //Calculate and display result:
      result = (6 * Math.pow(xInput, 3) - 4) 
         * Math.sqrt(Math.abs(7 * Math.pow(xInput, 3) 
            + 5 * Math.pow(xInput, 2) + 3 * xInput + 1));
      System.out.println("Result: " + result);
      
      //Convert the result to a String and calculate characters to left 
      //and right of decimal:
      resultString = Double.toString(result);
      decimalIndex = resultString.indexOf(".");
      System.out.println("# of characters to left of decimal point: "
         + decimalIndex);
      System.out.println("# of characters to right of decimal point: " 
         + (resultString.length() - decimalIndex - 1));
      
      //Format and display the formatted result:   
      formattedResult = decimalFormat.format(result);   
      System.out.println("Formatted Result: " + formattedResult);
            
   }
}