import java.text.DecimalFormat;
/**
 * Represents an octahedron. 
 * The octahedron has a label, color, and edge length.
 * 
 * Project_04
 *
 * @author Chase Tillman - COMP 1210 - 010
 * @version 9/18/2020
 */
public class Octahedron {
   
   // instance variables
   private String label = "", color = "";
   private double edge = 0;
   
   // Constructors
   /**
    * Constructs an instance of the Octahedron class and sets values
    * for the given label, color, and edge.
    * @param labelIn The label of the octahedron.
    * @param colorIn The color of the octahedron.
    * @param edgeIn The edge length of the octahedron.
    */
   public Octahedron(String labelIn, String colorIn, double edgeIn) {
      setLabel(labelIn);
      setColor(colorIn);
      setEdge(edgeIn);
   }
   
   // Methods
   /**
    * Gets the octahedrons label.
    * @return this octahedrons label
    */
   public String getLabel() {
      return label;
   }
   
   /**
    * Changes the octahedron's label if the label is valid. 
    * @param labelIn The label of the octahedron to be set.
    * @return Whether or not the label was set.
    */
   public boolean setLabel(String labelIn) {
      if (labelIn != null) {
         label = labelIn.trim();
         return true;
      }
      else {
         return false;
      }
   }
   
    /**
     * Gets the color of the octahedron.
     * @return this octahedron's color
     */  
   public String getColor() {
      return color;
   }
    
    /**
     * Changes the octahedron's color if the color is valid.
     * @param colorIn The color of the octahedron to be set.
     * @return Whether or not the color was set.
     */  
   public boolean setColor(String colorIn) {
      if (colorIn == null) {
         return false;
      }
      else {
         color = colorIn.trim();
         return true;
      } 
   } 
    
    /**
     * Gets the edge length of the octahedron.
     * @return this octahedron's edge length.
     */ 
   public double getEdge() {
      return edge;
   }
    
    /**
     * Changes the edges value if the edge is valid.
     * @param edgeIn the edge length of the octahedron to be set to edge.
     * @return Whether or not the edge was set.
     */  
   public boolean setEdge(double edgeIn) {
      if (edgeIn < 0) {
         return false;
      }
      else {
         edge = edgeIn;
         return true;
      }
   }
   
    /**
     * Evaluates the surface area of the octahedron.
     * @return this octahedron's surface area.
     */
   public double surfaceArea() {
      return (2 * Math.sqrt(3) * Math.pow(edge, 2));
   }
   
   /**
    * Evaluates the volume of the octahedron.
    * @return this octahedron's volume.
    */
   public double volume() {
      return (Math.sqrt(2) * Math.pow(edge, 3) / 3);
   }
    
    /**
     * Evaluates the surface area to volume ratio.
     * @return this octahedrons surface area to volume ratio.
     */
   public double surfaceToVolumeRatio() {
      return (surfaceArea() / volume());
   }
    
    /**
     * Creates a description of the octahedron.
     * @return this octahedron's description.
     */
   public String toString() {
      DecimalFormat decimalFormat = new DecimalFormat("#,##0.0###");
      return "Octahedron \"" + label + "\" is \"" + color + "\" with 12 "
         + "edges of length " + edge + " units.\n\tsurface area = " 
         + decimalFormat.format(surfaceArea()) + " square units\n\t"
         + "volume = " + decimalFormat.format(volume()) + " cubic units \n\t"
         + "surface/volume ratio = " 
         + decimalFormat.format(surfaceToVolumeRatio());
   }
   
  
}