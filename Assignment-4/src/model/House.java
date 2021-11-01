/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

//import java.util.HashMap;

/**
 *
 * @author Neha
 */
public class House {
    private String houseNo;
    private String streetNo;
    //private Person person;
    private Community community;
    private City city;
    public House(){
        
    }
   public House(String houseNo){
       this.houseNo=houseNo;
   }
    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public String getStreetNo() {
        return streetNo;
    }

//    public Person getPerson() {
//        return person;
//    }
//
//    public void setPerson(Person person) {
//        this.person = person;
//    }

    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public void setStreetNo(String streetNo) {
        this.streetNo = streetNo;
    }
}
