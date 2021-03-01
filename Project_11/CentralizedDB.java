import java.text.DecimalFormat;
/**
 * CentralizedDB class inherits from the DB class, and additionally
 * has a license cost.
 * 
 * Project_09
 *
 * @author Chase Tillman - COMP 1210 - 010
 * @version 11/6/2020
 */
public class CentralizedDB extends DB {
   private double license;
   
   /**
    * Creates an instance of the CentralizedDB class with name, 
    * base cost, and storagefrom the DB class, and a license cost.
    * @param nameIn - The name of the database.
    * @param costIn - The base cost of the database. 
    * @param storageIn - The amount of storage for the database.
    * @param licenseIn - The cost of the database license.
    */
   public CentralizedDB(String nameIn, double costIn, 
         double storageIn, double licenseIn) {
      super(nameIn, costIn, storageIn);
      license = licenseIn;
   }
   
   /**
    * Gets the cost of the database license.
    * @return - The cost of the database license.
    */
   public double getLicense() {
      return license;
   }
   
   /**
    * Sets the license cost to the passed parameter.
    * @param licenseIn - The new cost of the license.
    */
   public void setLicense(double licenseIn) {
      license = licenseIn;
   }
   
   /**
    * Calculates the monthly cost of the database.
    * @return - The monthly cost of the database.
    */
   public double monthlyCost() {
      return super.getBaseCost() + license;
   }
   
   /**
    * Creates a string describing the database.
    * @return - A string describing the database.
    */
   @Override
   public String toString() {
      DecimalFormat costFormat = new DecimalFormat("$#,##0.00");
      return super.toString() + "\nLicense: " + costFormat.format(getLicense());
   }
}