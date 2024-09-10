
package Interfaz;

import Code.ManejoUsuario;
import Code.Twits;
import Code.Usuario;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Perfil extends javax.swing.JFrame {
private ManejoUsuario user; 
    
    public Perfil(ManejoUsuario user) {
        this.user=user;
        
        initComponents();
        actualizarUsuario();
        mostrarTwit();
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
        
        
        if(user.mostrarEstado()==true){
            bnactivar.setText("Desactivar");
            
        }else if(user.mostrarEstado()==false){
            bnactivar.setText("Activar");
         
        }
         
}
    
     public void mostrarTwit() {
        jTextArea1.setText("");
        
         Twits[] twits = user.obtenerTwitsActual();

        // Recorremos el arreglo en orden inverso
        for (int i = twits.length - 1; i >= 0; i--) {
            if (twits[i] != null) {
                jTextArea1.append(twits[i].toString() + "\n\n");
            }
        }
        
        revalidate();
        repaint();
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
        bnactivar = new javax.swing.JButton();
        bnback = new javax.swing.JButton();
        txfbperfil = new javax.swing.JTextField();
        are3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        areabuscar = new javax.swing.JTextArea();
        lbcalendario1 = new javax.swing.JLabel();
        area = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        Fonde = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/perfil4 (1)perfil5.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, 150));

        fondo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell\\OneDrive - Universidad Tecnologica Centroamericana\\Documentos\\NetBeansProjects\\Project2\\Project2\\src\\Images\\fondo4.jpg")); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 880, 190));

        lbsiguiendo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        lbsiguiendo.setForeground(new java.awt.Color(255, 255, 255));
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
        lbseguidores.setForeground(new java.awt.Color(255, 255, 255));
        lbseguidores.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbseguidores.setText("50");
        getContentPane().add(lbseguidores, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 310, 50, 30));

        lbnombre.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        lbnombre.setForeground(new java.awt.Color(255, 255, 255));
        lbnombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbnombre.setText("Nombre Completo");
        getContentPane().add(lbnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 280, 25));

        bnuser.setBackground(new java.awt.Color(0, 153, 255));
        bnuser.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        bnuser.setForeground(new java.awt.Color(0, 0, 0));
        bnuser.setText("username");
        getContentPane().add(bnuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 280, 20));

        lbcalendario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lupa32.png"))); // NOI18N
        getContentPane().add(lbcalendario, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 40, 40, 40));

        lbfecha.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        lbfecha.setForeground(new java.awt.Color(255, 255, 255));
        lbfecha.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbfecha.setText("10/12/15");
        getContentPane().add(lbfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, 100, 25));

        lbfecha1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        lbfecha1.setForeground(new java.awt.Color(255, 255, 255));
        lbfecha1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbfecha1.setText("Se unió en");
        getContentPane().add(lbfecha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, 90, 25));

        bnactivar.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        bnactivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnactivarActionPerformed(evt);
            }
        });
        getContentPane().add(bnactivar, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 260, 130, 30));

        bnback.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        bnback.setText("X ");
        bnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnbackActionPerformed(evt);
            }
        });
        getContentPane().add(bnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 30));

        txfbperfil.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        txfbperfil.setText("Buscar algo");
        txfbperfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txfbperfilMousePressed(evt);
            }
        });
        txfbperfil.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfbperfilKeyTyped(evt);
            }
        });
        getContentPane().add(txfbperfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 40, 450, 40));

        are3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        areabuscar.setEditable(false);
        areabuscar.setBackground(new java.awt.Color(0, 0, 0));
        areabuscar.setColumns(20);
        areabuscar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        areabuscar.setForeground(new java.awt.Color(255, 255, 255));
        areabuscar.setRows(5);
        jScrollPane2.setViewportView(areabuscar);

        javax.swing.GroupLayout are3Layout = new javax.swing.GroupLayout(are3);
        are3.setLayout(are3Layout);
        are3Layout.setHorizontalGroup(
            are3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(are3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        are3Layout.setVerticalGroup(
            are3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(are3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        getContentPane().add(are3, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 110, 490, 580));

        lbcalendario1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/calendar24.png"))); // NOI18N
        getContentPane().add(lbcalendario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, -1, -1));

        area.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(0, 0, 0));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout areaLayout = new javax.swing.GroupLayout(area);
        area.setLayout(areaLayout);
        areaLayout.setHorizontalGroup(
            areaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 880, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        areaLayout.setVerticalGroup(
            areaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        getContentPane().add(area, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 920, 320));

        Fonde.setForeground(new java.awt.Color(255, 255, 255));
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

    private void txfbperfilMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txfbperfilMousePressed
        txfbperfil.setText("");
    }//GEN-LAST:event_txfbperfilMousePressed

    private void txfbperfilKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfbperfilKeyTyped
        String palabraClave = txfbperfil.getText(); 
        Usuario[] usuariosEncontrados = user.buscarUsuarios(palabraClave); 

        areabuscar.setText(""); 

        for (Usuario usuario : usuariosEncontrados) {
            if (usuario != null) {
                areabuscar.append(usuario.getNombre_user() + " - @" + usuario.getUsername() + "\n-----------------------------------------------------\n"); 
            }
        }
    }//GEN-LAST:event_txfbperfilKeyTyped

    private void bnactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnactivarActionPerformed
        
       
        
        if(user.mostrarEstado()==true){
            bnactivar.setText("Activar");
            
            user.cambiarEstadoUsuario(user.mostrarUser(), false);
            JOptionPane.showMessageDialog(null, "Su cuenta está inactiva ahora. No podran ver su informacion");
            
        }else if(user.mostrarEstado()==false){
            bnactivar.setText("Desactivar");
            
            user.cambiarEstadoUsuario(user.mostrarUser(), true);
            JOptionPane.showMessageDialog(null, "Su cuenta está activa ahora. Los demás pueden ver su informacion");

         
        }
    }//GEN-LAST:event_bnactivarActionPerformed

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
    private javax.swing.JPanel are3;
    private javax.swing.JPanel area;
    private javax.swing.JTextArea areabuscar;
    private javax.swing.JButton bnactivar;
    private javax.swing.JButton bnback;
    private javax.swing.JButton bnseguidores;
    private javax.swing.JButton bnseguidos;
    private javax.swing.JButton bnuser;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lbcalendario;
    private javax.swing.JLabel lbcalendario1;
    private javax.swing.JLabel lbfecha;
    private javax.swing.JLabel lbfecha1;
    private javax.swing.JLabel lbnombre;
    private javax.swing.JLabel lbseguidores;
    private javax.swing.JLabel lbsiguiendo;
    private javax.swing.JTextField txfbperfil;
    // End of variables declaration//GEN-END:variables
}
