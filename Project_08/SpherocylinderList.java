import java.text.DecimalFormat;
/**
 * The SpherocylinderList class contains a name, an array of Spherocylinders,
 * and the number of spherocylinders.
 * The class can get the name, calculate the total and average
 * volumes and surface areas.
 *
 * Project_08
 *
 * @author Chase Tillman - COMP 1210 - 010
 * @version 10/30/2020
 */
public class SpherocylinderList {
   private String name = "";
   private Spherocylinder[] spherocylinderArray;
   private int numberSpherocylinders;
   
   /**
    * Creates an instance of the SpherocylinderList class with a name,
    * spherocylinder array, and number of spherocylinders.
    * @param nameIn - The name of the list.
    * @param arrayIn - The array of spherocylinders.
    * @param numberIn - the number of spherocylinders in the list.
    */
   public SpherocylinderList(String nameIn, Spherocylinder[] arrayIn, 
      int numberIn) {
      name = nameIn;
      spherocylinderArray = arrayIn;
      numberSpherocylinders = numberIn;
   }
   
   /**
    * Gets the name of the list.
    * @return - The name of the list.
    */
   public String getName() {
      return name;
   }
   
   /**
    * Gets the number of objects in the spherocylinder list.
    * @return - The number of spherocylinders in the list.
    */
   public int numberOfSpherocylinders() {
      return numberSpherocylinders;
   }
    
    /**
     * Calculates the total surface area oF the spherocylinder list.
     * @return - Total surface area of the spherocylinders in the list.
     */
   public double totalSurfaceArea() {
      double total = 0;
      if (numberSpherocylinders == 0) {
         return 0;
      }
      for (Spherocylinder obj: spherocylinderArray) {
         total += obj.surfaceArea();
      }
      return total;
   }
   
   /**
    * Calculates the total volume of the spherocylinders.
    * @return - Total volume of spherocylinders.
    */
   public double totalVolume() {
      double total = 0;
      if (numberSpherocylinders == 0) {
         return 0;
      }
      for (Spherocylinder obj: spherocylinderArray) {
         total += obj.volume();
      } 
      return total;
   }
   
   /**
    * Calculates the average surface area of the spherocylinders.
    * @return - The average surface area of the spherocylinders.
    */
   public double averageSurfaceArea() {
      if (numberSpherocylinders > 0) {
         return totalSurfaceArea() / numberOfSpherocylinders();
      }
      return 0;
   }
   
   /**
    * Calculates the average volume of the spherocylinders.
    * @return - The average volume of the spherocylinders.
    */
   public double averageVolume() {
      if (numberSpherocylinders > 0) {
         return totalVolume() / numberOfSpherocylinders();
      }
      return 0;
   }
   
   /**
    * Creates a string of all the list's information.
    * @return - String of list's information.
    */
   public String toString() {
      DecimalFormat format = new DecimalFormat("#,##0.0##");
      return "----- Summary for " + name + " -----\n" 
         + "Number of Spherocylinders: " + numberOfSpherocylinders() + "\n"
         + "Total Surface Area: " + format.format(totalSurfaceArea()) + "\n"
         + "Total Volume: " + format.format(totalVolume()) + "\n"
         + "Average Surface Area: " + format.format(averageSurfaceArea()) + "\n"
         + "Average Volume: " + format.format(averageVolume());
   }
   
   /**
    * Gets the array of spherocylinders.
    * @return - The array of spherocylinders.
    */
   public Spherocylinder[] getList() {
      return spherocylinderArray;
   }
   
   /** 
    * Adds a spherocylinder to the list.
    * @param labelIn - The label of the spherocylinder.
    * @param radiusIn - The radiusof the spherocylinder.
    * @param heightIn - The height of the spherocylinder.
    */
   public void addSpherocylinder(String labelIn, double radiusIn,
      double heightIn) {
      Spherocylinder[] newArray = new 
            Spherocylinder[numberOfSpherocylinders() + 1];
      for (Spherocylinder obj: spherocylinderArray) {
         for (int i = 0; i < newArray.length; i++) {
            newArray[i] = obj;
         }
      }
      newArray[newArray.length - 1] = new 
            Spherocylinder(labelIn, radiusIn, heightIn);
      spherocylinderArray = newArray;
      numberSpherocylinders++;
   }
   
   /**
    * Finds a spherocylinder of the same label in the array.
    * @param labelIn - The label of the spherocylinder.
    * @return - The found spherocylinder.
    */
   public Spherocylinder findSpherocylinder(String labelIn) {
      for (Spherocylinder obj: spherocylinderArray) {
         if (obj.getLabel().equalsIgnoreCase(labelIn.trim())) {
            return obj;
         }  
      }
      return null;
   }
   
   /**
    * Deletes a spherocylinder from the array.
    * @param labelIn - The label of the spherocylinder.
    * @return - The deleted spherocylinder.
    */
   public Spherocylinder deleteSpherocylinder(String labelIn) {
      Spherocylinder toBeDeleted = null;
      int index;
      for (int i = 0; i < spherocylinderArray.length; i++) {
         if (spherocylinderArray[i].getLabel()
               .equalsIgnoreCase(labelIn.trim())) {
            toBeDeleted = spherocylinderArray[i];
            index = i;
            for (int j = index; j < spherocylinderArray.length; j++) {
               if (j == spherocylinderArray.length - 1) {
                  spherocylinderArray[j] = null;
               }
               else {
                  spherocylinderArray[j] = spherocylinderArray[j + 1];
               }
            }
            numberSpherocylinders--;
            return toBeDeleted;
         }  
      }
      return toBeDeleted;
   }
   
   /**
    * Edits a spherocylinder with the same label.
    * @param labelIn - The label of the spherocylinder.
    * @param radiusIn - The new radius of the spherocylinder.
    * @param heightIn - The new height of the spherocylinder.
    * @return - Whether or not a spherocylinder was edited.
    */
   public boolean editSpherocylinder(String labelIn,
         double radiusIn, double heightIn) {
      int index;
      for (int i = 0; i < spherocylinderArray.length; i++) {
         if (spherocylinderArray[i].getLabel()
               .equalsIgnoreCase(labelIn.trim())) {
            spherocylinderArray[i] = new 
                  Spherocylinder(labelIn, radiusIn, heightIn);
            return true;
         }
      }
      return false;
   }  
   
   /**
    * Finds the spherocylinder with the largest volume.
    * @return - The spherocylinder with the largest volume.
    */
   public Spherocylinder findSpherocylinderWithLargestVolume() {
      Spherocylinder spherocylinderLargestVolume = null;
      if (numberOfSpherocylinders() == 0) {
         return spherocylinderLargestVolume;
      }
      double largestVolume = 0;
      for (Spherocylinder obj: spherocylinderArray) {
         if (largestVolume < obj.volume()) {
            largestVolume = obj.volume();
            spherocylinderLargestVolume = obj;
         }
      }
      return spherocylinderLargestVolume;
   }
}