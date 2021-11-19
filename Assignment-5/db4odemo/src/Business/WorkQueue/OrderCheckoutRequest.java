/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author Vijay
 */
public class OrderCheckoutRequest extends WorkRequest{
    
    private String id;
    
    private List<CheckoutItems> checkoutList = new ArrayList<CheckoutItems>();
    
    private String feedback;

    public OrderCheckoutRequest() {
        UUID uuid = UUID.randomUUID();
        id = uuid.toString();
    }
    
    public String getId() {
        return id;
    }
    
     public CheckoutItems addItem(CheckoutItems checkout){
        checkoutList.add(checkout);
        return checkout;
    }

    public List<CheckoutItems> getItemsWithQualityList() {
        return checkoutList;
    }

    public void setItemsWithQualityList(List<CheckoutItems> checkoutList) {
        this.checkoutList = checkoutList;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String customerFeedback) {
        this.feedback = customerFeedback;
    }
        
}
