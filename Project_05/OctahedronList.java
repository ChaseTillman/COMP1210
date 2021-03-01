import java.util.ArrayList;
import java.text.DecimalFormat;
/**
 * OctahedronList object that contains a name and array list of octahedrons.
 * 
 * Project_05
 * 
 * @author Chase Tillman - COMP 1210 - 010
 * @version 9/25/2020
 */
public class OctahedronList {
   private String name = "";
   private ArrayList<Octahedron> octahedrons = new ArrayList<Octahedron>();
   
   /**
    * Creates an OctahedronList object with a name and ArrayList of octahedron.
    * @param nameIn - The name of the octahedron list.
    * @param octahedronsIn - The array list of the octahedrons.
    */
   public OctahedronList(String nameIn, ArrayList<Octahedron> octahedronsIn) {
      name = nameIn;
      octahedrons = octahedronsIn;
   }
   
   /**
    * Gets the name of the OctahedronList.
    * @return - Name of the OctahedronList.
    */
   public String getName() {
      return name;
   }
   
   /**
    * Gets the number of the octahedrons in this octahedron list.
    * @return - The Number of octahedrons in this octahedron list.
    */
   public int numberOfOctahedrons() {
      return octahedrons.size();
   }
   
   /**
    * Calculates the total surface area of the octahedrons.
    * @return - The total surface area of the octahedrons in OctahedronList.
    */
   public double totalSurfaceArea() {
      double surfaceArea = 0;
      int i = 0;
      while (i < octahedrons.size()) {
         surfaceArea += octahedrons.get(i).surfaceArea();
         i++;
      }
      return surfaceArea;
   }
   
   /**
    * Calculates the total volume of the octahedrons in this OctahedonList.
    * @return - The total volume of the octahedrons.
    */
   public double totalVolume() {
      double volume = 0;
      int i = 0;
      while (i < octahedrons.size()) {
         volume += octahedrons.get(i).volume();
         i++;
      }
      return volume;
   }
   
   /**
    * Calculates the average surface area of the octahedrons.
    * @return - The average surface area of the octahedrons.
    */
   public double averageSurfaceArea() {
      if (octahedrons.size() == 0) {
         return 0;
      }
      else {
         return totalSurfaceArea() / octahedrons.size();
      }
   }
   
   /**
    * Calculates the average volume of the octahedrons.
    * @return - The average volume of the octahedrons.
    */
   public double averageVolume() {
      if (octahedrons.size() == 0) {
         return 0;
      }
      else {
         return totalVolume() / octahedrons.size();
      }
   }
   
   /**
    * Calculates the average surface area to volume ratio of the octahedrons.
    * @return - The average surface are to volume ratio of the octahedrons.
    */
   public double averageSurfaceToVolumeRatio() {
      double surfaceToVolume = 0;
      if (octahedrons.size() == 0) {
         return 0;
      } 
      int i = 0;
      while (i < octahedrons.size()) {
         surfaceToVolume += octahedrons.get(i).surfaceToVolumeRatio();
         i++;
      }
      return surfaceToVolume / octahedrons.size();
   }
   
   /**
    * Gets information of each octahedron in this OctahedronList.
    * @return - The information of each octahedron.
    */
   public String toString() {
      int i = 0;
      String octahedronsString = name + "\n";
      while (i < octahedrons.size()) {
         octahedronsString += "\n" + octahedrons.get(i) + "\n";
         i++;
      }
      return octahedronsString;
   }
   
   /**
    * Gets a summary of all of the octahedrons in this octahedron list.
    * @return - Summary of all the Octahedrons.
    */
   public String summaryInfo() {
      DecimalFormat format = new DecimalFormat("#,##0.0##");
      return "----- Summary for " + name + " -----" 
         + "\nNumber of Octahedrons: " + numberOfOctahedrons() 
         + "\nTotal Surface Area: " + format.format(totalSurfaceArea())
         + "\nTotal Volume: " + format.format(totalVolume())
         + "\nAverage Surface Area: " + format.format(averageSurfaceArea())
         + "\nAverage Volume: " + format.format(averageVolume())
         + "\nAverage Surface/Volume Ratio: " 
         + format.format(averageSurfaceToVolumeRatio());
   } 
}