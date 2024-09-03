
package Interfaz;

import Code.ManejoUsuario;
import javax.swing.ImageIcon;

public class Perfil extends javax.swing.JFrame {
private ManejoUsuario user; 
    
    public Perfil(ManejoUsuario user) {
        this.user=user;
        
        initComponents();
        actualizarUsuario();
    }

    
    private void actualizarUsuario() {
        lbnombre.setText(user.mostrarNombre());
        bnuser.setText("@ " + user.mostrarUser());
        lbfecha.setText(user.mostrarFecha());
        
        String rutaImagen = "";
        char genero = user.mostrarGenero();

        if (genero == 'M') {
            rutaImagen = "/Images/male128.png"; 
        } else if (genero == 'F') {
            rutaImagen = "/Images/female128.png"; 
        }

            java.net.URL imgURL = getClass().getResource(rutaImagen);
        if (imgURL != null) {
            ImageIcon imagenIcon = new ImageIcon(imgURL);
            jLabel2.setIcon(imagenIcon);
        } else {
            System.err.println("No se pudo encontrar la imagen en la ruta: " + rutaImagen);
        }
        
        
        
}
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();
        lbsiguiendo = new javax.swing.JLabel();
        bnseguidos = new javax.swing.JButton();
        bnseguidores = new javax.swing.JButton();
        lbseguidores = new javax.swing.JLabel();
        lbnombre = new javax.swing.JLabel();
        bnuser = new javax.swing.JButton();
        lbcalendario = new javax.swing.JLabel();
        lbfecha = new javax.swing.JLabel();
        lbfecha1 = new javax.swing.JLabel();
        bnuser1 = new javax.swing.JButton();
        bnback = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        lbcalendario1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Fonde = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/perfil4 (1)perfil5.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, 150));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fondo.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 880, 190));

        lbsiguiendo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        lbsiguiendo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbsiguiendo.setText("50");
        getContentPane().add(lbsiguiendo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 310, 50, 30));

        bnseguidos.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        bnseguidos.setText("Siguiendo");
        bnseguidos.setBorderPainted(false);
        bnseguidos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bnseguidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnseguidosActionPerformed(evt);
            }
        });
        getContentPane().add(bnseguidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 310, 120, 30));

        bnseguidores.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        bnseguidores.setText("Seguidos");
        bnseguidores.setBorderPainted(false);
        bnseguidores.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bnseguidores.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bnseguidores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnseguidoresActionPerformed(evt);
            }
        });
        getContentPane().add(bnseguidores, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 310, 110, 30));

        lbseguidores.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        lbseguidores.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbseguidores.setText("50");
        getContentPane().add(lbseguidores, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 310, 50, 30));

        lbnombre.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        lbnombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbnombre.setText("Nombre Completo");
        getContentPane().add(lbnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 280, 25));

        bnuser.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        bnuser.setText("username");
        getContentPane().add(bnuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 280, 20));

        lbcalendario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lupa32.png"))); // NOI18N
        getContentPane().add(lbcalendario, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 40, 40, 40));

        lbfecha.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        lbfecha.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbfecha.setText("10/12/15");
        getContentPane().add(lbfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, 100, 25));

        lbfecha1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        lbfecha1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbfecha1.setText("Se unió en");
        getContentPane().add(lbfecha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, 90, 25));

        bnuser1.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        bnuser1.setText("Editar perfil");
        getContentPane().add(bnuser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 260, 130, 30));

        bnback.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        bnback.setText("X ");
        bnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnbackActionPerformed(evt);
            }
        });
        getContentPane().add(bnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 30));

        jTextField1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jTextField1.setText("Buscar algo");
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 40, 450, 40));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 486, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 576, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 110, 490, 580));

        lbcalendario1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/calendar24.png"))); // NOI18N
        getContentPane().add(lbcalendario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 916, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 316, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 920, 320));
        getContentPane().add(Fonde, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1490, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bnseguidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnseguidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bnseguidosActionPerformed

    private void bnseguidoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnseguidoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bnseguidoresActionPerformed

    private void bnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnbackActionPerformed
        this.setVisible(false);
        new Apariencia(user).setVisible(true);
    }//GEN-LAST:event_bnbackActionPerformed

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
            java.util.logging.Logger.getLogger(Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Perfil().setVisible(true);
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fonde;
    private javax.swing.JButton bnback;
    private javax.swing.JButton bnseguidores;
    private javax.swing.JButton bnseguidos;
    private javax.swing.JButton bnuser;
    private javax.swing.JButton bnuser1;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbcalendario;
    private javax.swing.JLabel lbcalendario1;
    private javax.swing.JLabel lbfecha;
    private javax.swing.JLabel lbfecha1;
    private javax.swing.JLabel lbnombre;
    private javax.swing.JLabel lbseguidores;
    private javax.swing.JLabel lbsiguiendo;
    // End of variables declaration//GEN-END:variables
}
