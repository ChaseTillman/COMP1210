/**
 * Creates four items of InventoryItem, ElectronicsItem, OnlineArticle, 
 * and OnlineBook classes and sets a 
 * value for all variables in the classes.
 *
 * Activity_09
 *
 * @author - Chase Tillman - COMP 1210 - 010
 * @version 11/3/2020
 */
public class InventoryApp {
   /**
    * Creates for Items and sets their values.
    * @param args Command line arguments - Not Used.
    */
   public static void main(String[] args) {
      InventoryItem.setTaxRate(0.05);
      InventoryItem item1 = new InventoryItem("Oil change kit", 39.00);
      ElectronicsItem item2 = new ElectronicsItem("Cordless phone", 80.00, 1.8);
      OnlineArticle item3 = new OnlineArticle("Java News", 8.50);
      item3.setWordCount(700);
      OnlineBook item4 = new OnlineBook("Java for Noobs", 13.37);
      item4.setAuthor("L. G. Jones");
   }  
}