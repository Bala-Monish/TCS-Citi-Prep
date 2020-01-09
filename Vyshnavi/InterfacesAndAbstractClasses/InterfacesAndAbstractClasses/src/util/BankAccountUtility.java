/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import enums.BankNames;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

/**
 *
 * @author Vyshnavi Srilaxmi Thannir
 */
public class BankAccountUtility {

    private static Random random;

    private BankAccountUtility()
    {
    }

    /**
     *
     * @param bankName
     * @return
     * @throws NoSuchAlgorithmException
     */
    public static long generateAccountNumbers(String bankName) throws NoSuchAlgorithmException {
        BankNames b = BankNames.valueOf(bankName.toUpperCase());
        int length = b.getAccountNumberLength();
        
        Random ran = new Random();
        char[] temp = new char[length];
        temp[0] = (char) (ran.nextInt(8) + '1');
        for (int j = 1; j < length; j++) 
        {
            temp[j] = (char) (ran.nextInt(10) + '0');
        }

        return Long.parseLong(new String(temp));
    }

    /**
     *
     * @param password
     * @return
     * @throws NoSuchAlgorithmException
     * @throws UnsupportedEncodingException
     */
    public static String getEncryptedPassword(String password) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MessageDigest txt = MessageDigest.getInstance("SHA");
        byte[] bArray = password.getBytes();
        byte[] encTxt = txt.digest(bArray);

        return new String(encTxt, "UTF-8");
    }

}
