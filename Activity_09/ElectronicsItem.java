/**
 * Electronics item class inherits from the InventoryItem class and
 * additionally has a weight and shipping cost.
 *
 * Activity_09
 *
 * @author Chase Tillman - COMP 1210 - 010
 * @version 11/3/2020
 */
public class ElectronicsItem extends InventoryItem {
   protected double weight = 0;
   
   /** 
    * The cost of shipping per unit weight.
    */
   public static final double SHIPPING_COST = 1.5;
   
   /**
    * Creates an instance of the electronics item class.
    * @param nameIn - Name of the item.
    * @param priceIn - Price of the item.
    * @param weightIn - Weight of the item.
    */
   public ElectronicsItem(String nameIn, double priceIn, double weightIn) {
      super(nameIn, priceIn);
      weight = weightIn;
   }
   
   /**
    * Calculates the cost of the item including shipping.
    * @return The cost of the item.
    */
   public double calculateCost() {
      return super.calculateCost() + (SHIPPING_COST * weight);
   }
}