/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface_DoctorRole;

import Business.Queue.AppointmentVisitPDCLRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Tanisha_Jain
 */
 
public class ProcessAppointmentJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private AppointmentVisitPDCLRequest req;
    /**
     * Creates new form ProcessAppointmentJPanel
     */
    public ProcessAppointmentJPanel(JPanel userProcessContainer,AppointmentVisitPDCLRequest req) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.req = req;
        approvalJLabel.setVisible(false);
        resultJTextField.setVisible(false);
        confirmJButton.setVisible(false);
        dayTimeJLabel.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        approveJButton = new javax.swing.JButton();
        approvalJLabel = new javax.swing.JLabel();
        resultJTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        rejectJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        confirmJButton = new javax.swing.JButton();
        dayTimeJLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 204, 153));

        approveJButton.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        approveJButton.setText("Approve Appointment");
        approveJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveJButtonActionPerformed(evt);
            }
        });

        approvalJLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        approvalJLabel.setText("Please mention below the half hour slot for the patient from the daytime range patient preferred:");

        resultJTextField.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N

        backJButton.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        rejectJButton.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        rejectJButton.setText("Reject Appointment");
        rejectJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rejectJButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel2.setText("APPOINTMENT ACCEPT/REJECT ");

        confirmJButton.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        confirmJButton.setText("Confirm");
        confirmJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmJButtonActionPerformed(evt);
            }
        });

        dayTimeJLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        dayTimeJLabel.setText("Day Time Chosen by patient");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(backJButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(approveJButton)
                                .addGap(109, 109, 109)
                                .addComponent(rejectJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(dayTimeJLabel)
                                .addGap(44, 44, 44)
                                .addComponent(resultJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(261, 261, 261)
                                .addComponent(confirmJButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(177, 177, 177)
                                .addComponent(jLabel2)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(approvalJLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rejectJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(approveJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(approvalJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resultJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dayTimeJLabel))
                .addGap(18, 18, 18)
                .addComponent(confirmJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backJButton)
                .addGap(28, 28, 28))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        DoctorToPatientProcessJPanel dtppjp = (DoctorToPatientProcessJPanel) component;
        dtppjp.patientRequestJTableOne();
        dtppjp.patientDetailsJTableTwo();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_backJButtonActionPerformed

    private void approveJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveJButtonActionPerformed

        approvalJLabel.setVisible(true);
        resultJTextField.setVisible(true);
        confirmJButton.setVisible(true);
        dayTimeJLabel.setVisible(true);
        
        dayTimeJLabel.setText(req.getDayTime());
        req.setStatus1("Completed");
        
    }//GEN-LAST:event_approveJButtonActionPerformed

    private void rejectJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rejectJButtonActionPerformed
   
        req.setAppointmentResult("Cancelled");
        req.setStatus1("Completed");
        
        JOptionPane.showMessageDialog(null,"Appointment for patient is cancelled.",
        "Information", JOptionPane.INFORMATION_MESSAGE);
         
        approvalJLabel.setVisible(false);
        resultJTextField.setVisible(false);
        confirmJButton.setVisible(false);
        dayTimeJLabel.setVisible(false);
         
         
    }//GEN-LAST:event_rejectJButtonActionPerformed

    private void confirmJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmJButtonActionPerformed
        // TODO add your handling code here:
        
        req.setAppointmentResult("Confirmed");
        req.setStatus1("Completed");
        
       String time = resultJTextField.getText();
       req.setDayTime(time);
        
        Date date = new Date();
        req.setResolveDate(date);
        
        JOptionPane.showMessageDialog(null,"Appointment for patient is confirmed.",
        "Information", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_confirmJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel approvalJLabel;
    private javax.swing.JButton approveJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton confirmJButton;
    private javax.swing.JLabel dayTimeJLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton rejectJButton;
    private javax.swing.JTextField resultJTextField;
    // End of variables declaration//GEN-END:variables
}
