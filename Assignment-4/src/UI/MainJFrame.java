/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import javax.swing.ImageIcon;
import model.Patient;
import model.PatientDirectory;
import model.Person;
import model.PersonDirectory;
import model.System;
/**
 *
 * @author Neha
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form JFrame
     */
    System system;
    Person person;
    Patient patient;
    PersonDirectory persondirectory;
    PatientDirectory patientdirectory;
    
    ImageIcon medical = new ImageIcon("medical.jpg");
    
    
    public MainJFrame() {
        initComponents();
      lblMedical.setIcon(medical);
       patient = new Patient();
        //populate existing person directory
        
        patientdirectory = model.System.getPatientdirectory();
            
       // persondirectory = //method call;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        controlPanel = new javax.swing.JPanel();
        btnRegister = new javax.swing.JButton();
        btnVisitClinic = new javax.swing.JButton();
        viewPatient = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        workArea = new javax.swing.JPanel();
        lblMedical = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        controlPanel.setBackground(new java.awt.Color(255, 255, 255));

        btnRegister.setBackground(new java.awt.Color(51, 153, 255));
        btnRegister.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister.setText("Register A Patient");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        btnVisitClinic.setBackground(new java.awt.Color(0, 153, 255));
        btnVisitClinic.setForeground(new java.awt.Color(255, 255, 255));
        btnVisitClinic.setText("Visit A Clinic");
        btnVisitClinic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisitClinicActionPerformed(evt);
            }
        });

        viewPatient.setBackground(new java.awt.Color(0, 153, 255));
        viewPatient.setForeground(new java.awt.Color(255, 255, 255));
        viewPatient.setText("Manage Patient");
        viewPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPatientActionPerformed(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(0, 153, 255));
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("Search Patient");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlPanelLayout = new javax.swing.GroupLayout(controlPanel);
        controlPanel.setLayout(controlPanelLayout);
        controlPanelLayout.setHorizontalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSearch, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, controlPanelLayout.createSequentialGroup()
                        .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(viewPatient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnVisitClinic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        controlPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnRegister, btnVisitClinic, viewPatient});

        controlPanelLayout.setVerticalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(btnRegister)
                .addGap(35, 35, 35)
                .addComponent(btnVisitClinic)
                .addGap(44, 44, 44)
                .addComponent(viewPatient)
                .addGap(31, 31, 31)
                .addComponent(btnSearch)
                .addContainerGap(270, Short.MAX_VALUE))
        );

        controlPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnRegister, btnVisitClinic, viewPatient});

        splitPane.setLeftComponent(controlPanel);

        workArea.setBackground(new java.awt.Color(51, 153, 255));

        lblMedical.setBackground(new java.awt.Color(102, 204, 255));
        lblMedical.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome To the Clinic");

        javax.swing.GroupLayout workAreaLayout = new javax.swing.GroupLayout(workArea);
        workArea.setLayout(workAreaLayout);
        workAreaLayout.setHorizontalGroup(
            workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 683, Short.MAX_VALUE)
            .addComponent(lblMedical, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        workAreaLayout.setVerticalGroup(
            workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, workAreaLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addComponent(lblMedical, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        splitPane.setRightComponent(workArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(splitPane)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
      
        createJPanel createPanel= new createJPanel(patient,patientdirectory);
        splitPane.setRightComponent(createPanel);
       
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void viewPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPatientActionPerformed
            // TODO add your handling code here:
            
            ViewJPanel1 viewPanel1 = new ViewJPanel1(patientdirectory);
            splitPane.setRightComponent(viewPanel1);
    }//GEN-LAST:event_viewPatientActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
            searchJPanel searchPanel = new searchJPanel(patient, patientdirectory);
            splitPane.setRightComponent(searchPanel);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnVisitClinicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisitClinicActionPerformed
        // TODO add your handling code here:
        ApointmentJPanel appointmentPanel = new ApointmentJPanel(patient,patientdirectory);
        splitPane.setRightComponent(appointmentPanel);
    }//GEN-LAST:event_btnVisitClinicActionPerformed

    /**
     * @param args the command line arguments
     */
    // create method that adds new persons and adds them to person directory.
   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnVisitClinic;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblMedical;
    private javax.swing.JSplitPane splitPane;
    private javax.swing.JButton viewPatient;
    private javax.swing.JPanel workArea;
    // End of variables declaration//GEN-END:variables
}
