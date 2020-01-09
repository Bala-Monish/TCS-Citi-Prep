/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package booking;

/**
 *
 * @author vyshnavi srilaxmi thannir
 */
public class Customer {
   
    private String firstName;
    private String lastName;
     private String licenceID;
     private int age;

    /**
     *constructor for customer class
     * @param firstName
     * @param lastName
     * @param licenceID
     * @param age
     */
    public Customer(String firstName, String lastName, String licenceID, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.licenceID = licenceID;
        this.age = age;
    }
     
    /**
     *getter method get name
     * @return
     */
    public String getName(){
         return firstName+ " "+ lastName;
     }

    /**
     *getter method of age less than 25
     * @return
     */
    public boolean isYoungRenter(){
        return age<25;
     }

    @Override
    public String toString() {
        return "Name: " + getName() + "\nLicence ID: " + licenceID + "\nAge: " + age ;
        
    }
     
}
