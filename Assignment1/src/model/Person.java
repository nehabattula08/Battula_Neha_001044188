/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import com.toedter.calendar.JDateChooser;
import java.net.URL;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Neha
 */
public class Person {
    private String firstName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    private String lastName;
    
    private String geogData;
    private Date DOB;
    private JDateChooser dateOfBirth;
    private String primaryTelNo;
    private String secondaryTelNo;
    private String faxNo;

    
    private String primaryEmailID;
    private String secondaryEmailID;

    public String getPrimaryEmailID() {
        return primaryEmailID;
    }

    public void setPrimaryEmailID(String primaryEmailID) {
        this.primaryEmailID = primaryEmailID;
    }

    public String getSecondaryEmailID() {
        return secondaryEmailID;
    }

    public void setSecondaryEmailID(String secondaryEmailID) {
        this.secondaryEmailID = secondaryEmailID;
    }
    private String SSN;
    private int MedicalRecordNumber; //write full name
    private String healthPlanID;
    private String primaryAccNumber;
    private String secondaryAccNumber;
    private String cert_licenseNumber; 
    private String vehicleIdentifier;
    private String deviceIdentifier1;
    private String deviceIdentifier2;

    public String getDeviceIdentifier1() {
        return deviceIdentifier1;
    }

    public void setDeviceIdentifier1(String deviceIdentifier1) {
        this.deviceIdentifier1 = deviceIdentifier1;
    }

    public String getDeviceIdentifier2() {
        return deviceIdentifier2;
    }

    public void setDeviceIdentifier2(String deviceIdentifier2) {
        this.deviceIdentifier2 = deviceIdentifier2;
    }
    private String linkedinUrl ="";
    private String IPaddr1;
    private String IPaddr2;

    public String getIPaddr1() {
        return IPaddr1;
    }

    public void setIPaddr1(String IPaddr1) {
        this.IPaddr1 = IPaddr1;
    }

    public String getIPaddr2() {
        return IPaddr2;
    }

    public void setIPaddr2(String IPaddr2) {
        this.IPaddr2 = IPaddr2;
    }
    private String uniqueIdentifier;
    private String biometricsUrl;
    private String imgUrl;

    public String getPrimaryAccNumber() {
        return primaryAccNumber;
    }

    public void setPrimaryAccNumber(String primaryAccNumber) {
        this.primaryAccNumber = primaryAccNumber;
    }

    public String getSecondaryAccNumber() {
        return secondaryAccNumber;
    }

    public void setSecondaryAccNumber(String secondaryAccNumber) {
        this.secondaryAccNumber = secondaryAccNumber;
    }
    

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getBiometricsUrl() {
        return biometricsUrl;
    }

    public void setBiometricsUrl(String biometricsUrl) {
        this.biometricsUrl = biometricsUrl;
    }

   

    public String getGeogData() {
        return geogData;
    }

    public void setGeogData(String gData){
        /*SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yy");
        Date dtGeog= formatter.parse(gDate);
        this.geogDate = dtGeog;*/
        this.geogData=gData;
    } 

    public Date getDOB() {
        
       return DOB;
    }

   
    public void setDOB(Date dob) throws ParseException {
        
        
        this.DOB = dob;
    }
  
    public String getprimaryTelNo() {
        return primaryTelNo;
 
    }
 
    public String getsecondaryTelNo() {
        return secondaryTelNo;
 
    }
  

    public void setprimaryTelNo(String telNo) {
        this.primaryTelNo = telNo;
    }
    
    public void setsecondaryTelNo(String telNo) {
        this.secondaryTelNo = telNo;
    }

  

    public String getSSN() {
        String strSSN= String.valueOf(SSN);
        return strSSN; 
    }

    public void setSSN(String ssn) {
        this.SSN=ssn;
    }

    public String getMRN() {
        
        return String.valueOf(MedicalRecordNumber);
    }

    public void setMRN(String MRN) {
        
        this.MedicalRecordNumber = Integer.parseInt(MRN);
    }

    public String getHealthPlanID() {
        return healthPlanID;
    }

    public void setHealthPlanID(String healthPlanID) {
        this.healthPlanID = healthPlanID;
    }


    public String getCert_licenseNumber() {
        return cert_licenseNumber;
    }

    public void setCert_licenseNumber(String cert_licenseNumber) {
        this.cert_licenseNumber = cert_licenseNumber;
    }

    public String getVehicleIdentifier() {
        return vehicleIdentifier;
    }

    public void setVehicleIdentifier(String vehicleIdentifier) {
        this.vehicleIdentifier = vehicleIdentifier;
    }

  

    public String getlinkedinUrl() {
        return linkedinUrl;
    }

    public void setlinkedinUrl(String url) {
        this.linkedinUrl = url;
    }

  

    public String getUniqueIdentifier() {
        return uniqueIdentifier;
    }

    public void setUniqueIdentifier(String uniqueIdentifier) {
        this.uniqueIdentifier = uniqueIdentifier;
    }

    public void setPrice(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String getFaxNo() {
        return faxNo;
    }

    public void setFaxNo(String faxNo) {
        this.faxNo = faxNo;
    }
    
}
