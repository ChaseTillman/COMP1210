import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
/**
 * JUnit test for the DB class.
 * 
 * Project_09
 *
 * @author Chase Tillman - COMP 1210 - 010
 * @version 11/6/2020
 */
public class DBTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /**
    * Compares the getCount to the expected value.
    */
   @Test public void getCountTest() {
      CentralizedDB db1 = new CentralizedDB("DB", 10, 5, 10);
      Assert.assertEquals(DB.getCount(), 1);
   } 
   
   /**
    * Compares the getCount to the reset value of 0.
    */
   @Test public void resetCountTest() {
      CentralizedDB db1 = new CentralizedDB("DB", 10, 5, 10);
      DB.resetCount();
      Assert.assertEquals(DB.getCount(), 0);
   }   
}
