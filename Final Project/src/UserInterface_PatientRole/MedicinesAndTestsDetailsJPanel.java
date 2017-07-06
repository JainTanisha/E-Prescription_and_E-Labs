/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface_PatientRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Enterprise.PathologyLabEnterprise;
import Business.Enterprise.PharmacyEnterprise;
import Business.Network.Network;
import Business.Organization.ChemistOrganization;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.Organization.LabAssistantOrganization;
import Business.Queue.AppointmentVisitPDCLRequest;
import Business.Queue.WorkRequest;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tanisha_Jain
 */
public class MedicinesAndTestsDetailsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientMedicalDetailsJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Organization organization;
    private Enterprise enterprise;
    private EcoSystem system;
    
    public MedicinesAndTestsDetailsJPanel(JPanel userProcessContainer, 
            UserAccount userAccount,Organization organization,Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.userAccount=userAccount;
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.system=system;
        this.organization=organization;
        
        populateTable();
    }

    public void populateTable(){
        
        mediDetailsJTable.setFont(new Font("Comic Sans MS", Font.BOLD, 10));
        mediDetailsJTable.getTableHeader().setFont(new Font("Comic Sans MS", Font.BOLD, 10));
       
         DefaultTableModel model = (DefaultTableModel) mediDetailsJTable.getModel();
        
        model.setRowCount(0);
        
         Object[] row = new Object[10];
        
         for(Network net: system.getNetworkList()){
           for(Enterprise enter : net.getEnterpriseDirectory().getEnterpriseList()){
              if (enter instanceof HospitalEnterprise){
           for (Organization org : enter.getOrganizationDirectory().getOrganizationList()){
            if (org instanceof DoctorOrganization){
            for (WorkRequest request : org.getWorkQueue().getWorkRequestList())
        
         
        {
            AppointmentVisitPDCLRequest req = (AppointmentVisitPDCLRequest)request;
            row[0] = req.getAppointmentDate();
            row[1] = req.getReceiver();
           
    
        }
       }}}}}
         
        
         
         for(Network net: system.getNetworkList()){
         for(Enterprise enter : net.getEnterpriseDirectory().getEnterpriseList()){
              if (enter instanceof PharmacyEnterprise){
        for (Organization org : enter.getOrganizationDirectory().getOrganizationList()){
            if (org instanceof ChemistOrganization){
        for (WorkRequest request : org.getWorkQueue().getWorkRequestList())
         
        {
           
          AppointmentVisitPDCLRequest drug =  (AppointmentVisitPDCLRequest)request; 
           row[2] = drug.getpPreferredChemist();
           row[3] = drug.getMedicineOne();
           row[4] = drug.getMedicineTwo();
           row[5] = drug.getMedicineThree();
         }
        }}}}}
        
         for(Network net: system.getNetworkList()){
         for(Enterprise enter : net.getEnterpriseDirectory().getEnterpriseList()){
              if (enter instanceof PathologyLabEnterprise){
        for (Organization org : enter.getOrganizationDirectory().getOrganizationList()){
            if (org instanceof LabAssistantOrganization){
        for (WorkRequest request : org.getWorkQueue().getWorkRequestList())
         
        {
            AppointmentVisitPDCLRequest test = (AppointmentVisitPDCLRequest)request;
            
            row[6] = test.getReceiver();
            row[7] = test.getTestOne();
            row[8] = test.getTestTwo();
            row[9] = test.getTestThree();
          }
           
           
            model.addRow(row);
        
    }}}}}} 
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        mediDetailsJTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 204, 153));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setText("MEDICINES AND TEST DETAILS FOR THE LATEST APPOINTMENT");

        mediDetailsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Appointment Date", "Doctor", "Chemist", "Medicine 1", "Medicine 2", "Medicine 3", "Lab Assistant", "Test 1", "Test 2", "Test 3"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(mediDetailsJTable);

        jButton1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton1.setText("<<Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 727, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(17, 17, 17))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        userProcessContainer.remove(this);
        
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable mediDetailsJTable;
    // End of variables declaration//GEN-END:variables
}