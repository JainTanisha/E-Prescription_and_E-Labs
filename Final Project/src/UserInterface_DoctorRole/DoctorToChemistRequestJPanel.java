/*
 * To change this template, choose Tools | Templates
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
public class DoctorToChemistRequestJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem business;
    private Network network;
    private Organization org;
    private DoctorOrganization doctorOrg;
    
    /**
     * Creates new form DoctorToChemistRequestJPanel
     */
    
    public DoctorToChemistRequestJPanel(JPanel userProcessContainer,
                     UserAccount account, Organization organization,
                  Enterprise enterprise, EcoSystem business, Network network) {
        
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
         
        
            populateDrugTable();
           
        
    }
    
    public void populateDrugTable(){
        
        drugRequestJTable.setFont(new Font("Comic Sans MS", Font.BOLD, 10));
        drugRequestJTable.getTableHeader().setFont(new Font("Comic Sans MS", Font.BOLD, 10));
        
        DefaultTableModel model = (DefaultTableModel) drugRequestJTable.getModel();
        
        model.setRowCount(0);
        HashSet<WorkRequest> uniqueValues = new HashSet<>(userAccount.getWorkQueue().getWorkRequestList());
        for (WorkRequest request : uniqueValues){
            
                    
            AppointmentVisitPDCLRequest req = (AppointmentVisitPDCLRequest)request;
                    Object[] row = new Object[8];
                    
                    row[0] = req.getStatus2();
                    row[1] = req.getpPreferredChemist();
                    row[2] = req.getReceiver();
                    row[3] = req.getSender();
                    row[4] = (req.getMedicineOne())+"-"+(req.getDosageOne()+"mg");
                    row[5] = (req.getMedicineTwo())+"-"+(req.getDosageTwo()+"mg");
                    row[6] = (req.getMedicineThree())+"-"+(req.getDosageThree()+"mg");
                   
                    String result = req.getPrescriptionResult();
                    row[7] = result == null ? "Waiting" : result;
                    
                    System.out.println(req.getSender());
                    
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

        jScrollPane1 = new javax.swing.JScrollPane();
        drugRequestJTable = new javax.swing.JTable();
        requestTestJButton = new javax.swing.JButton();
        refreshTestJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 204, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        drugRequestJTable.setAutoCreateRowSorter(true);
        drugRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Status", "Chemist Name", "Doctor Name", "Patient Name", "Medicine 1", "Medicine 2", "Medicine 3", "Result"
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
        jScrollPane1.setViewportView(drugRequestJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 80, 676, 154));

        requestTestJButton.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        requestTestJButton.setText("Make a request to drug");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });
        add(requestTestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(409, 261, -1, 40));

        refreshTestJButton.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        refreshTestJButton.setText("Refresh");
        refreshTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButtonActionPerformed(evt);
            }
        });
        add(refreshTestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 260, -1, 42));

        backJButton.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 334, -1, -1));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setText("DOCTOR TO CHEMIST REQUEST FOR PATIENT'S TESTS:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 25, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed
        
        RequestDrugJPanel rdjp=new RequestDrugJPanel(userProcessContainer,
                userAccount, enterprise, org, business, network);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        
        userProcessContainer.add("RequestLabTestJPanel", rdjp);
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void refreshTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButtonActionPerformed

        populateDrugTable();
        
    }//GEN-LAST:event_refreshTestJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
      
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_backJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JTable drugRequestJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshTestJButton;
    private javax.swing.JButton requestTestJButton;
    // End of variables declaration//GEN-END:variables
}
