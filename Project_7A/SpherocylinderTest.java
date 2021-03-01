import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
/**
 * A series of tests for each method of the Spherocylinder class.
 * 
 * Project_7A
 * 
 * @author Chase Tillman - COMP 1210 - 010
 * @version 10/16/2020
 */

public class SpherocylinderTest {
   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
      
   }
   
   /**
    * Compares the expected value of "Ex 1" to the 
    * returned value of the getLabel method.
    */
   @Test public void getLabelTest() {
      Spherocylinder exampleOne = new Spherocylinder("  Ex 1   ", 3.0, 1.0);
      Assert.assertTrue(exampleOne.getLabel().equals("Ex 1"));
   }
   
   /**
    * Checks that when setting label to a null, the setLabel method
    * returns false.
    */
   @Test public void setLabelTest() {
      Spherocylinder exampleOne = new Spherocylinder("  Ex 1   ", 3.0, 1.0);
      Assert.assertTrue(!(exampleOne.setLabel(null)));
      Assert.assertTrue(exampleOne.setLabel("Ex 3"));
   }
   
   /**
    * Gets the radius and compares it to the expected value of 3.0.
    */
   @Test public void getRadiusTest() {
      Spherocylinder exampleOne = new Spherocylinder("  Ex 1   ", 3.0, 1.0);
      Assert.assertEquals(" ", 3.0, exampleOne.getRadius(), 0.0000001);
   }
   
   /**
    * Attempts to set the radius to a negative value.
    * Checks that the setRadius method returns false.
    */
   @Test public void setRadiusTest() {
      Spherocylinder exampleOne = new Spherocylinder("  Ex 1   ", 3.0, 1.0);
      Assert.assertTrue(!(exampleOne.setRadius(-3.4)));
      Assert.assertTrue(exampleOne.setRadius(3.4));
   }
   
   /**
    * Gets the cylinder height and compares it to the expected value of 1.0.
    */
   @Test public void getCylinderHeightTest() {
      Spherocylinder exampleOne = new Spherocylinder("  Ex 1   ", 3.0, 1.0);
      Assert.assertEquals(" ", 1.0, exampleOne.getCylinderHeight(), 0.0000001);
   }

   /**
    * Attempts to set the height to a negative value.
    * Checks that the setCylinderHeight method returns false.
    */
   @Test public void setCylinderHeightTest() {
      Spherocylinder exampleOne = new Spherocylinder("  Ex 1   ", 3.0, 1.0);
      Assert.assertTrue(!(exampleOne.setCylinderHeight(-4.9)));
      Assert.assertTrue(exampleOne.setCylinderHeight(4.9));
   }
   
   /**
    * Compares the circumference to the expected value.
    */
   @Test public void circumferenceTest() {
      Spherocylinder exampleOne = new Spherocylinder("  Ex 1   ", 3.0, 1.0);
      Assert.assertEquals(" ", 18.849556, 
         exampleOne.circumference(), 0.0000001);
   }
   
   /**
    * Compares the surface area to the expected value.
    */
   @Test public void surfaceAreaTest() {
      Spherocylinder exampleOne = new Spherocylinder("  Ex 1   ", 3.0, 1.0);
      Assert.assertEquals(" ", 131.9468915, 
         exampleOne.surfaceArea(), 0.0000001);
   }
   
   /**
    * Compares the volume to the expected value.
    */
   @Test public void volumeTest() {
      Spherocylinder exampleOne = new Spherocylinder("  Ex 1   ", 3.0, 1.0);
      Assert.assertEquals(" ", 141.3716694, 
         exampleOne.volume(), 0.0000001);
   }
   
   /**
    * Tests the toString method to ensure it contains the concatenated label.
    */
   @Test public void toStringTest() {
      Spherocylinder exampleOne = new Spherocylinder("  Ex 1   ", 3.0, 1.0);
      Assert.assertTrue(exampleOne.toString().contains("\"Ex 1\""));
   }
   
   /**
    * Checks that the count is zero after it has been reset.
    */
   @Test public void resetCountTest() {
      Spherocylinder.resetCount();
      Assert.assertEquals(0, Spherocylinder.getCount());
   }
   
   /**
    * Checks that the count is three after three instances have been created.
    */
   @Test public void getCountTest() {
      Spherocylinder.resetCount();
      Spherocylinder exampleOne = new Spherocylinder("  Ex 1   ", 3.0, 1.0);
      Spherocylinder exampleTwo = new Spherocylinder("  Ex 1   ", 3.0, 1.0);
      Spherocylinder exampleThree = new Spherocylinder("  Ex 1   ", 3.0, 1.0);
      Assert.assertEquals(3, Spherocylinder.getCount());
   }
   
   /**
    * Checks that the equals method returns false 
    * when object is a different spherocylinder.
    */
   @Test public void equalsTest() {
      Spherocylinder exampleOne = new Spherocylinder("  Ex 1   ", 3.0, 1.0);
      Spherocylinder exampleTwo = new Spherocylinder("  Ex 1   ", 3.0, 1.0);
      Spherocylinder exampleThree = new Spherocylinder("  Ex 1   ", 3.0, 5.0);
      String testObject = "";
      Assert.assertTrue(exampleOne.equals(exampleTwo));
      Assert.assertTrue(!(exampleOne.equals(testObject)));
      Assert.assertTrue(!(exampleOne.equals(exampleThree)));
   }
   
   /**
    * Checks that the hash code works.
    */
   @Test public void hashCodeTest() {
      Spherocylinder exampleOne = new Spherocylinder("  Ex 1   ", 3.0, 1.0);
      Assert.assertEquals(0, ewxampleOne.hashCode());
   }
   
}
