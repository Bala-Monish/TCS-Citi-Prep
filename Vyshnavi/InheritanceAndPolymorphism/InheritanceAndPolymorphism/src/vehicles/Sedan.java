/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicles;

import enums.Seats;

/**
 *
 * @author Vyshnavi Srilaxmi Thannir
 */
public class Sedan extends Car {
   private double trunkSpace; 

    /**
     *controctor for class sedan
     */
    public Sedan() {
    }

    /**
     *controctor for class sedan with variables
     * @param trunkSpace
     * @param seatType
     * @param classification
     * @param vin
     * @param manufacturer
     * @param model
     * @param series
     * @param transmission
     * @param mileage
     */
    public Sedan(double trunkSpace, Seats seatType, String classification, String vin, String manufacturer, String model, String series, String transmission, double mileage) 
    {
        super(seatType, classification, vin, manufacturer, model, series, transmission, mileage);
        this.trunkSpace = trunkSpace;
    }

    /**
     *getter method for trunk space
     * @return
     */
    public double getTrunkSpace() {
        return trunkSpace;
    }

    /**
     *setter method for trunk space
     * @param trunkSpace
     */
    public void setTrunkSpace(double trunkSpace) {
        this.trunkSpace = trunkSpace;
    }
   
}
