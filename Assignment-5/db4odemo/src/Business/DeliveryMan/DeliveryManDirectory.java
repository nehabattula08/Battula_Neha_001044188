/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class DeliveryManDirectory {
    
     ArrayList<DeliveryMan> deliveryList = new ArrayList<DeliveryMan>();

    public ArrayList<DeliveryMan> getDeliveryList() {
        return deliveryList;
    }

    public void setDeliveryList(ArrayList<DeliveryMan> deliveryList) {
        this.deliveryList = deliveryList;
    }
    
}
