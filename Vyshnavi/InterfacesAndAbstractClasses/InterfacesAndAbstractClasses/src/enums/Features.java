/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;

/**
 *
 * @author Vyshnavi Srilaxmi Thannir
 */
public enum Features {

    /**
     *enum declaration
     */
    OVERDRAFT(0.12),

    /**
     *enum declaration
     */
    PAPERCHECKS(10);

    private double additionalChargeForFeature;
    private Features(double additionalChargeForFeature)
    {
        this.additionalChargeForFeature = additionalChargeForFeature;
    }

    /**
     *
     * @return
     */
    public double getAdditionalChargeForFeature() 
    {
        return additionalChargeForFeature;
    }

}
