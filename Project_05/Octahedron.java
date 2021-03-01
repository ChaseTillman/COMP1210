import java.text.DecimalFormat;
/**
 * Octahedron object that contains a label, color, and edge lenght.
 * 
 * Project_05
 * 
 * @author Chase Tillman - COMP 1210 - 010
 * @version 9/25/2020
 */
public class Octahedron {
   private String label = "", color = "";
   private double edge = 0;
   /**
    * Creates an Octahedron with a label, color, and edge length.
    * @param labelIn - The octahedron's label.
    * @param colorIn - The octahedron's color.
    * @param edgeIn - The octahedron's edge length.
    */
   public Octahedron(String labelIn, String colorIn, double edgeIn) {
      setLabel(labelIn);
      setColor(colorIn);
      setEdge(edgeIn);
   }
   
   /**
    * Gets the label of the octahedron.
    * @return - The label of the octahedron.
    */
   public String getLabel() {
      return label;
   }
   
   /**
    * Sets the label of the Octahedron.
    * @param labelIn - The label of the octahedron.
    * @return - Whether or not the label has been set.
    */
   public boolean setLabel(String labelIn) {
      if (labelIn == null) {
         return false;
      }
      else {
         label = labelIn.trim();
         return true;  
      }
   }
   
   /**
    * Gets the color of the Octahedron.
    * @return - The color of the Octahedron.
    */   
   public String getColor() {
      return color;
   }
   
   /**
    * Sets the color of the Octahedron.
    * @param colorIn - THe color of the octahedron.
    * @return - Whether or not the color has been set.
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
    * Gets the edge length of the Octahedron. 
    * @return - The edge length.
    */
   public double getEdge() {
      return edge;
   }
   
   /**
    * Sets the edge length of the Octahedron.
    * @param edgeIn - The edge length of the Octahedron.
    * @return - Whether or not the edge length was set.
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
    * Calculates the surface area of the Octahedron.
    * @return The Surface Area of the Octahedron.
    */
   public double surfaceArea() {
      return (2 * Math.sqrt(3) * Math.pow(edge, 2));
   }
   
   /**
    * Calculates the volume of the octahedron.
    * @return The voluime of the octahedron.
    */
   public double volume() {
      return (Math.sqrt(2) * Math.pow(edge, 3) / 3);
   }
   
   /**
    * Calculates the surface area to volume ratio. 
    * @return the surface area to volume ratio.
    */
   public double surfaceToVolumeRatio() {
      return (surfaceArea() / volume());
   }
   
   /**
    * Gets the information from the Octahedron.
    * @return The Octahedron information.
    */
   public String toString() {
      DecimalFormat format = new DecimalFormat("#,##0.0###");
      return "Octahedron \"" + label + "\" is \"" + color + "\" with 12 edges" 
         + " of length " + edge + " units.\n\tsurface area = " 
         + format.format(surfaceArea()) + " square units\n\tvolume = " 
         + format.format(volume()) + " cubic units\n\t"
         + "surface/volume ratio = " + format.format(surfaceToVolumeRatio()); 
   }

}