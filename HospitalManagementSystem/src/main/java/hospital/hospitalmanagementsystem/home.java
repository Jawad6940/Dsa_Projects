/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hospital.hospitalmanagementsystem;

import javax.swing.JOptionPane;

/**
 *
 * @author mine
 */
public class home extends javax.swing.JFrame {

    /**
     * Creates new form home
     */
    public home() {
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

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setLocation(new java.awt.Point(80, 50));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1300, 750));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon("D:\\java\\Git\\Project\\HospitalManagementSystem\\src\\main\\java\\hospital\\hospitalmanagementsystem\\two arrow.png")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 33, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon("D:\\java\\Git\\Project\\HospitalManagementSystem\\src\\main\\java\\hospital\\hospitalmanagementsystem\\add new patient.png")); // NOI18N
        jButton2.setText("Add new patient informations");
        jButton2.setPreferredSize(new java.awt.Dimension(240, 60));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 131, -1, -1));

        jButton3.setIcon(new javax.swing.ImageIcon("D:\\java\\Git\\Project\\HospitalManagementSystem\\src\\main\\java\\hospital\\hospitalmanagementsystem\\add diag.png")); // NOI18N
        jButton3.setText("Add Diagnosis");
        jButton3.setPreferredSize(new java.awt.Dimension(240, 60));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 209, -1, -1));

        jButton4.setIcon(new javax.swing.ImageIcon("D:\\java\\Git\\Project\\HospitalManagementSystem\\src\\main\\java\\hospital\\hospitalmanagementsystem\\rsz_history1.png")); // NOI18N
        jButton4.setText("Full History of the patient ");
        jButton4.setPreferredSize(new java.awt.Dimension(240, 60));
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 287, -1, -1));

        jButton5.setIcon(new javax.swing.ImageIcon("D:\\java\\Git\\Project\\HospitalManagementSystem\\src\\main\\java\\hospital\\hospitalmanagementsystem\\rsz_hospital_information.png")); // NOI18N
        jButton5.setText("Hospital Information");
        jButton5.setPreferredSize(new java.awt.Dimension(240, 60));
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 443, -1, -1));

        jButton6.setIcon(new javax.swing.ImageIcon("D:\\java\\Git\\Project\\HospitalManagementSystem\\src\\main\\java\\hospital\\hospitalmanagementsystem\\rsz_update_details.png")); // NOI18N
        jButton6.setText("Update Patient Record");
        jButton6.setPreferredSize(new java.awt.Dimension(240, 60));
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 365, -1, -1));

        jButton7.setIcon(new javax.swing.ImageIcon("D:\\java\\Git\\Project\\HospitalManagementSystem\\src\\main\\java\\hospital\\hospitalmanagementsystem\\exit.png")); // NOI18N
        jButton7.setText("Logout");
        jButton7.setPreferredSize(new java.awt.Dimension(240, 60));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 521, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\java\\Git\\Project\\HospitalManagementSystem\\src\\main\\java\\hospital\\hospitalmanagementsystem\\home_image.jpg")); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(1366, 750));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

int logout= JOptionPane.showConfirmDialog(null, "Do you really want to logout","Select",JOptionPane.YES_NO_OPTION);
if(logout==0){
    setVisible(false);
    new login().setVisible(true);
//        new Login().setVisible(true);
}
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed
int toggle=0;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
if(toggle==0){        
// TODO add your handling code here:
    jButton2.setLocation(95,30);
    jButton3.setLocation(333,30);
    jButton4.setLocation(570,30);
    jButton5.setLocation(810,30);
    jButton6.setLocation(1050,30);
     jButton7.setLocation(1050,90);
    toggle=1;
    }//GEN-LAST:event_jButton1ActionPerformed
else{
    jButton2.setLocation(10,110);
    jButton3.setLocation(10,180);
    jButton4.setLocation(10,260);
    jButton5.setLocation(10,330);
    jButton6.setLocation(10,410);
     jButton7.setLocation(10,490);
    toggle=0;
}
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       setVisible(false);
        new addPatient().setVisible(true);
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      setVisible(false);
        new addDaignosis().setVisible(true);
         dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
