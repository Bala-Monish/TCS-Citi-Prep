/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;



import interfaces.IBank;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDate;
import java.util.ArrayList;
import util.BankAccountUtility;

/**
 *
 * @author vyshnavi srilaxmi thannir
 */
public abstract class Account implements IBank {

    private Person accountHolder;
    private long accountNumber;
    private String userName, password, openDate;
    private double balance;
    ArrayList<Transaction> transactions;

    /**
     * constructor for account details of person
     * @param person
     * @param accntNum
     * @param userName
     * @param password
     * @throws NoSuchAlgorithmException
     * @throws UnsupportedEncodingException
     */
    public Account(Person person, long accntNum, String userName, String password) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        this.accountHolder = person;
        this.accountNumber = accntNum;
        this.userName = userName;
        this.password = password;
        this.balance = 0.0;
        this.password = BankAccountUtility.getEncryptedPassword(password);
        openDate = LocalDate.now().toString().replaceAll("-", "/");
        transactions = new ArrayList<Transaction>();
    }

    /**
     *getter method for account holder
     * @return
     */
    public Person getAccountHolder()
    {
        return accountHolder;
    }

    /**
     *getter method
     * @return
     */
    public long getAccountNumber()
    {
        return accountNumber;
    }

    /**
     *getter method
     * @return
     */
    public String getUserName() 
    {
        return userName;
    }

    /**
     *
     * @return
     * @throws NoSuchAlgorithmException
     * @throws UnsupportedEncodingException
     */
    public String getPassword() throws NoSuchAlgorithmException, UnsupportedEncodingException 
    {
        resetPassword(password);
        return password;
    }

    /**
     *
     * @return
     */
    public String getOpenDate() 
    {
        return openDate;
    }

    /**
     *
     * @return
     */
    public double getBalance()
    {
        return balance;
    }

    /**
     *
     * @param balance
     */
    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    /**
     *
     * @return
     */
    public ArrayList<Transaction> getTranscations() 
    {
        return transactions;
    }

    /**
     *
     * @param password
     * @throws NoSuchAlgorithmException
     * @throws UnsupportedEncodingException
     */
    public void resetPassword(String password) throws NoSuchAlgorithmException, UnsupportedEncodingException 
    {
        this.password = BankAccountUtility.getEncryptedPassword(password);
    }

    /**
     *
     * @param amount
     * @return
     */
    public double calculateOverDraftCharges(double amount)
    {
        return 0.0;
    }

    /**
     *
     * @return
     */
    public double calculateInterest() 
    {
        return 0.0;
    }

    /**
     *
     * @param transcation
     */
    public void addTranscations(Transaction transcation) 
    {
        this.transactions.add(transcation);
    }

    /**
     *
     * @param accntNum
     * @param amount
     * @param date
     * @return
     */
    @Override
    public abstract String makeDebit(long accntNum, double amount, String date);

    @Override
    public String toString() {
        
        String str1 = "";
        String str2 = "";
        if (this instanceof CheckingAccount) {
            for (Transaction t : transactions) {
                str1 += t.toString() + "\n";
            }
            double balance = this.getBalance();
            if (balance < 0) {
                balance = 0;
            }
            str2 = "Account Type: Checking Account\n" + getAccountHolder()
                    + "\nAccount Number: " + getAccountNumber() 
                    + "\nAccount Open Date: " + getOpenDate()
                    + "\nBalance: $" + balance + "\n" + str1;
        } else if (this instanceof SavingsAccount) {
            for (Transaction t : getTranscations()) {
                str1 += t.toString() + "\n";
            }
            str2 = "Account Type: Savings Account\n" + getAccountHolder().toString()
                    + "\nAccount Number: " 
                    + getAccountNumber() 
                    + "\nAccount Open Date: " + getOpenDate()
                    + "\nBalance: $" + getBalance() + "\n" + str1;
        }
        return str2;
    }

}
