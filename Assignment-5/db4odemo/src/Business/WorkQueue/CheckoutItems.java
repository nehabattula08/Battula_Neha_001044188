/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Restaurant.Dish;

/**
 *
 * @author Vijay
 */
public class CheckoutItems {
    
    Dish dish;
    
    int quantity;

    public CheckoutItems(Dish dish, int quantity) {
        this.dish = dish;
        this.quantity = quantity;
    }

    public Dish getDish() {
        return dish;
    }

    public void setDish(Dish dish) {
        this.dish = dish;
    }

    public int getQuantilty() {
        return quantity;
    }

    public void setQuantilty(int quantity) {
        this.quantity = quantity;
    }
    
     public String toString(){
        if(dish != null){
            return dish.getName();
        }else{
          return "No dish";  
        } 
    }
    
    
}
