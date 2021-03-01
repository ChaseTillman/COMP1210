/**
 * HeterogeneousDB class inherits from the DistributedDB class
 * and additionally has it's own cost factor.
 *
 * Project_09
 *
 * @author Chase Tillman - COMP 1210 - 010 
 * @version 11/6/2020
 */
public class HeterogeneousDB extends DistributedDB {
  /**
   * The factor by which the user cost is multiplied
   * to get the final monthly cost.
   */
   public static final double COST_FACTOR = 1.3;
   
   /**
    * Creates an instance of the HeterogeneousDB class with a name, base cost,
    * storage amount, number of users, and cost per user.
    * @param nameIn - The name of the database.
    * @param costIn - The base cost of the database.
    * @param storageIn - The amount of storage for the database.
    * @param usersIn - The number of users of the database.
    * @param costPerUserIn - The cost per user of the database.
    */
   public HeterogeneousDB(String nameIn, double costIn, double storageIn,
            int usersIn, double costPerUserIn) {
      super(nameIn, costIn, storageIn, usersIn, costPerUserIn);
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
      return super.getBaseCost() + super.userCost() * COST_FACTOR;
   }
}