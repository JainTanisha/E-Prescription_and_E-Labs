/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface_PatientRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Network.Network;
import Business.Organization.ChemistOrganization;
import Business.Organization.Organization;
import Business.Organization.PatientOrganization;
import Business.Queue.NotifyCPRequest;
import Business.Queue.WorkRequest;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tanisha_Jain
 */
public class PatientToChemistJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private ChemistOrganization chemistOrganization;
    private Organization org;
    private Enterprise enterprise;
    
    /**
     * Creates new form 
     */
    public PatientToChemistJPanel(JPanel userProcessContainer, UserAccount account,
            Organization organization,Enterprise enterprise, EcoSystem business) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
    //   this.userAccount = (doctor)account;
        this.business = business;
     //   this.chemistOrganization = (ChemistOrganization)organization;
        this.business = business;
        this.org=organization;
        
        populateTable();
    }
    
    public void populateTable(){
        
        drugCollectJTable.setFont(new Font("Comic Sans MS", Font.BOLD, 10));
        drugCollectJTable.getTableHeader().setFont(new Font("Comic Sans MS", Font.BOLD, 10));
       
        DefaultTableModel model = (DefaultTableModel)drugCollectJTable.getModel();
        
        model.setRowCount(0);
     
         for(Network net : business.getNetworkList()){
      for(Enterprise enter : net.getEnterpriseDirectory().getEnterpriseList()){
          if(enter instanceof HospitalEnterprise){
            for(Organization organization : enter.getOrganizationDirectory().getOrganizationList()){        
              if (organization instanceof PatientOrganization){
        
        for(WorkRequest request : org.getWorkQueue().getWorkRequestList()){
           if(request instanceof NotifyCPRequest){
        
            NotifyCPRequest notify = (NotifyCPRequest)request;
            
            if(notify.getReceiver()==userAccount){
                
                Object[] row = new Object[8];
                    
                    row[0] = notify;
                    row[1] = notify.getSender().getEmployee().getName();
                    row[2] = notify.getReceiver() == null ? null : notify.getReceiver().getEmployee().getName();
                    row[3] = notify.getDoctor();
                    row[4] = notify.getMessage();
                    row[5] = notify.getRequestDate();
                    row[6] = notify.getResolveDate();
                
                    String result = notify.getNotifyDrugResult();
                    row[7] = result == null ? "Waiting" : result;
                   
                    model.addRow(row);
                }  
            
    }
              }}}
    }
      }}}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        drugCollectJTable = new javax.swing.JTable();
        processJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jScrollPane2.setViewportView(jEditorPane1);

        setBackground(new java.awt.Color(0, 204, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        drugCollectJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "State", "Chemist Name", "Patient Name", "Doctor", "Notification Message", "Notification Date", "Collection Date", "Result"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
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
        jScrollPane1.setViewportView(drugCollectJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 670, 130));

        processJButton.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        processJButton.setText("Process");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });
        add(processJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 380, -1, 40));

        refreshJButton.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });
        add(refreshJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, -1, 40));

        backJButton.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, -1, -1));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setText("PATIENT TO CHEMIST NOTIFICATION ACKNOWLEDGEMENT");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed
        
        int selectedRow = drugCollectJTable.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please Select A Row", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        NotifyCPRequest notify = (NotifyCPRequest)drugCollectJTable.getValueAt(selectedRow, 0);
     
        notify.setStatus4("Reaching Pharmacy");
        
        CollectedDrugsJPanel cdjp = new CollectedDrugsJPanel(userProcessContainer, notify);
        userProcessContainer.add("CollectedDrugsJPanel", cdjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_processJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JTable drugCollectJTable;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton processJButton;
    private javax.swing.JButton refreshJButton;
    // End of variables declaration//GEN-END:variables
}
