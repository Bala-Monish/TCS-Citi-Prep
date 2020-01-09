/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author Vyshnavi Srilaxmi Thannir
 */
public abstract class AbstractHospitalInfo implements Hospital{
    
    private List<Doctor> availableDoctorsList;
    private HashMap<Doctor,HashSet<Patient>> patientsMappedToDoctor;
    private String hospitalAddress;
    private String hospitalName;
    
    public AbstractHospitalInfo(){
        this.availableDoctorsList = new ArrayList<>();
        this.patientsMappedToDoctor = new HashMap<>();
    }

    public AbstractHospitalInfo(String hospitalAddress, String hospitalName) {
        this.hospitalAddress = hospitalAddress;
        this.hospitalName = hospitalName;
        this.availableDoctorsList = new ArrayList<>();
        this.patientsMappedToDoctor = new HashMap<>();
    }

    public List<Doctor> getAvailableDoctorsList() {
        return availableDoctorsList;
    }

    public HashMap<Doctor, HashSet<Patient>> getPatientsMappedToDoctor() {
        return patientsMappedToDoctor;
    }

    public String getHospitalAddress() {
        return hospitalAddress;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public static double getEMERGENCY_FEE() {
        return EMERGENCY_FEE;
    }

    public static double getBASE_CONSULTATION_FEE() {
        return BASE_CONSULTATION_FEE;
    }

    public void setAvailableDoctorsList(List<Doctor> availableDoctorsList) {
        this.availableDoctorsList = availableDoctorsList;
    }
    
    public void addDoctors(Doctor doctor) throws InvalidDoctorSizeException{
        if(availableDoctorsList.size()<0)
            throw new InvalidDoctorSizeException();
        else{
            availableDoctorsList.add(doctor);
        }
    }
    
    @Override
    public abstract double calcBill(String billingDetails);

    @Override
    public abstract void assignPatientsToDoctor(List<Doctor> doctorList, Patient patient);
    
    @Override
    public String toString(){
        return "Hospital Name: "+this.getHospitalName()+", "
                + "Hospital Address: "+this.getHospitalAddress();
    }
}
