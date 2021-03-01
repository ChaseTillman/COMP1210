import java.util.Scanner;
   /**
 * Simple program to convert time from a user's input in seconds 
 * to days, hours, minutes, and seconds.
 *
 * Project_02 
 * @author Chase Tillman - COMP 1210 - 010
 * @version 9/2/2020
 */ 
public class TimeConverter {
 /**
  * Takes input time in seconds and converts it to 
  * days, hours, minutes, and seconds.
  * @param args Command line arguments - not used
  */
   public static void main(String[] args) {
      
      Scanner userInput = new Scanner(System.in);
      int timeInput = 0;
      int remainder = 0;
      int days = 0;
      int hours = 0;
      int minutes = 0;
      int seconds = 0;
      
      //Get time in seconds from user:
      System.out.print("Enter the raw time measurement in seconds: ");
      timeInput = userInput.nextInt();
      remainder = timeInput;
      
      
      if (timeInput < 0) { //Display that mesurement is invalid:
         System.out.println("Measurement must be non-negative!");
      }
      else { //Calculate time in days, hours, minutes, and seconds:
         days = remainder / 86400;   
         remainder %= 86400;
         hours = remainder / 3600;    
         remainder %= 3600;
         minutes = remainder / 60;   
         remainder %= 60;
         seconds = remainder;
         
         //Display the calculated times:
         System.out.println("\nMeasurement by combined days, hours, " 
                     + "minutes, seconds: ");
         System.out.println("\tdays: " + days);
         System.out.println("\thours: " + hours);
         System.out.println("\tminutes: " + minutes);
         System.out.println("\tseconds: " + seconds);
         System.out.println("\n" + timeInput + " seconds = "
                     + days + " days, " + hours + " hours, "
                     + minutes + " minutes, " + seconds + " seconds");
      }
   }
}