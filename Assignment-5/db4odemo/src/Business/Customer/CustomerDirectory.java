/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class CustomerDirectory {
    
    ArrayList <Customer> customerList = new ArrayList<Customer>();
    
    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList=customerList;
    }
    
     public void createCustomer (Customer addCustomer){
       
          customerList.add(addCustomer);  
        
     }
     
     public void removeCustomer(Customer removeCustomer ){
         customerList.remove(removeCustomer);
     }
     
    
}
