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
public class Car extends Vehicle{
  
    private Seats seatType;
    private String classification;

    /**
     *contructor for car
     */
    public Car() {
    }

    /**
     *controctor class with all variales
     * @param seatType
     * @param classification
     * @param vin
     * @param manufacturer
     * @param model
     * @param series
     * @param transmission
     * @param mileage
     */
    public Car(Seats seatType, String classification, String vin, String manufacturer, String model, String series, String transmission, double mileage) {
        super(vin, manufacturer, model, series, transmission, mileage);
        this.seatType = seatType;
        this.classification = classification;
    }

    /**
     *getter method for seat type
     * @return
     */
    public Seats getSeatType() {
        return seatType;
    }

    /**
     *setter method for seat type
     * @param seatType
     */
    public void setSeatType(Seats seatType) {
        this.seatType = seatType;
    }

    /**
     *getter method for classification of class
     * @return
     */
    public String getClassification() {
        return classification;
    }

    /**
     *setter method for classification of class
     * @param classification
     */
    public void setClassification(String classification) {
        this.classification = classification;
    }
  
   
   
}
