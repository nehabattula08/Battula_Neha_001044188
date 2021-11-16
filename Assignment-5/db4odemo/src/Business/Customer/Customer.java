/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Role.CustomerRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author harold
 */
public class Customer extends UserAccount{
    
    private String customerName;
    private String customerAddress;
    private String mobileNumber;
 
    public Customer(String CustUserName, String Custpassword,String customerName, String customerAddress, String mobileNumber) {
        
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.mobileNumber = mobileNumber;
        setUsername(CustUserName);
        setPassword(Custpassword);
        setRole(new CustomerRole());
    }
    
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    
   @Override
    public String toString() {
        return this.customerName;
    }
}
