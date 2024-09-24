/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

 package view;

 import javax.swing.JOptionPane;

import model.Account;
import model.BusinessInput;

public class Step1 extends javax.swing.JPanel {

    Account ac;
    MainFrame parentFrame;
    BusinessInput bi = new BusinessInput();

    public Step1(Account ac, MainFrame parentFrame) {
        this.ac = ac;
        this.parentFrame = parentFrame;
        initComponents();
        addBusinessTypeListeners();
    }
                    
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        sexButtonGroup = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        TypeBusiness = new javax.swing.JLabel();
        SoleProprietorship = new javax.swing.JRadioButton();
        Partnership = new javax.swing.JRadioButton();
        Corporation = new javax.swing.JRadioButton();
        Cooperative = new javax.swing.JRadioButton();
        RegNum = new javax.swing.JLabel();
        RegNumField = new javax.swing.JTextField();
        TIN = new javax.swing.JLabel();
        TINField = new javax.swing.JTextField();
        BusName = new javax.swing.JLabel();
        BusNameField = new javax.swing.JTextField();
        TradeName = new javax.swing.JLabel();
        TradeNameField = new javax.swing.JTextField();
        Address = new javax.swing.JLabel();
        AddressField = new javax.swing.JTextField();
        TelNo = new javax.swing.JLabel();
        TelNoField = new javax.swing.JTextField();
        Mobile = new javax.swing.JLabel();
        MobileField = new javax.swing.JTextField();
        Email = new javax.swing.JLabel();
        EmailField = new javax.swing.JTextField();
        ForSole = new javax.swing.JLabel();
        Owner = new javax.swing.JLabel();
        OwnerField = new javax.swing.JTextField();
        ForCorp = new javax.swing.JLabel();
        Pres = new javax.swing.JLabel();
        PresField = new javax.swing.JTextField();
        Sex = new javax.swing.JLabel();
        SMale = new javax.swing.JRadioButton();
        SFemale = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(931, 601));
        setMinimumSize(new java.awt.Dimension(931, 601));

        jPanel2.setBackground(new java.awt.Color(221, 230, 237));

        Title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/UPDATED_GUI_Logos/QCBPH_BIR (200 x 50 px).png"))); // NOI18N

        TypeBusiness.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        TypeBusiness.setForeground(new java.awt.Color(39, 55, 77));
        TypeBusiness.setText("Type of Business: ");
        TypeBusiness.setToolTipText("");

        buttonGroup1.add(SoleProprietorship);
        SoleProprietorship.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        SoleProprietorship.setForeground(new java.awt.Color(39, 55, 77));
        SoleProprietorship.setBackground(new java.awt.Color(221, 230, 237));
        SoleProprietorship.setText("Sole Proprietorship");
        SoleProprietorship.addActionListener(evt -> SoleProprietorshipActionPerformed(evt));

        buttonGroup1.add(Partnership);
        Partnership.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        Partnership.setForeground(new java.awt.Color(39, 55, 77));
        Partnership.setBackground(new java.awt.Color(221, 230, 237));
        Partnership.setText("Partnership");
        

        buttonGroup1.add(Corporation);
        Corporation.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        Corporation.setForeground(new java.awt.Color(39, 55, 77));
        Corporation.setBackground(new java.awt.Color(221, 230, 237));
        Corporation.setText("Corporation");

        buttonGroup1.add(Cooperative);
        Cooperative.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        Cooperative.setForeground(new java.awt.Color(39, 55, 77));
        Cooperative.setBackground(new java.awt.Color(221, 230, 237));
        Cooperative.setText("Cooperatives");
       

        RegNum.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        RegNum.setForeground(new java.awt.Color(39, 55, 77));
        RegNum.setText("DTI/SEC/CDA Registration Number:");

        TIN.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        TIN.setForeground(new java.awt.Color(39, 55, 77));
        TIN.setText("Tax Identification Number (TIN):");

        BusName.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        BusName.setForeground(new java.awt.Color(39, 55, 77));
        BusName.setText("Business Name:");

        TradeName.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        TradeName.setForeground(new java.awt.Color(39, 55, 77));
        TradeName.setText("Trade Name/Franchise (if applicable):");

        Address.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        Address.setForeground(new java.awt.Color(39, 55, 77));
        Address.setText("Main Office Address:");

        TelNo.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        TelNo.setForeground(new java.awt.Color(39, 55, 77));
        TelNo.setText("Telephone No.:");

        Mobile.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        Mobile.setForeground(new java.awt.Color(39, 55, 77));
        Mobile.setText("Mobile No.:");

        Email.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        Email.setForeground(new java.awt.Color(39, 55, 77));
        Email.setText("Email Address:");

        ForSole.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        ForSole.setForeground(new java.awt.Color(39, 55, 77));
        ForSole.setText("For Sole Proprietorship");

        Owner.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        Owner.setForeground(new java.awt.Color(39, 55, 77));
        Owner.setText("Name of Owner:");

        ForCorp.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        ForCorp.setForeground(new java.awt.Color(39, 55, 77));
        ForCorp.setText("For Corporations / Cooperatives / Partnerships");

        Pres.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        Pres.setForeground(new java.awt.Color(39, 55, 77));
        Pres.setText("Name of President / Officer in Charge:");

        Sex.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        Sex.setForeground(new java.awt.Color(39, 55, 77));
        Sex.setText("Sex:");
        
        sexButtonGroup.add(SMale);
        SMale.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        SMale.setForeground(new java.awt.Color(39, 55, 77));
        SMale.setBackground(new java.awt.Color(221, 230, 237));
        SMale.setText("Male");

        sexButtonGroup.add(SFemale);
        SFemale.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        SFemale.setForeground(new java.awt.Color(39, 55, 77));
        SFemale.setBackground(new java.awt.Color(221, 230, 237));
        SFemale.setText("Female");

        backButton.setBackground(new java.awt.Color(82, 109, 130));
        backButton.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        backButton.setForeground(new java.awt.Color(221, 230, 237));
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               backButtonActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(82, 109, 130));
        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(221, 230, 237));
        jButton1.setText("Next");
        jButton1.addActionListener(evt -> jButton1ActionPerformed(evt));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(47, 47, 47)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(TypeBusiness, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(45, 45, 45)
                            .addComponent(SoleProprietorship))
                        .addComponent(ForSole)
                        .addComponent(ForCorp)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(Pres)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(PresField))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(Owner)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(OwnerField, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(TelNo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TelNoField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(Mobile)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(MobileField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Email)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(EmailField, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(Sex, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(SMale, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(SFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(TradeName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(RegNum, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BusName, javax.swing.GroupLayout.Alignment.LEADING))
                                .addComponent(Address))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(RegNumField, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(26, 26, 26)
                                    .addComponent(TIN)
                                    .addGap(198, 198, 198))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(TINField, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BusNameField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TradeNameField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AddressField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addGap(104, 104, 104)
                                        .addComponent(Partnership, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 272, Short.MAX_VALUE)
                                        .addComponent(Cooperative))))))
                    .addContainerGap(62, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Corporation, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Title))
                            .addGap(265, 265, 265))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(backButton)
                            .addGap(107, 107, 107)
                            .addComponent(jButton1)
                            .addGap(344, 344, 344))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(29, 29, 29)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TypeBusiness)
                        .addComponent(SoleProprietorship)
                        .addComponent(Partnership)
                        .addComponent(Corporation)
                        .addComponent(Cooperative))
                    .addGap(14, 14, 14)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(RegNum)
                        .addComponent(RegNumField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TIN)
                        .addComponent(TINField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BusName)
                        .addComponent(BusNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TradeName)
                        .addComponent(TradeNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Address)
                        .addComponent(AddressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TelNo)
                        .addComponent(TelNoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Mobile)
                        .addComponent(MobileField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Email)
                        .addComponent(EmailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(26, 26, 26)
                    .addComponent(ForSole)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Owner)
                        .addComponent(OwnerField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(26, 26, 26)
                    .addComponent(ForCorp)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Pres)
                        .addComponent(PresField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(24, 24, 24)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Sex)
                        .addComponent(SMale)
                        .addComponent(SFemale))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(backButton)
                        .addComponent(jButton1))
                    .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );





    }// </editor-fold>                        

    private void SoleProprietorshipActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {
        parentFrame.setHomeWelcome(ac);
        parentFrame.showCard("homeWelcome");
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        // Validation before proceeding to the next step
        if (!SoleProprietorship.isSelected() && !Partnership.isSelected() && !Corporation.isSelected() && !Cooperative.isSelected()) {
        JOptionPane.showMessageDialog(this, "Please select a type of business.");
        return;
        }

        if (RegNumField.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "DTI/SEC/CDA Registration Number is required.");
        return;
        }
        
        if (TINField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Tax Identification Number (TIN) is required.");
            return;
        }
        
        // Validate TINField

        if (!isValidIntegerInput(TINField.getText(), 12)) {
            JOptionPane.showMessageDialog(this, "Invalid input for TIN.");
            return;
        }

        if (BusNameField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Business Name is required.");
            return;
        }
        
        if (AddressField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Main Office Address is required.");
            return;
        }
        
        if (MobileField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Mobile Number is required.");
            return;
        }

        // Validate MobileField
        if (!isValidIntegerInput(MobileField.getText(), 11)) {
            JOptionPane.showMessageDialog(this, "Invalid input for Mobile Number.");
            return;
        }

        
    
    if (EmailField.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Email Address is required.");
        return;
    }
        

    // If the applicant chose Sole Proprietorship, validate the owner's name
    if (SoleProprietorship.isSelected()) {
        if (OwnerField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Name of Owner is required for Sole Proprietorship.");
            return;
        }
    }
    
    // If the applicant chose Partnership, Corporation, or Cooperative, validate the president's name
    if (Partnership.isSelected() || Corporation.isSelected() || Cooperative.isSelected()) {
        if (PresField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Name of President/Officer in Charge is required.");
            return;
        }
    }
    
   if (!SMale.isSelected() && !SFemale.isSelected()) {
        JOptionPane.showMessageDialog(this, "Please select the sex.");
        return;
    }
   
    BusinessInput bi = new BusinessInput();
    
    bi.setRegistrationNum(Long.parseUnsignedLong(RegNumField.getText()));
    
    if (SoleProprietorship.isSelected()) {
        bi.setBusinessType(SoleProprietorship.getText());
    } else if (Partnership.isSelected()) {
        bi.setBusinessType(Partnership.getText());
    } else if (Corporation.isSelected()) {
        bi.setBusinessType(Corporation.getText());
    } else if (Cooperative.isSelected()) {
        bi.setBusinessType(Cooperative.getText());
    }
    
    if (SMale.isSelected()){
        bi.setSex('M');
    } else if (SFemale.isSelected()){
        bi.setSex('F');
    }
    
    bi.setTin(Long.parseLong(TINField.getText()));
    bi.setBusinessName(BusNameField.getText());
    bi.setTradeName(TradeNameField.getText());
    bi.setMainOfficeAddress(AddressField.getText());
    bi.setTelephoneNum(TelNoField.getText());

    
    if (MobileField.getText().equals("")) {
        bi.setMobileNum(0);
    } else {
        bi.setMobileNum(Long.parseLong(MobileField.getText()));
    } 
    
    bi.setEmail(EmailField.getText());
    
    if (bi.getBusinessType().equals("Sole Proprietorship")) {
        bi.setNameOPO(OwnerField.getText());
    } else {
        bi.setNameOPO(PresField.getText());
    }
    
    if (SMale.isSelected()){
    bi.setSex('M');
    } else if (SFemale.isSelected()){
    bi.setSex('F');
    }


       // If all validations pass, show a dialog and then proceed to the next step
    int option = JOptionPane.showConfirmDialog(this, "Are you sure you want to proceed to the next step?", "Confirmation", JOptionPane.YES_NO_OPTION);
    if (option == JOptionPane.YES_OPTION) {
       parentFrame.setStep2(ac, bi);
       parentFrame.showCard("step2");
    }
}
    // Method to check if a string can be parsed into an integer
    private boolean isValidIntegerInput(String input, int length) {
        try {
            //Integer.parseInt(input);
            Long.parseLong(input);
            return input.length() == length;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private void addBusinessTypeListeners() {
        SoleProprietorship.addActionListener(evt -> updateBusinessTypeFields());
        Partnership.addActionListener(evt -> updateBusinessTypeFields());
        Corporation.addActionListener(evt -> updateBusinessTypeFields());
        Cooperative.addActionListener(evt -> updateBusinessTypeFields());
    }

    private void updateBusinessTypeFields() {
        if (SoleProprietorship.isSelected()) {
            OwnerField.setEnabled(true);
            PresField.setEnabled(false);
            PresField.setText("");
        } else {
            OwnerField.setEnabled(false);
            OwnerField.setText("");
            PresField.setEnabled(true);
        }
    }
    // Variables declaration - do not modify                     
    private javax.swing.JLabel Address;
    private javax.swing.JTextField AddressField;
    private javax.swing.JLabel BusName;
    private javax.swing.JTextField BusNameField;
    private javax.swing.JRadioButton Cooperative;
    private javax.swing.JRadioButton Corporation;
    private javax.swing.JLabel Email;
    private javax.swing.JTextField EmailField;
    private javax.swing.JLabel ForCorp;
    private javax.swing.JLabel ForSole;
    private javax.swing.JLabel Mobile;
    private javax.swing.JTextField MobileField;
    private javax.swing.JLabel Owner;
    private javax.swing.JTextField OwnerField;
    private javax.swing.JRadioButton Partnership;
    private javax.swing.JLabel Pres;
    private javax.swing.JTextField PresField;
    private javax.swing.JLabel RegNum;
    private javax.swing.JTextField RegNumField;
    private javax.swing.JRadioButton SFemale;
    private javax.swing.JRadioButton SMale;
    private javax.swing.JLabel Sex;
    private javax.swing.JRadioButton SoleProprietorship;
    private javax.swing.JLabel TIN;
    private javax.swing.JTextField TINField;
    private javax.swing.JLabel TelNo;
    private javax.swing.JTextField TelNoField;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel TradeName;
    private javax.swing.JTextField TradeNameField;
    private javax.swing.JLabel TypeBusiness;
    private javax.swing.JButton backButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup sexButtonGroup;
    // End of variables declaration                   
}
