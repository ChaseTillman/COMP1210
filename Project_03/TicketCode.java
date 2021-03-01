import java.util.Scanner;
import java.text.DecimalFormat;
/**
 * Simple program that decodes and separates the information in a ticket
 * code and displays it in an easy to read format.
 *
 * Project_03
 *
 * @author Chase Tillman - COMP 1210 - 010
 * @version 9/10/2020
 */
public class TicketCode {
   /**
    * Takes a ticket code and displays the information in a
    * readable format.
    * @param args Command line arguments - not used.
    */   
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      String priceFormat = "$#,##0.00";
      String discountFormat = "0%";
      String prizeFormat = "000";
      String code = "";
      String description = "";
      String month = "";
      String day = "";
      String year = "";
      String hour = "";
      String minute = "";
      String section = "";
      String row = "";
      String seat = "";
      String price = "";
      String discount = "";
      String cost = "";
      String prizeNumber = "";
      DecimalFormat decimalFormat = new DecimalFormat(priceFormat);
      
      //Prompt user for ticket code:
      System.out.print("Enter ticket code: ");
      code = userInput.nextLine();
      code = code.trim();
      
      
      if (code.length() < 26) { //invalid ticket code:
         System.out.println("\nInvalid ticket code."
            + "\nTicket code must have at least 26 characters.");
      }
      else { //Decode the ticket code to its information:
         
         //Display event discription, date, and time:
         description = code.substring(25);
         month = code.substring(11, 13);
         day = code.substring(13, 15);
         year = code.substring(15, 19);
         hour = code.substring(7, 9);
         minute = code.substring(9, 11);
         System.out.println("\nDescription: " + description 
            + "   Date: " + month + "/" + day + "/" + year 
            + "   Time: " + hour + ":" + minute);
         //Display section, row, and seat:   
         section = code.substring(19, 21);
         row = code.substring(21, 23); 
         seat = code.substring(23, 25);
         System.out.println("Section: " + section + "   Row: " + row 
            + "   Seat: " + seat);
         
         //Format and display price, discount, and cost:
         price = decimalFormat.format(Double.parseDouble(
            code.substring(0, 5)) / 100);
         cost = decimalFormat.format(Double.parseDouble(
            code.substring(0, 5)) / 100
            * (100 -  Double.parseDouble(code.substring(5, 7))) / 100);
         decimalFormat.applyPattern(discountFormat);
         discount = decimalFormat.format(
            Double.parseDouble(code.substring(5, 7)) / 100);
         System.out.println("Price: " + price 
            + "   Discount: " + discount + "   Cost: " + cost);
         
         //Generate and display prize number:
         decimalFormat.applyPattern(prizeFormat);   
         prizeNumber = decimalFormat.format((Math.random() * 1000));
         System.out.println("Prize Number: " + prizeNumber);
         
         
      }
   }
}