/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;

/**
 *
 * @author Janhvi Shah
 */
public class Login extends javax.swing.JFrame {

    
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelHospitalManagementSystem = new javax.swing.JLabel();
        jSplitPane1 = new javax.swing.JSplitPane();
        controlpanel = new javax.swing.JPanel();
        lblWelcomeText = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        workspacepanel = new javax.swing.JPanel();
        labelHospitalManagementSystem1 = new javax.swing.JLabel();
        labelHospitalManagementSystem2 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        lbPassword = new javax.swing.JLabel();
        lbLogin = new javax.swing.JLabel();
        cmbLoginType = new javax.swing.JComboBox<>();
        btnLogin = new javax.swing.JButton();
        lbUsername = new javax.swing.JLabel();

        labelHospitalManagementSystem.setBackground(new java.awt.Color(153, 153, 153));
        labelHospitalManagementSystem.setFont(new java.awt.Font("Helvetica Neue", 2, 14)); // NOI18N
        labelHospitalManagementSystem.setForeground(new java.awt.Color(0, 71, 119));
        labelHospitalManagementSystem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelHospitalManagementSystem.setText("Please enter the login credentials");
        labelHospitalManagementSystem.setToolTipText("To create new employee");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setMinimumSize(new java.awt.Dimension(300, 230));

        controlpanel.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Blue"));
        controlpanel.setAlignmentX(0.0F);
        controlpanel.setAlignmentY(0.0F);
        controlpanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblWelcomeText.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblWelcomeText.setForeground(new java.awt.Color(255, 255, 255));
        lblWelcomeText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWelcomeText.setText("Welcome");

        btnLogout.setBackground(new java.awt.Color(0, 51, 102));
        btnLogout.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlpanelLayout = new javax.swing.GroupLayout(controlpanel);
        controlpanel.setLayout(controlpanelLayout);
        controlpanelLayout.setHorizontalGroup(
            controlpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controlpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblWelcomeText, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controlpanelLayout.createSequentialGroup()
                        .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        controlpanelLayout.setVerticalGroup(
            controlpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlpanelLayout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(lblWelcomeText, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 166, Short.MAX_VALUE)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jSplitPane1.setLeftComponent(controlpanel);

        workspacepanel.setBackground(new java.awt.Color(253, 214, 214));

        labelHospitalManagementSystem1.setBackground(new java.awt.Color(153, 153, 153));
        labelHospitalManagementSystem1.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        labelHospitalManagementSystem1.setForeground(new java.awt.Color(204, 0, 0));
        labelHospitalManagementSystem1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelHospitalManagementSystem1.setText("E-Health Care Managment System");
        labelHospitalManagementSystem1.setToolTipText("To create new employee");

        labelHospitalManagementSystem2.setBackground(new java.awt.Color(153, 153, 153));
        labelHospitalManagementSystem2.setFont(new java.awt.Font("Helvetica Neue", 2, 14)); // NOI18N
        labelHospitalManagementSystem2.setForeground(new java.awt.Color(0, 71, 119));
        labelHospitalManagementSystem2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelHospitalManagementSystem2.setText("Please enter the login credentials");
        labelHospitalManagementSystem2.setToolTipText("To create new employee");

        txtUserName.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });

        txtPassword.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N

        lbPassword.setBackground(new java.awt.Color(153, 153, 153));
        lbPassword.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lbPassword.setForeground(new java.awt.Color(0, 71, 119));
        lbPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPassword.setText("Password :");
        lbPassword.setToolTipText("To create new employee");

        lbLogin.setBackground(new java.awt.Color(153, 153, 153));
        lbLogin.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lbLogin.setForeground(new java.awt.Color(0, 71, 119));
        lbLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbLogin.setText("Login As :");
        lbLogin.setToolTipText("To create new employee");

