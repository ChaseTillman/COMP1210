import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.NoSuchElementException;
/**
 * DBList class store an array of databases and an array of invalid records.
 * It can get these arrays, add another DB or invalid record, add database
 * and invalid records from a file, and generate reports in original order,
 * ordered by name, and ordered by monthly cost.
 *
 * Project_10
 * 
 * @author Chase Tillman - COMP 1210 - 010
 * @version 11/13/2020
 */
public class DBList {
   private DB[] databaseArray;
   private String[] invalidRecords;
   
   /**
    * Creates an instance of DBList class with arrays of length 0.
    */
   public DBList() {
      databaseArray = new DB[0];
      invalidRecords = new String[0];
   }
   
   /**
    * Gets the database array.
    * @return - The database array.
    */
   public DB[] getDBArray() {
      return databaseArray;
   }
   
   /**
    * Gets the invalid records array.
    * @return - The invalid records array.
    */
   public String[] getInvalidRecordsArray() {
      return invalidRecords;
   }
   
   /** 
    * Adds a database to the database array.
    * @param obj - Database to be added to the array.
    */
   public void addDB(DB obj) {
      databaseArray = Arrays.copyOf(databaseArray, databaseArray.length + 1);
      databaseArray[databaseArray.length - 1] = obj;
   }
   
   /**
    * Adds an invalid record to the array.
    * @param obj - The invalid record to be added to the array.
    */
   public void addInvalidRecord(String obj) {
      invalidRecords = Arrays.copyOf(invalidRecords, invalidRecords.length + 1);
      invalidRecords[invalidRecords.length - 1] = obj;
   }
   
   /**
    * Reads a file and creates databases and invalid records based on
    * the letter code.
    * @param fileName - The name of the file to be read.
    * @throws FileNotFoundException - File with given name not found.
    */
   public void readFile(String fileName) throws FileNotFoundException {
      Scanner fileReader = new Scanner(new File(fileName));
      String currentLine = "";
      Scanner myReader;
      while (fileReader.hasNext()) {
         currentLine = fileReader.nextLine();
         myReader = new Scanner(currentLine).useDelimiter(",");
         try {
            switch (myReader.next().charAt(0)) {
               case 'C':
                  addDB(new CentralizedDB(myReader.next(),
                        Double.parseDouble(myReader.next()), 
                        Double.parseDouble(myReader.next()),
                        Double.parseDouble(myReader.next())));
                  break;
               case 'D':
                  addDB(new DistributedDB(myReader.next(),
                        Double.parseDouble(myReader.next()), 
                        Double.parseDouble(myReader.next()),
                        Integer.parseInt(myReader.next()), 
                        Double.parseDouble(myReader.next())));
                  break;
               case 'H':
                  addDB(new HomogeneousDB(myReader.next(),
                        Double.parseDouble(myReader.next()), 
                        Double.parseDouble(myReader.next()),
                        Integer.parseInt(myReader.next()), 
                        Double.parseDouble(myReader.next())));
                  break;
               case 'E':
                  addDB(new HeterogeneousDB(myReader.next(), 
                        Double.parseDouble(myReader.next()),
                        Double.parseDouble(myReader.next()), 
                        Integer.parseInt(myReader.next()), 
                        Double.parseDouble(myReader.next())));
                  break;   
               default:
                  throw new InvalidCategoryException(currentLine
                        .substring(0, 1));
            }
         }
         catch (InvalidCategoryException e) {
            addInvalidRecord(currentLine + "\n" + e);
         }
         catch (NumberFormatException e) {
            addInvalidRecord(currentLine + "\n" + e);
         
         }
         catch (NoSuchElementException e) {
            addInvalidRecord(currentLine + "\n" + e 
               + ": For missing input data");
         }
      }
      
   }
   
   /**
    * Creates a string describing all the databases in the array.
    * @return - Report on all dabases in the array.
    */
   public String generateReport() {
      String report = "-------------------------------\n" 
         + "Monthly Database Report\n"
         + "-------------------------------\n";
      for (DB obj: databaseArray) {
         report += obj.toString() + "\n\n";
      }
      return report;
   }
   
   /**
    * Creates a string describing all the databases in the array 
    * in order by name.
    * @return - Report on all dabases in the array ordered by name.
    */
   public String generateReportByName() {
      DB[] orderedArray = databaseArray;
      Arrays.sort(orderedArray);
      
      String report = "-----------------------------------------\n"
         + "Monthly Database Report (by Name)\n"
         + "-----------------------------------------\n";
      for (DB obj: orderedArray) {
         report += obj.toString() + "\n\n";
      }
      return report;
   }
   
   /**
    * Creates a string describing all the databases in the array in 
    * order by monthly cost.
    * @return - Report on all dabases in the array ordered by monthly cost.
    */
   public String generateReportByMonthlyCost() {
      DB[] orderedArray = databaseArray;
      Arrays.sort(orderedArray, new MonthlyCostComparator());
      
      String report = "-------------------------------------------------\n"
         + "Monthly Database Report (by Monthly Cost)\n"
         + "-------------------------------------------------\n";
      for (DB obj: orderedArray) {
         report += obj.toString() + "\n\n";
      }
      return report;
   }
   
   /**
    * Creates a string describing the invalid records.
    * @return - A string describing the invalid records.
    */
   public String generateInvalidRecordsReport() {
      String report = "----------------------\nInvalid Records Report\n"
         + "----------------------\n";
      for (String obj: invalidRecords) {
         report += obj + "\n\n";
      }
      return report;
   }
}