/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantAdminRole;

import Business.EcoSystem;
import Business.Restaurant.Dish;
import Business.Restaurant.Menu;
import Business.Restaurant.Restaurant;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vijay
 */
public class ManageRestaurantMenuJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageRestaurantMenuJPanel
     */
    JPanel userProcessContainer;
    EcoSystem system;
    UserAccount account;
    Restaurant restaurant;
    public ManageRestaurantMenuJPanel(JPanel userProcessContainer, EcoSystem system, UserAccount account) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.account = account;
        restaurant = (Restaurant) account;
      
//       Dish dish1 = new Dish("water",2.0);
      // restaurant.getMenu().getDishList().add(dish1);
//       restaurant.getMenu().getDishList().set(0, d);


//      Menu menu1 = new Menu();
//       menu1.addDish(dish1);
//      restaurant.setMenu(menu1);
       displayTable();
     
//     try{
//        displayRestaurantMenu(account);}
//     catch(Exception e){
//         throw e;
//     }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMenu = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("View Menu");

        tblMenu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Dish Name", "Dish Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMenuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblMenu);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Dish Name:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Dish Price:");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });

        btnSave.setBackground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Save Dish");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update Dish");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(82, 82, 82)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSave)
                                .addGap(68, 68, 68)
                                .addComponent(btnUpdate)
                                .addGap(67, 67, 67)
                                .addComponent(btnDelete)))))
                .addContainerGap(193, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete))
                .addContainerGap(165, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        
         if (txtName.getText().isEmpty() || txtName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Kindly enter a valid price");
            return;
        }
       if(restaurant.getMenu().getDishList().size()>0){  
        for (Dish dish : restaurant.getMenu().getDishList()) {
            if (txtName.getText().equals(dish.getName())) {
                JOptionPane.showMessageDialog(null, "Dish already exists");
                return;
            }
        }
       } 
        double price = 0.0;
        try {
            price = Double.valueOf(txtPrice.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please enter a valid price");
            return;
        }
        int index= system.getRestaurantDirectory().getRestaurantList().indexOf(restaurant);
        
        Dish dish = new Dish(txtName.getText(), Double.valueOf(txtPrice.getText()));

        // ecosystem.getItemList().addItem(item);
        
        restaurant.getMenu().addDish(dish);
       
        System.out.println("hi");
         System.out.println(index);
         system.getRestaurantDirectory().getRestaurantList().set(index, restaurant);
//        
//        for(restaurant : system.getRestaurantDirectory().getRestaurantList())
//          system.getRestaurantDirectory().getRestaurantList().add(restaurant);
//        system.getRestaurantDirectory().createRestaurant(restaurant);
        
        
        displayTable();
        txtName.setText("");
        txtPrice.setText("");

    }//GEN-LAST:event_btnSaveActionPerformed

    private void tblMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMenuMouseClicked
        // TODO add your handling code here:
         int rNum = tblMenu.getSelectedRow();
        // Restaurant= system.getRestaurantDirectory().getRestaurantList().get(rNum);
        txtName.setText(tblMenu.getModel().getValueAt(rNum,0).toString());
        txtPrice.setText(tblMenu.getModel().getValueAt(rNum,1).toString());

         
        
    }//GEN-LAST:event_tblMenuMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        
        int rNum= tblMenu.getSelectedRow();
        int flag=1;
        if(rNum<0){
            JOptionPane.showMessageDialog(this, "Please select a row to update");
            return;
        }
        
        if((txtName.getText()==null)|| (txtName.getText().trim().isEmpty())){
            JOptionPane.showMessageDialog(null,"Please enter a valid Dish name");   
           flag=0;  
        }
        
         if((txtPrice.getText()==null)|| (txtPrice.getText().trim().isEmpty())){
            JOptionPane.showMessageDialog(null,"Please enter a valid Price");   
           flag=0;  
        }
         
         if(flag==1){  
       
        Dish d = new Dish(txtName.getText(),Double.parseDouble(txtPrice.getText()));
   
        restaurant.getMenu().getDishList().set(rNum, d);
        
        displayTable();
         }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
            int rNum = tblMenu.getSelectedRow();
         if(rNum<0){
            JOptionPane.showMessageDialog(this, "Please select a row to delete");
            return;
         }
            
         else {
             
            Dish dish =  restaurant.getMenu().getDishList().get(rNum);
            restaurant.getMenu().getDishList().remove(dish);
            //system.getRestaurantDirectory().getRestaurantList()
            Restaurant deleteRestaurant = system.getRestaurantDirectory().getRestaurantList().get(rNum);
                   
             
            JOptionPane.showMessageDialog(null, "Dish "  + txtName.getText() + " deleted");
            displayTable();
            txtName.setText("");
            txtPrice.setText("");
           
         }

    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblMenu;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables

   private void displayTable() {
         
         try{
         Menu menu = restaurant.getMenu();
        DefaultTableModel model = (DefaultTableModel) tblMenu.getModel();
        model.setRowCount(0);
        
          for(Dish dish: menu.getDishList()){
             Object[] row = new Object[2];
              
                    row[0] = dish.getName();
                    row[1] = dish.getPrice();
                 
                    model.addRow(row);
                    
           }
         }
    catch(Exception e){
         throw e;
     }
   }     
    
//    private void displayRestaurantMenu(UserAccount account) {
//      try{
//        for(Restaurant currentRestaurant: system.getRestaurantDirectory().getRestaurantList()){
//             if(account.getUsername().equals(currentRestaurant.getUsername())){             
//              displayTable(currentRestaurant);
//        }
//      }
//    }
//    catch(Exception e){
//        throw e;
//    }
//    
//}
}
