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
public abstract class AbstractInsurance extends Patient implements Insurance{
    
    private String InsuranceCompanyName;
    private double InsuranceCoverage;

    public AbstractInsurance(String InsuranceCompanyName, double InsuranceCoverage,
            String fName, String lName, int insuranceID, int age, 
            char gender, String doctorToVisit) {
        super(fName, lName, insuranceID, age, gender, doctorToVisit);
        this.InsuranceCompanyName = InsuranceCompanyName;
        this.InsuranceCoverage = InsuranceCoverage;
    }

    public String getInsuranceCompanyName() {
        return InsuranceCompanyName;
    }

    public double getInsuranceCoverage() {
        return InsuranceCoverage;
    }
    
    @Override
    public String checkHealthInsurancePlan() throws InvalidInsuranceIDException{
        if(super.getInsuranceID()<=0 || super.getInsuranceID()>=40000)
            throw new InvalidInsuranceIDException();
        else if(super.getInsuranceID()>0 && super.getInsuranceID()<10000)
            return "Health maintenance organizations (HMOs) plan";
        else if(super.getInsuranceID()>=10000 && super.getInsuranceID()<20000)
            return "Preferred provider organizations (PPOs) plan";
        else if(super.getInsuranceID()>=20000 && super.getInsuranceID()<30000)
            return "Point-of-service (POS) plan";
        else
            return "High-deductible health plans (HDHPs)";
    }
    
    @Override
    public abstract double calcAmountPayableToHospital(double PremiumPaid,
            double billGenerated) throws NegativeAmountException;
    
}
