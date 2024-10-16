package view;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author sheen
 */
public class LoginRegister extends javax.swing.JPanel {

    MainFrame parentFrame;
    /**
     * Creates new form LOGINREGISTER
     */
    public LoginRegister(MainFrame parentFrame) {
        this.parentFrame = parentFrame;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        logo_qc = new javax.swing.JLabel();
        logo_own = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        LogInbtn = new javax.swing.JButton();
        Registerbtn = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(931, 601));

        jPanel1.setBackground(new java.awt.Color(221, 230, 237));
        jPanel1.setMaximumSize(new java.awt.Dimension(931, 601));

        jPanel2.setBackground(new java.awt.Color(157, 178, 191));

        logo_qc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/UPDATED_GUI_Logos/QC_LOGO (100 x 100 px).png"))); // NOI18N

        logo_own.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/UPDATED_GUI_Logos/QCBPH_LOGO (100 x 100 px).png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(logo_qc)
                        .addContainerGap(34, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(logo_own)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(logo_qc)
                .addGap(18, 18, 18)
                .addComponent(logo_own, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/UPDATED_GUI_Logos/QCBPH_LoginRegister.png"))); // NOI18N

        LogInbtn.setBackground(new java.awt.Color(82, 109, 130));
        LogInbtn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        LogInbtn.setForeground(new java.awt.Color(221, 230, 237));
        LogInbtn.setText("LOGIN");
        LogInbtn.setMaximumSize(new java.awt.Dimension(75, 26));
        LogInbtn.setMinimumSize(new java.awt.Dimension(75, 26));
        LogInbtn.setPreferredSize(new java.awt.Dimension(75, 26));
        LogInbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogInbtnActionPerformed(evt);
            }
        });

        Registerbtn.setBackground(new java.awt.Color(82, 109, 130));
        Registerbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Registerbtn.setForeground(new java.awt.Color(221, 230, 237));
        Registerbtn.setText("REGISTER");
        Registerbtn.setMaximumSize(new java.awt.Dimension(75, 26));
        Registerbtn.setMinimumSize(new java.awt.Dimension(75, 26));
        Registerbtn.setPreferredSize(new java.awt.Dimension(75, 26));
        Registerbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(LogInbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(Registerbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LogInbtn)
                    .addComponent(Registerbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    }// </editor-fold>//GEN-END:initComponents

    private void LogInbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogInbtnActionPerformed
    
        parentFrame.showCard("login");
    }//GEN-LAST:event_LogInbtnActionPerformed

    private void RegisterbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterbtnActionPerformed
        
        parentFrame.showCard("register");
    }//GEN-LAST:event_RegisterbtnActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LogInbtn;
    private javax.swing.JButton Registerbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel logo_own;
    private javax.swing.JLabel logo_qc;
    // End of variables declaration//GEN-END:variables
}
