/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Vyshnavi Srilaxmi Thannir
 */
public class HospitalDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, 
            InvalidDoctorSizeException, InvalidInsuranceIDException, NegativeAmountException {
        Scanner scan = new Scanner(new File("input.txt"));
        String docname;
        String SpecialityType;
        String officeHours;
        String hospitalName;
        String hospitalAddress;
        AbstractHospitalInfo hospitalInfo = new OutPatient();
        hospitalName = scan.nextLine();
        hospitalAddress = scan.nextLine();
        System.out.println("****************************************\n"
                + "Patient Details: "); 
        while(scan.hasNext()){
            String equality = scan.nextLine();
            if(equality.equals("Doctor")){
                docname = scan.nextLine();
                SpecialityType = scan.nextLine();
                officeHours = scan.nextLine();
                Doctor doctor = new Doctor(docname, SpecialityType, officeHours);
                try{
                    hospitalInfo.addDoctors(doctor);
                }
                catch(InvalidDoctorSizeException e){
                    
                }
            }
            else{
                char gender = equality.charAt(0);
                int age = scan.nextInt();
                scan.nextLine();
                String fName = scan.nextLine();
                String lName = scan.nextLine();
                int insuranceID = scan.nextInt();
                scan.nextLine();
                String doctorToVisit = scan.nextLine();
                Patient patient = new Patient(fName, lName, insuranceID, age, gender, doctorToVisit);
                OutPatient outPatient = new OutPatient(hospitalName, hospitalAddress, patient);
                System.out.println("****************************************\n"+outPatient.toString());
                hospitalInfo.assignPatientsToDoctor(hospitalInfo.getAvailableDoctorsList(), patient);
                String billingDetails = scan.nextLine();
                double billGenerated = outPatient.calcBill(billingDetails);
                System.out.println("Bill Amount Generated before Insurance deduction:" + billGenerated);
                String InsuranceCompany = scan.nextLine();
                double InsuranceCoverage = scan.nextDouble();
                scan.nextLine();
                if(age < 16){
                    ChildInsurance childInsurance = new ChildInsurance(InsuranceCompany, InsuranceCoverage, fName, lName, insuranceID, age, gender, doctorToVisit);
                    System.out.println(childInsurance.toString());
                    try{
                        String insurancePlanName = childInsurance.checkHealthInsurancePlan();
                        System.out.println("Insurance Plan Name: " + insurancePlanName);
                    }
                    catch(InvalidInsuranceIDException e){  
                    }
                    double premiumPaid = scan.nextDouble();
                    scan.nextLine();
                    try{
                        double amountPayable = childInsurance.calcAmountPayableToHospital(premiumPaid, billGenerated);
                        System.out.println("Amount to be paid by after insurance deduction: " +amountPayable);
                    }
                    catch(NegativeArraySizeException e){   
                    }
                    System.out.println("****************************************");
                }
                else{
                    AdultInsurance adultInsurance = new AdultInsurance(InsuranceCompany, InsuranceCoverage, fName, lName, insuranceID, age, gender, doctorToVisit);
                    System.out.println(adultInsurance.toString());
                    try{
                        String insurancePlanName = adultInsurance.checkHealthInsurancePlan();
                        System.out.println("Insurance Plan Name: " + insurancePlanName);
                    }
                    catch(InvalidInsuranceIDException e){
                        
                    }
                    double premiumPaid = scan.nextDouble();
                    scan.nextLine();
                    try{
                        double amountPayable = adultInsurance.calcAmountPayableToHospital(premiumPaid, billGenerated);
                        System.out.println("Amount to be paid by after insurance deduction: " +amountPayable);
                    }
                    catch(NegativeAmountException e){
                        
                    }
                }                
            }
        }
        System.out.println("\n****************************************\n"
                + "Patients assigned to doctor \"Lisa DiStefano\": \n"
                + "****************************************");
        HashMap<Doctor,HashSet<Patient>> lisa = new HashMap<>();
        lisa = hospitalInfo.getPatientsMappedToDoctor();
        String str = "";
        for (Doctor doc : lisa.keySet()) {
            if (doc.getName().equals("Lisa DiStefano")) {
                LinkedList<Patient> patientSet = new LinkedList<>();
                patientSet.addAll(lisa.get(doc));
                for(int i=patientSet.size()-1; i>=0; i--){
                    str += patientSet.get(i)+", ";
                }
            }
        }
        String s1 = str.substring(0,str.length()-2);
        System.out.println(s1);
    }
    
}
