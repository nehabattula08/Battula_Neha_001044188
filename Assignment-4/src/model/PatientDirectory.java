/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Neha
 */
public class PatientDirectory {
     private ArrayList<Patient> patientHistory=new ArrayList<>();

    public ArrayList<Patient> getPatientHistory() {
        return patientHistory;
    }

    public void setPatientHistory(Patient patientHistory) {
        this.patientHistory.add(patientHistory);
    }
    
}
