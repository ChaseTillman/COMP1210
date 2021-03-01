import javax.swing.JOptionPane;
/**
 * Gets two numbers to divide from the user. It then divides these numbers and
 * displays the integer value and decimal value. If the input is invalid, the 
 * program catches the error. 
 *
 * Activity_11
 *
 * @author Chase Tillman - COMP 1210 - 010
 * @version 11/17/2020
 */
public class DivisionDriver {
   /**
    * Prompts the user for a denominator and then divides the two numbers.
    * @param args - Not Used.
    */
   public static void main(String[] args) {
      String numInput
         = JOptionPane.showInputDialog("Enter the numerator:");
         
      String denomInput
         = JOptionPane.showInputDialog("Enter the denominator:");
      
      try {   
         int num = Integer.parseInt(numInput);
         int denom = Integer.parseInt(denomInput);
         
         String result = "Integer division: \n"
               + Division.intDivide(num, denom)
               + "\n\nFloating point division: \n"
               + Division.decimalDivide(num, denom);
               
         JOptionPane.showMessageDialog(null, result,
            "Result", JOptionPane.PLAIN_MESSAGE);
      }
      catch (NumberFormatException e) {
         JOptionPane.showMessageDialog(null,
            "Invalid input: enter numerical integer values only.",
            "Error", JOptionPane.ERROR_MESSAGE);
      }
      catch (IllegalArgumentException e) {
         JOptionPane.showMessageDialog(null,
            e, "Error", JOptionPane.ERROR_MESSAGE);
      } 
      
   }
}