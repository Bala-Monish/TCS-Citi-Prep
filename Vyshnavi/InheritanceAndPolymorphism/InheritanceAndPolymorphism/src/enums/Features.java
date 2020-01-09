/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;

/**
 *
 * @author Vyshnavi srilaxmi Thannir
 */
public enum Features {
  
    /**
     *enum for xmradio
     */
    XM_RADIO(2.49,"XM radio provides 150+ stations for streaming music, latest news etc."),

    /**
     *declaration of enum
     */
    PERSONAL_INSURANCE(8.35,"Insurance coverage for liability, collision etc."),

    /**
     *declaration of enum
     */
    PREMIUM_INSURANCE	(13.65,"Provides full insurance coverage."),

    /**
     *declaration of enum
     */
    ADDITIONAL_DRIVER(7.50,"Cost of additions drivers who can operate vehicle"),

    /**
     *declaration of enum
     */
    ROADSIDE_ASSISTANCE(1.99, "Assistance for vehicles that have suffered a mechanical failure."),

    /**
     *declaration of enum
     */
    PORTABLE_GPS(1.25, "A GPS-based unit that provides navigation services."),

    /**
     *declaration of enum
     */
    TOOLKIT(0.25,"Tools for emergency.");

private double costPerDay;
private String description;

    private Features(double costPerDay, String description) {
        this.costPerDay = costPerDay;
        this.description = description;
    }

    /**
     *getter method for cost per day
     * @return
     */
    public double getCostPerDay() {
        return costPerDay;
    }

    /**
     *getter method for description
     * @return
     */
    public String getDescription() {
        return description;
    }


}
