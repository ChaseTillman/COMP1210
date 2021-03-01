import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
/**
 * Tests the methods for the SpherocylinderList Class.
 *
 * Project_08
 *
 * @author Chase Tillman - COMP 1210 - 010
 * @version 10/30/2020
 */
public class SpherocylinderListTest {
   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   /**
    * Test the get name method.
    */
   @Test public void getNameTest() {
      Spherocylinder testOne = new Spherocylinder("Ex1", 2.0, 1.0);
      Spherocylinder testTwo = new Spherocylinder("Ex2", 4.0, 1.0);
      Spherocylinder[] spheroArray = {testOne, testTwo};
      SpherocylinderList spheroList = new SpherocylinderList("Test", 
         spheroArray, 2);
      Assert.assertEquals(spheroList.getName(), "Test");
   }
   
   /**
    * Test the number of spherocylinders method.
    */
   @Test public void numberOfSpherocylindersTest1() {
      Spherocylinder testOne = new Spherocylinder("Ex1", 2.0, 1.0);
      Spherocylinder testTwo = new Spherocylinder("Ex2", 4.0, 1.0);
      Spherocylinder[] spheroArray = {testOne, testTwo};
      SpherocylinderList spheroList = new SpherocylinderList("Test", 
         spheroArray, 2);
      Assert.assertEquals(spheroList.numberOfSpherocylinders(), 2);
   }
   
  /**
    * Test the number of spherocylinders method when there are 0.
    */
   @Test public void numberOfSpherocylindersTest2() {
      Spherocylinder[] spheroArray = null;
      SpherocylinderList spheroList = new SpherocylinderList("Test", 
         spheroArray, 0);
      Assert.assertEquals(spheroList.numberOfSpherocylinders(), 0);
   }
   
   /**
    * Compares the expected value to the method value for total
    * surface area.
    */
   @Test public void totalSurfaceAreaTest1() {
      Spherocylinder testOne = new Spherocylinder("Ex1", 2.0, 1.0);
      Spherocylinder testTwo = new Spherocylinder("Ex2", 4.0, 1.0);
      Spherocylinder[] spheroArray = {testOne, testTwo};
      SpherocylinderList spheroList = new SpherocylinderList("Test", 
         spheroArray, 2);
      Assert.assertEquals(spheroList.totalSurfaceArea(), 
         289.02652413026095, 0.0000001);
   }
   
   /**
    * Compares the expected value to the method value for total
    * surface area when there are 0 spherocylinders.
    */
   @Test public void totalSurfaceAreaTest2() {
      Spherocylinder[] spheroArray = null;
      SpherocylinderList spheroList = new SpherocylinderList("Test", 
         spheroArray, 0);
      Assert.assertEquals(spheroList.totalSurfaceArea(), 0, 0.0000001);
   }
   
   /**
    * Compares the expected value to the method value for total
    * volume.
    */
   @Test public void totalVolumeTest1() {
      Spherocylinder testOne = new Spherocylinder("Ex1", 2.0, 1.0);
      Spherocylinder testTwo = new Spherocylinder("Ex2", 4.0, 1.0);
      Spherocylinder[] spheroArray = {testOne, testTwo};
      SpherocylinderList spheroList = new SpherocylinderList("Test", 
         spheroArray, 2);
      Assert.assertEquals(spheroList.totalVolume(), 
         364.42474781641596, 0.0000001);
   }
   
   /**
    * Compares the expected value to the method value for total
    * volume when there are 0 spherocylinders.
    */
   @Test public void totalVolumeTest2() {
      Spherocylinder[] spheroArray = null;
      SpherocylinderList spheroList = new SpherocylinderList("Test", 
         spheroArray, 0);
      Assert.assertEquals(spheroList.totalVolume(), 0, 0.0000001);
   }
   
   /**
    * Compares the expected value to the method value for average
    * surface area.
    */
   @Test public void averageSurfaceAreaTest1() {
      Spherocylinder testOne = new Spherocylinder("Ex1", 2.0, 1.0);
      Spherocylinder testTwo = new Spherocylinder("Ex2", 4.0, 1.0);
      Spherocylinder[] spheroArray = {testOne, testTwo};
      SpherocylinderList spheroList = new SpherocylinderList("Test", 
         spheroArray, 2);
      Assert.assertEquals(spheroList.averageSurfaceArea(), 
         144.51326206513048, 0.0000001);
   }
   
