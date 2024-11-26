/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pbouas;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

/**
 *
 * @author DAGH
 */
public class Daftar_Akun extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Daftar_Akun() {
        initComponents();
        
    }
    private String validatePassword(String password){
      if (password.length() < 8) {
            return "Password minimal 8 karakter.";
        }
        if (!password.matches(".*[A-Z].*")) {
            return "Password harus mengandung minimal huruf besar.";
        }
        if (!password.matches(".*[a-z].*")) {
            return "Password harus mengandung minimal satu huruf kecil.";
        }
        if (!password.matches(".*[0-9].*")) {
            return "Password harus mengandung minimal satu angka.";
        }
        if (!password.matches(".*[!@#$%^&(),.?\\\":{}|<>].*")) {
            return "Password harus mengandung minimal satu simbol.";
        }
        return null;
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        btnDaftar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lbBuka1 = new javax.swing.JLabel();
        lbTutup1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("DAFTAR AKUN");

        jLabel2.setText("Username");

        jLabel3.setText("Password");

        btnDaftar.setText("Daftar");
        btnDaftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDaftarActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("X");

        lbBuka1.setIcon(new javax.swing.ImageIcon("C:\\Users\\DAGH\\Downloads\\weui--eyes-on-filled.png")); // NOI18N
        lbBuka1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbBuka1MouseClicked(evt);
            }
        });

        lbTutup1.setIcon(new javax.swing.ImageIcon("C:\\Users\\DAGH\\Downloads\\tutupmata.jpg")); // NOI18N
        lbTutup1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbTutup1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtID)
                            .addComponent(txtPass)
                            .addComponent(btnDaftar, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTutup1)
                            .addComponent(lbBuka1))))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jButton2))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbTutup1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDaftar))
                    .addComponent(lbBuka1))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDaftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDaftarActionPerformed
        // TODO add your handling code here:
        if (txtID.getText().isEmpty() || String.valueOf(txtPass.getText()).isEmpty()) {
            JOptionPane.showMessageDialog(null, "Isi username dan password terlebih dahulu");
        } else {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("utspbo1PU");
            EntityManager em = emf.createEntityManager();

            try {
                em.getTransaction().begin();

                
                String username = txtID.getText();
                String password = String.valueOf(txtPass.getText());

                Login existingUser = em.find(Login.class, username);

                if (existingUser != null) {
                    JOptionPane.showMessageDialog(null, "Username sudah terdaftar. Gunakan username lain.");
                    txtID.requestFocus();
                } else {
                    
                    String passwordError = validatePassword(password);  
                    if (passwordError != null) {
                        JOptionPane.showMessageDialog(null, passwordError);
                    } else {
                        Login baru = new Login();
                        baru.setUsername(username);
                        baru.setPassword(password);

                        em.persist(baru);

                        em.getTransaction().commit();

                        JOptionPane.showMessageDialog(null, "Registrasi berhasil! \nSilakan login menggunakan akun Anda.");

                        Login_Mahasiswa log = new Login_Mahasiswa();
                        log.setVisible(true);
                        this.dispose(); 
                    }
                }
            } catch (Exception ex) {
                em.getTransaction().rollback();
                JOptionPane.showMessageDialog(null, "Terjadi kesalahan: " + ex.getMessage());
                ex.printStackTrace();
            } finally {
                em.close();
                emf.close();
            }
        }
    }//GEN-LAST:event_btnDaftarActionPerformed

    private void lbBuka1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbBuka1MouseClicked
        // TODO add your handling code here:
        txtPass.setEchoChar((char) 0);
        lbBuka1.setVisible(false);
        lbTutup1.setVisible(true);
    }//GEN-LAST:event_lbBuka1MouseClicked

    private void lbTutup1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbTutup1MouseClicked
        // TODO add your handling code here:
        txtPass.setEchoChar('*');
        lbTutup1.setVisible(false);
        lbBuka1.setVisible(true);
    }//GEN-LAST:event_lbTutup1MouseClicked

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Daftar_Akun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Daftar_Akun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Daftar_Akun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Daftar_Akun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Daftar_Akun().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDaftar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbBuka1;
    private javax.swing.JLabel lbTutup1;
    private javax.swing.JTextField txtID;
    private javax.swing.JPasswordField txtPass;
    // End of variables declaration//GEN-END:variables
}