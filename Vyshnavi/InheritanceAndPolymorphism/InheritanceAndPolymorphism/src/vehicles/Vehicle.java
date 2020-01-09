/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicles;

/**
 *
 * @author Vyshnavi Srilaxmi Thannir
 */
public class Vehicle {
  
    private String vin;
    private String manufacturer;
    private String model;
    private String series;
    private String transmission;
    private double mileage;

    /**
     *static variable
     */
    public static final double HORSEPOWERINWATTS= 735.5;

    /**
     *static variable
     */
    public static final double TORQUE_CONSTANT=5252;

    /**
     *static variable
     */
    public Vehicle() {
       
    }

    /**
     *arugument constructor
     * @param vin
     * @param manufacturer
     * @param model
     * @param series
     * @param transmission
     * @param mileage
     */
    public Vehicle(String vin, String manufacturer, String model, String series, String transmission, double mileage) {
        this.vin = vin;
        this.manufacturer = manufacturer;
        this.model = model;
        this.series = series;
        this.transmission = transmission;
        this.mileage = mileage;
    }

    /**
     *getter method for get vin
     * @return
     */
    public String getVin() {
        return vin;
    }

    /**
     *set method for vin
     * @param vin
     */
    public void setVin(String vin) {
        this.vin = vin;
    }

    /**
     *getter method manufacture
     * @return
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**setter method for manufacture
     *
     * @param manufacturer
     */
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    /**
     *getter method for model
     * @return
     */
    public String getModel() {
        return model;
    }

    /**
     *setter method for model
     * @param model
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     *getter for series
     * @return
     */
    public String getSeries() {
        return series;
    }

    /**
     *settre menthod for series
     * @param series
     */
    public void setSeries(String series) {
        this.series = series;
    }

    /**
     *getter for the transsmision
     * @return
     */
    public String getTransmission() {
        return transmission;
    }

    /**
     *setter method for transmission
     * @param transmission
     */
    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    /**
     *getter method
     * @return
     */
    public double getMileage() {
        return mileage;
    }

    /**
     *setter method
     * @param mileage
     */
    public void setMileage(double mileage) {
        this.mileage = mileage;
    }
    
    /**
     *method to calculate horse power
     * @param rpmIn
     * @param torqueIn
     * @return
     */
    public double calculateHorsePower(int rpmIn,double torqueIn){
      return (rpmIn*torqueIn)/TORQUE_CONSTANT;
  }

    /**
     *method to calculate power loss
     * @param rpmIn
     * @param torqueIn
     * @return
     */
    public double calculatePowerLoss(int rpmIn,double torqueIn){
      return ((calculateHorsePower(rpmIn, torqueIn)*HORSEPOWERINWATTS)*4.2)/(100*1000.0);
  }
  
    @Override
  public String toString(){
      return "VIN: "+ vin +"\n"+"Manufacturer: "+ manufacturer+ ", "+"Model: "+ model+"  "+series +"\n"+ "Transmission: "+transmission +"\n"+"Mileage: "+mileage +" mpg";
  }
     
     
}
