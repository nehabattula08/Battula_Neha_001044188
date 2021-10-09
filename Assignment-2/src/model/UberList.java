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
public class UberList {
   
    private ArrayList<UberCar> cars;
    public UberList(){
         this.cars = new ArrayList<UberCar>();
    }


    public ArrayList<UberCar> getCars() {
        return cars;
    }

    public void setCars(ArrayList<UberCar> cars) {
        this.cars = cars;
    }
  
    public UberCar addNewCar(){
        UberCar newCar = new UberCar();
        cars.add(newCar);
        return newCar;
    }
   

 
}
