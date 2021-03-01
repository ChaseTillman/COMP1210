/**
 * OnlineTextItem class inherits from the InventoryItem class
 * and overrides the cost to exclude tax.
 * 
 * Activity_09
 *
 * @author Chase Tillman - COMP 1210 - 010
 * @version 11/3/2020
 */
public abstract class OnlineTextItem extends InventoryItem {
   
   /** 
    * Passes the name and price to create an instance of a class 
    * inheriting from OnlineTextItem.
    * @param nameIn - name of the item.
    * @param priceIn - price of the item.
    */
   public OnlineTextItem(String nameIn, double priceIn) {
      super(nameIn, priceIn);
   }
   
   /**
    * Calculates the cost without any tax.
    * @return - The cost of the item.
    */
   @Override
   public double calculateCost() {
      return price;
   }
}