/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
import java.util.Date;

/**
 *
 * @author Neha
 */
public class UberCar {

   
    
    private String carName;

    public String getCarAvailability() {
        return carAvailability;
    }

    public void setCarAvailability(String carAvailability) {
        this.carAvailability = carAvailability;
    }
    private String carAvailability;
    private String isPassengerCarAvailable;
    private String carManufacture;
    private int manufactureYear;
    private int noOfSeats;
    private Long serialNumber;
    private String modelNumber;
    private List<String> availableCities;
    private Date maintenanceCertDate;
    

    public String getIsPassengerCarAvailable() {
        return isPassengerCarAvailable;
    }

    public void setIsPassengerCarAvailable(String isPassengerCarAvailable) {
        this.isPassengerCarAvailable = isPassengerCarAvailable;
    }

  

    public List<String> getAvailableCities() {
        return availableCities;
    }

  
    public void setAvailableCities(List<String> availableCities) {
        this.availableCities = availableCities;
    }
    
    

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }
    
    

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

  
  

    public String getCarManufacture() {
        return carManufacture;
    }

    public void setCarManufacture(String carManufacture) {
        this.carManufacture = carManufacture;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

 

    public Long getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(Long serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

  

    public Date getMaintenanceCertDate() {
        return maintenanceCertDate;
    }

    public void setMaintenanceCertDate(Date maintenanceCertDate) {
        this.maintenanceCertDate = maintenanceCertDate;
    }
    
    
}