        cmbLoginType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "System", "Hospital", "Community" }));

        btnLogin.setBackground(new java.awt.Color(0, 71, 119));
        btnLogin.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        lbUsername.setBackground(new java.awt.Color(153, 153, 153));
        lbUsername.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lbUsername.setForeground(new java.awt.Color(0, 71, 119));
        lbUsername.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbUsername.setText("Username:");
        lbUsername.setToolTipText("To create new employee");

        javax.swing.GroupLayout workspacepanelLayout = new javax.swing.GroupLayout(workspacepanel);
        workspacepanel.setLayout(workspacepanelLayout);
        workspacepanelLayout.setHorizontalGroup(
            workspacepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(workspacepanelLayout.createSequentialGroup()
                .addComponent(labelHospitalManagementSystem1, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 104, Short.MAX_VALUE))
            .addGroup(workspacepanelLayout.createSequentialGroup()
                .addGroup(workspacepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(workspacepanelLayout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(workspacepanelLayout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(labelHospitalManagementSystem2, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(workspacepanelLayout.createSequentialGroup()
                        .addGroup(workspacepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(workspacepanelLayout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addGroup(workspacepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbUsername, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, workspacepanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lbLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)))
                        .addGroup(workspacepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUserName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbLoginType, 0, 247, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        workspacepanelLayout.setVerticalGroup(
            workspacepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(workspacepanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(labelHospitalManagementSystem1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelHospitalManagementSystem2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(workspacepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38)
                .addGroup(workspacepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(workspacepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbLoginType, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jSplitPane1.setRightComponent(workspacepanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        String username = txtUserName.getText();
        String password = txtPassword.getText();
        String role = (String)cmbLoginType.getSelectedItem();

        System.out.println(username + password + role);

        if(SysAdminPanel.getUserName().equals(username) && SysAdminPanel.getPassword().equals(password) && role.equals("System") ){
            btnLogout.setVisible(true);
            JOptionPane.showMessageDialog(this,"Logged in as System Admin");
            String text = "<html>";
            text+= "Welcome,<br>";
            text+="System<br>";
            text+="Admin";
            text+="</html>";
            lblWelcomeText.setText(text);

            SysAdminJPanel adminDashboardJPanel = new SystemAdminDashboardJPanel(patientDirectory,doctorDirectory,hospitalDirectory);
            splitPane.setRightComponent(adminDashboardJPanel);

        }

        else if(hospitalAdmin.getUserName().equals(username) && hospitalAdmin.getPassword().equals(password) && role.equals("Hospital") ){
            btnLogout.setVisible(true);
            JOptionPane.showMessageDialog(this,"Logged in as Hospital Admin");
            String text = "<html>";
            text+= "Welcome,<br>";
            text+="Hospital<br>";
            text+="Admin";
            text+="</html>";
            lblWelcomeText.setText(text);
            HospitalAdminDashboardJPanel hospitalAdminDashboardJPanel = new HospitalAdminDashboardJPanel(patientDirectory,doctorDirectory,hospitalDirectory);
            splitPane.setRightComponent(hospitalAdminDashboardJPanel);
        }

        else if(communityAdmin.getUserName().equals(username) && communityAdmin.getPassword().equals(password) && role.equals("Community") ){
            btnLogout.setVisible(true);
            JOptionPane.showMessageDialog(this,"Logged in as Community Admin");
            String text = "<html>";
            text+= "Welcome,<br>";
            text+="Community<br>";
            text+="Admin";
            text+="</html>";
            lblWelcomeText.setText(text);
            CommunityAdminDashboardJPanel communityAdminDashboardJPanel = new CommunityAdminDashboardJPanel(cityDirectory, houseDirectory, communityDirectory);
            splitPane.setRightComponent(communityAdminDashboardJPanel);
        }

    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:

        String text = "<html>";
        text+= "Welcome,<br>";

        text+="</html>";
        lblWelcomeText.setText(text);
        splitPane.setRightComponent(workspacePanel);
        btnLogout.setVisible(false);
        txtPassword.setText("");
        txtUserName.setText("");
    }//GEN-LAST:event_btnLogoutActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnLogout;
    private javax.swing.JComboBox<String> cmbLoginType;
    private javax.swing.JPanel controlpanel;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel labelHospitalManagementSystem;
    private javax.swing.JLabel labelHospitalManagementSystem1;
    private javax.swing.JLabel labelHospitalManagementSystem2;
    private javax.swing.JLabel lbLogin;
    private javax.swing.JLabel lbPassword;
    private javax.swing.JLabel lbUsername;
    private javax.swing.JLabel lblWelcomeText;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JPanel workspacepanel;
    // End of variables declaration//GEN-END:variables
}
