/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface_DoctorRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.Queue.AppointmentVisitPDCLRequest;
import Business.UserAccount.UserAccount;
import Business.Queue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Font;
import java.util.HashSet;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tanisha_Jain
 */
public class DoctorToLabAssistantRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DoctorToLabAssistantRequestJPanel
     */
    
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem business;
    private Network network;
    private Organization org;
    private DoctorOrganization doctorOrg;
    
    public DoctorToLabAssistantRequestJPanel(JPanel userProcessContainer,
            UserAccount account, Organization organization,
            Enterprise enterprise, EcoSystem business, Network network){
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.org = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.business = business;
        this.network = network;
        
         for(Organization or : enterprise.getOrganizationDirectory().getOrganizationList() )
            if(or instanceof DoctorOrganization){
                doctorOrg=(DoctorOrganization)or;
                break;
            }
         
        valueLabel.setText(enterprise.getName());
            populateTestTable();
    }
    
    public void populateTestTable(){
        
        testRequestJTable.setFont(new Font("Comic Sans MS", Font.BOLD, 10));
        testRequestJTable.getTableHeader().setFont(new Font("Comic Sans MS", Font.BOLD, 10));
        
        DefaultTableModel model = (DefaultTableModel) testRequestJTable.getModel();
        
        model.setRowCount(0);
        HashSet<WorkRequest> uniqueValues = new HashSet<>(userAccount.getWorkQueue().getWorkRequestList());
        for(WorkRequest request : uniqueValues){
                    
            
             AppointmentVisitPDCLRequest test = (AppointmentVisitPDCLRequest)request;
                    Object[] row = new Object[8];
                    
                    row[0] = test.getStatus3();
                    row[1] = test.getpPreferredLabAssistant(); 
                    row[2] = test.getReceiver();
                    row[3] = test.getSender();
                    row[4] = test.getTestOne();
                    row[5] = test.getTestTwo();
                    row[6] = test.getTestThree();
                   
                    String result = test.getPathologyTestResult();
                    row[7] = result == null ? "Waiting" : result;
                   
                    model.addRow(row);
                }  
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        testRequestJTable = new javax.swing.JTable();
        requestTestJButton = new javax.swing.JButton();
        refreshTestJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 204, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backJButton.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, -1, 30));

        testRequestJTable.setAutoCreateRowSorter(true);
        testRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Status", "Lab Assistant Name", "Doctor Name", "Patient Name", "Test 1", "Test 2", "Test 3", "Result"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(testRequestJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 691, 201));

        requestTestJButton.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        requestTestJButton.setText("Make request for lab tests");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });
        add(requestTestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 390, -1, 40));

        refreshTestJButton.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        refreshTestJButton.setText("Refresh");
        refreshTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButtonActionPerformed(evt);
            }
        });
        add(refreshTestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, -1, 40));

        enterpriseLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        enterpriseLabel.setText("Enterprise ");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 127, 30));

        valueLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 158, 26));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setText("DOCTOR TO LAB ASSISTANT REQUEST FOR PATIENT'S TESTS:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed
       
        RequestTestJPanel rtjp = new RequestTestJPanel(userProcessContainer,
                userAccount, enterprise, org, business, network);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        
        userProcessContainer.add("RequestLabTestJPanel", rtjp);
        layout.next(userProcessContainer);

    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void refreshTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButtonActionPerformed

        populateTestTable();

    }//GEN-LAST:event_refreshTestJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshTestJButton;
    private javax.swing.JButton requestTestJButton;
    private javax.swing.JTable testRequestJTable;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}