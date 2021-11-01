/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Neha
 */
public class Patient extends Person {
    private String medicalRecordNumber;
    private EncounterHistory encounterhistory;

    public Patient(String firstName, String lastName, int age, int height, String mobileNo, House house, String salutation) {
        super(firstName, lastName, age, height, mobileNo, house, salutation);
    }

 

    
    
    
//    public Patient(String medicalRecordNumber, EncounterHistory encounterhistory, String firstName, String lastName, int age, int height, String mobileNo, House house, String salutation, Patient patient) {
//        super(firstName, lastName, age, height, mobileNo, house, salutation, patient);
//        this.medicalRecordNumber = medicalRecordNumber;
//        this.encounterhistory = encounterhistory;
//    }

    public Patient() {
    }
  
  
    public String getmedicalRecordNumber() {
        return medicalRecordNumber;
    }

  
    public void setMedicalRecordNumber(String medicalRecordNumber) {
        this.medicalRecordNumber = medicalRecordNumber;
    }

    public EncounterHistory getEncounterhistory() {
        return encounterhistory;
    }

    public void setEncounterhistory(EncounterHistory encounterhistory) {
        this.encounterhistory = encounterhistory;
    }

   
   
    
}
