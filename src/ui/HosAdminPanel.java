/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import model.CommunityHistory;
import model.DoctorHistory;
import model.HospitalHistory;
import model.PatientHistory;


/**
 *
 * @author Janhvi Shah
 */
public class HosAdminPanel extends javax.swing.JPanel {
  PatientHistory patientHistory;
    DoctorHistory doctorHistory;
    HospitalHistory hospitalHistory;
     CommunityHistory communityHistory;
    private boolean deleteFlag=false;
    /**
     * Creates new form HosAdminPanel
     
     */
    public HosAdminPanel( PatientHistory patientHistory, DoctorHistory doctorHistory, HospitalHistory hospitalHistory, CommunityHistory communitytory) {
      initComponents();     
    this.patientHistory = patientHistory;
    this.doctorHistory = doctorHistory;
    this.hospitalHistory = hospitalHistory;
     this.communityHistory=communityHistory;
       
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tabbedPanel1 = new javax.swing.JTabbedPane();
        tabPatient = new javax.swing.JPanel();
        jSplitPanePatient = new javax.swing.JSplitPane();
        splitNavigation = new javax.swing.JPanel();
        btnViewPatient = new javax.swing.JButton();
        btnCreatePatient = new javax.swing.JButton();
        splitworkspace = new javax.swing.JPanel();
        tabDoctor = new javax.swing.JPanel();
        jSplitPaneDoctor = new javax.swing.JSplitPane();
        splitNavigation1 = new javax.swing.JPanel();
        btnViewDoctor = new javax.swing.JButton();
        btnCreateDoctor = new javax.swing.JButton();
        splitworkspace1 = new javax.swing.JPanel();
        tabHospital = new javax.swing.JPanel();
        jSplitPaneHospital = new javax.swing.JSplitPane();
        splitNavigation2 = new javax.swing.JPanel();
        btnViewHospital = new javax.swing.JButton();
        btnCreateHospital = new javax.swing.JButton();
        splitworkspace2 = new javax.swing.JPanel();
        tabEncounters = new javax.swing.JPanel();
        jSplitPaneEncounters = new javax.swing.JSplitPane();
        splitNavigation3 = new javax.swing.JPanel();
        btnViewEncounters = new javax.swing.JButton();
        btnCreateEncounters = new javax.swing.JButton();
        splitworkspace3 = new javax.swing.JPanel();

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel1.setText("Hospital Admin");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        tabbedPanel1.setBackground(new java.awt.Color(154, 94, 94));
        tabbedPanel1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N

        btnViewPatient.setFont(new java.awt.Font("Helvetica Neue", 1, 10)); // NOI18N
        btnViewPatient.setText("View Patient");
        btnViewPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewPatientActionPerformed(evt);
            }
        });

        btnCreatePatient.setFont(new java.awt.Font("Helvetica Neue", 1, 10)); // NOI18N
        btnCreatePatient.setText("Create Patient");
        btnCreatePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreatePatientActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout splitNavigationLayout = new javax.swing.GroupLayout(splitNavigation);
        splitNavigation.setLayout(splitNavigationLayout);
        splitNavigationLayout.setHorizontalGroup(
            splitNavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(splitNavigationLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(splitNavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCreatePatient, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                    .addComponent(btnViewPatient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        splitNavigationLayout.setVerticalGroup(
            splitNavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(splitNavigationLayout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(btnCreatePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnViewPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSplitPanePatient.setLeftComponent(splitNavigation);

        javax.swing.GroupLayout splitworkspaceLayout = new javax.swing.GroupLayout(splitworkspace);
        splitworkspace.setLayout(splitworkspaceLayout);
        splitworkspaceLayout.setHorizontalGroup(
            splitworkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 544, Short.MAX_VALUE)
        );
        splitworkspaceLayout.setVerticalGroup(
            splitworkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 433, Short.MAX_VALUE)
        );

        jSplitPanePatient.setRightComponent(splitworkspace);

        javax.swing.GroupLayout tabPatientLayout = new javax.swing.GroupLayout(tabPatient);
        tabPatient.setLayout(tabPatientLayout);
        tabPatientLayout.setHorizontalGroup(
            tabPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabPatientLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPanePatient)
                .addContainerGap())
        );
        tabPatientLayout.setVerticalGroup(
            tabPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabPatientLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPanePatient))
        );

        tabbedPanel1.addTab("Patient ", tabPatient);

        btnViewDoctor.setFont(new java.awt.Font("Helvetica Neue", 1, 10)); // NOI18N
        btnViewDoctor.setText("View Doctor");
        btnViewDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDoctorActionPerformed(evt);
            }
        });

        btnCreateDoctor.setFont(new java.awt.Font("Helvetica Neue", 1, 10)); // NOI18N
        btnCreateDoctor.setText("Create Doctor");
        btnCreateDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateDoctorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout splitNavigation1Layout = new javax.swing.GroupLayout(splitNavigation1);
        splitNavigation1.setLayout(splitNavigation1Layout);
        splitNavigation1Layout.setHorizontalGroup(
            splitNavigation1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(splitNavigation1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(splitNavigation1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(splitNavigation1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnViewDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(splitNavigation1Layout.createSequentialGroup()
                        .addComponent(btnCreateDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        splitNavigation1Layout.setVerticalGroup(
            splitNavigation1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(splitNavigation1Layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(btnCreateDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnViewDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        jSplitPaneDoctor.setLeftComponent(splitNavigation1);

        javax.swing.GroupLayout splitworkspace1Layout = new javax.swing.GroupLayout(splitworkspace1);
        splitworkspace1.setLayout(splitworkspace1Layout);
        splitworkspace1Layout.setHorizontalGroup(
            splitworkspace1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 544, Short.MAX_VALUE)
        );
        splitworkspace1Layout.setVerticalGroup(
            splitworkspace1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 433, Short.MAX_VALUE)
        );

        jSplitPaneDoctor.setRightComponent(splitworkspace1);

        javax.swing.GroupLayout tabDoctorLayout = new javax.swing.GroupLayout(tabDoctor);
        tabDoctor.setLayout(tabDoctorLayout);
        tabDoctorLayout.setHorizontalGroup(
            tabDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabDoctorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPaneDoctor)
                .addContainerGap())
        );
        tabDoctorLayout.setVerticalGroup(
            tabDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabDoctorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPaneDoctor))
        );

        tabbedPanel1.addTab("Doctor", tabDoctor);

        btnViewHospital.setFont(new java.awt.Font("Helvetica Neue", 1, 10)); // NOI18N
        btnViewHospital.setText("View Doctor");
        btnViewHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewHospitalActionPerformed(evt);
            }
        });

        btnCreateHospital.setFont(new java.awt.Font("Helvetica Neue", 1, 10)); // NOI18N
        btnCreateHospital.setText("Create Doctor");
        btnCreateHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateHospitalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout splitNavigation2Layout = new javax.swing.GroupLayout(splitNavigation2);
        splitNavigation2.setLayout(splitNavigation2Layout);
        splitNavigation2Layout.setHorizontalGroup(
            splitNavigation2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(splitNavigation2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(splitNavigation2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(splitNavigation2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnViewHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(splitNavigation2Layout.createSequentialGroup()
                        .addComponent(btnCreateHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        splitNavigation2Layout.setVerticalGroup(
            splitNavigation2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(splitNavigation2Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(btnCreateHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnViewHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        jSplitPaneHospital.setLeftComponent(splitNavigation2);

        javax.swing.GroupLayout splitworkspace2Layout = new javax.swing.GroupLayout(splitworkspace2);
        splitworkspace2.setLayout(splitworkspace2Layout);
        splitworkspace2Layout.setHorizontalGroup(
            splitworkspace2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 544, Short.MAX_VALUE)
        );
        splitworkspace2Layout.setVerticalGroup(
            splitworkspace2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 433, Short.MAX_VALUE)
        );

        jSplitPaneHospital.setRightComponent(splitworkspace2);

        javax.swing.GroupLayout tabHospitalLayout = new javax.swing.GroupLayout(tabHospital);
        tabHospital.setLayout(tabHospitalLayout);
        tabHospitalLayout.setHorizontalGroup(
            tabHospitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabHospitalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPaneHospital)
                .addContainerGap())
        );
        tabHospitalLayout.setVerticalGroup(
            tabHospitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabHospitalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPaneHospital))
        );

        tabbedPanel1.addTab("Hospital", tabHospital);

        btnViewEncounters.setFont(new java.awt.Font("Helvetica Neue", 1, 10)); // NOI18N
        btnViewEncounters.setText("View Encounters");
        btnViewEncounters.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewEncountersActionPerformed(evt);
            }
        });

        btnCreateEncounters.setFont(new java.awt.Font("Helvetica Neue", 1, 10)); // NOI18N
        btnCreateEncounters.setText("Create Encounters");
        btnCreateEncounters.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateEncountersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout splitNavigation3Layout = new javax.swing.GroupLayout(splitNavigation3);
        splitNavigation3.setLayout(splitNavigation3Layout);
        splitNavigation3Layout.setHorizontalGroup(
            splitNavigation3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(splitNavigation3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(splitNavigation3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCreateEncounters, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                    .addComponent(btnViewEncounters, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        splitNavigation3Layout.setVerticalGroup(
            splitNavigation3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(splitNavigation3Layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(btnCreateEncounters, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnViewEncounters, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSplitPaneEncounters.setLeftComponent(splitNavigation3);

        javax.swing.GroupLayout splitworkspace3Layout = new javax.swing.GroupLayout(splitworkspace3);
        splitworkspace3.setLayout(splitworkspace3Layout);
        splitworkspace3Layout.setHorizontalGroup(
            splitworkspace3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 544, Short.MAX_VALUE)
        );
        splitworkspace3Layout.setVerticalGroup(
            splitworkspace3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 433, Short.MAX_VALUE)
        );

        jSplitPaneEncounters.setRightComponent(splitworkspace3);

        javax.swing.GroupLayout tabEncountersLayout = new javax.swing.GroupLayout(tabEncounters);
        tabEncounters.setLayout(tabEncountersLayout);
        tabEncountersLayout.setHorizontalGroup(
            tabEncountersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabEncountersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPaneEncounters)
                .addContainerGap())
        );
        tabEncountersLayout.setVerticalGroup(
            tabEncountersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabEncountersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPaneEncounters))
        );

        tabbedPanel1.addTab("Encounters", tabEncounters);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(286, 286, 286))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabbedPanel1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tabbedPanel1)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewPatientActionPerformed
        // TODO add your handling code here:
        ViewPatientPanel viewPatientPanel= new ViewPatientPanel(patientHistory,deleteFlag);
        jSplitPanePatient.setRightComponent(viewPatientPanel);
    }//GEN-LAST:event_btnViewPatientActionPerformed

    private void btnCreatePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreatePatientActionPerformed
        // TODO add your handling code here:
        CreatePatientPanel createPatientPanel= new CreatePatientPanel(patientHistory);
        jSplitPanePatient.setRightComponent(createPatientPanel);
    }//GEN-LAST:event_btnCreatePatientActionPerformed

    private void btnViewDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDoctorActionPerformed
        // TODO add your handling code here:
           // TODO add your handling code here:
        ViewDoctorPanel viewDoctorPanel= new ViewDoctorPanel(doctorHistory,deleteFlag);
        jSplitPaneDoctor.setRightComponent(viewDoctorPanel);
    }//GEN-LAST:event_btnViewDoctorActionPerformed

    private void btnCreateDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateDoctorActionPerformed
        // TODO add your handling code here:
         CreateDoctorPanel createDoctorPanel= new CreateDoctorPanel(doctorHistory);
        jSplitPaneDoctor.setRightComponent(createDoctorPanel);
    }//GEN-LAST:event_btnCreateDoctorActionPerformed

    private void btnViewHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewHospitalActionPerformed
        // TODO add your handling code here:
        ViewHospitalPanel viewHospitalPanel= new ViewHospitalPanel(hospitalHistory,deleteFlag);
        jSplitPaneDoctor.setRightComponent(viewHospitalPanel);
        
    }//GEN-LAST:event_btnViewHospitalActionPerformed

    private void btnCreateHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateHospitalActionPerformed
        // TODO add your handling code here:
         CreateHospitalPanel createHospitalPanel= new CreateHospitalPanel(hospitalHistory);
        jSplitPaneHospital.setRightComponent(createHospitalPanel);
        
        
    }//GEN-LAST:event_btnCreateHospitalActionPerformed

    private void btnViewEncountersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewEncountersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewEncountersActionPerformed

    private void btnCreateEncountersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateEncountersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCreateEncountersActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateDoctor;
    private javax.swing.JButton btnCreateEncounters;
    private javax.swing.JButton btnCreateHospital;
    private javax.swing.JButton btnCreatePatient;
    private javax.swing.JButton btnViewDoctor;
    private javax.swing.JButton btnViewEncounters;
    private javax.swing.JButton btnViewHospital;
    private javax.swing.JButton btnViewPatient;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSplitPane jSplitPaneDoctor;
    private javax.swing.JSplitPane jSplitPaneEncounters;
    private javax.swing.JSplitPane jSplitPaneHospital;
    private javax.swing.JSplitPane jSplitPanePatient;
    private javax.swing.JPanel splitNavigation;
    private javax.swing.JPanel splitNavigation1;
    private javax.swing.JPanel splitNavigation2;
    private javax.swing.JPanel splitNavigation3;
    private javax.swing.JPanel splitworkspace;
    private javax.swing.JPanel splitworkspace1;
    private javax.swing.JPanel splitworkspace2;
    private javax.swing.JPanel splitworkspace3;
    private javax.swing.JPanel tabDoctor;
    private javax.swing.JPanel tabEncounters;
    private javax.swing.JPanel tabHospital;
    private javax.swing.JPanel tabPatient;
    private javax.swing.JTabbedPane tabbedPanel1;
    // End of variables declaration//GEN-END:variables
}
