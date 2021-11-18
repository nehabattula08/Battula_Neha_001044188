/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author Vijay
 */
public class CustomerAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerAdminJPanel
     */
    JPanel userProcessContainer;
    EcoSystem system;
    UserAccount account;
    public CustomerAdminJPanel() {
       initComponents();
       this.userProcessContainer = userProcessContainer;
        this.system=system;
        this.account=account;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel2 = new javax.swing.JPanel();
        btnPlaceOrder = new javax.swing.JButton();
        btnOrderStatus = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();

        setLayout(new java.awt.CardLayout());

        btnPlaceOrder.setText("P1lace Order");
        btnPlaceOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaceOrderActionPerformed(evt);
            }
        });

        btnOrderStatus.setText("View Order Status");
        btnOrderStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderStatusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPlaceOrder)
                    .addComponent(btnOrderStatus))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(btnPlaceOrder)
                .addGap(37, 37, 37)
                .addComponent(btnOrderStatus)
                .addContainerGap(252, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel2);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 689, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 518, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(jPanel4);

        add(jSplitPane1, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btnPlaceOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaceOrderActionPerformed
        // TODO add your handling code here:
        CustomerPlaceOrderJPanel managecustorder = new CustomerPlaceOrderJPanel(userProcessContainer,system,account);
        jSplitPane1.setRightComponent(managecustorder);
    }//GEN-LAST:event_btnPlaceOrderActionPerformed

    private void btnOrderStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderStatusActionPerformed
        // TODO add your handling code here:
        
          CustomerOrderStatusJPanel managecustorder = new CustomerOrderStatusJPanel(userProcessContainer,system,account);
        jSplitPane1.setRightComponent(managecustorder);

      
    }//GEN-LAST:event_btnOrderStatusActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOrderStatus;
    private javax.swing.JButton btnPlaceOrder;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
