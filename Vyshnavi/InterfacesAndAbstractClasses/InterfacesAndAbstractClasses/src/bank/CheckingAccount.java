/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

import enums.Features;
import interfaces.IBank;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author Vyshnavi srilaxmi Thannir
 */
public class CheckingAccount extends Account implements IBank {

    private Features[] features;

    /**
     *
     * @param person
     * @param accntNum
     * @param userName
     * @param password
     * @param features
     * @throws NoSuchAlgorithmException
     * @throws UnsupportedEncodingException
     */
    public CheckingAccount(Person person, long accntNum, String userName, String password,
            Features[] features) throws NoSuchAlgorithmException, UnsupportedEncodingException 
    {
        super(person, accntNum, userName, password);
        this.features = features;
    }

    @Override
    public double calculateOverDraftCharges(double amount) 
    {
        double charges = 0;
        for (Features f : features) {
            if (f.equals(Features.OVERDRAFT)) 
            {
                charges = getOverDraft(amount) * f.getAdditionalChargeForFeature();
            } else if (f.equals(Features.PAPERCHECKS)) 
            {
                charges = getOverDraft(amount) * f.getAdditionalChargeForFeature();
            }
        }
        return charges;
    }

    /**
     *
     * @param amount
     * @return
     */
    public double getOverDraft(double amount)
    {
        return amount - getBalance();
    }

    /**
     *
     * @param accntNum
     * @param amount
     * @param date
     * @return
     */
    @Override
    public String makeCredit(long accntNum, double amount, String date) {
        String message;
        if (getBalance() < 0) {
            double over = getOverDraft(getBalance());
            double overCharge = calculateOverDraftCharges(over);
            double dep = amount - overCharge;
            Transaction tran2 = new Transaction(accntNum, "deposit", amount, getBalance(), date, true);
            Transaction tran = new Transaction(accntNum, "withdraw", overCharge, amount + getBalance(), date, true);

            getTranscations().add(tran2);
            getTranscations().add(tran);

            setBalance(amount + getBalance() - overCharge);

            message = "Success: Amount $" + amount + " has been credited to account " + accntNum
                    + " and $" + overCharge + " been charged for overdraft on " + date;

        } else {
            Transaction tran = new Transaction(accntNum, "deposit", amount, getBalance(), date, true);
            getTranscations().add(tran);
            setBalance(amount + getBalance());

            message = "Success: Amount $" + amount + " has been credited to account " + accntNum + " on " + date;

        }
        return message;

    }

    @Override
    public String makeDebit(long accntNum, double amount, String date) {
        String message = "Failed: Insufficient balance";
        double bal = getBalance();
        for (Features f : features) 
        {
            if (f.equals(Features.OVERDRAFT)) 
            {
                if (amount < OVER_DRAFT_LIMIT + bal && amount > bal) 
                {
                    double over = getOverDraft(amount);
                    Transaction tran = new Transaction(accntNum, "withdraw", bal, getBalance(), date, true);
                    Transaction tran2 = new Transaction(accntNum, "withdraw", amount, bal, date, true);
                    getTranscations().add(tran2);
                    setBalance(bal - amount);
                    message = "Success: Amount $" + Math.abs(tran2.getTransactionAmount() - over)
                            + " debited from account " + accntNum 
                            + " And an amount of $"
                            + over + " has been withdrawn as an overdraft amount on "
                            + date;
                } else if (amount < getBalance()) 
                {
                    Transaction tran = new Transaction(accntNum, "withdraw", amount, getBalance(), date, true);
                    getTranscations().add(tran);
                    setBalance(getBalance() - amount);

                    message = "Success: Amount $" + amount 
                            + " has been debited from account "
                            + accntNum + " on " + date;

                }
            } else if (amount < getBalance())
            {
                Transaction tran = new Transaction(accntNum, "withdraw", amount, getBalance(), date, true);
                getTranscations().add(tran);
                setBalance(getBalance() - amount);

                message = "Success: Amount $"
                        + amount + " has been debited from account " 
                        + accntNum + " on " + date;

            }
        }
        return message;
    }

  
    @Override
    public String toString() {
        double over = 0;
        double bal = this.getBalance();
        if (bal < 0) {
            over = Math.abs(bal);
        }

        return super.toString() + "Current Overdraft Amount " 
                + over
                + "\n-------------------------------------------------\n";
    }
}
