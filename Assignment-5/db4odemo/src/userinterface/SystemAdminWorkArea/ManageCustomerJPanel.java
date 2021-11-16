/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vijay
 */
public class ManageCustomerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageCustomerJPanel
     */
    
    JPanel userProcessContainer;
    EcoSystem system;
    UserAccountDirectory userList;
    UserAccount user;
    public ManageCustomerJPanel(UserAccount user, EcoSystem system) {
        initComponents();
//        this.userProcessContainer=userProcessContainer;

        this.user=user;
        this.system=system;
        displayTable();
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
        tblCustomerContent = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCustName = new javax.swing.JTextField();
        txtCustAddress = new javax.swing.JTextField();
        txtCustContactNo = new javax.swing.JTextField();
        txtCustUsername = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        txtCustPassword = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Customer Information");

        tblCustomerContent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "Address", "Contact", "Username", "Password"
            }
        ));
        tblCustomerContent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCustomerContentMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCustomerContent);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Address");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Contact Number:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Username");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Password");

        txtCustAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustAddressActionPerformed(evt);
            }
        });

        btnSave.setText("Save Customer");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        txtCustPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCustName)
                            .addComponent(txtCustAddress)
                            .addComponent(txtCustContactNo)
                            .addComponent(txtCustUsername)
                            .addComponent(txtCustPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSave)
                                .addGap(63, 63, 63)
                                .addComponent(btnUpdate)
                                .addGap(72, 72, 72)
                                .addComponent(btnDelete))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(75, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCustName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCustAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCustContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCustUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtCustPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete)
                    .addComponent(btnSave))
                .addContainerGap(68, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtCustAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCustAddressActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        
             if( txtCustName.getText().isEmpty()||txtCustAddress.getText().isEmpty()|| txtCustContactNo.getText().isEmpty() || txtCustUsername.getText().isEmpty() || txtCustPassword.getText().isEmpty()){
               JOptionPane.showMessageDialog(null, "Fields cannot be empty");
               return;
             }
         if(system.getUserAccountDirectory().checkIfUsernameIsUnique(txtCustUsername.getText())){
               Customer addCustomer = new Customer(txtCustUsername.getText(), txtCustPassword.getText(), txtCustName.getText(), txtCustAddress.getText(), txtCustContactNo.getText());
               
            system.getUserAccountDirectory().addUserAccount(addCustomer); 
            system.getCustomerDirectory().createCustomer(addCustomer);
            
         
            displayTable();

             txtCustName.setText("");
           txtCustAddress.setText("");
          txtCustContactNo.setText("");
          txtCustUsername.setText("");
            txtCustPassword.setText("");
            
             
         }
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int rNum= tblCustomerContent.getSelectedRow();
        int flag=1;
        if(rNum<0){
            JOptionPane.showMessageDialog(this, "Please select a row to update");
            return;
        }
        if((txtCustName.getText()==null)|| (txtCustName.getText().trim().isEmpty())){
            JOptionPane.showMessageDialog(null,"Please enter a valid Customer Name");   
           flag=0;  
        }
        
         if((txtCustAddress.getText()==null)|| (txtCustAddress.getText().trim().isEmpty())){
            JOptionPane.showMessageDialog(null,"Please enter a valid Customer Address");   
           flag=0;  
        }
         
          if((txtCustContactNo.getText()==null)|| (txtCustContactNo.getText().trim().isEmpty())){
            JOptionPane.showMessageDialog(null,"Please enter a valid Customer Contact Number");   
           flag=0;  
        }
          
         if((txtCustUsername.getText()==null)|| (txtCustUsername.getText().trim().isEmpty())){
            JOptionPane.showMessageDialog(null,"Please enter a valid Customer Name");   
           flag=0;  
        }
         
         if(txtCustPassword.getText()==null || (txtCustPassword.getText().toString().trim().isEmpty())){
                         JOptionPane.showMessageDialog(null,"Please enter a valid Password"); 
             flag=0;
         }
         
         if(flag==1){
             Customer customerUpdate = system.getCustomerDirectory().getCustomerList().get(rNum);
             customerUpdate.setCustomerName(txtCustName.getText());
             customerUpdate.setCustomerAddress(txtCustAddress.getText());
             customerUpdate.setMobileNumber(txtCustContactNo.getText());
             customerUpdate.setUsername(txtCustUsername.getText());
             customerUpdate.setPassword(txtCustPassword.getText());
             system.getCustomerDirectory().getCustomerList().set(rNum, customerUpdate);
             displayTable();
         }
          
        
        
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tblCustomerContentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCustomerContentMouseClicked
        // TODO add your handling code here:
        
        int rNum = tblCustomerContent.getSelectedRow();
        Customer currentCustomer = system.getCustomerDirectory().getCustomerList().get(rNum);
        txtCustName.setText(tblCustomerContent.getModel().getValueAt(rNum, 0).toString());
        txtCustAddress.setText(tblCustomerContent.getModel().getValueAt(rNum, 1).toString());
        txtCustContactNo.setText(tblCustomerContent.getModel().getValueAt(rNum, 2).toString());
        txtCustUsername.setText(tblCustomerContent.getModel().getValueAt(rNum, 3).toString());
        txtCustPassword.setText(tblCustomerContent.getModel().getValueAt(rNum, 4).toString());
        
    }//GEN-LAST:event_tblCustomerContentMouseClicked

    private void txtCustPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCustPasswordActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        
        int rNum = tblCustomerContent.getSelectedRow();
        if(rNum<0){
            JOptionPane.showMessageDialog(this, "Please select a row to delete");
            return;
        }
        
         else {
           Customer deleteCustomer = system.getCustomerDirectory().getCustomerList().get(rNum);
           CustomerDirectory customerDirectory = system.getCustomerDirectory();
            customerDirectory.removeCustomer(deleteCustomer);
            JOptionPane.showMessageDialog(null, "Customer "  + txtCustUsername.getText() + " has been deleted");
            displayTable();
            txtCustName.setText("");
            txtCustAddress.setText("");
            txtCustContactNo.setText("");
            txtCustUsername.setText("");
            txtCustPassword.setText("");
         }
        
        
        
    }//GEN-LAST:event_btnDeleteActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCustomerContent;
    private javax.swing.JTextField txtCustAddress;
    private javax.swing.JTextField txtCustContactNo;
    private javax.swing.JTextField txtCustName;
    private javax.swing.JTextField txtCustPassword;
    private javax.swing.JTextField txtCustUsername;
    // End of variables declaration//GEN-END:variables

    private void displayTable() {
            
        DefaultTableModel model = (DefaultTableModel) tblCustomerContent.getModel();
        model.setRowCount(0);
        for (Customer c : system.getCustomerDirectory().getCustomerList()){
             Object[] row = new Object[5];
              
                    row[0] = c.getCustomerName();
                    row[1] = c.getCustomerAddress();
                    row[2] = c.getMobileNumber();
                    row[3] = c.getUsername();
                    row[4]= c.getPassword();
                    model.addRow(row);
                    
        }
    }
}
