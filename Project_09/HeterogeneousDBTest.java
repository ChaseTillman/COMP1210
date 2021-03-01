import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
/**
 * JUnit test for the HeterogeneousDB class.
 * 
 * Project_09
 *
 * @author Chase Tillman - COMP 1210 - 010
 * @version 11/6/2020
 */

public class HeterogeneousDBTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /**
     * Tests the getName method inherited from DB class.
     */
   @Test public void getNameTest() {
      HeterogeneousDB db1 = new HeterogeneousDB("DB", 100, 5, 10, 12.);
      Assert.assertEquals(db1.getName(), "DB");
   }
   
    /**
     * Tests the setName method inherited from DB class.
     */
   @Test public void setNameTest() {
      HeterogeneousDB db1 = new HeterogeneousDB("DB", 100, 5, 10, 12.);
      db1.setName("DB1");
      Assert.assertEquals(db1.getName(), "DB1");
   }
   
    /**
     * Tests the getBaseCost method inherited from DB class.
     */
   @Test public void getBaseCostTest() {
      HeterogeneousDB db1 = new HeterogeneousDB("DB", 100, 5, 10, 12.);
      Assert.assertEquals(db1.getBaseCost(), 100., 0.000001);
   }
   
    /**
     * Tests the setBaseCost method inherited from DB class.
     */
   @Test public void setBaseCostTest() {
      HeterogeneousDB db1 = new HeterogeneousDB("DB", 100, 5, 10, 12.);
      db1.setBaseCost(200);
      Assert.assertEquals(db1.getBaseCost(), 200., 0.000001);
   }
   
    /**
     * Tests the getDbStorage method inherited from DB class.
     */
   @Test public void getDbStorageTest() {
      HeterogeneousDB db1 = new HeterogeneousDB("DB", 100, 5, 10, 12.);
      Assert.assertEquals(db1.getDbStorage(), 5., 0.000001);
   }
   
    /**
     * Tests the setDbStorage method inherited from DB class.
     */
   @Test public void setDbStorageTest() {
      HeterogeneousDB db1 = new HeterogeneousDB("DB", 100, 5, 10, 12.);
      db1.setDbStorage(10);
      Assert.assertEquals(db1.getDbStorage(), 10., 0.000001);
   }
   
   /**
    * Tests the getNumberOfUsers method by comparing to the initialized
    * number of users.
    */
   @Test public void getNumberOfUsersTest() {
      HeterogeneousDB db1 = new HeterogeneousDB("DB", 100, 5, 10, 12.);
      Assert.assertEquals(db1.getNumberOfUsers(), 10);
   }
   
   /**
    * Tests the getNumberOfUsers method by comparing to the set
    * number of users.
    */
   @Test public void setNumberOfUsersTest() {
      HeterogeneousDB db1 = new HeterogeneousDB("DB", 100, 5, 10, 12.);
      db1.setNumberOfUsers(20);
      Assert.assertEquals(db1.getNumberOfUsers(), 20);
   }
   
   /**
    * Tests the monthly cost by comparing the method to the expected value.
    */
   @Test public void monthlyCostTest() {
      HeterogeneousDB db1 = new HeterogeneousDB("DB", 2000.0, 7.5, 100, 12.0);
      Assert.assertEquals(db1.monthlyCost(), 3560., 0.000001);
   }
   
   /**
    * Checks that the toString contains the Users.
    */
   @Test public void toStringTest() {
      HeterogeneousDB db1 = new HeterogeneousDB("DB", 1200, 5, 1500, 12.);
      Assert.assertTrue(db1.toString().contains("Users: 1500"));
   }
   
   /**
    * Compares the getCostFactor to the actual cost factor.
    */
   @Test public void getCostFactorTest() {
      HeterogeneousDB db1 = new HeterogeneousDB("DB", 1200, 5, 1500, 12.);
      Assert.assertEquals(db1.getCostFactor(), 1.3, 0.000001);
   }
   
   /**
    * Compares the getCostPerUser to the initialized value.
    */
   @Test public void getCostPerUserTest() {
      HeterogeneousDB db1 = new HeterogeneousDB("DB", 1200, 5, 1500, 12.);
      Assert.assertEquals(db1.getCostPerUser(), 12.0, 0.000001);
   }
   
   /**
    * Compares the costPerUser to the set value.
    */
   @Test public void setCostPerUserTest() {
      HeterogeneousDB db1 = new HeterogeneousDB("DB", 1200, 5, 1500, 12.);
      db1.setCostPerUser(15);
      Assert.assertEquals(db1.getCostPerUser(), 15.0, 0.000001);
   }
   
   /**
    * Compares the userCost value to the expected value.
    */
   @Test public void userCostTest() {
      HeterogeneousDB db1 = new HeterogeneousDB("DB", 1200, 5, 1500, 12.);
      Assert.assertEquals(db1.userCost(), 18000.0, 0.000001);
   }
   
   /**
    * Tests the getCount method inherited from DB class.
    */
   @Test public void getCountTest() {
      Assert.assertEquals(HeterogeneousDB.getCount(), 14);
   }
   
   /**
    * Tests the resetCount method inherited from DB class.
    */
   @Test public void resetCountTest() {
      HeterogeneousDB.resetCount();
      Assert.assertEquals(HeterogeneousDB.getCount(), 0);
   }
}