   /**
    * Compares the expected value to the method value for average
    * surface area when there are 0 spherocylinders.
    */
   @Test public void averageSurfaceAreaTest2() {
      Spherocylinder[] spheroArray = null;
      SpherocylinderList spheroList = new SpherocylinderList("Test", 
         spheroArray, 0);
      Assert.assertEquals(spheroList.averageSurfaceArea(), 0, 0.0000001);
   }
   
   /**
    * Compares the expected value to the method value for average
    * volume.
    */
   @Test public void averageVolumeTest1() {
      Spherocylinder testOne = new Spherocylinder("Ex1", 2.0, 1.0);
      Spherocylinder testTwo = new Spherocylinder("Ex2", 4.0, 1.0);
      Spherocylinder[] spheroArray = {testOne, testTwo};
      SpherocylinderList spheroList = new SpherocylinderList("Test", 
         spheroArray, 2);
      Assert.assertEquals(spheroList.averageVolume(), 
         182.21237390820798, 0.0000001);
   }
   
   /**
    * Compares the expected value to the method value for average
    * volume when there are 0 spherocylinders.
    */
   @Test public void averageVolumeTest2() {
      Spherocylinder[] spheroArray = null;
      SpherocylinderList spheroList = new SpherocylinderList("Test", 
         spheroArray, 0);
      Assert.assertEquals(spheroList.averageVolume(), 0, 0.0000001);
   }
   
   /**
    * Tests the getList method.
    */
   @Test public void getListTest() {
      Spherocylinder testOne = new Spherocylinder("Ex1", 2.0, 1.0);
      Spherocylinder testTwo = new Spherocylinder("Ex2", 4.0, 1.0);
      Spherocylinder[] spheroArray = {testOne, testTwo};
      SpherocylinderList spheroList = new SpherocylinderList("Test", 
         spheroArray, 2);
      Assert.assertEquals(spheroList.getList(), spheroArray);
   }
   
   /**
    * Tests the findSpherocylinder method when it actually finds
    * the spherocylinder.
    */
   @Test public void findSpherocylinderTest1() {
      Spherocylinder testOne = new Spherocylinder("Ex1", 2.0, 1.0);
      Spherocylinder testTwo = new Spherocylinder("Ex2", 4.0, 1.0);
      Spherocylinder[] spheroArray = {testOne, testTwo};
      SpherocylinderList spheroList = new SpherocylinderList("Test", 
         spheroArray, 2);
      Assert.assertEquals(spheroList.findSpherocylinder("ex1   "), 
         testOne);
   }
   
   /**
    * Tests the findSpherocylinder method when spherocylinder
    * with the label doesn't exist.
    */
   @Test public void findSpherocylinderTest2() {
      Spherocylinder testOne = new Spherocylinder("Ex1", 2.0, 1.0);
      Spherocylinder testTwo = new Spherocylinder("Ex2", 4.0, 1.0);
      Spherocylinder[] spheroArray = {testOne, testTwo};
      SpherocylinderList spheroList = new SpherocylinderList("Test", 
         spheroArray, 2);
      Assert.assertEquals(spheroList.findSpherocylinder("ex5   "), null);
   }
   
   /** 
    * Tests the addSpherocylinder method.
    */
   @Test public void addSpherocylinderTest() {
      Spherocylinder testOne = new Spherocylinder("Ex1", 2.0, 1.0);
      Spherocylinder testTwo = new Spherocylinder("Ex2", 4.0, 1.0);
      Spherocylinder[] spheroArray = {testOne, testTwo};
      SpherocylinderList spheroList = new SpherocylinderList("Test", 
         spheroArray, 2);
      spheroList.addSpherocylinder("ex3", 1.0, 1.0);
      Assert.assertEquals(spheroList.numberOfSpherocylinders(), 3);
   }
   
   /**
    * Tests the deleteSpherocylinder method.
    */
   @Test public void deleteSpherocylinder1() {
      Spherocylinder testOne = new Spherocylinder("Ex1", 2.0, 1.0);
      Spherocylinder testTwo = new Spherocylinder("Ex2", 4.0, 1.0);
      Spherocylinder[] spheroArray = {testOne, testTwo};
      SpherocylinderList spheroList = new SpherocylinderList("Test", 
         spheroArray, 2);
      Assert.assertEquals(spheroList.deleteSpherocylinder("ex1"), testOne);
   }
   
