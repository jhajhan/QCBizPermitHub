/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

 package view;

 import javax.swing.ButtonGroup;
 import javax.swing.JOptionPane;

import model.Account;
import model.BusinessInput;

public class Step2 extends javax.swing.JPanel {

    BusinessInput bi;
     ButtonGroup ownedGroup;
     Account ac = new Account();

     MainFrame parentFrame;

    public Step2(Account ac, BusinessInput bi, MainFrame parentFrame) {
        initComponents();
        this.ac = ac;
        this.bi = bi;
        System.out.println(bi.getBusinessType());
        this.parentFrame = parentFrame;
        IfYesField.setEnabled(false); // Initially disable IfYesField
        ownedGroup = new ButtonGroup();
        ownedGroup.add(Yes);
        ownedGroup.add(No);
         
         
         setSize(931, 601);
         setPreferredSize(new java.awt.Dimension(931,601));
         setLocation(0,0);
    }
                       
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BusOperation = new javax.swing.JLabel();
        BusArea = new javax.swing.JLabel();
        BusAreaField = new javax.swing.JTextField();
        FloorArea = new javax.swing.JLabel();
        FloorAreaField = new javax.swing.JTextField();
        BusLoc = new javax.swing.JLabel();
        BusLocField = new javax.swing.JTextField();
        EmpEstab = new javax.swing.JLabel();
        Male = new javax.swing.JLabel();
        MaleField = new javax.swing.JTextField();
        Female = new javax.swing.JLabel();
        FemaleField = new javax.swing.JTextField();
        EmpQC = new javax.swing.JLabel();
        EmpQCField = new javax.swing.JTextField();
        Vehicles = new javax.swing.JLabel();
        Van = new javax.swing.JLabel();
        VanField = new javax.swing.JTextField();
        Motorcycle = new javax.swing.JLabel();
        MotorcycleField = new javax.swing.JTextField();
        Time = new javax.swing.JLabel();
        TimeField = new javax.swing.JTextField();
        Owned = new javax.swing.JLabel();
        Yes = new javax.swing.JRadioButton();
        No = new javax.swing.JRadioButton();
        IfYes = new javax.swing.JLabel();
        IfYesField = new javax.swing.JTextField();
        Capital = new javax.swing.JLabel();
        CapitalField = new javax.swing.JTextField();
        Designation = new javax.swing.JLabel();
        DesignationField = new javax.swing.JTextField();
        backButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(931, 601));
        setMinimumSize(new java.awt.Dimension(931, 601));

        jPanel1.setBackground(new java.awt.Color(221, 230, 237));

        BusOperation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/UPDATED_GUI_Logos/QCBPH_BO (200 x 50 px).png"))); // NOI18N

        BusArea.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        BusArea.setForeground(new java.awt.Color(39, 55, 77));
        BusArea.setText("Business Area (in sq. m.):");

        FloorArea.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        FloorArea.setForeground(new java.awt.Color(39, 55, 77));
        FloorArea.setText("Total Floor Area (in sq.m.):");

        BusLoc.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        BusLoc.setForeground(new java.awt.Color(39, 55, 77));
        BusLoc.setText("Business Location Address:");

        EmpEstab.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        EmpEstab.setForeground(new java.awt.Color(39, 55, 77));
        EmpEstab.setText("Total No. of Employees in Establishment:");

        Male.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        Male.setForeground(new java.awt.Color(39, 55, 77));
        Male.setText("Male:");

        Female.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        Female.setForeground(new java.awt.Color(39, 55, 77));
        Female.setText("Female:");

        EmpQC.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        EmpQC.setForeground(new java.awt.Color(39, 55, 77));
        EmpQC.setText("No. of Employees Residing within QC :");

        Vehicles.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        Vehicles.setForeground(new java.awt.Color(39, 55, 77));
        Vehicles.setText("No. of Delivery Vehicles (If applicable):");

        VanField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VanFieldActionPerformed(evt);
            }
        });

        Van.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        Van.setForeground(new java.awt.Color(39, 55, 77));
        Van.setText("Van / Truck:");

        Motorcycle.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        Motorcycle.setForeground(new java.awt.Color(39, 55, 77));
        Motorcycle.setText("Motorcycle:");

        Time.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        Time.setForeground(new java.awt.Color(39, 55, 77));
        Time.setText("Time of Operation:");

        Owned.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        Owned.setForeground(new java.awt.Color(39, 55, 77));
        Owned.setText("Owned:");

        Yes.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        Yes.setForeground(new java.awt.Color(39, 55, 77));
        Yes.setBackground(new java.awt.Color(221, 230, 237));
        Yes.setText("Yes");
        Yes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YesActionPerformed(evt);
            }
        });


        No.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        No.setForeground(new java.awt.Color(39, 55, 77));
        No.setBackground(new java.awt.Color(221, 230, 237));
        No.setText("No");
        No.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoActionPerformed(evt);
            }
        });

        IfYes.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        IfYes.setForeground(new java.awt.Color(39, 55, 77));
        IfYes.setText("If yes (Property Identification No.):");

        Capital.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        Capital.setForeground(new java.awt.Color(39, 55, 77));
        Capital.setText("Total Capital Investment (Paid up Capital + Lease Expenses + Equipments):");

        Designation.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        Designation.setForeground(new java.awt.Color(39, 55, 77));
        Designation.setText("Designation / Position:");

        backButton.setBackground(new java.awt.Color(82, 109, 130));
        backButton.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        backButton.setForeground(new java.awt.Color(221, 230, 237));
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               backButtonActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(82, 109, 130));
        jButton2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(221, 230, 237));
        jButton2.setText("Next");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Designation)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(DesignationField, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(EmpEstab)
                                        .addGap(81, 81, 81)
                                        .addComponent(Male, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(MaleField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(83, 83, 83)
                                        .addComponent(Female)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(FemaleField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Vehicles)
                                        .addGap(42, 42, 42)
                                        .addComponent(Van)
                                        .addGap(18, 18, 18)
                                        .addComponent(VanField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(58, 58, 58)
                                        .addComponent(Motorcycle)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(MotorcycleField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(Owned)
                                            .addGap(39, 39, 39)
                                            .addComponent(Yes)
                                            .addGap(34, 34, 34)
                                            .addComponent(No)
                                            .addGap(30, 30, 30)
                                            .addComponent(IfYes)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                            .addComponent(IfYesField, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(Time)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(TimeField, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(EmpQC)
                                            .addGap(18, 18, 18)
                                            .addComponent(EmpQCField))))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(Capital)
                                    .addGap(27, 27, 27)
                                    .addComponent(CapitalField, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(344, 344, 344)
                        .addComponent(backButton)
                        .addGap(107, 107, 107)
                        .addComponent(jButton2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BusArea)
                            .addComponent(FloorArea)
                            .addComponent(BusLoc, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BusAreaField, javax.swing.GroupLayout.DEFAULT_SIZE, 643, Short.MAX_VALUE)
                            .addComponent(FloorAreaField)
                            .addComponent(BusLocField, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BusOperation)
                .addGap(264, 264, 264))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(BusOperation, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BusArea)
                    .addComponent(BusAreaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FloorArea)
                    .addComponent(FloorAreaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BusLoc)
                    .addComponent(BusLocField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmpEstab)
                    .addComponent(Male)
                    .addComponent(MaleField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Female)
                    .addComponent(FemaleField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmpQC)
                    .addComponent(EmpQCField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Vehicles)
                    .addComponent(Van)
                    .addComponent(VanField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Motorcycle)
                    .addComponent(MotorcycleField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Time)
                    .addComponent(TimeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Owned)
                    .addComponent(Yes)
                    .addComponent(No)
                    .addComponent(IfYes)
                    .addComponent(IfYesField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Capital)
                    .addComponent(CapitalField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Designation)
                    .addComponent(DesignationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton)
                    .addComponent(jButton2))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }
        
    private void YesActionPerformed(java.awt.event.ActionEvent evt) {
        IfYesField.setEnabled(true);
    }

    private void NoActionPerformed(java.awt.event.ActionEvent evt) {
        IfYesField.setEnabled(false);
        IfYesField.setText("");
    }

   private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {
       parentFrame.showCard("step1");
   }

   private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       // Validation before proceeding to the next step
       if (BusAreaField.getText().isEmpty()) {
           JOptionPane.showMessageDialog(this, "Business Area is required.");
           return;
       }

       if (FloorAreaField.getText().isEmpty()) {
           JOptionPane.showMessageDialog(this, "Total Floor Area is required.");
           return;
       }

       if (TimeField.getText().isEmpty()) {
           JOptionPane.showMessageDialog(this, "Time of Operation is required.");
           return;
       }

       if (MaleField.getText().isEmpty()) {
           JOptionPane.showMessageDialog(this, "No. of Male Employees is required.");
           return;
       }

       if (!isValidIntegerInput(MaleField.getText())) {
           JOptionPane.showMessageDialog(this, "Invalid input for Male. Enter ONLY a number.");
           return;
       }

       if (FemaleField.getText().isEmpty()) {
           JOptionPane.showMessageDialog(this, "No. of Female Employees is required.");
           return;
       }

       if (!isValidIntegerInput(FemaleField.getText())) {
           JOptionPane.showMessageDialog(this, "Invalid input for Female. Enter ONLY a number.");
           return;
       }

       if (EmpQCField.getText().isEmpty()) {
           JOptionPane.showMessageDialog(this, "No. of Employees Residing within QC is required.");
           return;
       }

       if (!isValidIntegerInput(EmpQCField.getText())) {
           JOptionPane.showMessageDialog(this, "Invalid input for No. of Employees. Enter ONLY a number.");
           return;
       }

       if (CapitalField.getText().isEmpty()) {
          JOptionPane.showMessageDialog(this, "Total Capital Investment is required.");
          return;
      }

      if (DesignationField.getText().isEmpty()) {
          JOptionPane.showMessageDialog(this, "Designation / Position is required.");
          return;
      }

       if (Yes.getText().isEmpty()) {
          JOptionPane.showMessageDialog(this, "Is Owned property is required.");
          return;
      }

       // Check if the user chose "Yes" for "Owned"
       if (Yes.isSelected()) {
           if (IfYesField.getText().isEmpty()) {
               JOptionPane.showMessageDialog(this, "Property Identification Number is required when Owned is 'Yes'.");
               return;
           }
       }

        bi.setBusinessArea(Double.parseDouble(BusAreaField.getText()));
        bi.setTotalFloorArea(Double.parseDouble(FloorAreaField.getText()));
        bi.setTimeOperation(TimeField.getText());
        bi.setTotalEmployee(Integer.parseInt(FemaleField.getText()) + Integer.parseInt(MaleField.getText()));
        bi.setEmployeesFemale(Integer.parseInt(FemaleField.getText()));
        bi.setEmployeesMale(Integer.parseInt(MaleField.getText()));
        bi.setEmployeesQC(Integer.parseInt(EmpQCField.getText()));

        if (MotorcycleField.getText().equals("")) {
            bi.setVehMotor(0);
        } else {
            bi.setVehMotor(Integer.parseInt(MotorcycleField.getText()));
        }

        if (VanField.getText().equals("")) {
            bi.setVehVanTruck(0);
        } else {
            bi.setVehVanTruck(Integer.parseInt(VanField.getText()));
        }

        bi.setBusinessLocAddress(BusLocField.getText());

        if (Yes.isSelected()) {
            bi.setOwned(true);
        } else {
            bi.setOwned(false);
        }
        
        if (IfYesField.getText().equals("")) {
            bi.setPropertyIdentityNum(0);
        } else {
            bi.setPropertyIdentityNum(Integer.parseInt(IfYesField.getText()));
        }
        
        
        bi.setCapital(Double.parseDouble(CapitalField.getText()));
        bi.setPosition(DesignationField.getText());

        // If all validations pass, show a dialog and then proceed to the next step
        int option = JOptionPane.showConfirmDialog(this, "Are you sure you want to proceed to the next step?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            parentFrame.setStep3(ac, bi);
            parentFrame.showCard("step3");
        }
    }                                        

    private boolean isValidIntegerInput(String input) {
       try {
           Integer.parseInt(input);
           return true;
       } catch (NumberFormatException e) {
           return false;
       }
   }   

    private void VanFieldActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
    }                                        
                                  

    // Getter methods for private fields
    public javax.swing.JTextField getBusAreaField() {
        return BusAreaField;
    }

    public javax.swing.JTextField getFloorAreaField() {
        return FloorAreaField;
    }

    public javax.swing.JTextField getTimeField() {
        return TimeField;
    }

    public javax.swing.JTextField getMaleField() {
        return MaleField;
    }

    public javax.swing.JTextField getFemaleField() {
        return FemaleField;
    }

    public javax.swing.JTextField getEmpQCField() {
        return EmpQCField;
    }

    public javax.swing.JTextField getIfYesField() {
        return IfYesField;
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel BusArea;
    private javax.swing.JTextField BusAreaField;
    private javax.swing.JLabel BusLoc;
    private javax.swing.JTextField BusLocField;
    private javax.swing.JLabel BusOperation;
    private javax.swing.JLabel Capital;
    private javax.swing.JTextField CapitalField;
    private javax.swing.JLabel Designation;
    private javax.swing.JTextField DesignationField;
    private javax.swing.JLabel EmpEstab;
    private javax.swing.JLabel EmpQC;
    private javax.swing.JTextField EmpQCField;
    private javax.swing.JLabel Female;
    private javax.swing.JTextField FemaleField;
    private javax.swing.JLabel FloorArea;
    private javax.swing.JTextField FloorAreaField;
    private javax.swing.JLabel IfYes;
    private javax.swing.JTextField IfYesField;
    private javax.swing.JLabel Male;
    private javax.swing.JTextField MaleField;
    private javax.swing.JLabel Motorcycle;
    private javax.swing.JTextField MotorcycleField;
    private javax.swing.JRadioButton No;
    private javax.swing.JLabel Owned;
    private javax.swing.JLabel Time;
    private javax.swing.JTextField TimeField;
    private javax.swing.JLabel Van;
    private javax.swing.JTextField VanField;
    private javax.swing.JLabel Vehicles;
    private javax.swing.JRadioButton Yes;
    private javax.swing.JButton backButton;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration                   
}
