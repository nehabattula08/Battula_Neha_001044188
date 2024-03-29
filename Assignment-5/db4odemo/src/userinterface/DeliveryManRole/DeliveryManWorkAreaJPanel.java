/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DeliveryManRole;

import Business.EcoSystem;

import Business.UserAccount.UserAccount;
import Business.WorkQueue.OrderCheckoutRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class DeliveryManWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
   private List<WorkRequest> workRequests;
    
    /**
     * Creates new form LabAssistantWorkAreaJPanel
     */
    public DeliveryManWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
      
        
        populateTable();
    }
    
    public void populateTable(){
        
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        workRequestJTable.getColumnModel().getColumn(0).setMinWidth(0);
        workRequestJTable.getColumnModel().getColumn(0).setMaxWidth(0);
        model.setRowCount(0);
        workRequests = business.getWorkQueue().getWorkRequestListDeliveryMan(userAccount);
        for(WorkRequest workrequest: workRequests){
            Object[] row = new Object[5];
            row[0] = workrequest;
            row[1]=workrequest.getMessage();
            row[2]= workrequest.getRestaurant();
            row[3]= workrequest.getCustomer();  
            row[4]= workrequest.getStatus();
            model.addRow(row);
            
        }
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
        workRequestJTable = new javax.swing.JTable();
        processJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "obj", "Message", "Restaurant Name", "Customer Name", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);
        if (workRequestJTable.getColumnModel().getColumnCount() > 0) {
            workRequestJTable.getColumnModel().getColumn(0).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(1).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(2).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(3).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 590, 96));

        processJButton.setBackground(new java.awt.Color(255, 255, 255));
        processJButton.setText("Process");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });
        add(processJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, -1, -1));

        refreshJButton.setBackground(new java.awt.Color(255, 255, 255));
        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });
        add(refreshJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Delivery Status");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 30, 870, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Select a row to process the order");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed
      workRequestJTable.getColumnModel().getColumn(0).setMinWidth(0);
      workRequestJTable.getColumnModel().getColumn(0).setMaxWidth(0);
        
        //DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
      DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
     
     int index = workRequestJTable.getSelectedRow();
     if(index<0){
         JOptionPane.showMessageDialog(null, "Kindly select a row");
     }
     
     WorkRequest wq = (WorkRequest)workRequestJTable.getModel().getValueAt(index, 0);
     workRequestJTable.getModel().setValueAt("Delivered", index, 4);
     OrderCheckoutRequest orderCheckoutRequest;
      for(WorkRequest workRequest:business.getWorkQueue().getWorkRequestList())
      {
          orderCheckoutRequest=(OrderCheckoutRequest) workRequest;
          OrderCheckoutRequest tempId=(OrderCheckoutRequest)workRequestJTable.getModel().getValueAt(index, 0);
          if(orderCheckoutRequest.getId()==tempId.getId())
          {
              wq.setStatus("Delivered");
              
          }
      }
      populateTable();
        
    }//GEN-LAST:event_processJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton processJButton;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
