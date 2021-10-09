/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import com.toedter.calendar.JYearChooser;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.UberCar;
import model.UberList;

/**
 *
 * @author Neha
 */
public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    
    UberList cars;
    UberCar selectCar;
    public ViewJPanel(UberList cars) {
        initComponents();
        this.cars=cars; 
        
        populateTable();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RegisterjLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCars = new javax.swing.JTable();
        btnSubmit = new javax.swing.JButton();
        availabilityYes = new javax.swing.JRadioButton();
        availabilityNo = new javax.swing.JRadioButton();
        modelComboBox = new javax.swing.JComboBox<>();
        BostonCheckBox = new javax.swing.JCheckBox();
        NewJerseyCheckBox = new javax.swing.JCheckBox();
        DallasCheckBox = new javax.swing.JCheckBox();
        OregonCheckBox = new javax.swing.JCheckBox();
        JDateExp = new com.toedter.calendar.JDateChooser();
        ManufacturingDate = new javax.swing.JButton();
        Seats = new javax.swing.JButton();
        SerialNo = new javax.swing.JButton();
        txtSerialNo = new javax.swing.JTextField();
        modelNo = new javax.swing.JButton();
        cityAvailability = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        yesPassengerRadioButton = new javax.swing.JRadioButton();
        noPassengerRadioButton = new javax.swing.JRadioButton();
        carName = new javax.swing.JButton();
        carManufacturing = new javax.swing.JButton();
        CarManufacturerjLabel = new javax.swing.JLabel();
        passengerCar = new javax.swing.JButton();
        txtCarName = new javax.swing.JTextField();
        txtCarManufacturer = new javax.swing.JTextField();
        txtNoOfSeats = new javax.swing.JTextField();
        jYearChooser = new com.toedter.calendar.JYearChooser();
        carAvailability = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        RegisterjLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        RegisterjLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RegisterjLabel.setText("     View Car Details");
        RegisterjLabel.setPreferredSize(new java.awt.Dimension(140, 24));

        tblCars.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Car Name", "Car Manufacturer", "Passenger Car Availability", "Car Availability", "Manufacturer Year", "No. Of Seats", "Serial Number", "Model Number", "Maintenance Certificate Date", "Car Available in Cities"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCars.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCarsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCars);

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        availabilityYes.setText("Yes");

        availabilityNo.setText("No");
        availabilityNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                availabilityNoActionPerformed(evt);
            }
        });

        modelComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "VX", "SUV", "HatchBack", "VI" }));
        modelComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modelComboBoxActionPerformed(evt);
            }
        });

        BostonCheckBox.setText("Boston");

        NewJerseyCheckBox.setText("New Jersey");

        DallasCheckBox.setText("Dallas");

        OregonCheckBox.setText("Oregon");

        ManufacturingDate.setText("Manufacturing Year");
        ManufacturingDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManufacturingDateActionPerformed(evt);
            }
        });

        Seats.setText("No of Seats");

        SerialNo.setText("Serial No");

        modelNo.setText("Model No.");

        cityAvailability.setText("Available Cities");

        jButton2.setText("Maintainance Certificate Date");

        yesPassengerRadioButton.setText("Yes");

        noPassengerRadioButton.setText("No");
        noPassengerRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noPassengerRadioButtonActionPerformed(evt);
            }
        });

        carName.setText("Car Name:");
        carName.setToolTipText("Enter car name");
        carName.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        carName.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        carName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carNameActionPerformed(evt);
            }
        });

        carManufacturing.setText("Car Manufacturer:");
        carManufacturing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carManufacturingActionPerformed(evt);
            }
        });

        passengerCar.setText("Is it a Passenger Car?");
        passengerCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passengerCarActionPerformed(evt);
            }
        });

        txtCarName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCarNameActionPerformed(evt);
            }
        });

        txtCarManufacturer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCarManufacturerActionPerformed(evt);
            }
        });

        txtNoOfSeats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoOfSeatsActionPerformed(evt);
            }
        });

        carAvailability.setText("Is the car available?");

        jLabel1.setText("To update a particular row, click on the row from the above table");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RegisterjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cityAvailability)
                    .addComponent(modelNo, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SerialNo, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Seats, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ManufacturingDate, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carAvailability, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passengerCar)
                    .addComponent(carManufacturing)
                    .addComponent(carName, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 249, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jYearChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CarManufacturerjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCarManufacturer, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BostonCheckBox)
                                .addGap(18, 18, 18)
                                .addComponent(NewJerseyCheckBox)
                                .addGap(32, 32, 32)
                                .addComponent(DallasCheckBox)
                                .addGap(18, 18, 18)
                                .addComponent(OregonCheckBox))
                            .addComponent(JDateExp, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(modelComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSerialNo, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNoOfSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(availabilityYes)
                                .addGap(18, 18, 18)
                                .addComponent(availabilityNo))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(yesPassengerRadioButton)
                                .addGap(18, 18, 18)
                                .addComponent(noPassengerRadioButton))
                            .addComponent(txtCarName, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(246, 246, 246))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(318, 318, 318)
                        .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(RegisterjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(carName)
                    .addComponent(txtCarName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(carManufacturing)
                    .addComponent(txtCarManufacturer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passengerCar)
                    .addComponent(yesPassengerRadioButton)
                    .addComponent(noPassengerRadioButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(carAvailability)
                    .addComponent(availabilityYes)
                    .addComponent(availabilityNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(CarManufacturerjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ManufacturingDate)
                            .addComponent(jYearChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Seats)
                    .addComponent(txtNoOfSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SerialNo)
                    .addComponent(txtSerialNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modelNo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modelComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BostonCheckBox)
                    .addComponent(NewJerseyCheckBox)
                    .addComponent(DallasCheckBox)
                    .addComponent(OregonCheckBox)
                    .addComponent(cityAvailability))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JDateExp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(15, 15, 15)
                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void modelComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modelComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modelComboBoxActionPerformed

    private void ManufacturingDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManufacturingDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ManufacturingDateActionPerformed

    private void noPassengerRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noPassengerRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noPassengerRadioButtonActionPerformed

    private void carNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_carNameActionPerformed

    private void carManufacturingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carManufacturingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_carManufacturingActionPerformed

    private void passengerCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passengerCarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passengerCarActionPerformed

    private void txtNoOfSeatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoOfSeatsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNoOfSeatsActionPerformed

    private void availabilityNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_availabilityNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_availabilityNoActionPerformed

    private void txtCarNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCarNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCarNameActionPerformed

    private void tblCarsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCarsMouseClicked
        // TODO add your handling code here:
       int rowNumber=tblCars.getSelectedRow();
       
       UberCar car= cars.getCars().get(rowNumber);
       txtCarName.setText(car.getCarName());
       txtCarManufacturer.setText(car.getCarManufacture());
       txtNoOfSeats.setText(String.valueOf(car.getNoOfSeats()));
       txtSerialNo.setText(String.valueOf(String.valueOf(car.getSerialNumber())));
       String passCar=car.getIsPassengerCarAvailable();
       if(passCar.equalsIgnoreCase("Yes")){
           yesPassengerRadioButton.setSelected(true);
       }
       else{
           noPassengerRadioButton.setSelected(true);
       }
       
       String carAvail=car.getCarAvailability();
       
       if(carAvail.equalsIgnoreCase("yes")){
           availabilityYes.setSelected(true);
       }
       else
           availabilityNo.setSelected(true);
      
       jYearChooser.setYear(car.getManufactureYear());
       JDateExp.setDate(car.getMaintenanceCertDate());
       
       modelComboBox.setSelectedItem(car.getModelNumber());
        

       for(String city: car.getAvailableCities()){
           if(city.equalsIgnoreCase("Boston"))
               BostonCheckBox.setSelected(true);
           else if(city.equalsIgnoreCase("New Jersey"))
               NewJerseyCheckBox.setSelected(true);
           
           else if(city.equalsIgnoreCase("Dallas"))
               DallasCheckBox.setSelected(true);
           else
               OregonCheckBox.setSelected(true);
       }
                   
       
    }//GEN-LAST:event_tblCarsMouseClicked

    private void txtCarManufacturerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCarManufacturerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCarManufacturerActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        //Updating to the car object
        int rowNumber=tblCars.getSelectedRow();
         if(rowNumber<0){
            JOptionPane.showMessageDialog(this, "Please select a row to update");
            return;
        }
        
        UberCar car2 = new UberCar();
        car2.setCarName(txtCarName.getText());
        car2.setCarManufacture(txtCarManufacturer.getText());
        
        if(yesPassengerRadioButton.isSelected())
            car2.setIsPassengerCarAvailable("Yes");
        
        else
            car2.setIsPassengerCarAvailable("No");
        
        
        if(availabilityYes.isSelected())
            car2.setCarAvailability("Yes");
        else
            car2.setCarAvailability("No");
        
        car2.setManufactureYear(jYearChooser.getYear());
        car2.setMaintenanceCertDate(JDateExp.getDate());
        car2.setNoOfSeats(Integer.parseInt(txtNoOfSeats.getText()));
        car2.setSerialNumber(Long.parseLong(txtSerialNo.getText()));
        car2.setModelNumber(modelComboBox.getSelectedItem().toString());
        List<String> availCities = new ArrayList<>();
        
        if(BostonCheckBox.isSelected()==true){
          availCities.add("Boston");
       }
        
        if(NewJerseyCheckBox.isSelected()==true){
             availCities.add("New Jersey");
       }
        
        
        if(DallasCheckBox.isSelected()==true){
          availCities.add("Dallas");
       }
       
       if(OregonCheckBox.isSelected()==true){
          availCities.add("Oregon");
       }
       
        car2.setAvailableCities(availCities); 
        cars.getCars().set(tblCars.getSelectedRow(), car2);
           
        populateTable();
        //combo box.
       
       
       
    }//GEN-LAST:event_btnSubmitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox BostonCheckBox;
    private javax.swing.JLabel CarManufacturerjLabel;
    private javax.swing.JCheckBox DallasCheckBox;
    private com.toedter.calendar.JDateChooser JDateExp;
    private javax.swing.JButton ManufacturingDate;
    private javax.swing.JCheckBox NewJerseyCheckBox;
    private javax.swing.JCheckBox OregonCheckBox;
    private javax.swing.JLabel RegisterjLabel;
    private javax.swing.JButton Seats;
    private javax.swing.JButton SerialNo;
    private javax.swing.JRadioButton availabilityNo;
    private javax.swing.JRadioButton availabilityYes;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton carAvailability;
    private javax.swing.JButton carManufacturing;
    private javax.swing.JButton carName;
    private javax.swing.JButton cityAvailability;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JYearChooser jYearChooser;
    private javax.swing.JComboBox<String> modelComboBox;
    private javax.swing.JButton modelNo;
    private javax.swing.JRadioButton noPassengerRadioButton;
    private javax.swing.JButton passengerCar;
    private javax.swing.JTable tblCars;
    private javax.swing.JTextField txtCarManufacturer;
    private javax.swing.JTextField txtCarName;
    private javax.swing.JTextField txtNoOfSeats;
    private javax.swing.JTextField txtSerialNo;
    private javax.swing.JRadioButton yesPassengerRadioButton;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel)tblCars.getModel();
        model.setRowCount(0);
        
        for(UberCar car1: cars.getCars()){
            Object[] row= new Object[10];
            row[0]=car1.getCarName();
            row[1]=car1.getCarManufacture();
            row[2]=car1.getIsPassengerCarAvailable();
            row[3]=car1.getCarAvailability();
            row[4]=car1.getManufactureYear();
            row[5]=car1.getNoOfSeats();
            row[6]=car1.getSerialNumber();
            row[7]=car1.getModelNumber();
            row[8]=car1.getMaintenanceCertDate();
            row[9]= car1.getAvailableCities();
        
            model.addRow(row);
        }
        
        
    }
}