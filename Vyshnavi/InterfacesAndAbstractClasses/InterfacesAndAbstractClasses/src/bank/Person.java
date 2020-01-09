/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

/**
 *
 * @author Vyshnavi srilaxmi Thannir
 */
public class Person {
    private String fName, lName, dob, idProof;
    private Address address;
    private String phoneNumber, email;

    /**
     *constructor
     * @param fName
     * @param lName
     * @param dob
     * @param idProof
     * @param address
     * @param phoneNumber
     * @param email
     */
    public Person(String fName, String lName, String dob, String idProof, Address address, String phoneNumber, String email) {
        this.fName = fName;
        this.lName = lName;
        this.dob = dob;
        this.idProof = idProof;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    /**
     *getter method
     * @return
     */
    public String getfName()
    {
        return fName;
    }

    /**
     *getter method
     * @return
     */
    public String getlName() 
    {
        return lName;
    }

    /**
     *getter method
     * @return
     */
    public String getDob() 
    {
        return dob;
    }

    /**
     *getter method
     * @return
     */
    public String getIdProof()
    {
        return idProof;
    }

    /**
     *getter method get phonenumber
     * @return
     */
    public String getFormattedPhoneNumber() 
    {
       // char[] p = new char[15];
       // p = this.phoneNumber.toCharArray();

        return "+1(" + phoneNumber.substring(0, 3) + ")" 
                + phoneNumber.substring(3, 6) + "-"
                + phoneNumber.substring(6);
    }

    /**
     *metjod for email
     * @return
     */
    public String getEmail() 
    {
        return email;
    }

    @Override
    public String toString() 
    {
        return "Account Holder Name: " 
                + getlName() + ", " + getfName()
                + "\nAddress: " + address.toString() + "\nPhone Number: " 
                + getFormattedPhoneNumber() + ", Email: " + getEmail();
    }

}
