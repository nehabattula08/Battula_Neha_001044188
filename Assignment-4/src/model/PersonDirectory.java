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
public class PersonDirectory {
    
    private ArrayList <Person> personHistory;
    Person person;
    
    public PersonDirectory(){
    this.personHistory = new ArrayList<>();
    }

    public ArrayList<Person> getPersonHistory() {
        return personHistory;
    }

    public void setPersonHistory(ArrayList<Person> personHistory) {
        this.personHistory = personHistory;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    
    
   
   
   
}
