/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

/**
 *
 * @author Vyshnavi Srilaxmi Thannir
 */
public class AdultInsurance extends AbstractInsurance implements Insurance{

    public AdultInsurance(String InsuranceCompanyName,
            double InsuranceCoverage, String fName, String lName, 
            int insuranceID, int age, char gender, String doctorToVisit) {
        super(InsuranceCompanyName, 
                InsuranceCoverage, fName, lName, 
                insuranceID, age, gender, doctorToVisit);
    }
    
    @Override
    public double calcAmountPayableToHospital(double PremiumPaidByCustomer, 
            double billGenerated) throws NegativeAmountException {
        double amountPayable;
        if(PremiumPaidByCustomer < 0)
            throw new NegativeAmountException();
        else if(PremiumPaidByCustomer > BASE_PREMIUM_AMOUNT)
            amountPayable = 0.75*billGenerated;
        else if(PremiumPaidByCustomer <= BASE_PREMIUM_AMOUNT && PremiumPaidByCustomer > (BASE_PREMIUM_AMOUNT/2))
            amountPayable = 0.45*billGenerated;
        else
            amountPayable = billGenerated;
        return amountPayable;    
    }
    
    @Override
    public String toString(){
        return "Insurance Company Name: "+super.getInsuranceCompanyName()+
                ", Insurance Coverage: "+super.getInsuranceCoverage();
    }
}
