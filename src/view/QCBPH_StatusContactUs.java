package view;

import controller.BusinessController;
import model.Account;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Ryan Jhon
 */
public class QCBPH_StatusContactUs extends javax.swing.JPanel {

    /**
     * Creates new form QCBPH_StatusContactUs
     */

    MainFrame parentFrame;
    Account ac;
    BusinessController bcon = new BusinessController();

    public QCBPH_StatusContactUs(Account ac, MainFrame parentFrame) {
        this.ac = ac;
        this.parentFrame = parentFrame;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        WelcomePanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        StatusPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        DataPrivPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        ContactUsPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        AccountPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jPanel3.setBackground(new java.awt.Color(221, 230, 237));

        jPanel4.setBackground(new java.awt.Color(157, 178, 191));

        WelcomePanel1.setBackground(new java.awt.Color(157, 178, 191));
        WelcomePanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                WelcomePanel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                WelcomePanel1MouseExited(evt);
            }
            public void mouseClicked (java.awt.event.MouseEvent evt) {
                WelcomePanelMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(221, 230, 237));
        jLabel2.setText("WELCOME");

        javax.swing.GroupLayout WelcomePanel1Layout = new javax.swing.GroupLayout(WelcomePanel1);
        WelcomePanel1.setLayout(WelcomePanel1Layout);
        WelcomePanel1Layout.setHorizontalGroup(
            WelcomePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WelcomePanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        WelcomePanel1Layout.setVerticalGroup(
            WelcomePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WelcomePanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        StatusPanel.setBackground(new java.awt.Color(157, 178, 191));
        StatusPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                StatusPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                StatusPanelMouseExited(evt);
            }
            public void mouseClicked (java.awt.event.MouseEvent evt) {
                StatusPanelMouseClicked(evt);
            }

        });

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(221, 230, 237));
        jLabel3.setText("STATUS");

        javax.swing.GroupLayout StatusPanelLayout = new javax.swing.GroupLayout(StatusPanel);
        StatusPanel.setLayout(StatusPanelLayout);
        StatusPanelLayout.setHorizontalGroup(
            StatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StatusPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        StatusPanelLayout.setVerticalGroup(
            StatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );

        DataPrivPanel.setBackground(new java.awt.Color(157, 178, 191));
        DataPrivPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DataPrivPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DataPrivPanelMouseExited(evt);
            }
            public void mouseClicked (java.awt.event.MouseEvent evt) {
                DataPrivPanelMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(221, 230, 237));
        jLabel4.setText("DATA PRIVACY");

        javax.swing.GroupLayout DataPrivPanelLayout = new javax.swing.GroupLayout(DataPrivPanel);
        DataPrivPanel.setLayout(DataPrivPanelLayout);
        DataPrivPanelLayout.setHorizontalGroup(
            DataPrivPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DataPrivPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        DataPrivPanelLayout.setVerticalGroup(
            DataPrivPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );

        ContactUsPanel.setBackground(new java.awt.Color(82, 109, 130));
        ContactUsPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ContactUsPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ContactUsPanelMouseExited(evt);
            }
            
        });

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(221, 230, 237));
        jLabel5.setText("CONTACT US");

        javax.swing.GroupLayout ContactUsPanelLayout = new javax.swing.GroupLayout(ContactUsPanel);
        ContactUsPanel.setLayout(ContactUsPanelLayout);
        ContactUsPanelLayout.setHorizontalGroup(
            ContactUsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContactUsPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        ContactUsPanelLayout.setVerticalGroup(
            ContactUsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );

        AccountPanel.setBackground(new java.awt.Color(157, 178, 191));
        AccountPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AccountPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AccountPanelMouseExited(evt);
            }
            public void mouseClicked (java.awt.event.MouseEvent evt) {
                AccountPanelMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(221, 230, 237));
        jLabel6.setText("ACCOUNT");

        javax.swing.GroupLayout AccountPanelLayout = new javax.swing.GroupLayout(AccountPanel);
        AccountPanel.setLayout(AccountPanelLayout);
        AccountPanelLayout.setHorizontalGroup(
            AccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AccountPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        AccountPanelLayout.setVerticalGroup(
            AccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/UPDATED_GUI_Logos/QCBPH_LOGO (100 x 100 px).png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(StatusPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(DataPrivPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ContactUsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(AccountPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
            .addComponent(WelcomePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(WelcomePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(StatusPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DataPrivPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ContactUsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AccountPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/UPDATED_GUI_Logos/QCBPH_ContactUs.png"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/UPDATED_GUI_Logos/QCBPH_ContactUsText.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8))
                .addGap(58, 58, 58))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>                        

    private void WelcomePanel1MouseEntered(java.awt.event.MouseEvent evt) {                                           
        WelcomePanel1.setBackground(new java.awt.Color(82, 109, 130));
    }                                          

    private void WelcomePanel1MouseExited(java.awt.event.MouseEvent evt) {                                          
        WelcomePanel1.setBackground(new java.awt.Color(157, 178, 191));
    }                                         

    private void StatusPanelMouseEntered(java.awt.event.MouseEvent evt) {                                         
        StatusPanel.setBackground(new java.awt.Color(82, 109, 130));
    }                                        

    private void StatusPanelMouseExited(java.awt.event.MouseEvent evt) {                                        
        StatusPanel.setBackground(new java.awt.Color(157, 178, 191));
    }
    
    private void AccountPanelMouseClicked(java.awt.event.MouseEvent evt) {
        String status = bcon.readStatus(ac.getRegNum());
        if (status.equals(new String("To Be Processed")) || status.equals(new String("Cancelled"))) {
            parentFrame.setStatusAccount(ac);
            parentFrame.showCard("statusAccount");
        } else if (status.equals(new String("Now Processing")) || status.equals(new String("Processed"))) {
            parentFrame.setStatusAccNoDelete(ac);
            parentFrame.showCard("statusAccNoDelete");
        }
    }
    

    private void DataPrivPanelMouseClicked(java.awt.event.MouseEvent evt) {
        parentFrame.setStatusDataPriv(ac);;
        parentFrame.showCard("statusDataPriv");
    }

    private void WelcomePanelMouseClicked(java.awt.event.MouseEvent evt) {
        parentFrame.setHomeStatus(bcon.readStatus(ac.getRegNum()), ac);;
        parentFrame.showCard("homeStatus");
    }

    private void StatusPanelMouseClicked(java.awt.event.MouseEvent evt) {

        String status = bcon.readStatus(ac.getRegNum());
        if (status.equals("To Be Processed")) {
            parentFrame.setStatusTBP(ac);
            parentFrame.showCard("statusTBP");
        } else if (status.equals("Now Processing")) {
            parentFrame.setStatusNP(ac);
            parentFrame.showCard("statusNP");
        } else if (status.equals("Processed")) {
            parentFrame.setStatusP(ac);
            parentFrame.showCard("statusP");
        }
    }

                                  

    private void DataPrivPanelMouseEntered(java.awt.event.MouseEvent evt) {                                           
        DataPrivPanel.setBackground(new java.awt.Color(82, 109, 130));
    }                                          

    private void DataPrivPanelMouseExited(java.awt.event.MouseEvent evt) {                                          
        DataPrivPanel.setBackground(new java.awt.Color(157, 178, 191));
    }                                         

    private void ContactUsPanelMouseEntered(java.awt.event.MouseEvent evt) {                                            
        ContactUsPanel.setBackground(new java.awt.Color(82, 109, 130));
    }                                           

    private void ContactUsPanelMouseExited(java.awt.event.MouseEvent evt) {                                           
        ContactUsPanel.setBackground(new java.awt.Color(82, 109, 130));
    }                                          

    private void AccountPanelMouseEntered(java.awt.event.MouseEvent evt) {                                          
        AccountPanel.setBackground(new java.awt.Color(82, 109, 130));
    }                                         

    private void AccountPanelMouseExited(java.awt.event.MouseEvent evt) {                                         
        AccountPanel.setBackground(new java.awt.Color(157, 178, 191));
    }                                        

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify                     
    private javax.swing.JPanel AccountPanel;
    private javax.swing.JPanel ContactUsPanel;
    private javax.swing.JPanel DataPrivPanel;
    private javax.swing.JPanel StatusPanel;
    private javax.swing.JPanel WelcomePanel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration                   
}
