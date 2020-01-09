/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.util.HashSet;
import java.util.List;

/**
 *
 * @author Vyshnavi Srilaxmi Thannir
 */
public class OutPatient extends AbstractHospitalInfo implements Hospital{
    
    private Patient patient;

    public OutPatient() {
    }

    public OutPatient(String hospitalName, String hospitalAddress, Patient patient) {
        super(hospitalAddress, hospitalName);
        this.patient = patient;
    }
    
    @Override
    public double calcBill(String billingDetails) {
        double bill = 0;
        String[] items = billingDetails.split(",");
        for(String str : items){
            if(str != null){
                switch(str){
                    case "Cirrhosis":
                        bill += 10.49;
                        break;
                    case "Diabetes Mellitus":
                        bill += 13.99;
                        break;
                    case "Acellular Pertussis":
                        bill += 17.89;
                        break;
                    case "Acute Bronchitis":
                        bill += 11.25;
                        break;
                    case "Pneumonia":
                        bill += 7.9;
                        break;
                    default:
                        bill += EMERGENCY_FEE;
                        break;
                }
            }
        }
        return bill+BASE_CONSULTATION_FEE;
    }

    @Override
    public void assignPatientsToDoctor(List<Doctor> doctorList, Patient patient) {
        for (int i = 0; i < doctorList.size(); i++) {
            if (getPatientsMappedToDoctor().containsKey(doctorList.get(i))) {
                if (doctorList.get(i).getName().equals(patient.getDoctorToVisit())) {
                    getPatientsMappedToDoctor().get(doctorList.get(i)).add(patient);
                    getPatientsMappedToDoctor().put(doctorList.get(i), 
                            getPatientsMappedToDoctor().get(doctorList.get(i)));
                }
            } else {
                if (doctorList.get(i).getName().equals(patient.getDoctorToVisit())) {
                    HashSet<Patient> a = new HashSet<>();
                    a.add(patient);
                    getPatientsMappedToDoctor().put(doctorList.get(i), a);
                }
            }
        }
    }
    
    @Override
    public String toString(){
        String str1="";
        str1 += super.toString()+"\n"+patient.toString();
        return str1;
    }
}
