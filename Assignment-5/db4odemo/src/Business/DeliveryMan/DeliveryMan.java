/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import Business.Role.DeliverManRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author harold
 */
public class DeliveryMan extends UserAccount{
    private String deliveryName;
    private String phone;
    private String namePlate;
 

    public DeliveryMan(String userName, String password, String deliveryName, String phone, String namePlate) {
        
        setUsername(userName);
        setPassword(password); 
        setRole(new DeliverManRole());
        
        this.deliveryName = deliveryName;
        this.phone = phone;
        this.namePlate = namePlate;
        
    }

  
    public String getDeliveryName() {
        return deliveryName;
    }

    public void setDeliveryName(String deliveryName) {
        this.deliveryName = deliveryName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNamePlate() {
        return namePlate;
    }

    public void setNamePlate(String namePlate) {
        this.namePlate = namePlate;
    }
    
    
    
    
}
