/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

/**
 *
 * @author Vyshnavi Srilaxmi Thannir
 */
public class BankDriver {

    /**
     *
     * @param args
     * @throws FileNotFoundException
     * @throws NoSuchAlgorithmException
     * @throws UnsupportedEncodingException
     */
    public static void main(String[] args) throws FileNotFoundException, NoSuchAlgorithmException, UnsupportedEncodingException {
        Scanner scan = new Scanner(new File("inputFile.txt"));
        String t = "";

        System.out.println("*********************************************\n" + "**********Bank Accounts Management***********\n" + "*********************************************");
        while (scan.hasNextLine()) {

            String t1 = t;
            if (t1.equals("")) {
                scan.nextLine();
            }
            t = "";
            String line = "";
            do {
                String bName = t;
                if (bName.isEmpty()) {
                    bName = scan.nextLine();
                }
                String bBranch = scan.nextLine();
                String bAdd = scan.nextLine();
                Bank bank1 = new Bank(bName, bBranch, bAdd);

                do {
                    String fName = line;
                    if (fName.equalsIgnoreCase("Bank") || fName.isEmpty()) {
                        fName = scan.nextLine();
                    }
                    line = "";
                    String lN = scan.nextLine();
                    String db = scan.nextLine();
                    String id = scan.nextLine();
                    String add = scan.nextLine();
                    Address address = new Address(add.split(",")[0], add.split(",")[1], add.split(",")[2], add.split(",")[3]);
                    String pn = scan.nextLine();
                    String mail = scan.nextLine();
                    if (!mail.endsWith("gmail.com") && !mail.endsWith("yahoo.com") && !mail.endsWith("nwmissouri.edu.com")) {
                        mail = null;
                    }
                    Person person = new Person(fName, lN, db, id, address, pn, mail);
                    String userName = scan.nextLine();
                    String password = scan.nextLine();

                    if (!password.matches("[a-zA-Z0-9]^\\S")) {
                        password = person.getfName() + person.getDob().split("/")[0];
                    }
                    String acType = scan.nextLine();
                    String[] features = null;
                    double initDep = 0;
                    if (acType.equalsIgnoreCase("checking")) {
                        features = scan.nextLine().split(" ");

                    } else {
                        initDep = scan.nextDouble();
                        scan.nextLine();
                    }
                    Account ac = bank1.openAccount(person, acType, userName, password, features, initDep);
                    if (ac == null) {
                        System.out.println("Not eligible to open a bank account");
                        line = scan.nextLine();
                    } else {
                        System.out.println(bank1);
                        System.out.println(ac.getAccountHolder());
                        System.out.println("Account Number: " + ac.getAccountNumber());
                        System.out.println("\nUser name: " + ac.getUserName() + "		Password: " + ac.getPassword());

                        System.out.println("\n************Transaction summary***************");
                        boolean check;
                        do {
                            if (!scan.hasNextLine())
                            {
                                check = false;
                                line = "";
                            } else 
                            {
                                line = scan.nextLine();
                                String[] trans = line.split(",");
                                if (trans[0].equalsIgnoreCase("deposit") || trans[0].equalsIgnoreCase("withdraw")) 
                                {
                                    check = true;
                                    if (trans[0].equalsIgnoreCase("deposit")) 
                                    {
                                        System.out.println(ac.makeCredit(ac.getAccountNumber(), Double.parseDouble(trans[1]), trans[2]));
                                    } else 
                                    {
                                        System.out.println(ac.makeDebit(ac.getAccountNumber(), Double.parseDouble(trans[1]), trans[2]));
                                    }
                                } else 
                                {
                                    check = false;
                                }
                            }
                        } 
                        while (check);
                        System.out.println("\n**********************************************\n"
                                + "                 Pass Book                    \n"
                                + "**********************************************\n" 
                                + bank1.getAccount(ac.getAccountNumber()));
                    }
                } 
                while (scan.hasNext() && !line.startsWith("Bank"));
                t = line;
                line = "";
            } 
            while (scan.hasNextLine() && line.startsWith("Bank"));
        }
        scan.close();
    }
}
