/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;

import Code.ManejoUsuario;
import javax.swing.JOptionPane;



public class Iniciar_Sesion extends javax.swing.JFrame {
 private ManejoUsuario user; 
 
 public String who="";

   
    public Iniciar_Sesion(ManejoUsuario user) {
       this.user=user;
        initComponents();
        this.setLocationRelativeTo(null);
        
    }

   
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txusername = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        bnX = new javax.swing.JButton();
        bnIniciar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        bncrear = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        chmostrar = new javax.swing.JCheckBox();
        jpasswor = new javax.swing.JPasswordField();
        jpassword = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Aún no tienes cuenta?");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 510, 190, 20));

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Nombre de usuario");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, 260, 30));

        txusername.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        txusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txusernameActionPerformed(evt);
            }
        });
        getContentPane().add(txusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 261, 40));

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Inicia sesion ");
        jLabel3.setToolTipText("");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 300, 90));

        bnX.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        bnX.setText("X");
        bnX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnXActionPerformed(evt);
            }
        });
        getContentPane().add(bnX, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, 40));

        bnIniciar.setBackground(new java.awt.Color(255, 255, 255));
        bnIniciar.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        bnIniciar.setForeground(new java.awt.Color(0, 0, 0));
        bnIniciar.setText("Siguiente ");
        bnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnIniciarActionPerformed(evt);
            }
        });
        getContentPane().add(bnIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 400, 260, 40));

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Contraseña");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, 260, 30));

        bncrear.setBackground(new java.awt.Color(255, 255, 255));
        bncrear.setForeground(new java.awt.Color(0, 0, 0));
        bncrear.setText("Crear cuenta");
        bncrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bncrearActionPerformed(evt);
            }
        });
        getContentPane().add(bncrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 530, 260, -1));

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 48)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/xb256.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 320, 300));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 300, -1));

        chmostrar.setBackground(new java.awt.Color(0, 0, 0));
        chmostrar.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        chmostrar.setForeground(new java.awt.Color(255, 255, 255));
        chmostrar.setText("Mostrar contraseña");
        chmostrar.setOpaque(true);
        chmostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chmostrarActionPerformed(evt);
            }
        });
        getContentPane().add(chmostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 370, -1, -1));

        jpasswor.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        getContentPane().add(jpasswor, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 320, 260, 40));

        jpassword.setBackground(new java.awt.Color(0, 0, 0));
        jpassword.setOpaque(true);
        getContentPane().add(jpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txusernameActionPerformed

    private void bnXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnXActionPerformed
        this.setVisible(false);
        new Iniciar_Sesion(user).setVisible(true);
    }//GEN-LAST:event_bnXActionPerformed

    private void bnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnIniciarActionPerformed
        String username = txusername.getText();
        String password = new String(jpasswor.getPassword());

        if (!username.isEmpty() && !password.isEmpty()) {
            if (user.validarCredenciales(username, password)) {
                
                JOptionPane.showMessageDialog(null, "Bienvenido :)");
                who=username;
                this.setVisible(false);
                new Apariencia(user).setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Campos incompletos");
        }
        
    }//GEN-LAST:event_bnIniciarActionPerformed

    private void bncrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bncrearActionPerformed
      this.setVisible(false);
      new Registro(user).setVisible(true);
    }//GEN-LAST:event_bncrearActionPerformed

    private void chmostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chmostrarActionPerformed
        if (chmostrar.isSelected()) {
        jpasswor.setEchoChar((char)0);
        } else {
            
            jpasswor.setEchoChar('*');
        }
    }//GEN-LAST:event_chmostrarActionPerformed

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
            java.util.logging.Logger.getLogger(Iniciar_Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Iniciar_Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Iniciar_Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Iniciar_Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
       /* java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Iniciar_Sesion().setVisible(true);
                
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnIniciar;
    private javax.swing.JButton bnX;
    private javax.swing.JButton bncrear;
    private javax.swing.JCheckBox chmostrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPasswordField jpasswor;
    private javax.swing.JLabel jpassword;
    private javax.swing.JTextField txusername;
    // End of variables declaration//GEN-END:variables
}
