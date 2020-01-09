/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package booking;

import enums.Features;
import java.util.ArrayList;
import util.BookingUtility;
import static util.BookingUtility.getDistanceInMiles;
import vehicles.Car;
import vehicles.Coupe;
import vehicles.Sedan;
import vehicles.Truck;
import vehicles.Vehicle;
import static vehicles.Vehicle.TORQUE_CONSTANT;

/**
 *
 * @author Vyshnavi srilaxmi Thannir
 */
public class Booking {

    private Customer customer;
    private Vehicle vehicle;
    private double baseRentPrice;
    private ArrayList<Features> features = new ArrayList<>();
    private Location source;
    private Location destination;
    private boolean roundTrip;
    private int noOfDays;

    /**
     *
     * @param customer
     * @param vehicle
     * @param baseRentPrice
     * @param source
     * @param destination
     * @param roundTrip
     * @param noOfDays
     */
    public Booking(Customer customer, Vehicle vehicle, double baseRentPrice, Location source, Location destination, boolean roundTrip, int noOfDays) {
        this.customer = customer;
        this.vehicle = vehicle;
        this.baseRentPrice = baseRentPrice;
        this.source = source;
        this.destination = destination;
        this.roundTrip = roundTrip;
        this.noOfDays = noOfDays;
    }

    /**
     *array list to features
     * @return
     */
    public ArrayList<Features> getFeatures(){
        return features;
    }

    /**
     *
     * @param feature
     */
    public void addFeatures(Features feature){
        features.add(feature);
    }
            
    /**
     *get method for get horse power
     * @param rpm
     * @param torque
     * @return
     */
    public double getHorsePower(int rpm,double torque){      
        double hPower = vehicle.calculateHorsePower(rpm,torque);
        return hPower;      
    }
    
    /**
     *getmethod for getpower loss
     * @param rpm
     * @param torque
     * @return
     */
    public double getPowerLoss(int rpm, double torque){
        
        double pLoss = vehicle.calculatePowerLoss(rpm,torque);
        return pLoss;
    }

    /**
     *get method for additional vechile details
     * @return
     */
    public String getAdditionalVehicleDetails(){
String s="";
if(vehicle instanceof Car){
s+="Classification: "+((Car)vehicle).getClassification();
s+="\nSeat Type: "+((Car)vehicle).getSeatType();
}else if(vehicle instanceof Sedan){
s+="Classification: "+((Sedan)vehicle).getClassification();
s+="\nSeat Type: "+((Sedan)vehicle).getSeatType();
s+="\nTrunk Space: "+((Sedan)vehicle).getTrunkSpace()+" cubic feet";
}else if(vehicle instanceof Coupe){
s+="Classification: "+((Coupe)vehicle).getClassification();
s+="\nSeat Type: "+((Coupe)vehicle).getSeatType();
s+="\nConvertable: "+((Coupe)vehicle).isConvertable();
}else if(vehicle instanceof Truck){
s+="Max Load Capacity: "+((Truck)vehicle).getMaxLoad() + " lbs.";
s+="\nMilage at Max Load Capacity: "
+((Truck)vehicle).calculateMileageAtMaxLoad()+ " mpg"; 
}
return s;
}

    /**
     *get method for milaege with load
     * @return
     */
    public double getMileageWithLoad(){
if(vehicle instanceof Truck)
return ((Truck)vehicle).calculateMileageAtMaxLoad();
return Double.NaN;
}

    /**
     *get method for total distance
     * @return
     */
    public double getTotalDistance(){
        if(roundTrip){
            return BookingUtility.getDistanceInMiles(source, destination)*2;
        }
        else return BookingUtility.getDistanceInMiles(source, destination);
}

    /**
     *get metod for estimise pice
     * @return
     */
    public double getEstimatePrice(){
double price = 0;
        if (customer.isYoungRenter()) {
            price += baseRentPrice;
            price = features.stream().map((f) -> f.getCostPerDay() * BookingUtility.minimumNumberOfDays(source, destination, roundTrip)).reduce(price, (accumulator, _item) -> accumulator + _item);
            if (BookingUtility.getDistanceInMiles(source, destination) > 600) {
                price += (BookingUtility.getDistanceInMiles(source, destination) - 600) * 0.1;
            }
            price += 45.0;
        } else {
            price += baseRentPrice;
            price = features.stream().map((f) -> f.getCostPerDay() * BookingUtility.minimumNumberOfDays(source, destination, roundTrip)).reduce(price, (accumulator, _item) -> accumulator + _item);
            if (BookingUtility.getDistanceInMiles(source, destination) > 600) {
                price += (BookingUtility.getDistanceInMiles(source, destination) - 600) * 0.1;
            }
        }
        return price;
}

    /**
     *get method for estimate details of return type string
     * @return
     */
    public String getEstimateDetails(){
    double cost = 0;
        String str ="******************************************\nEstimate Details:\nBase Price for a Vehicle: $"+baseRentPrice;
        str += "\nAdditional Features:\n";
        if(customer.isYoungRenter()){
            for(Features f : features){
                str += f+": $"+String.format("%.1f",f.getCostPerDay()*BookingUtility.minimumNumberOfDays(source, destination, roundTrip))+"\n";
            }
            str += "Young Renter Fee: $45\n";
            if(getTotalDistance()>600)
                cost += (getTotalDistance()-600)*0.1;
            str += "Price for extra miles: $"+cost;
            str += "\n---------------------------------------------\n";
            str += "Total Estimated price: $"+(getEstimatePrice());
        }else{
            for(Features f : features){
                str += f+": $"+String.format("%.1f",f.getCostPerDay()*BookingUtility.minimumNumberOfDays(source, destination, roundTrip))+"\n";
            }
             if(getTotalDistance()>600)
                cost += (getTotalDistance()-600)*0.1;
            str += "Price for Extra Miles: $"+cost;
            str += "\n---------------------------------------------\n";
            str += "Total Estimated price: $"+String.format("%.1f",getEstimatePrice())+"\n";
        }
        return str;
}
public String toString(){
    String str1="";
    str1 +="\n"+"******************************************";
    str1 +="\nBooking Details:";
    str1 +="\n"+"******************************************";
    str1 +="\n"+ "Customer: " ;
    str1 +="\n"+customer.toString();
    
    str1 +="\n\n"+"Trip Details: ";
    str1 +="\n"+"Source: "+source.getName()+", Destination: "+destination.getName() ;
    String roundTrip1="";
    if(roundTrip){
        roundTrip1 = "yes";
    }
    else 
        roundTrip1 = "no";
    str1 +="\n"+"No of days: "+noOfDays + ", Round Trip: "+roundTrip1;
    
    str1 +="\n\n"+"Vehicle Details: ";
    str1 +="\n"+vehicle.toString();
    
    
    str1 +="\n\n"+"Additional Features: ";
    str1 +="\n"+getAdditionalVehicleDetails();
    
    return str1;
}
}
