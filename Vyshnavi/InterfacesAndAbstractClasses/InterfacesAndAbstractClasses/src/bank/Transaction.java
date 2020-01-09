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
class Transaction {
    private long accntNum;
    private String type;
    private double transactionAmount,currentBalance;
    private String date;
    private boolean status;
    public Transaction(long accntNum, String type, double transactionAmount, double previousBalance, String date, boolean status) {
        this.accntNum = accntNum;
        this.type = type;
        this.transactionAmount = transactionAmount;
        this.currentBalance = previousBalance;
        this.date = date;
        this.status = status;
        
    }
    public long getAccntNum() 
    {
        return accntNum;
    }
    public String getType()
    {
        return type;
    }
    public double getTransactionAmount() 
    {
        return transactionAmount;
    }
    public double getCurrentBalance() 
    {
        double bal =0;
        if(getType().equalsIgnoreCase("deposit")){
        currentBalance=getPreviousBalance()+getTransactionAmount();
        }else if(getType().equalsIgnoreCase("withdraw")){
        currentBalance=getPreviousBalance()-getTransactionAmount();
        }
        
        return currentBalance;
    }
    public double getPreviousBalance() {
        return currentBalance;
    }
    public String getDate() {
        return date;
    }
    public boolean isStatus() {
        return status;
    }
    @Override
    public String toString() {
        double b1= getPreviousBalance();
        double b2 = getCurrentBalance();
        
        if(b2<0){
            b2=0;
        }
        return getDate()+" "
                +getType()+" "
                +getTransactionAmount()+" "
                +b1+" Success "
                +b2;
    }
    
    
}
