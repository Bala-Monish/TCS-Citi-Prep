/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;


import interfaces.IBank;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author vyshnavi srilaxmi Thannir
 */
public class SavingsAccount extends Account implements IBank {

    private double initialDeposit;

    /**
     *
     * @param initialDeposit
     * @param person
     * @param accntNum
     * @param userName
     * @param password
     * @throws NoSuchAlgorithmException
     * @throws UnsupportedEncodingException
     */
    public SavingsAccount(double initialDeposit, Person person, long accntNum, String userName, String password) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        super(person, accntNum, userName, password);
        this.initialDeposit = initialDeposit;

        Transaction t = new Transaction(accntNum, "deposit", initialDeposit, 0, getOpenDate(), true);
        getTranscations().add(t);
        setBalance(initialDeposit);
    }

    @Override
    public double calculateInterest() 
    {
        double interest = 0;
        if (getBalance() >= this.initialDeposit) 
        {
            interest = getBalance() * INTEREST_RATE;
            setBalance(interest + getBalance());
        }
        return interest;
    }

    @Override
    public String makeDebit(long accntNum, double amount, String date) {
        String message = "Failed: Insufficient balance";
        int not = 1;
        if (amount <= getBalance()) {
            for (Transaction t : getTranscations()) {
                if (t.getDate().split("/")[1].equalsIgnoreCase(date.split("/")[1]) && t.getType().equalsIgnoreCase("withdrawl") && t.getAccntNum() == accntNum) {
                    not += 1;
                }
            }
            if (not > 3) {
                message = "Failed: Cannot withdraw amount. Number of withdraws limit exceeded";
            } else {
                System.out.println("Transactions" + not);
                Transaction tran = new Transaction(accntNum, "withdraw", amount, getBalance(), date, true);
                getTranscations().add(tran);
                setBalance(getBalance() - amount);

                message = "Success: Amount $" + amount + " has been debited from account " + accntNum + " on " + date;
            }

        }

        return message;
    }

    /**
     *string method
     * @param accntNum
     * @param amount
     * @param date
     * @return
     */
    @Override
    public String makeCredit(long accntNum, double amount, String date) {

        Transaction tran = new Transaction(accntNum, "deposit", amount, getBalance(), date, true);
        getTranscations().add(tran);
        setBalance(amount + getBalance());
        return "Success: Amount $" + amount 
                + " has been credited to the account " 
                + accntNum + " on " + date;
    }

    @Override
    public String toString() {
        return super.toString() + "Interest: $" 
                + calculateInterest() + " \nTotal balance: $" 
                + getBalance()
                + "\n-------------------------------------------------\n";
    }

}
