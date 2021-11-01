/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Neha
 */
public class Encounter {
    private Date date;
    //private Patient patient;
    private VitalSigns vitalsigns;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }



    public VitalSigns getVitalsigns() {
        return vitalsigns;
    }

    public void setVitalsigns(VitalSigns vitalsigns) {
        this.vitalsigns = vitalsigns;
    }
    
}
