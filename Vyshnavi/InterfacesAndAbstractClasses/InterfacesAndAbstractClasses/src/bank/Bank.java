/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

/**
 *
 * @author Vyshnavi Srilaxmi Thannir
 */


import enums.Features;
import interfaces.Eligible;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import util.BankAccountUtility;

/**
 *
 * @author S531441
 */
public class Bank implements Eligible {

    private String bankName, branch, address;
    private ArrayList<Account> accounts;

    /**
     *
     * @param bankName
     * @param branch
     * @param address
     */
    public Bank(String bankName, String branch, String address) 
    {
        this.bankName = bankName;
        this.branch = branch;
        this.address = address;
        accounts = new ArrayList<Account>();
    }

    /**
     *
     * @param accNum
     * @return
     */
    public Account getAccount(long accNum) 
    {
        for (Account a : accounts)
        {
            if (a.getAccountNumber() == accNum) 
            {
                return a;
            }
        }
        return null;
    }

    private long assignAccountNumber() throws NoSuchAlgorithmException
    {
        return BankAccountUtility.generateAccountNumbers(bankName);
    }

    /**
     *
     * @param person
     * @return
     */
    @Override
    public boolean verifyIdentity(Person person) 
    {
        boolean rslt = false;
        String Proof = person.getIdProof();
        String dob = person.getDob();
        String[] s1 = Proof.trim().split("-");
        if (dob.equalsIgnoreCase(s1[1])) {
            if (s1[2].startsWith("L") && s1[2].length() == 8) 
            {
                if (s1[3].equalsIgnoreCase("passport"))
                {
                    rslt = true;
                }
            } else if (s1[2].startsWith("D") && s1[2].length() == 10) 
            {
                if (s1[3].equalsIgnoreCase("Driver's license")) 
                {
                    rslt = true;
                }
            } else if (s1[2].matches("\\d+") && s1[2].length() == 12) 
            {
                if (s1[3].equalsIgnoreCase("Aadhar")) 
                {
                    rslt = true;
                }
            }

        }
        return rslt;
    }

    /**
     *
     * @param person
     * @return
     */
    @Override
    public boolean checkAge(Person person) 
    {
        LocalDate loc = LocalDate.now();
        LocalDate date = LocalDate.of(Integer.parseInt(person.getDob().split("/")[0]),
                Integer.parseInt(person.getDob().split("/")[1]), Integer.parseInt(person.getDob().split("/")[2]));
        Period per = date.until(loc);
        boolean result = false;
        if (per.getYears() == 16) 
        {
            if (per.getDays() == 0) 
            {
                result = true;
            }
        } else if (per.getYears() > 16) 
        {

            result = true;
        }
        return result;

    }
      @Override
    public String toString() 
    {
        String name = "";
        if (bankName.equalsIgnoreCase("USBank"))
        {
            name = "US Bank";
        } else if (bankName.equalsIgnoreCase("Nodaway"))
        {
            name = "Nodaway Bank";
        } else if (bankName.equalsIgnoreCase("Bank_of_America")) 
        {
            name = bankName.replaceAll("_", " ");
        }
        return "Bank Name: " + name + ", Branch: " 
                + branch + " \nAddress: " + address + "\n";
    }

    /**
     *
     * @param person
     * @param accountType
     * @param userName
     * @param password
     * @param features
     * @param initialDeposit
     * @return
     * @throws NoSuchAlgorithmException
     * @throws UnsupportedEncodingException
     */
    public Account openAccount(Person person, String accountType, String userName,
            String password, String[] features, double initialDeposit) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        Account a = null;
        if (checkAge(person) && verifyIdentity(person))
        {

            if (accountType.equalsIgnoreCase("checking"))
            {
                Features[] fea = new Features[features.length];
                int i = 0;
                for (String s : features) 
                {
                    Features feat = Features.valueOf(s.toUpperCase());
                    fea[i] = feat;
                    i += 1;
                }

                a = new CheckingAccount(person, assignAccountNumber(), userName, password, fea);
                accounts.add(a);
            } else 
            {
                a = new SavingsAccount(initialDeposit, person, assignAccountNumber(), userName, password);
                accounts.add(a);

            }
        }
        return a;
    }

  

}
