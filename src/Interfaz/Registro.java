/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;

import Code.ManejoUsuario;

import java.time.LocalDate;


import javax.swing.JOptionPane;

public class Registro extends javax.swing.JFrame {
    private ManejoUsuario user;
    
   
    public Registro(ManejoUsuario user) {
         this.user=user;
        initComponents();
        
        user.mostrarNombre();
        this.setLocationRelativeTo(null);
    }

    char genero = 0;
    LocalDate today = LocalDate.now();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gpgenero = new javax.swing.ButtonGroup();
        jLabel10 = new javax.swing.JLabel();
        txpassword = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        bnX = new javax.swing.JButton();
        bnIniciar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtedad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        rdF = new javax.swing.JRadioButton();
        rdM = new javax.swing.JRadioButton();
        lbfecha = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 48)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/xb256.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 320, 300));

        txpassword.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        txpassword.setForeground(new java.awt.Color(0, 0, 0));
        txpassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txpasswordFocusLost(evt);
            }
        });
        txpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txpasswordActionPerformed(evt);
            }
        });
        getContentPane().add(txpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, 250, 30));

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Nombre Completo");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, 140, 30));

        txtnombre.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        txtnombre.setForeground(new java.awt.Color(0, 0, 0));
        txtnombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtnombreFocusLost(evt);
            }
        });
        txtnombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtnombreMouseClicked(evt);
            }
        });
        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });
        getContentPane().add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 250, 30));

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 32)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Crear cuenta");
        jLabel3.setToolTipText("");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 260, 90));

        bnX.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        bnX.setText("X ");
        bnX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnXActionPerformed(evt);
            }
        });
        getContentPane().add(bnX, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, 30));

        bnIniciar.setBackground(new java.awt.Color(255, 255, 255));
        bnIniciar.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        bnIniciar.setForeground(new java.awt.Color(0, 0, 0));
        bnIniciar.setText("Siguiente ");
        bnIniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnIniciarActionPerformed(evt);
            }
        });
        getContentPane().add(bnIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 530, 250, 30));

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Nombre usuario");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 220, 30));

        txtusername.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        txtusername.setForeground(new java.awt.Color(0, 0, 0));
        txtusername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtusernameFocusLost(evt);
            }
        });
        txtusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusernameActionPerformed(evt);
            }
        });
        getContentPane().add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, 250, 30));

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Contraseña");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, 110, 30));

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Fecha");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 390, 170, 30));

        txtedad.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        txtedad.setForeground(new java.awt.Color(0, 0, 0));
        txtedad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtedadFocusLost(evt);
            }
        });
        txtedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtedadActionPerformed(evt);
            }
        });
        getContentPane().add(txtedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 350, 250, 30));

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Edad");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 320, 220, 30));

        jSeparator1.setBackground(new java.awt.Color(0, 153, 255));
        jSeparator1.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255), 2));
        jSeparator1.setOpaque(true);
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 260, -1));

        rdF.setBackground(new java.awt.Color(0, 153, 255));
        gpgenero.add(rdF);
        rdF.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        rdF.setForeground(new java.awt.Color(255, 255, 255));
        rdF.setText("Femenino");
        rdF.setContentAreaFilled(false);
        rdF.setFocusable(false);
        rdF.setOpaque(false);
        rdF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdFActionPerformed(evt);
            }
        });
        getContentPane().add(rdF, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 490, -1, -1));

        rdM.setBackground(new java.awt.Color(0, 102, 255));
        gpgenero.add(rdM);
        rdM.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        rdM.setForeground(new java.awt.Color(255, 255, 255));
        rdM.setText("Masculino");
        rdM.setContentAreaFilled(false);
        rdM.setFocusPainted(false);
        rdM.setRequestFocusEnabled(false);
        rdM.setRolloverEnabled(false);
        getContentPane().add(rdM, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 490, -1, -1));

        lbfecha.setBackground(new java.awt.Color(255, 255, 255));
        lbfecha.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        lbfecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbfecha.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lbfecha.setOpaque(true);
        lbfecha.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                lbfechaComponentAdded(evt);
            }
        });
        getContentPane().add(lbfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 420, 250, 30));

        jLabel9.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Genero");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 460, 220, 30));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setOpaque(true);
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txpasswordActionPerformed

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed


    }//GEN-LAST:event_txtnombreActionPerformed

    private void bnXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnXActionPerformed
        this.setVisible(false);
        new Iniciar_Sesion(user).setVisible(true);
    }//GEN-LAST:event_bnXActionPerformed

    private void bnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnIniciarActionPerformed
        String nombre = txtnombre.getText().trim();
        String username = txtusername.getText().trim();
        String password = txpassword.getText().trim();
        String fecha = lbfecha.getText().trim();
        String edadText = txtedad.getText().trim();
        boolean generoSeleccionado = rdM.isSelected() || rdF.isSelected();
        
        int edad = -1;
        try {
            if (!edadText.isEmpty()) {
                edad = Integer.parseInt(edadText);
                if (edad < 12 || edad > 100) {
                    JOptionPane.showMessageDialog(null, "!Error. Rango de edad invalido");
                    txtedad.setText(null);
                    edad = -1; 
                }
            } else {
              //  JOptionPane.showMessageDialog(null, "!Error. El campo de edad no puede estar vacío");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "!Error. Formato de edad incorrecto");
            txtedad.setText(null);
        }
        
        
        
    if (rdM.isSelected()) {
        genero = 'M';
    }
    if (rdF.isSelected()) {
        genero = 'F';
    }

    if (!nombre.isEmpty()
        && !username.isEmpty()
        && !password.isEmpty()
        && edad != -1
        && generoSeleccionado) {
        
        if (!user.usuarioExiste(username)) {
            if (user.agregarUser(nombre, genero, username, password, fecha, edad, true)) {
                JOptionPane.showMessageDialog(null, "Registrado Exitosamente");
                this.setVisible(false);
                new Apariencia(user).setVisible(true);
                Perfil perfil = new Perfil(user);
            } else {
                JOptionPane.showMessageDialog(null, "Algo salio mal, intenta de nuevo");
                   }
            
        } else {
            JOptionPane.showMessageDialog(null, "Usuario existente");
        } 
       
        
    } else {
        if (nombre.isEmpty() || username.isEmpty() || password.isEmpty() || edadText.isEmpty() || (!generoSeleccionado)) {
            JOptionPane.showMessageDialog(null, "¡Error! Asegúrese de llenar todos los campos");
            
            }
        } 
    }//GEN-LAST:event_bnIniciarActionPerformed

    private void txtusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusernameActionPerformed

    private void rdFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdFActionPerformed

    }//GEN-LAST:event_rdFActionPerformed

    private void txtedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtedadActionPerformed

    }//GEN-LAST:event_txtedadActionPerformed

    private void lbfechaComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_lbfechaComponentAdded

    }//GEN-LAST:event_lbfechaComponentAdded

    private void txtnombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtnombreMouseClicked

    }//GEN-LAST:event_txtnombreMouseClicked


    private void txtnombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnombreFocusLost
        if (!txtnombre.getText().isEmpty()) {
            lbfecha.setText("" + today);
        }
    }//GEN-LAST:event_txtnombreFocusLost

    private void txtusernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtusernameFocusLost
        if (txtnombre.getText().isEmpty()) {

        }
    }//GEN-LAST:event_txtusernameFocusLost

    private void txpasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txpasswordFocusLost
        if (txtnombre.getText().isEmpty()) {

        }
    }//GEN-LAST:event_txpasswordFocusLost

    private void txtedadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtedadFocusLost
        
    }//GEN-LAST:event_txtedadFocusLost

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

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
               
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnIniciar;
    private javax.swing.JButton bnX;
    private javax.swing.ButtonGroup gpgenero;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbfecha;
    private javax.swing.JRadioButton rdF;
    private javax.swing.JRadioButton rdM;
    private javax.swing.JTextField txpassword;
    private javax.swing.JTextField txtedad;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
