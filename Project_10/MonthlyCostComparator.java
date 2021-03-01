import java.util.Comparator;
/**
 * Defines the natural order for the Databases to be sorted by monthly cost.
 *
 * Project_10
 *
 * @author Chase Tillman - COMP 1210 - 010
 * @version 11/13/2020
 */
public class MonthlyCostComparator implements Comparator<DB> {
   
   /**
    * Compares the monthly cost of two databases.
    * @param db1 - First database to compare.
    * @param db2 - Second database to compare.
    */
   @Override
   public int compare(DB db1, DB db2) {
      return Double.compare(db2.monthlyCost(), db1.monthlyCost());
   }
}