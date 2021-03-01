import java.util.Scanner;
/**
 * A simple program that takes input of a person's name, age, and gender,
 * and prints their age in minutes and years, and their max heart rate.
 *
 * Activity_02 
 * @author Chase Tillman - COMP 1210 - 010
 * @version 08/31/2020
 */
public class AgeStatistics {
/**
 * Takes input for name and age. 
 * Prints Age in years and minutes, and Max Heart Rate.
 * @param args Command line argument - not used
 */
   public static void main(String[] args) {
   
      Scanner userInput = new Scanner(System.in);
      String name = "";
      int ageInYears = 0;
      int gender = 0;
      double maxHeartRate = 0;
   
      //Prompt the user for their name:
      System.out.print("Enter your name: ");
      name = userInput.nextLine();
      
      //Prompt the user for their age:
      System.out.print("Enter your age in years: ");
      ageInYears = userInput.nextInt();
      
      //Prompt the user for their gender:
      System.out.print("Enter your gender (1 for female and 0 for male): ");
      gender = userInput.nextInt();
      
      //Convert age: 
      System.out.println("\tYour age in minutes is "
            + ageInYears * 525600 + " minutes.");
      System.out.println("\tYour age in centuries is "
            + (double) ageInYears / 100 + " centuries.");
   
      //Display max heart rate
      System.out.print("Your max heart rate is ");
      
      if (gender == 1) { //Calculate female MHR
         maxHeartRate = 209 - (0.7 * ageInYears);
      }
      else { //Calculate male MHR
         maxHeartRate = 214 - (0.8 * ageInYears);
      }
      System.out.println(maxHeartRate + " beats per minute.");
   }

}