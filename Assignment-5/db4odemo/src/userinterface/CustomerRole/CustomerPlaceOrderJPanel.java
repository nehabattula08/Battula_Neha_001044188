/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Restaurant.Dish;
import Business.Restaurant.Menu;

import Business.Restaurant.Restaurant;
import Business.Restaurant.RestaurantDirectory;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.CheckoutItems;
import Business.WorkQueue.OrderCheckoutRequest;
import Business.WorkQueue.WorkQueue;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vijay
 */
public class CustomerPlaceOrderJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerOrderJPanel
     */
    
    private JPanel userProcessContainer;
    public EcoSystem system;
    private UserAccount userAccount;
    private RestaurantDirectory restdir;
    private ArrayList <Integer> quantityList;
    private ArrayList <Double>  priceList; 
    private int index=-1;
     private final List<CheckoutItems> checkoutList  = new ArrayList<>();
    Customer customer;
        DefaultListModel<String> listModel;
    public CustomerPlaceOrderJPanel(JPanel userProcessContainer, EcoSystem system, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.system=system;
        this.userAccount = userAccount;
        customer = (Customer)userAccount;
        //txtQuantity.setVisible(false);
        restdir= system.getRestaurantDirectory();
        priceList = new ArrayList<>();
        quantityList = new ArrayList<>();
        getRestaurantData();
        
       
    }
    //filling listModel with all restaurants
    public void getRestaurantData(){
        
     restdir= system.getRestaurantDirectory();
      index=0;  
     listModel = new DefaultListModel<>();
        
     fillCombobox(restdir.getRestaurantList());
    }
    
    private void populateTotalPrice() {
//        double total = 0.0;
//        cartTable.setRowCount(0);
//        for (ItemWithQuantity itemWithQuantity : itemsWithQuantityList) {
//            Object[] row = new Object[cartTable.getColumnCount()];
//            row[0] = itemWithQuantity;
//            row[1] = itemWithQuantity.getQuantity();
//            row[2] = itemWithQuantity.getItem().getPrice() * itemWithQuantity.getQuantity();
//            total += itemWithQuantity.getItem().getPrice() * itemWithQuantity.getQuantity();
//            cartTable.addRow(row);
//        }
//        totalPrice.setText(total + "");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        restComboBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrder = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblCheckout = new javax.swing.JTable();
        txtMessage = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setBackground(new java.awt.Color(255, 204, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Customer Order");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Choose Restaurant:");

        restComboBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                restComboBoxMouseClicked(evt);
            }
        });
        restComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restComboBoxActionPerformed(evt);
            }
        });

        tblOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Dish", "Dish Name", "Dish Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblOrderMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblOrder);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Cart");

        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Total:");

        jButton1.setText("Place Order");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tblCheckout.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "Quantity", "Price"
            }
        ));
        jScrollPane3.setViewportView(tblCheckout);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Message:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jLabel5)))
                        .addGap(18, 18, 18)
                        .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(restComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(143, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(332, 332, 332))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(137, 137, 137))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(restComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(27, 27, 27)
                .addComponent(jButton1)
                .addContainerGap(179, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
 private int quantity = 0;
    private void tblOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOrderMouseClicked
        // TODO add your handling code here:
        try{
        DefaultTableModel tblModel = (DefaultTableModel) tblOrder.getModel();
//      get row data from table
   //txtName.setText(tblMenu.getModel().getValueAt(rNum,0).toString());
        //txtPrice.setText(tblMenu.getModel().getValueAt(rNum,1).toString());
		
		
		
       /* String name = tblModel.getValueAt(tblOrder.getSelectedRow(), 0).toString();
        String price = tblModel.getValueAt(tblOrder.getSelectedRow(), 0).toString();
        double d = Double.parseDouble(price);
        Dish dish= new Dish();
        dish.setName(name);
        dish.setPrice(d);*/
       Dish dish = (Dish) tblModel.getValueAt(tblOrder.getSelectedRow(), 0);
        
        int rNum = tblOrder.getSelectedRow();
                if (rNum >= 0) {
                    
                      // Dish dish= (Dish)  tblOrder.getModel().getValueAt(rNum,0);
                       
                    //Dish item = (Dish) tblOrder.getValueAt(rNum, 0);
                    if (dish != null) {
                        
                        
                        
                        String response = JOptionPane.showInputDialog("Please provide Quantity");
                        try {
                           quantity = Integer.parseInt(response);
                        } catch (NumberFormatException e) {

                        }
                        if (quantity != 0) {
                            CheckoutItems checkout = new CheckoutItems(dish, quantity);
                            checkoutList.add(checkout);
                          
                            System.out.println("QUANTITY : " + quantity);
                           displayCartTable();
                        }

                    }
                }
          
       
        
    
        //listModel.addElement(name);
        //listModel.addElement(name);
//        jList1.setModel(listModel);
        //Double price;
//         price = (Double)tblOrder.getValueAt(tblOrder.getSelectedRow(), 1);
//         
       // Double price1 = (Double)price;
//        priceList.add(price);
//        calculateTotal();
//        
     
//      set data from table to textfields
//        jTextFieldId.setText(id);
//        jTextFieldName.setText(name);
//        jTextFieldUserName.setText(username);
//        jTextFieldAddress.setText(address);
//        jTextFieldContact.setText(contact);



        }
        catch(Exception e){
            throw e;
        }
    }//GEN-LAST:event_tblOrderMouseClicked
  //private int index = -1;
  
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
           if (checkoutList.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Cart is empty");
          
          }
           else {
            OrderCheckoutRequest checkoutRequest = new OrderCheckoutRequest();
            checkoutRequest.setItemsWithQualityList(checkoutList);
           
            checkoutRequest.setMessage(txtMessage.getText());
            if (customer != null) {
                checkoutRequest.setCustomer(customer);
            } else {
                System.out.println("No data in Customer");
              
            }
            
            index= restComboBox.getSelectedIndex();
            Restaurant restaurant = restdir.getRestaurantList().get(index);
           
            if (restaurant != null) {
                checkoutRequest.setRestaurant(restaurant);
            } else {
                System.out.println("Restaurant is null");
              
            }
            checkoutRequest.setRequestDate(new Date());
            checkoutRequest.setStatus("Ordered");
            
            WorkQueue wq = new WorkQueue();
            wq.addWorkRequest(checkoutRequest);
            system.setWorkQueue(wq);
//             if(system.getWorkQueue()==null)
//            {
//                List<WorkRequest> workQueue=new ArrayList<>();
//            }
//            
//            system.getWorkQueue().addWorkRequest(checkoutRequest);
//       
        }
         
           JOptionPane.showMessageDialog(null, "Ordered has been placed successfully");
//            OrderStatusJPanel orderStatusJPanel = new OrderStatusJPanel(userProcessContainer, ecosystem, customer);
//            userProcessContainer.add("OrderStatusJPanel", orderStatusJPanel);
          
//            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//            layout.next(userProcessContainer);
//        populateItemsWithQuantityTable();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void displayTable(){
        DefaultTableModel model = (DefaultTableModel) tblOrder.getModel();
        model.setRowCount(0);
        //createAddToCartButton();
        Restaurant restaurant = restdir.getRestaurantList().get(index);
        Menu menu = restaurant.getMenu();
        if(menu !=null){
                  List<Dish> dishes = menu.getDishList();
                for(Dish dish: menu.getDishList()){
             Object[] row = new Object[3];
              
                    row[0] = dish;
                    row[1]= dish.getName();
                    row[2] = dish.getPrice();
                 
                    model.addRow(row);
                    
           }
        }
           
        
    }
    private void restComboBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_restComboBoxMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_restComboBoxMouseClicked
 
 
    private void restComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restComboBoxActionPerformed
        // TODO add your handling code here:
          index = restComboBox.getSelectedIndex();
        //clear of the selected items
