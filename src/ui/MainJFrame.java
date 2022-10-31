/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.BookAppointmentDirectory;
import model.City;
import model.CityDirectory;
import model.Community;
import model.CommunityDirectory;
import model.Doctor;
import model.DoctorDirectory;
import model.EncounterHistory;
import model.Hospital;
import model.HospitalDirectory;
import model.Patient;
import model.PatientDirectory;
import model.Person;
import model.PersonDirectory;

/**
 *
 * @author Janhvi Shah
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    PatientDirectory directory;
    PersonDirectory personDirectory;
    DoctorDirectory doctorDirectory;
    EncounterHistory encounterHistory;
    HospitalDirectory hospitalDirectory;
    CommunityDirectory communityDirectory;
    CityDirectory cityDirectory;
    BookAppointmentDirectory bookAppointmentDirectory;
    public MainJFrame() {
//        setExtendedState(JFrame.MAXIMIZED_BOTH);
//        setUndecorated(true);
        initComponents();
        directory = new PatientDirectory();      
        doctorDirectory = new DoctorDirectory();
        personDirectory = new PersonDirectory();
        encounterHistory = new EncounterHistory();
        hospitalDirectory = new HospitalDirectory();
        communityDirectory = new CommunityDirectory();
        encounterHistory = new EncounterHistory();
        bookAppointmentDirectory = new BookAppointmentDirectory();        
        cityDirectory = new CityDirectory();
        
        personDirectory.addPerson(new Person("systemAdmin", "1234", "SystemAdmin","test","test",5001,1,1234567890,"Male"));
        personDirectory.addPerson(new Person("communityAdmin", "1234", "CommunityAdmin","test","test",5002,1,1234567890,"Male"));
        personDirectory.addPerson(new Person("hospitalAdmin", "1234", "HospitalAdmin","test","test",5003,1,1234567890,"Male"));
        doctorDirectory.addDoctor(new Doctor("doctorAdmin", "1234", "Doctor","test","test",5004,1,1234567890,"Male","testHospital"));
        Community c = communityDirectory.addNewCommunity();
        c.setCommunity("Longwood");
        City city = new City("Boston");
        c.setCity(city);
        
        Hospital h = HospitalDirectory.addNewHospital();
        h.setHospitalID(1);
        h.setHospitalName("Apollo");
        h.setCommunity(c);
        h.setMobileNo(1234567890);
        
        
        Patient p = new Patient();
        p.setUserName("testPatient");
        p.setFirstName("test");
        p.setLastName("test");
        p.setPassword("1234");
        p.setAge(20);
        p.setPatientID(25);
        p.setGender("Female");
        p.setMobileNo(1234567890);
        p.setCommunity("Longwood");
        p.setCity("Boston");
        p.setRole("Patient");
        directory.addNewPatient(p);
        
        
        txtUsername.setVisible(false);
        lblUsername.setVisible(false);
        txtPassword.setVisible(false);
        lblPassword.setVisible(false);
        btnLogin.setVisible(false);
        
    }
    
    public void loadDefaultState() {
        splitPanel.setRightComponent(rightPanel);
        splitPanel.setLeftComponent(leftPanel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPanel = new javax.swing.JSplitPane();
        leftPanel = new javax.swing.JPanel();
        btnHospital = new javax.swing.JButton();
        btnCommunity = new javax.swing.JButton();
        btnDoctor = new javax.swing.JButton();
        btnPatient = new javax.swing.JButton();
        btnSystem = new javax.swing.JButton();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        rightPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        leftPanel.setBackground(new java.awt.Color(255, 102, 102));

        btnHospital.setBackground(new java.awt.Color(214, 219, 223));
        btnHospital.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        btnHospital.setText("Hospital Administrator");
        btnHospital.setBorder(null);
        btnHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHospitalActionPerformed(evt);
            }
        });

        btnCommunity.setBackground(new java.awt.Color(214, 219, 223));
        btnCommunity.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        btnCommunity.setText("Community Administrator");
        btnCommunity.setBorder(null);
        btnCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCommunityActionPerformed(evt);
            }
        });

        btnDoctor.setBackground(new java.awt.Color(214, 219, 223));
        btnDoctor.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        btnDoctor.setText("Doctor");
        btnDoctor.setBorder(null);
        btnDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoctorActionPerformed(evt);
            }
        });

        btnPatient.setBackground(new java.awt.Color(214, 219, 223));
        btnPatient.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        btnPatient.setText("Patient");
        btnPatient.setBorder(null);
        btnPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatientActionPerformed(evt);
            }
        });

        btnSystem.setBackground(new java.awt.Color(214, 219, 223));
        btnSystem.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        btnSystem.setText("System Administrator");
        btnSystem.setBorder(null);
        btnSystem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSystemActionPerformed(evt);
            }
        });

        lblUsername.setText("Username: ");

        lblPassword.setText("Password:");

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        btnLogin.setBackground(new java.awt.Color(214, 219, 223));
        btnLogin.setText("Log In");
        btnLogin.setBorder(null);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnBack.setText(">> Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leftPanelLayout.createSequentialGroup()
                        .addComponent(btnHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(leftPanelLayout.createSequentialGroup()
                        .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSystem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBack)
                            .addComponent(lblUsername)
                            .addComponent(lblPassword)
                            .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCommunity, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                            .addComponent(txtUsername)
                            .addComponent(btnPatient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDoctor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPassword))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(btnBack)
                .addGap(73, 73, 73)
                .addComponent(btnCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSystem, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(295, Short.MAX_VALUE))
        );

        splitPanel.setLeftComponent(leftPanel);

        rightPanel.setBackground(new java.awt.Color(94, 180, 231));

        jLabel1.setFont(new java.awt.Font("Helvetica", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("E-HEALTH CARE MANAGEMENT SYSTEM");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/HHH.jpg"))); // NOI18N

        javax.swing.GroupLayout rightPanelLayout = new javax.swing.GroupLayout(rightPanel);
        rightPanel.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 885, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        rightPanelLayout.setVerticalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 629, Short.MAX_VALUE))
        );

        splitPanel.setRightComponent(rightPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPanel)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPanel, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSystemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSystemActionPerformed
        // TODO add your handling code here:
        btnPatient.setVisible(false);
        btnDoctor.setVisible(false);
        btnCommunity.setVisible(false);
        btnHospital.setVisible(false);
        txtUsername.setVisible(true);
        lblUsername.setVisible(true);
        txtPassword.setVisible(true);
        lblPassword.setVisible(true);
        btnLogin.setVisible(true);
    }//GEN-LAST:event_btnSystemActionPerformed

    private void btnPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatientActionPerformed
        // TODO add your handling code here:
        btnPatient.setVisible(false);
        btnDoctor.setVisible(false);
        btnCommunity.setVisible(false);
        btnHospital.setVisible(false);
        btnSystem.setVisible(false);
//        btnBack.setVisible(false);
        txtUsername.setVisible(false);
        lblUsername.setVisible(false);
        txtPassword.setVisible(false);
        lblPassword.setVisible(false);
        btnLogin.setVisible(false);
        PatientLoginJPanel patientLoginPanel = new PatientLoginJPanel(splitPanel, directory, cityDirectory, communityDirectory, hospitalDirectory, encounterHistory, bookAppointmentDirectory);
        splitPanel.setRightComponent(patientLoginPanel);
        
    }//GEN-LAST:event_btnPatientActionPerformed

    private void btnDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoctorActionPerformed
        // TODO add your handling code here:
        btnPatient.setVisible(false);
        btnSystem.setVisible(false);
        btnCommunity.setVisible(false);
        btnHospital.setVisible(false);
        txtUsername.setVisible(true);
        lblUsername.setVisible(true);
        txtPassword.setVisible(true);
        lblPassword.setVisible(true);
        btnLogin.setVisible(true);
        
    }//GEN-LAST:event_btnDoctorActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        btnPatient.setVisible(true);
        btnSystem.setVisible(true);
        btnCommunity.setVisible(true);
        btnHospital.setVisible(true);
        btnDoctor.setVisible(true);
        txtUsername.setVisible(false);
        lblUsername.setVisible(false);
        txtPassword.setVisible(false);
        lblPassword.setVisible(false);
        btnLogin.setVisible(false);
//        btnBack.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCommunityActionPerformed
        // TODO add your handling code here:
        btnPatient.setVisible(false);
        btnSystem.setVisible(false);
        btnDoctor.setVisible(false);
        btnHospital.setVisible(false);
        txtUsername.setVisible(true);
        lblUsername.setVisible(true);
        txtPassword.setVisible(true);
        lblPassword.setVisible(true);
        btnLogin.setVisible(true);
    }//GEN-LAST:event_btnCommunityActionPerformed

    private void btnHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHospitalActionPerformed
        // TODO add your handling code here:
        btnPatient.setVisible(false);
        btnSystem.setVisible(false);
        btnCommunity.setVisible(false);
        btnDoctor.setVisible(false);
        txtUsername.setVisible(true);
        lblUsername.setVisible(true);
        txtPassword.setVisible(true);
        lblPassword.setVisible(true);
        btnLogin.setVisible(true);
    }//GEN-LAST:event_btnHospitalActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        String username = txtUsername.getText();
        String password = txtPassword.getText();
        
        if(doctorDirectory.authenticateDoctor(username, password)){
            JOptionPane.showMessageDialog(this, "Login Successfull!");
            Doctor doctor = doctorDirectory.searchDoctor("Username",username);
            txtUsername.setText("");
            txtPassword.setText("");           
            MainDoctorJPanel doctorPanel = new MainDoctorJPanel(splitPanel, directory, doctor, doctorDirectory, encounterHistory);
            splitPanel.setRightComponent(doctorPanel);
        }                
        else if(personDirectory.authenticateAdmin(username, password)){
//        if(username.equals("drashti") && password.equals("1234")){
            JOptionPane.showMessageDialog(this, "Login Successfull!");
            txtUsername.setText("");
            txtPassword.setText("");
            String role = personDirectory.getPersonRole(username);
            switch(role){
                case "SystemAdmin":
                    MainSystemJPanel systemPanel = new MainSystemJPanel(splitPanel, directory, doctorDirectory, hospitalDirectory, communityDirectory, personDirectory, cityDirectory);
                    splitPanel.setRightComponent(systemPanel);
                    break;
                    
//                case "Doctor":
//                    MainDoctorJPanel doctorPanel = new MainDoctorJPanel(splitPanel, directory);
//                    splitPanel.setRightComponent(doctorPanel);
//                    break;
                    
                case "HospitalAdmin":
                    MainHospitalJPanel hospitalPanel = new MainHospitalJPanel(splitPanel, hospitalDirectory, directory, doctorDirectory, cityDirectory, communityDirectory, bookAppointmentDirectory );
                    splitPanel.setRightComponent(hospitalPanel);
                    break;
                    
                case "CommunityAdmin":
                    MainCommunityJPanel communityPanel = new MainCommunityJPanel(splitPanel, communityDirectory, cityDirectory);
                    splitPanel.setRightComponent(communityPanel);
                    break;
                   
            }
            
        } else{
            JOptionPane.showMessageDialog(this, "Login Failed!");
        }
        
    }//GEN-LAST:event_btnLoginActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCommunity;
    private javax.swing.JButton btnDoctor;
    private javax.swing.JButton btnHospital;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnPatient;
    private javax.swing.JButton btnSystem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JSplitPane splitPanel;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
