import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
/**
 * Simple program that gets information of Octahedrons from a text file,
 * and places them in an OctahedronList, then prints the information
 * from the OctahedronList.
 *
 * Project_05
 * 
 * @author Chase Tillman - COMP 1210 - 010
 * @version 9/25/2020
 */
public class OctahedronListApp {
   /**
    * Reads information from a text file and creates an OctahedronList from
    * them, then prints the information of the list.
    * @param args - Command Line arguments not used.
    * @throws FileNotFoundException - Entered file name cannot be found.
    */
   public static void main(String[] args) throws FileNotFoundException {
      Scanner scan = new Scanner(System.in);
      String input;
      ArrayList<String> inputList = new ArrayList<String>();
      ArrayList<Octahedron> octahedrons = new ArrayList<Octahedron>();
      System.out.print("Enter file name: ");
      input = scan.nextLine();
      System.out.println();
      Scanner scanFile = new Scanner(new File(input));
      
      while (scanFile.hasNext()) {
         inputList.add(scanFile.nextLine());
      }
      scanFile.close();
      
       
      int i = 1;
      while (i < inputList.size()) {
         octahedrons.add(new Octahedron(inputList.get(i), inputList.get(++i), 
            Double.parseDouble(inputList.get(++i))));
         i++;
      }
      OctahedronList octahedronList = new OctahedronList(inputList.get(0), 
         octahedrons);
      
      System.out.print(octahedronList.toString() + "\n\n" 
         + octahedronList.summaryInfo());
   }
   
}