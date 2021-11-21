/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantAdminRole;

import Business.DeliveryMan.DeliveryMan;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.EcoSystem;
import Business.Restaurant.Restaurant;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.OrderCheckoutRequest;
import Business.WorkQueue.WorkRequest;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vijay
 */
public class ManageRestaurantOrderJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageRestaurantOrderJPanel
     */
    
    JPanel userProcessContainer;
    EcoSystem system;
    UserAccountDirectory userAccountList;
    private List<WorkRequest> workRequestList;
    UserAccount account;
    private DeliveryManDirectory deliverymen;
   // deliverymen= system.getDeliveryManDirectory();
	 
    public ManageRestaurantOrderJPanel(JPanel userProcessContainer, EcoSystem system,UserAccount account) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.account=account;
        this.system=system;
        displayRestaurantOrder();       
        fillDeliveryComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblRestaurantOrder = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        deliveryComboBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        btnDecline = new javax.swing.JButton();
        btnAccept = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 204));

        tblRestaurantOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "default", "Customer Name", "Status", "Request Date", "Comment", "Customer Feedback"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblRestaurantOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRestaurantOrderMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblRestaurantOrder);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Manage Order");

        jLabel2.setText("Assign to a Delivery man:");

        btnDecline.setBackground(new java.awt.Color(255, 255, 255));
        btnDecline.setText("Decline");
        btnDecline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeclineActionPerformed(evt);
            }
        });

        btnAccept.setBackground(new java.awt.Color(255, 255, 255));
        btnAccept.setText("Accept");
        btnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(332, 332, 332)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(btnAccept)))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDecline)
                            .addComponent(deliveryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(deliveryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAccept)
                    .addComponent(btnDecline))
                .addGap(66, 66, 66))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed
        // TODO add your handling code here:
        
//        DeliveryMan dMan = (DeliveryMan) deliveryComboBox.getSelectedItem();
//        system.getWorkQueue().getWorkRequestList();
      try{
        int index= deliveryComboBox.getSelectedIndex();
        DeliveryMan deliveryMan = system.getDeliveryManDirectory().getDeliveryList().get(index);
        
        WorkRequest workRequest=(WorkRequest) tblRestaurantOrder.getModel().getValueAt(tblRestaurantOrder.getSelectedRow(), 0);
        workRequest.setDeliveryMan(deliveryMan);
        workRequest.setStatus("Accepted");
        JOptionPane.showMessageDialog(null,"Your order has been accepted");
        displayRestaurantOrder();
      }
      catch(Exception e){
          throw e;
      }
      
      
        
        
    }//GEN-LAST:event_btnAcceptActionPerformed

    private void tblRestaurantOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRestaurantOrderMouseClicked
        // TODO add your handling code here:
        
//        int row = tblRestaurantOrder.getSelectedRow();
//        
//        
//        tblRestaurantOrder.getModel().getValueAt(row, WIDTH).toString();
        
    }//GEN-LAST:event_tblRestaurantOrderMouseClicked

    private void btnDeclineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeclineActionPerformed
        // TODO add your handling code here:
        int index= deliveryComboBox.getSelectedIndex();
        if(index<1){
        DeliveryMan deliveryMan = system.getDeliveryManDirectory().getDeliveryList().get(index);
        
        WorkRequest workRequest=(WorkRequest) tblRestaurantOrder.getModel().getValueAt(tblRestaurantOrder.getSelectedRow(), 0);
        workRequest.setDeliveryMan(deliveryMan);
        workRequest.setStatus("Declined");
        JOptionPane.showMessageDialog(null,"Your order has been declined");
        displayRestaurantOrder();
        }
        
    }//GEN-LAST:event_btnDeclineActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccept;
    private javax.swing.JButton btnDecline;
    private javax.swing.JComboBox<String> deliveryComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRestaurantOrder;
    // End of variables declaration//GEN-END:variables

    private void displayRestaurantOrder() {
        
        try{
            DefaultTableModel model = (DefaultTableModel) tblRestaurantOrder.getModel();
            model.setRowCount(0);
            
            tblRestaurantOrder.getColumnModel().getColumn(0).setMinWidth(0);
            tblRestaurantOrder.getColumnModel().getColumn(0).setMaxWidth(0);
            workRequestList= system.getWorkQueue().getWorkRequestListRestaurant(account);
           // OrderCheckoutRequest oc = new OrderCheckoutRequest();
           
            
           // oc.getId()
            for (WorkRequest workrequest : workRequestList) {
             Object[] row = new Object[6];
             
             row[0]= workrequest;
             row[1]=workrequest.getCustomer();
             row[2]= workrequest.getStatus();
             row[3]= workrequest.getRequestDate();
             row[4]= workrequest.getMessage();
             if(workrequest.getFeedback() != null){
                 row[5]= workrequest.getFeedback();
             }
             else{
                 row[5]= "Customer Feedback not received";
             }
             model.addRow(row);        
         }
        }    
        
        catch(Exception e){
            
            
        }
        
        
    }

    private void fillDeliveryComboBox() {
     for(DeliveryMan dm: system.getDeliveryManDirectory().getDeliveryList()){
         deliveryComboBox.addItem(dm.getDeliveryName());
         
     }  
        
    }
}
