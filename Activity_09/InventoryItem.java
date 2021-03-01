/**
 * The InventoryItem class stores an Item with a name and a price.
 * It also stores a static tax rate for all InventoryItem instances.
 *
 * Activity_09
 *
 * @author - Chase Tillman - COMP 1210 - 010
 * @version 11/3/2020
 */
public class InventoryItem {
   protected String name = "";
   protected double price = 0;
   private static double taxRate = 0;
   
   /**
    * Creates an instance of the InventoryItem class.
    * @param nameIn - The name of the item.
    * @param priceIn - The price of the item.
    */
   public InventoryItem(String nameIn, double priceIn) {
      name = nameIn;
      price = priceIn;
   }
   
   /**
    * Gets the name of the item.
    * @return - The name of the item.
    */
   public String getName() {
      return name;
   }
   
   /**
    * Calculates the cost of the item after tax.
    * @return - The cost of the item.
    */
   public double calculateCost() {
      return price * (1 + taxRate);
   }
   
   /**
    * Sets the tax rate for all InventoryItems.
    * @param taxRateIn - The tax rate being set.
    */
   public static void setTaxRate(double taxRateIn) {
      taxRate = taxRateIn;
   }
   
   /**
    * Gets the information about the item.
    * @return - The item's information.
    */
   public String toString() {
      return name + ": $" + calculateCost();
   }
   
   
}