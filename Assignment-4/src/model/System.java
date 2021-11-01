/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Neha
 */
public class System {
    public static PatientDirectory patientdirectory = new PatientDirectory();
    public static ArrayList<Patient> patientHistory = new ArrayList<Patient>();
    
    public static PersonDirectory persondirectory = new PersonDirectory();
    public static ArrayList<Person> personHistory = new ArrayList<Person>();
    
    private City city;

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
    

    public static PersonDirectory getPersondirectory() {
        return persondirectory;
    }

    public static void setPersondirectory(PersonDirectory persondirectory) {
        System.persondirectory = persondirectory;
    }

    public static ArrayList<Person> getPersonHistory() {
        return personHistory;
    }

    public static void setPersonHistory(ArrayList<Person> personHistory) {
        System.personHistory = personHistory;
    }
   

    public static PatientDirectory getPatientdirectory() {
        return patientdirectory;
    }

    public static void setPatientdirectory(PatientDirectory patientdirectory) {
        System.patientdirectory = patientdirectory;
    }

    public static ArrayList<Patient> getPatientHistory() {
        return patientHistory;
    }

    public static void setPatientHistory(ArrayList<Patient> patientHistory) {
        System.patientHistory = patientHistory;
    }
    

}
