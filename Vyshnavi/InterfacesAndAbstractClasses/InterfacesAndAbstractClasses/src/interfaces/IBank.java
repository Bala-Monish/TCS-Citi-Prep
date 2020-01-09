/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author Vyshnavi Srilaxmi Thannir
 */
public interface IBank {

    /**
     *interfaces
     */
    double INTEREST_RATE = 0.05;

    /**
     *
     */
    double OVER_DRAFT_LIMIT = 500.0;
    
    /**
     *method
     * @param accntNum
     * @param amount
     * @param date
     * @return
     */
    String makeCredit(long accntNum,double amount,String date);

    /**
     *method
     * @param accntNum
     * @param amount
     * @param date
     * @return
     */
    String makeDebit(long accntNum,double amount,String date);
}
