/**
 *
 *
 *
 *
 *
 *
 * @author Chase Tillman - COMP 1210 - 010
 * @version 9/1 /2020
 */
public class UserInfo {
   // instance variables
   private String firstName, lastName, location = "";
   private int age, status;
   private static final int OFFLINE = 0, ONLINE = 1;
   
   // constructors
   public UserInfo(String firstNameIn, String lastNameIn) {
      firstName = firstNameIn;
      lastName = lastNameIn;
      location = "Not specified";
      age = 0;
      status = OFFLINE;
   }
   // methods
   public String toString() {
      String output = "Name: " + firstName + " "
         + lastName + "\n";
      output += "Location: " + location + "\n";
      output += "Age: " + age + "\n";
      output += "Status: ";
      if (status == OFFLINE) {
         output += "Offline";
      }
      else {
         output += "Online";
      }
      return output;
   }
   
   public void setLocation(String locationIn) {
      location = locationIn;
   }
   
   public boolean setAge(int ageIn) {
      boolean isSet = false;
      if (ageIn > 0) {
         age = ageIn;
         isSet = true;
      }
      return isSet;
   }
   
   public int getAge() {
      return age;
   }
   
   public String getLocation() {
      return location;
   }
   
   public void logOff() {
      status = OFFLINE;
   }
   
   public void logOn() {
      status = ONLINE;
   }
   
    
}