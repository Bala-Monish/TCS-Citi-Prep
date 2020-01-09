/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package booking;

import enums.Features;
import enums.Seats;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import util.BookingUtility;
import vehicles.Coupe;
import vehicles.Sedan;
import vehicles.Truck;
import vehicles.Vehicle;

/**
 *
 * @author Vyshnavi srilaxmi Thannir
 */
public class BookingDriver {

    /**
     * booking driver class it prints all the details
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner scan = new Scanner(new File("inputFile.txt"));
        ArrayList<Booking> bookings = new ArrayList<>();
        Vehicle vehicle = null;
        Customer customer = null;
        while (scan.hasNext()) {
            if (scan.nextLine().equals("Customer")) {
                String firstName = scan.next();
                String lastName = scan.next();
                scan.nextLine();
                String licenceId = scan.next();
                int age = scan.nextInt();
                scan.nextLine();
                customer = new Customer(firstName, lastName, licenceId, age);
            }
            if (scan.nextLine().equals("Vehicle")) {
                switch (scan.nextLine()) {
                    case "Coupe":
                        String vin = scan.next();

                        String manufacturer = scan.next();
                        String model = scan.next();
                        String series = scan.nextLine();

                        String transmisson = scan.next();

                        double mileage = scan.nextDouble();
                        scan.nextLine();

                        String classification = scan.nextLine();
                        //System.out.println(classification);

                        String seat = scan.nextLine();
                        // System.out.println(seat);

                        Seats seatType = Seats.valueOf(seat.toUpperCase());

                        boolean convertable = scan.nextBoolean();
                        scan.nextLine();

                        vehicle = new Coupe(convertable, seatType, classification, vin, manufacturer, model, series, transmisson, mileage);

                        int rpm = scan.nextInt();
                        double torque = scan.nextDouble();
                        scan.nextLine();
                        double hP = vehicle.calculateHorsePower(rpm, torque);
                        double pL = vehicle.calculatePowerLoss(rpm, torque);
                        System.out.println("******************************************");
                        System.out.println("Tech specs: " + manufacturer + " " + model);
                        System.out.print("Horse Power: ");
                        System.out.println(String.format("%.1f", hP) + " HP");
                        System.out.print("Power Loss: ");
                        System.out.println(String.format("%.1f", pL) + " Kilowatts");
                        if (scan.nextLine().equals("Booking")) {
                            double basePriceRent = scan.nextDouble();
                            scan.nextLine();
                            String feature = scan.nextLine();
                            String src = scan.nextLine();
                            int sLatitude = scan.nextInt();
                            int sLongitude = scan.nextInt();
                            scan.nextLine();
                            Location source = new Location(src, sLongitude, sLatitude);
                            String dest = scan.nextLine();
                            int dLatitude = scan.nextInt();
                            int dLongitude = scan.nextInt();
                            scan.nextLine();
                            Location destination = new Location(dest, dLongitude, dLatitude);
                            String roundtrip = scan.nextLine();
                            boolean roundTrip;
                            if (roundtrip.equals("yes") || roundtrip.equals("Yes")) {
                                roundTrip = true;
                            } else {
                                roundTrip = false;
                            }
                            int noOfDays = BookingUtility.minimumNumberOfDays(source, destination, roundTrip);

                            Booking booking = new Booking(customer, vehicle, basePriceRent, source, destination, roundTrip, noOfDays);
                            bookings.add(booking);
                            System.out.println("Booking by " + customer.getName() + " for " + vehicle.getManufacturer() + " " + vehicle.getModel() + " is complete.");
                            String store = "";
                            ArrayList<String> features = new ArrayList<>();
                            for (int j = 0; j < feature.length(); j++) {
                                if (feature.charAt(j) == ',') {
                                    features.add(store);
                                    store = "";
                                } else {
                                    store += feature.charAt(j);
                                }
                            }
                            features.add(store);
                            for (String s1 : features) {
                                booking.addFeatures(Features.valueOf(s1.toUpperCase()));
                            }
                        }
                        break;
                    case "Sedan":
                        String vin1 = scan.next();
                        String manufacturer1 = scan.next();
                        String model1 = scan.next();
                        String series1 = scan.next();
                        scan.nextLine();
                        String transmisson1 = scan.next();
                        double mileage1 = scan.nextDouble();
                        scan.nextLine();
                        String classification1 = scan.nextLine();
                        String seat1 = scan.nextLine();
                        Seats seatType1 = Seats.valueOf(seat1.toUpperCase());
                        double trunckSpace = scan.nextDouble();
                        scan.nextLine();

                        vehicle = new Sedan(trunckSpace, seatType1, classification1, vin1, manufacturer1, model1, series1, transmisson1, mileage1);
                        int rpm1 = scan.nextInt();
                        double torque1 = scan.nextDouble();
                        scan.nextLine();
                        double hP1 = vehicle.calculateHorsePower(rpm1, torque1);
                        double pL1 = vehicle.calculatePowerLoss(rpm1, torque1);
                        System.out.println("******************************************");
                        System.out.println("Tech specs: " + manufacturer1 + " " + model1);
                        System.out.print("Horse Power: ");
                        System.out.println(String.format("%.1f", hP1) + " HP");
                        System.out.print("Power Loss: ");
                        System.out.println(String.format("%.1f", pL1) + " Kilowatts");
                        if (scan.nextLine().equals("Booking")) {
                            double basePriceRent = scan.nextDouble();
                            scan.nextLine();
                            String feature = scan.nextLine();
                            String src = scan.nextLine();
                            int sLatitude = scan.nextInt();
                            int sLongitude = scan.nextInt();
                            scan.nextLine();
                            Location source = new Location(src, sLongitude, sLatitude);
                            String dest = scan.nextLine();
                            int dLatitude = scan.nextInt();
                            int dLongitude = scan.nextInt();
                            scan.nextLine();
                            Location destination = new Location(dest, dLongitude, dLatitude);
                            String roundtrip = scan.nextLine();    // Syste
                            boolean roundTrip;
                            if (roundtrip.equals("yes") || roundtrip.equals("Yes")) {
                                roundTrip = true;
                            } else {
                                roundTrip = false;
                            }
                            int noOfDays = BookingUtility.minimumNumberOfDays(source, destination, roundTrip);
                            Booking booking1 = new Booking(customer, vehicle, basePriceRent, source, destination, roundTrip, noOfDays);
                            bookings.add(booking1);
                            System.out.println("Booking by " + customer.getName() + " for " + vehicle.getManufacturer() + " " + vehicle.getModel() + " is complete.");
                            String store = "";
                            ArrayList<String> features = new ArrayList<>();
                            for (int j = 0; j < feature.length(); j++) {
                                if (feature.charAt(j) == ',') {
                                    features.add(store);
                                    store = "";
                                } else {
                                    store += feature.charAt(j);
                                }
                            }
                            features.add(store);
                            for (String s1 : features) {
                                booking1.addFeatures(Features.valueOf(s1.toUpperCase()));
                            }
                        }
                        break;
                    case "Truck":
                        String vin2 = scan.next();
                        String manufacturer2 = scan.next();
                        String model2 = scan.next();
                        String series2 = scan.next();
                        scan.nextLine();
                        String transmisson2 = scan.next();
                        double mileage2 = scan.nextDouble();
                        scan.nextLine();
                        double maxLoad = scan.nextDouble();
                        scan.nextLine();
                        double wheelDiameter = scan.nextDouble();
                        scan.nextLine();

                        vehicle = new Truck(vin2, manufacturer2, model2, series2, transmisson2, mileage2, maxLoad, wheelDiameter);
                        int rpm2 = scan.nextInt();
                        double torque2 = scan.nextDouble();
                        scan.nextLine();
                        double hP2 = vehicle.calculateHorsePower(rpm2, torque2);
                        double pL2 = vehicle.calculatePowerLoss(rpm2, torque2);
                        System.out.println("******************************************");
                        System.out.println("Tech specs: " + manufacturer2 + " " + model2);
                        System.out.print("Horse Power: ");
                        System.out.println(String.format("%.1f", hP2) + " HP");
                        System.out.print("Power Loss: ");
                        System.out.println(String.format("%.1f", pL2) + " Kilowatts");
                        if (scan.nextLine().equals("Booking")) {
                            double basePriceRent = scan.nextDouble();
                            scan.nextLine();
                            String feature = scan.nextLine();
                            String src = scan.nextLine();
                            int sLatitude = scan.nextInt();
                            int sLongitude = scan.nextInt();
                            scan.nextLine();
                            Location source = new Location(src, sLongitude, sLatitude);
                            String dest = scan.nextLine();
                            int dLatitude = scan.nextInt();
                            int dLongitude = scan.nextInt();
                            scan.nextLine();
                            Location destination = new Location(dest, dLongitude, dLatitude);
                            String roundtrip = scan.nextLine();
                            boolean roundTrip;
                            if (roundtrip.equals("yes") || roundtrip.equals("Yes")) {
                                roundTrip = true;
                            } else {
                                roundTrip = false;
                            }
                            int noOfDays = BookingUtility.minimumNumberOfDays(source, destination, roundTrip);
                            Booking booking2 = new Booking(customer, vehicle, basePriceRent, source, destination, roundTrip, noOfDays);
                            bookings.add(booking2);
                            System.out.println("Booking by " + customer.getName() + " for " + vehicle.getManufacturer() + " " + vehicle.getModel() + " is complete.");
                            String store = "";
                            ArrayList<String> features = new ArrayList<>();
                            for (int j = 0; j < feature.length(); j++) {
                                if (feature.charAt(j) == ',') {
                                    features.add(store);
                                    store = "";
                                } else {
                                    store += feature.charAt(j);
                                }
                            }
                            features.add(store);
                            for (String s1 : features) {
                                booking2.addFeatures(Features.valueOf(s1.toUpperCase()));
                            }
                        }
                        break;
                }
            }
        }
        System.out.println("******************Bookings******************");
        for (Booking b : bookings) {
            System.out.println(b.toString());
            System.out.println(b.getEstimateDetails());
        }
    }

}
