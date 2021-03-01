import java.text.DecimalFormat;
/**
 * The Spherocylinder class counts the number of spherocylinders and 
 * contains a spherocylinder with a label, radius, and cylinder height.
 * The class can find the circumference, the surface area, and the volume
 * of the spherocylinder, and it can compare an object to the spherocylinder.
 *
 * Project_7B
 *
 * @author Chase Tillman - COMP 1210 - 010
 * @version 10/23/2020
 */

public class Spherocylinder implements Comparable<Spherocylinder> {
   
   private String label = "";
   private double radius = 0, cylinderHeight = 0;
   private static int numberSpherocylinders = 0;
   
   /**
    * Creates an instance of the Spherocylinder class with 
    * a label, radius, and height,
    * and increments the number of cylinders.
    * @param labelIn - The label of the Spherocylinder.
    * @param radiusIn - The radius of the Spherocylinder.
    * @param heightIn - The height of the Spherocylinder.
    */
   public Spherocylinder(String labelIn, double radiusIn, double heightIn) {
      setLabel(labelIn);
      setRadius(radiusIn);
      setCylinderHeight(heightIn);
      numberSpherocylinders++;  
   }
   
   /**
    * Gets the label of the Spherocylinder.
    * @return - The label of the Spherocylinder.
    */
   public String getLabel() {
      return label;
   }
   
   /**
    * Sets the label of the Spherocylinder if it is not null.
    * @param labelIn - The label of the Spherocylinder.
    * @return - Whether or not the label was set.
    */
   public boolean setLabel(String labelIn) {
      if (labelIn == null) {
         return false;
      }
      label = labelIn.trim();
      return true;
   }
   
   /**
    * Gets the radius of the Spherocylinder.
    * @return - The radius of the Spherocylinder.
    */
   public double getRadius() {
      return radius;
   }
   
   /**
    * Sets the radius of the Spherocylinder if it is positive.
    * @param radiusIn - The radius of the Spherocylinder.
    * @return - Whether or not the radius was set.
    */
   public boolean setRadius(double radiusIn) {
      if (radiusIn < 0) {
         return false;
      }
      radius = radiusIn;
      return true;
   }
   
   
   /**
    * Gets the cylinder Height of the Spherocylinder.
    * @return - The cylinder height of the Spherocylinder.
    */
   public double getCylinderHeight() {
      return cylinderHeight;
   }
   
   /**
    * Sets the height of the Spherocylinder if it is positive.
    * @param heightIn - The height of the Spherocylinder.
    * @return - Whether or not the height was set.
    */
   public boolean setCylinderHeight(double heightIn) {
      if (heightIn < 0) {
         return false;
      }
      cylinderHeight = heightIn;
      return true;
   }
   
   /**
    * Calculates the circumference of the Spherocylinder.
    * @return - The circumference of the Spherocylinder.
    */
   public double circumference() {
      return 2 * Math.PI * radius;
   }
   
   /**
    * Calculates the surface area of the Spherocylinder.
    * @return - The surface area of the Spherocylinder.
    */
   public double surfaceArea() {
      return 2 * Math.PI * radius * (2 * radius + cylinderHeight);
   }
   
   /**
    * Calculates the volume of the Spherocylinder.
    * @return - The volume of the Spherocylinder.
    */
   public double volume() {
      return Math.PI * Math.pow(radius, 2) * (4 * radius / 3 + cylinderHeight);
   }
   
   /**
    * All the information about the Spherocylinder.
    * @return - The information of the Spherocylinder as a String.
    */
   public String toString() {
      DecimalFormat dFormat = new DecimalFormat("#,##0.0##");
      return "Spherocylinder \"" + label + "\" with radius " 
         + dFormat.format(radius) + " and cylinder height " 
         + dFormat.format(cylinderHeight) + " has:\n\tcircumference = " 
         + dFormat.format(circumference()) + " units\n\t"
         + "surface area = " + dFormat.format(surfaceArea()) 
         + " square units\n\t"
         + "volume = " + dFormat.format(volume()) + " cubic units";
   }
   
   /**
    * Gets the count of spherocylinders.
    * @return - The number of spherocylinders.
    */
   public static int getCount() {
      return numberSpherocylinders;
   }
   
   /**
    * Resets the number of spherocylinders to 0.
    */
   public static void resetCount() {
      numberSpherocylinders = 0;
   }
   
   /**
    * Checks if an object is a Spherocylinder, 
    * and if it is the same spherocylinder. 
    * @param object - The object being compared to the Spherocylinder.
    * @return - Whether or not the object is the same.
    */
   public boolean equals(Object object) {
      if (!(object instanceof Spherocylinder)) {
         return false;
      }
      else {
         Spherocylinder d = (Spherocylinder) object;
         return (label.equalsIgnoreCase(d.getLabel())
                  && Math.abs(radius - d.getRadius()) < .000001
                  && Math.abs(cylinderHeight - d.getCylinderHeight())
                        < .000001);
      }
   }
   
   /**
    * Hashcode for the equals method.
    * @return - 0
    */
   public int hashCode() {
      return 0;
   }
   
   /**
    * Compares the spherocylinder's volume to another spherocylinder's volume.
    * @param obj - The spherocylinder to be compared.
    * @return - 0: Equal Volumes. 1: Original is greater. -1: New is greater.
    */
   public int compareTo(Spherocylinder obj) {
      if (Math.abs(this.volume() - obj.volume()) < .000001) {
         return 0;
      }
      else if (this.volume() > obj.volume()) {
         return 1;
      }
      else {
         return -1;
      }
   }
   
     
}