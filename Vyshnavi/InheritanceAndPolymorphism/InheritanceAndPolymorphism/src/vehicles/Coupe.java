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
public class Coupe extends Car {
   private boolean convertable;

    /**
     *constructor
     */
    public Coupe() {
    }

    /**
     *constroctur with all the variales
     * @param convertable
     * @param seatType
     * @param classification
     * @param vin
     * @param manufacturer
     * @param model
     * @param series
     * @param transmission
     * @param mileage
     */
    public Coupe(boolean convertable, Seats seatType, String classification, String vin, String manufacturer, String model, String series, String transmission, double mileage) 
    {
        super(seatType, classification, vin, manufacturer, model, series, transmission, mileage);
        this.convertable = convertable;
    }

    /**
     *method for convertable
     * @return
     */
    public boolean isConvertable() {
        return convertable;
    }

    /**
     *
     * @param convertable
     */
    public void setConvertable(boolean convertable) {
        this.convertable = convertable;
    }
   
    /**
     *method to calculate power loss
     * @param rpm
     * @param torque
     * @return
     */
    public double calculatePowerLoss(int rpm,double torque){
        
        double total = 0;
        if(convertable){
            total = super.calculatePowerLoss(rpm, torque);
            return total+((super.calculateHorsePower(rpm, torque)*Vehicle.HORSEPOWERINWATTS*2.6)/(100*1000.0));
        }
        else
            return super.calculatePowerLoss(rpm, torque);
    }
    
}
