/**
 * Customer class stores a customer with a name, location, and a balance.
 *
 * Activity_7B
 *
 * @author Chase Tillman - COMP 1210 - 010
 * @version 10/20/2020
 */
public class Customer implements Comparable<Customer> {
   private String name = "", location = "";
   private double balance = 0;
   
   /**
    * Creates an instance of the Customer class with a name, blank location, \
    * and 0 balance.
    * @param nameIn - The name of the customer - Last Name, First Name.
    */
   public Customer(String nameIn) {
      name = nameIn;
      location = "";
      balance = 0;
   }
   
   /**
    * Sets the customer's location.
    * @param locationIn - The location of the customer.
    */
   public void setLocation(String locationIn) {
      location = locationIn;
   }
   
   /** 
    * Changes the customer's balance.
    * @param amount - The amount to add to the balance.
    */
   public void changeBalance(double amount) {
      balance += amount;
   }
   
   /**
    * Gets the customer's location.
    * @return - The customer's location.
    */
   public String getLocation() {
      return location;
   }
   
   /**
    * Gets the customer's balance.
    * @return - The customer's balance.
    */
   public double getBalance() {
      return balance;
   }
   
   /**
    * Sets the customer's location.
    * @param city - The customer's city.
    * @param state - The customer's state.
    */
   public void setLocation(String city, String state) {
      location = city + ", " + state;
   }
   
   /**
    * Compares the customer's balance with another customer's balance.
    * @param obj - The customer to be compared.
    * @return - 0: Same balance. -1: The second customer is greater
    * 1: The original customer is greater.
    */
   public int compareTo(Customer obj) {
      if (Math.abs(this.balance - obj.getBalance()) < 0.000001) {
         return 0;
      }
      else if (this.balance < obj.getBalance()) {
         return -1;
      }
      else {
         return 1;
      }
   }
   
   /**
    * Makes a string of the customer's information.
    * @return - The customer's information.
    */
   public String toString() {
      return name + "\n" + getLocation() + "\n$" + getBalance();
   }
}