   /**
    * Tests the deleteSpherocylinder method.
    */
   @Test public void deleteSpherocylinderTest2() {
      Spherocylinder testOne = new Spherocylinder("Ex1", 2.0, 1.0);
      Spherocylinder testTwo = new Spherocylinder("Ex2", 4.0, 1.0);
      Spherocylinder[] spheroArray = {testOne, testTwo};
      SpherocylinderList spheroList = new SpherocylinderList("Test", 
         spheroArray, 2);
      Assert.assertEquals(spheroList.deleteSpherocylinder("ex125"), 
         null);
   }
   
   /**
    * Tests the editSpherocylinder method.
    */
   @Test public void editSpherocylinderTest1() {
      Spherocylinder testOne = new Spherocylinder("Ex1", 2.0, 1.0);
      Spherocylinder testTwo = new Spherocylinder("Ex2", 4.0, 1.0);
      Spherocylinder testThree = new Spherocylinder("Ex1", 5.0, 4.0);
      Spherocylinder[] spheroArray = {testOne, testTwo};
      SpherocylinderList spheroList = new SpherocylinderList("Test", 
         spheroArray, 2);
      spheroList.editSpherocylinder("ex1", 5.0, 4.0);
      Assert.assertEquals(spheroList.findSpherocylinder("ex1"), testThree);
   }
   
   /**
    * Tests the editSpherocylinder method.
    */
   @Test public void editSpherocylinderTest2() {
      Spherocylinder testOne = new Spherocylinder("Ex1", 2.0, 1.0);
      Spherocylinder testTwo = new Spherocylinder("Ex2", 4.0, 1.0);
      Spherocylinder testThree = new Spherocylinder("Ex1", 5.0, 4.0);
      Spherocylinder[] spheroArray = {testOne, testTwo};
      SpherocylinderList spheroList = new SpherocylinderList("Test", 
         spheroArray, 2);
      Assert.assertTrue(!(spheroList.editSpherocylinder("ex3241", 5.0, 4.0)));
   }
   
   /**
    * Tests the findSpherocylinder method.
    */
   @Test public void findSpherocylinderWithLargestVolumeTest1() {
      Spherocylinder testOne = new Spherocylinder("Ex1", 2.0, 1.0);
      Spherocylinder testTwo = new Spherocylinder("Ex2", 4.0, 1.0);
      Spherocylinder[] spheroArray = {testOne, testTwo};
      SpherocylinderList spheroList = new SpherocylinderList("Test", 
         spheroArray, 2);
      Assert.assertEquals(spheroList.findSpherocylinderWithLargestVolume(), 
         testTwo);
   }
   
   /**
    * Tests the findSpherocylinder method.
    */
   @Test public void findSpherocylinderWithLargestVolumeTest2() {
      Spherocylinder[] spheroArray = null;
      SpherocylinderList spheroList = new SpherocylinderList("Test", 
         spheroArray, 0);
      Assert.assertEquals(spheroList.findSpherocylinderWithLargestVolume(), 
         null);
   }
   
   /**
    * Tests the findSpherocylinder method.
    */
   @Test public void findSpherocylinderWithLargestVolumeTest3() {
      Spherocylinder testOne = new Spherocylinder("Ex1", 10.0, 1.0);
      Spherocylinder testTwo = new Spherocylinder("Ex2", 4.0, 1.0);
      Spherocylinder[] spheroArray = {testOne, testTwo};
      SpherocylinderList spheroList = new SpherocylinderList("Test", 
         spheroArray, 2);
      Assert.assertEquals(spheroList.findSpherocylinderWithLargestVolume(), 
         testOne);
   }
   
   /**
    * Tests that the to string contains the properly formatted
    * average volume.
    */
   @Test public void toStringTest() {
      Spherocylinder testOne = new Spherocylinder("Ex1", 2.0, 1.0);
      Spherocylinder testTwo = new Spherocylinder("Ex2", 4.0, 1.0);
      Spherocylinder testThree = new Spherocylinder("Ex1", 5.0, 4.0);
      Spherocylinder[] spheroArray = {testOne, testTwo};
      SpherocylinderList spheroList = new SpherocylinderList("Test", 
         spheroArray, 2);
      Assert.assertTrue(spheroList.toString().contains("Average Volume: " 
         + 182.212));
   }

}
