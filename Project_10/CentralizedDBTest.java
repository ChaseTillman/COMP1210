import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
/**
 * JUnit test for the CentralizedDB class.
 * 
 * Project_09
 *
 * @author Chase Tillman - COMP 1210 - 010
 * @version 11/6/2020
 */

public class CentralizedDBTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /**
    * Compares the getName to the initialized value.
    */
   @Test public void getNameTest() {
      CentralizedDB db1 = new CentralizedDB("DB", 100, 5, 10);
      Assert.assertEquals(db1.getName(), "DB");
   }
   
   /**
    * Compares the getName to the set value.
    */
   @Test public void setNameTest() {
      CentralizedDB db1 = new CentralizedDB("DB", 100, 5, 10);
      db1.setName("DB1");
      Assert.assertEquals(db1.getName(), "DB1");
   }
   
   /**
    * Compares the getBaseCost to the initialized value.
    */
   @Test public void getBaseCostTest() {
      CentralizedDB db1 = new CentralizedDB("DB", 100, 5, 10);
      Assert.assertEquals(db1.getBaseCost(), 100., 0.000001);
   }
   
   /**
    * Compares the getBaseCost to the set value.
    */
   @Test public void setBaseCostTest() {
      CentralizedDB db1 = new CentralizedDB("DB", 100, 5, 10);
      db1.setBaseCost(200);
      Assert.assertEquals(db1.getBaseCost(), 200., 0.000001);
   }
   
   /**
    * Compares the getDbStorage to the initialized value.
    */
   @Test public void getDbStorageTest() {
      CentralizedDB db1 = new CentralizedDB("DB", 100, 5, 10);
      Assert.assertEquals(db1.getDbStorage(), 5., 0.000001);
   }
   
   /**
    * Compares the getDbStorage to the set value.
    */
   @Test public void setDbStorageTest() {
      CentralizedDB db1 = new CentralizedDB("DB", 100, 5, 10);
      db1.setDbStorage(10);
      Assert.assertEquals(db1.getDbStorage(), 10., 0.000001);
   }
   
   /**
    * Compares the getLicense to the initialized value.
    */
   @Test public void getLicenseTest() {
      CentralizedDB db1 = new CentralizedDB("DB", 100, 5, 10);
      Assert.assertEquals(db1.getLicense(), 10., 0.000001);
   }
   
   /**
    * Compares the getLicense to the set value.
    */
   @Test public void setLicenseTest() {
      CentralizedDB db1 = new CentralizedDB("DB", 100, 5, 10);
      db1.setLicense(20.);
      Assert.assertEquals(db1.getLicense(), 20., 0.000001);
   }
   
   /**
    * Compares the monthlyCost to the calculated value.
    */
   @Test public void monthlyCostTest() {
      CentralizedDB db1 = new CentralizedDB("DB", 1200, 5, 1500);
      Assert.assertEquals(db1.monthlyCost(), 2700., 0.000001);
   }
   
   /**
    * Checks that the toString contains the License cost.
    */
   @Test public void toStringTest() {
      CentralizedDB db1 = new CentralizedDB("DB", 1200, 5, 1500);
      Assert.assertTrue(db1.toString().contains("License: $1,500.00"));
   }
   
   /**
    * Compares the getCount to the expected value.
    */
   @Test public void getCountTest() {
      Assert.assertEquals(CentralizedDB.getCount(), 10);
   }
   
   /**
    * Compares the getCount to the expected reset value of 0.
    */
   @Test public void resetCountTest() {
      CentralizedDB.resetCount();
      Assert.assertEquals(CentralizedDB.getCount(), 0);
   }

}
