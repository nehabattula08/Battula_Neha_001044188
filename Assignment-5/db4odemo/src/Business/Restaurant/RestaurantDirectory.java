/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class RestaurantDirectory {
    
    private ArrayList <Restaurant> restaurantList = new ArrayList<>();

    public ArrayList<Restaurant> getRestaurantList() {
        return restaurantList;
    }

    public void setRestaurantList(ArrayList<Restaurant> restaurantList) {
        this.restaurantList = restaurantList;
    }
    
     public void createRestaurant(Restaurant restaurant){
        restaurantList.add(restaurant);
       
    }
     
     public void deleteRestaurant(Restaurant restaurant){
         restaurantList.remove(restaurant);
     }
    
    
    
}
