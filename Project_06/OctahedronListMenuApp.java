import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileNotFoundException;
/**
 * A menu of options for octahedron lists where you can read from a file,
 * print the list, print the summary, add an octohedron, delete an octohedron,
 * find an octohedron, or edit an octohedron.
 *
 * Project_06
 *
 * @author Chase Tillman - COMP 1210 - 010
 * @version 10/2/2020
 */
public class OctahedronListMenuApp {
   /**
    * Creates a menu of options for a user to manipulate an octohedron list.
    * @param args Command Line arguments - Not Used
    */
   public static void main(String[] args) throws FileNotFoundException {
      Scanner userInput = new Scanner(System.in);
      String listName = "*** no list name assigned ***";
      ArrayList<Octahedron> octList = new ArrayList<Octahedron>();
      OctahedronList octahedronList = new OctahedronList(listName, octList);
      String labelIn;
      String colorIn;
      double edgeIn;
      String choice = "";
      System.out.println("Octahedron List System Menu");  
      System.out.println("R - Read File and Create Octahedron List");
      System.out.println("P - Print Octahedron List");
      System.out.println("S - Print Summary");
      System.out.println("A - Add Octahedron");
      System.out.println("D - Delete Octahedron");
      System.out.println("F - Find Octahedron");
      System.out.println("E - Edit Octahedron");
      System.out.println("Q - Quit");
      
      do {
         System.out.print("Enter Code [R, P, S, A, D, F, E, or Q]: ");
         labelIn = "";
         colorIn = "";
         edgeIn = 0;
         choice = userInput.nextLine();
         switch (choice.toUpperCase()) {
            case "R":
               System.out.print("File Name: ");
               octahedronList = octahedronList.readFile(userInput.nextLine());
               System.out.println("File read in and Octahedron List created\n");
               break;
            case "P":
               System.out.print(octahedronList + "\n");
               break; 
            case "S":
               System.out.println("\n" + octahedronList.summaryInfo() + "\n");
               break;
            case "A":
               System.out.print("\tLabel: ");
               labelIn = userInput.nextLine();
               System.out.print("\tColor: ");
               colorIn = userInput.nextLine();
               System.out.print("\tEdge: ");
               edgeIn = userInput.nextDouble();
               octahedronList.addOctahedron(labelIn, colorIn, edgeIn);
               System.out.println("\t*** Octahedron added ***\n");
               break;
            case "D":
               System.out.print("\tLabel: ");
               labelIn = userInput.nextLine();
               if (octahedronList.findOctahedron(labelIn) != null) {
                  System.out.println("\t\"" 
                     + octahedronList.findOctahedron(labelIn).getLabel() 
                     + "\" deleted\n");
                  octahedronList.deleteOctahedron(labelIn);
               }
               else {
                  System.out.println("\t\"" + labelIn + "\" not found\n");
               }
               break;
            case "F":
               System.out.print("\tLabel: ");
               labelIn = userInput.nextLine();
               if (octahedronList.findOctahedron(labelIn) != null) {
                  System.out.println(octahedronList.findOctahedron(labelIn));
               }
               else {
                  System.out.println("\t\"" + labelIn + "\" not found\n");
               }
               break;
            case "E":
               System.out.print("\tLabel: ");
               labelIn = userInput.nextLine(); 
               System.out.print("\tColor: ");
               colorIn = userInput.nextLine();
               System.out.print("\tEdge: ");
               edgeIn = userInput.nextDouble();
               if (octahedronList.findOctahedron(labelIn) != null) {
                  octahedronList.editOctahedron(labelIn, colorIn, edgeIn);
                  System.out.println("\t\"" 
                     + octahedronList.findOctahedron(labelIn).getLabel() 
                     + "\" successfully edited");
               }
               else {
                  System.out.print("\t\"" + labelIn + "\" not found\n");
               }
               break;
            case "Q":
               break;
            default:
               System.out.println("\t*** invalid code ***");
         }
      } while (!choice.toUpperCase().equals("Q"));
      
   }
}