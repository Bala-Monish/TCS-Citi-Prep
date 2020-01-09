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
public class Patient {
    
    private String fName;
    private String lName;
    private int insuranceID;
    private int age;
    private char gender;
    private String doctorToVisit;

    public Patient() {
    }

    public Patient(String fName, String lName, int insuranceID, int age, char gender, String doctorToVisit) {
        this.fName = fName;
        this.lName = lName;
        this.insuranceID = insuranceID;
        this.age = age;
        this.gender = gender;
        this.doctorToVisit = doctorToVisit;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getInsuranceID() {
        return insuranceID;
    }

    public void setInsuranceID(int insuranceID) {
        this.insuranceID = insuranceID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getDoctorToVisit() {
        return doctorToVisit;
    }
    
    @Override
    public String toString(){
        return "First Name: "+this.getfName()+"\nLast Name: "+getlName()+"\nInsurance ID: "+getInsuranceID()+"\nAge: "+getAge()+"\nGender: "+getGender();
    }
    
}
