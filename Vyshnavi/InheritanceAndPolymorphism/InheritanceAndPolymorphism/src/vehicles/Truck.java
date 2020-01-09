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
public class Truck extends Vehicle{
 private double maxLoad;
 private double wheelDiameter;

    /**
     *no arugemnet constructor
     */
    public Truck() {
    }

    /**
     *argument constructor
     * @param vin
     * @param manufacturer
     * @param model
     * @param series
     * @param transmission
     * @param mileage
     * @param maxLoad
     * @param wheelDiameter
     */
    public Truck( String vin, String manufacturer, String model, String series, String transmission, double mileage,double maxLoad, double wheelDiameter) 
    {
        super(vin, manufacturer, model, series, transmission, mileage);
        this.maxLoad = maxLoad;
        this.wheelDiameter = wheelDiameter;
    }

    /**
     *getter method max load
     * @return
     */
    public double getMaxLoad() {
        return maxLoad;
    }

    /**setter for max load
     *
     * @param maxLoad
     */
    public void setMaxLoad(double maxLoad) {
        this.maxLoad = maxLoad;
    }

    /**
     *getter method wheel diameter
     * @return
     */
    public double getWheelDiameter() {
        return wheelDiameter;
    }

    /**
     *set method for wheel diameter
     * @param wheelDiameter
     */
    public void setWheelDiameter(double wheelDiameter) {
        this.wheelDiameter = wheelDiameter;
    }
 
    /**
     *method to calculate milage at max load
     * @return
     */
    public double  calculateMileageAtMaxLoad(){
        //calculation of Milage at maximum load
        if(maxLoad>1000){
            return (90/100)*getMileage();
        }
        else if(maxLoad > 1000 && maxLoad < 5000 ){
              return (80/100)*getMileage();
        }else
         return (70/100)*getMileage();    
    } 
    
    /**
     *to calculate horse power
     * @param rpm
     * @param torque
     * @return
     */
    @Override
      public double calculateHorsePower(int rpm, double torque){
        
        double t;
        t=torque+(getMaxLoad()*9.8)*(getWheelDiameter()/30.0);
        return super.calculateHorsePower(rpm, t);
//         double Horsepower;
//        Horsepower = (rpm*t)/TORQUE_CONSTANT;
//        return Horsepower;

    }

    /**
     *method to calculate power loss
     * @param rpm
     * @param torque
     * @return
     */
    public double calculatePowerLoss(int rpm, double torque){
       return ((calculateHorsePower(rpm, torque)*Vehicle.HORSEPOWERINWATTS*3.2)/(100.0*1000.0))+((calculateHorsePower(rpm, torque)*Vehicle.HORSEPOWERINWATTS*1.0)/(100.0*1000.0));
    }
}