//        itemsWithQuantityList.clear();
        displayTable();
    }//GEN-LAST:event_restComboBoxActionPerformed

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed
      // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JComboBox<String> restComboBox;
    private javax.swing.JTable tblCheckout;
    private javax.swing.JTable tblOrder;
    private javax.swing.JTextField txtMessage;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables

//   private void displayMenu(ArrayList<Restaurant> restaurantList) {
//       try{
//        
//           
//        Menu menu = restaurant.getMenu();
//        DefaultTableModel model = (DefaultTableModel) tblOrder.getModel();
//        
//        
//        model.setRowCount(0);
//        
//          for(Dish dish: menu.getDishList()){
//             Object[] row = new Object[2];
//              
//                    row[0] = dish.getName();
//                    row[1] = dish.getPrice();
//                 
//                    model.addRow(row);
//                    
//           }
//         }
//    catch(Exception e){
//         throw e;
//     }
//    }

    private void fillCombobox(ArrayList<Restaurant> restaurantList) {
       for (Restaurant restaurant : restaurantList) {
            restComboBox.addItem(restaurant.getRestaurantName());
        }
    }


    private void displayCartTable() {
        DefaultTableModel model = (DefaultTableModel) tblCheckout.getModel();
        model.setRowCount(0);
        double total = 0.0;
     
        for (CheckoutItems checkout : checkoutList) {
            Object[] row = new Object[tblCheckout.getColumnCount()];
            row[0] = checkout;
            row[1] = checkout.getQuantilty();
            row[2] = checkout.getDish().getPrice() * checkout.getQuantilty();
            total += checkout.getDish().getPrice() * checkout.getQuantilty();
            model.addRow(row);
        }
        txtPrice.setText(total + "");
        
        
        
    }
}
