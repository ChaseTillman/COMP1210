import java.io.FileNotFoundException;
/**
 * A simple program that reads a list of databases from a file and
 * generates and displays reports about them. 
 *
 *
 * Projedt_11
 *
 * @author Chase Tillman - COMP 1210 - 010
 * @version 11/20/2020
 */
public class DBPart3 {
   /**
    * Creates a Database List from a file given in the command line arguments.
    * Then Prints four reports about the database list.
    * @param args - The name of the file to read.
    */
   public static void main(String[] args) {
      DBList databaseList = new DBList();
      try {
         if (args.length == 0) { // No args given
            System.out.println("File name expected as command line argument.");
            System.out.println("Program ending.");
            return;
         }
         for (String string: args) { 
            databaseList.readFile(string);
         }
         System.out.print(databaseList.generateReport());
         System.out.print(databaseList.generateReportByName());
         System.out.print(databaseList.generateReportByMonthlyCost());
         System.out.print(databaseList.generateInvalidRecordsReport());
      }
      catch (FileNotFoundException e) {
         System.out.println("*** Attempted to read file: " 
               + args[0] + " (No such file or directory)"); 
      }
      
      
      
   }
}