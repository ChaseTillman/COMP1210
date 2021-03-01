import java.util.Scanner;
/**
 * Simple program that takes user input of label, color, and edge length to
 * create an Octahedron. 
 *
 * Project_04
 *
 * @author Chase Tillman - COMP 1210 - 010
 * @version 9/18/2020
 */
public class OctahedronApp {
/**
 * Builds an octahedron from a user's label, color and edge length.
  * @param args Command Line Arguments - not used.
  */
   public static void main(String[] args) {
      String label = "", color = "";
      double edge = 0;
      Scanner userInput = new Scanner(System.in);
      
      // Prompt user for label, color, and edge length:
      System.out.println("Enter label, color, and edge" 
         + " length for an octahedron.");
      System.out.print("\tlabel: ");
      label = userInput.nextLine();
      System.out.print("\tcolor: ");
      color = userInput.nextLine();
      System.out.print("\tedge: ");
      edge = Double.parseDouble(userInput.nextLine());
      
      if (edge < 0) { // Invalid edge:
         System.out.println("Error: edge must be non-negative.");
      }
      else { // Create Octahedron and display it:
         Octahedron octa = new Octahedron(label, color, edge);
         System.out.println("\n" + octa);   
      }
   
      
   }

}