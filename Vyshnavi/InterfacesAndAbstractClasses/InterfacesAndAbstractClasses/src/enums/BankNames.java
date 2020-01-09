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
public enum BankNames {

    /**
     *enum bank of america
     */
    BANK_OF_AMERICA(14, "Bank of America"),

    /**
     *
     */
    NODAWAY(10, "Nodaway bank"),

    /**
     *enum declaration
     */
    USBANK(12, "US bank");

    private int accountNumberLength;
    private String bankName;
    private BankNames(int accountNumberLength, String bankName)
    {
        this.accountNumberLength = accountNumberLength;
        this.bankName = bankName;
    }

    /**
     *enum declaration
     * @return
     */
    public int getAccountNumberLength() 
    {
        return accountNumberLength;
    }

    /**
     *enum declaration
     * @return
     */
    public String getBankName() 
    {
        return bankName;
    }

}
