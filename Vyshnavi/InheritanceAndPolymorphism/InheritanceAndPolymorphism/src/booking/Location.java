/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package booking;

/**
 *
 * @author vyshnavi srilaxmi Thannir
 */
public class Location {
 
     private String name;
    private int longitude;
     private int latitude;

    /**
     *public variable
     */
    public static double SCALETOMILES=6.8;

    /**
     *constructor for location class
     * @param name
     * @param longitude
     * @param latitude
     */
    public Location(String name, int longitude, int latitude) {
        this.name = name;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    /**
     *getter method for name
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *getter method for loggitute
     * @return
     */
    public int getLongitude() {
        return longitude;
    }

    /**
     *getmethod latitude
     * @return
     */
    public int getLatitude() {
        return latitude;
    }

    /**
     *getter method set name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *setter method for logitude
     * @param longitude
     */
    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }

    /**
     *setter method for latitude
     * @param latitude
     */
    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }


    
}
