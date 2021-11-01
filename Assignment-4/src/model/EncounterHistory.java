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
public class EncounterHistory {
       private ArrayList <Encounter> encounter;
       public EncounterHistory(){
           if (this.encounter == null || this.encounter.isEmpty()) {
           encounter = new ArrayList<>();
         }
           
       }

    public ArrayList<Encounter> getEncounter() {
        return encounter;
    }

    public void setEncounter(ArrayList<Encounter> encounter) {
        this.encounter = encounter;
       
    }
}
