import java.text.DecimalFormat;
/**
 * DB is an abstract class containing the name, base cost, storage amount, and
 * the number of databases created. It can get and set these values, and
 * it it contains an abstract method for monthly cost.
 *
 * Project_09
 *
 * @author Chase Tillman - COMP 1210 - 010
 * @version 11/6/2020
 */
public abstract class DB {
   protected String name;
   protected double cost, storage;
   
   /**
    * The number of Databases created from the DB class.
    */
   protected static int count = 0;
   
   /**
    * Creates an instance of the DB class with a name, base cost,
    * and storage value.
    * @param nameIn - The name of the database.
    * @param costIn - The base cost of the database.
    * @param storageIn - The amount of storage for the database.
    */
   public DB(String nameIn, double costIn, double storageIn) {
      name = nameIn;
      cost = costIn;
      storage = storageIn;
      count++;
   }
   
   /**
    * Gets the name of the database.
    * @return - The name of the database.
    */
   public String getName() {
      return name;
   }
   
   /**
    * Sets the name to the passed parameter.
    * @param nameIn - The new name of the database.
    */
   public void setName(String nameIn) {
      name = nameIn;
   }
   
   /**
    * Gets the base cost of the database.
    * @return - The base cost of the database.
    */
   public double getBaseCost() {
      return cost;
   }
   
   /**
    * Sets the base cost to the passed parameter.
    * @param costIn - The new base cost of the database.
    */
   public void setBaseCost(double costIn) {
      cost = costIn;
   }
   
   /**
    * Gets the storage amount of the database.
    * @return - The storage of the database.
    */
   public double getDbStorage() {
      return storage;
   }
   
   /**
    * Sets the database storage to the passed parameter.
    * @param storageIn - The new storage of the database.
    */
   public void setDbStorage(double storageIn) {
      storage = storageIn;
   }
   
   /**
    * Gets the number of databases made.
    * @return - The number of databases made from the DB class.
    */
   public static int getCount() {
      return count;
   }
   
   /**
    * Resets the count of databases made to 0.
    */
   public static void resetCount() {
      count = 0;  
   }
   
   /**
    * Creates a string describing the database.
    * @return - A string describing the database.
    */
   public String toString() { 
      DecimalFormat costFormat = new DecimalFormat("$#,##0.00");
      DecimalFormat storageFormat = new DecimalFormat("0.000");
      return getName() + " (" + this.getClass() + ") Monthly "
         + "Cost: " + costFormat.format(monthlyCost()) + "\nStorage: "
         + storageFormat.format(getDbStorage()) + " TB\n"
         + "Base Cost: " + costFormat.format(getBaseCost());
   }
   
   /**
    * Calculates the monthly cost of the database.
    * @return - The montly cost of the database.
    */
   public abstract double monthlyCost();
}