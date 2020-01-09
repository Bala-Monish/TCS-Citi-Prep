/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

/**
 *
 * @author Vyshnavi Srilaxmi Thannir
 */
public class Address {

    private String street, city, state, zipCode;

    /**
     *
     * @param street
     * @param city
     * @param state
     * @param zipCode
     */
    public Address(String street, String city, String state, String zipCode) 
    {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    /**
     *
     * @return
     */
    public String getStreet() 
    {
        return street;
    }

    /**
     *
     * @return
     */
    public String getCity()
    {
        return city;
    }

    /**
     *
     * @return
     */
    public String getState()
    {
        return state;
    }

    /**
     *
     * @return
     */
    public String getZipCode() 
    {
        return zipCode;
    }

    @Override
    public String toString() 
    {
        return getStreet() + "\n" + getCity() 
                + ", " + getState() + "-" + getZipCode();
    }

}
