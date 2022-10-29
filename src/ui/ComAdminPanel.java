/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import model.CityHistory;
import model.CommunityHistory;
import model.HouseHistory;

 
public class ComAdminPanel extends javax.swing.JPanel {
CityHistory cityHistory;
CommunityHistory communityHistory;
HouseHistory houseHistory;
    /**
     * Creates new form ComAdminPanel
     */
    public ComAdminPanel(CityHistory cityHistory,CommunityHistory communityHistory,HouseHistory houseHistory) {
        this(cityHistory, houseHistory, communityHistory);
        
    }

    /**
     * Creates new form ComAdminPanel
     */
    public ComAdminPanel(CityHistory cityHistory, HouseHistory houseHistory, CommunityHistory communityHistory) {
        initComponents();
        this.cityHistory = cityHistory;
        this.communityHistory = communityHistory;
        this.houseHistory = houseHistory;
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
        jTabbedPane1 = new javax.swing.JTabbedPane();
        tabCity = new javax.swing.JPanel();
        splitPaneCity = new javax.swing.JSplitPane();
        splitNavigation = new javax.swing.JPanel();
        btnCreateCity = new javax.swing.JButton();
        splitWorkspace = new javax.swing.JPanel();
        tabCommunity = new javax.swing.JPanel();
        splitPaneCommunity = new javax.swing.JSplitPane();
        splitNavigation1 = new javax.swing.JPanel();
        btnCreateCommunity = new javax.swing.JButton();
        splitWorkspace1 = new javax.swing.JPanel();
        tabHouse = new javax.swing.JPanel();
        splitPaneHouse = new javax.swing.JSplitPane();
        splitNavigation2 = new javax.swing.JPanel();
        btnCreateHouse = new javax.swing.JButton();
        splitWorkspace2 = new javax.swing.JPanel();

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Community Admin Dashboard");

        jTabbedPane1.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N

        btnCreateCity.setFont(new java.awt.Font("Helvetica Neue", 1, 10)); // NOI18N
        btnCreateCity.setText("Create City");
        btnCreateCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateCityActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout splitNavigationLayout = new javax.swing.GroupLayout(splitNavigation);
        splitNavigation.setLayout(splitNavigationLayout);
        splitNavigationLayout.setHorizontalGroup(
            splitNavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCreateCity, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
        );
        splitNavigationLayout.setVerticalGroup(
            splitNavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(splitNavigationLayout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(btnCreateCity, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(146, Short.MAX_VALUE))
        );

        splitPaneCity.setLeftComponent(splitNavigation);

        splitWorkspace.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout splitWorkspaceLayout = new javax.swing.GroupLayout(splitWorkspace);
        splitWorkspace.setLayout(splitWorkspaceLayout);
        splitWorkspaceLayout.setHorizontalGroup(
            splitWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 679, Short.MAX_VALUE)
        );
        splitWorkspaceLayout.setVerticalGroup(
            splitWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 429, Short.MAX_VALUE)
        );

        splitPaneCity.setRightComponent(splitWorkspace);

