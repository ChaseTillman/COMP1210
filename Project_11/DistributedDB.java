import java.text.DecimalFormat;
/**
 * DistributedDB class inherits from the DB class and also
 * has a count of users, a cost per user, and a cost factor.
 *
 * Project_09
 *
 * @author Chase Tillman - COMP 1210 - 010
 * @version 11/6/2020
 */
public class DistributedDB extends DB {
   protected int users;
   protected double costPerUser;
   
   /**
    * The factor by which the user cost is multiplied
    * to calculate the final monthly cost of the database.
    */
   public static final double COST_FACTOR = 1.1;
   
   /**
    * Creates an instance of the DistributedDB with a name, base cost, storage,
    * number of users, and cost per user.
    * @param nameIn - The name of the database.
    * @param costIn - The base cost of the database.
    * @param storageIn - The amount of storage for the database.
    * @param usersIn - The number of users for the database.
    * @param costPerUserIn - The cost for each user of the database.
    */
   public DistributedDB(String nameIn, double costIn, double storageIn, 
         int usersIn, double costPerUserIn) {
      super(nameIn, costIn, storageIn);
      users = usersIn;
      costPerUser = costPerUserIn;
   }
   
   /**
    * Gets the number of users of the database.
    * @return - The number of database users.
    */
   public int getNumberOfUsers() {
      return users;
   }
   
   /**
    * Sets the number of users to the passed parameter.
    * @param usersIn - The new number of database users.
    */
   public void setNumberOfUsers(int usersIn) {
      users = usersIn;
   }
   
   /**
    * Gets the cost per user of the database.
    * @return - The cost per user of the database.
    */
   public double getCostPerUser() {
      return costPerUser;
   }
   
   /**
    * Sets the cost per user of the database to the passed value.
    * @param costPerUserIn - The new cost per user of the database.
    */
   public void setCostPerUser(double costPerUserIn) {
      costPerUser = costPerUserIn;
   }
   
   /**
    * Calculates the cost from the users of the database.
    * @return - The cost of users of the database.
    */
   public double userCost() {
      return users * costPerUser;
   }
   
   /**
    * Gets the cost factor of the database.
    * @return - The cost factor of the database.
    */
   public double getCostFactor() {
      return COST_FACTOR;  
   }
   
   /**
    * Calculates the monthly cost of the database.
    * @return - The monthly cost of the database.
    */
   public double monthlyCost() {
      return super.getBaseCost() + userCost() * getCostFactor();  
   }
   
   /**
    * Creates a string describing the database.
    * @return - A string describing the database.
    */
   @Override
   public String toString() {
      DecimalFormat costFormat = new DecimalFormat("$#,##0.00");
      return super.toString() + "\nNumber of Users: " + getNumberOfUsers() 
         + "\nCost per User: " + costFormat.format(getCostPerUser()) + "\n"
         + "User Cost: " + costFormat.format(userCost()) + "\n"
         + "Cost Factor: " + getCostFactor();
   }
}