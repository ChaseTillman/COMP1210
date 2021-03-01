import java.io.FileNotFoundException;
/**
 * Program that creates a DBList and populates its database array from a file
 * from the command line arguments. Then it displays the reports from DBList.
 *
 * Project_10
 *
 * @author Chase Tillman - COMP 1210 - 010
 * @version 11/13/2020
 */
public class DBPart2 {
   /** 
    * Creates an instance of DBList, reads from a file, and displays all reports
    * in the DBList class.
    * @param args Command Line arguments - File name for database information.
    * @throws FileNotFoundException - File name is invalid.
    */
   public static void main(String[] args) throws FileNotFoundException {
      DBList dbList = new DBList();
      
      if (args.length > 0) {
         for (String string: args) {
            dbList.readFile(string);
         }
         System.out.print(dbList.generateReport());
         System.out.print(dbList.generateReportByName());
         System.out.print(dbList.generateReportByMonthlyCost());
      }
      
      else {
         System.out.println("File name expected as command line argument.\n"
               + "Program ending.");
      }
   }
}