        javax.swing.GroupLayout tabCityLayout = new javax.swing.GroupLayout(tabCity);
        tabCity.setLayout(tabCityLayout);
        tabCityLayout.setHorizontalGroup(
            tabCityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabCityLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(splitPaneCity)
                .addContainerGap())
        );
        tabCityLayout.setVerticalGroup(
            tabCityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabCityLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(splitPaneCity, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("City", tabCity);

        btnCreateCommunity.setFont(new java.awt.Font("Helvetica Neue", 1, 10)); // NOI18N
        btnCreateCommunity.setText("Create Community");
        btnCreateCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateCommunityActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout splitNavigation1Layout = new javax.swing.GroupLayout(splitNavigation1);
        splitNavigation1.setLayout(splitNavigation1Layout);
        splitNavigation1Layout.setHorizontalGroup(
            splitNavigation1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(splitNavigation1Layout.createSequentialGroup()
                .addComponent(btnCreateCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        splitNavigation1Layout.setVerticalGroup(
            splitNavigation1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(splitNavigation1Layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(btnCreateCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(146, Short.MAX_VALUE))
        );

        splitPaneCommunity.setLeftComponent(splitNavigation1);

        splitWorkspace1.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout splitWorkspace1Layout = new javax.swing.GroupLayout(splitWorkspace1);
        splitWorkspace1.setLayout(splitWorkspace1Layout);
        splitWorkspace1Layout.setHorizontalGroup(
            splitWorkspace1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 679, Short.MAX_VALUE)
        );
        splitWorkspace1Layout.setVerticalGroup(
            splitWorkspace1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 429, Short.MAX_VALUE)
        );

        splitPaneCommunity.setRightComponent(splitWorkspace1);

        javax.swing.GroupLayout tabCommunityLayout = new javax.swing.GroupLayout(tabCommunity);
        tabCommunity.setLayout(tabCommunityLayout);
        tabCommunityLayout.setHorizontalGroup(
            tabCommunityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabCommunityLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(splitPaneCommunity)
                .addContainerGap())
        );
        tabCommunityLayout.setVerticalGroup(
            tabCommunityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabCommunityLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(splitPaneCommunity, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Community", tabCommunity);

        btnCreateHouse.setFont(new java.awt.Font("Helvetica Neue", 1, 10)); // NOI18N
        btnCreateHouse.setText("Create House");
        btnCreateHouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateHouseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout splitNavigation2Layout = new javax.swing.GroupLayout(splitNavigation2);
        splitNavigation2.setLayout(splitNavigation2Layout);
        splitNavigation2Layout.setHorizontalGroup(
            splitNavigation2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(splitNavigation2Layout.createSequentialGroup()
                .addComponent(btnCreateHouse, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        splitNavigation2Layout.setVerticalGroup(
            splitNavigation2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(splitNavigation2Layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(btnCreateHouse, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(145, Short.MAX_VALUE))
        );

        splitPaneHouse.setLeftComponent(splitNavigation2);

        splitWorkspace2.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout splitWorkspace2Layout = new javax.swing.GroupLayout(splitWorkspace2);
        splitWorkspace2.setLayout(splitWorkspace2Layout);
        splitWorkspace2Layout.setHorizontalGroup(
            splitWorkspace2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 673, Short.MAX_VALUE)
        );
        splitWorkspace2Layout.setVerticalGroup(
            splitWorkspace2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 429, Short.MAX_VALUE)
        );

        splitPaneHouse.setRightComponent(splitWorkspace2);

        javax.swing.GroupLayout tabHouseLayout = new javax.swing.GroupLayout(tabHouse);
        tabHouse.setLayout(tabHouseLayout);
        tabHouseLayout.setHorizontalGroup(
            tabHouseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabHouseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(splitPaneHouse)
                .addContainerGap())
        );
        tabHouseLayout.setVerticalGroup(
            tabHouseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabHouseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(splitPaneHouse, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("House", tabHouse);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateCityActionPerformed
        // TODO add your handling code here:
        CreateCityPanel createCityPanel = new CreateCityPanel(cityHistory);
        splitPaneCity.setRightComponent(createCityPanel);
    }//GEN-LAST:event_btnCreateCityActionPerformed

    private void btnCreateCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateCommunityActionPerformed
        // TODO add your handling code here:
     CreatecommunityJPanel createcommunityJPanel = new CreatecommunityJPanel(communityHistory);
        splitPaneCommunity.setRightComponent(createcommunityJPanel);
    }//GEN-LAST:event_btnCreateCommunityActionPerformed

    private void btnCreateHouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateHouseActionPerformed
        // TODO add your handling code here:
        //        CreateHospitalJPanel createHospitalJPanel= new CreateHospitalJPanel(hospitalDirectory);
        //        splitPaneHouse.setRightComponent(createHospitalJPanel);
        CreateHousePanel createHousePanel = new CreateHousePanel(houseHistory);
        splitPaneHouse.setRightComponent(createHousePanel);
    }//GEN-LAST:event_btnCreateHouseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateCity;
    private javax.swing.JButton btnCreateCommunity;
    private javax.swing.JButton btnCreateHouse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel splitNavigation;
    private javax.swing.JPanel splitNavigation1;
    private javax.swing.JPanel splitNavigation2;
    private javax.swing.JSplitPane splitPaneCity;
    private javax.swing.JSplitPane splitPaneCommunity;
    private javax.swing.JSplitPane splitPaneHouse;
    private javax.swing.JPanel splitWorkspace;
    private javax.swing.JPanel splitWorkspace1;
    private javax.swing.JPanel splitWorkspace2;
    private javax.swing.JPanel tabCity;
    private javax.swing.JPanel tabCommunity;
    private javax.swing.JPanel tabHouse;
    // End of variables declaration//GEN-END:variables
}
