/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import booking.Location;

/**
 *
 * @author Vyshnavi srilaxmi Thannir
 */
public class BookingUtility {

    /**
     *constructor for booking utility
     */
    public BookingUtility() {
    }
    
    /**
     *getter method for distance in miles
     * @param src
     * @param dest
     * @return
     */
    public static double getDistanceInMiles(Location src, Location dest){
        double dist = 0;
        dist = Math.sqrt((Math.pow((src.getLatitude()-dest.getLatitude()), 2)
                   +Math.pow((src.getLongitude()-dest.getLongitude()), 2)));
        return dist*Location.SCALETOMILES;
    }
    
    /**
     *method for minimum number of days
     * @param src
     * @param dest
     * @param roundTrip
     * @return
     */
    public static int minimumNumberOfDays(Location src, Location dest, boolean roundTrip){
       double distance = 0;
        distance = Math.sqrt((Math.pow((src.getLatitude()-dest.getLatitude()), 2)
                +Math.pow((src.getLongitude()-dest.getLongitude()), 2)));
        if(roundTrip){
            return (int)Math.ceil(distance/(60.0*14.0))*2;
        }
        else
            return (int)Math.ceil(distance/(60.0*14.0));
    } 
}
