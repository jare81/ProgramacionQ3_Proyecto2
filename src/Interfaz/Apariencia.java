/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;

import Code.ManejoUsuario;
import Code.Twits;
import Code.Usuario;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.JButton;

public class Apariencia extends javax.swing.JFrame {
      private ManejoUsuario user;
      int max=140;
      private TimeLine timeLinePanel;
      private Interacciones timeLinePanel2;
      
    /**
     * Creates new form Apariencia
     */
    public Apariencia(ManejoUsuario user) {
       
        this.user = user;
        initComponents();
        this.setLocationRelativeTo(null);
        
        //foto, user, nombre
        actualizarUsuario();
        
        //cambiar panel
        TimeLine p1 = new TimeLine(user);
        mostrarPanel(p1);
       
        // solo 140 caractees
        limitarCaracteres();
        areapost.setLineWrap(true);  
        areapost.setWrapStyleWord(true);
        
        lbhora.setVisible(false);
         
        timeLinePanel = new TimeLine(user);
        timeLinePanel2 = new Interacciones(user);
     
         mostrarHash();
    }
    
    
    
    private void actualizarUsuario() {
        lbnombre.setText(user.mostrarNombre());
        bnuser.setText("@ " + user.mostrarUser());
        
        String rutaImagen = "";
        char genero = user.mostrarGenero();

        if (genero == 'M') {
            rutaImagen = "/Images/male.png"; 
        } else if (genero == 'F') {
            rutaImagen = "/Images/female.png"; 
        }

            java.net.URL imgURL = getClass().getResource(rutaImagen);
        if (imgURL != null) {
            ImageIcon imagenIcon = new ImageIcon(imgURL);
            lbfoto.setIcon(imagenIcon);
        } else {
            System.err.println("No se pudo encontrar la imagen en la ruta: " + rutaImagen);
        }
}
    
    
    
    private void mostrarPanel(JPanel p){
        
        p.setSize(720,490);
        p.setLocation(0,0);
        
        contenido.removeAll();
        contenido.add(p, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
     
    }
    
    private void limitarCaracteres() {
      /*if (areapost.getText().length() > max) {
          JOptionPane.showMessageDialog(null, "Solo se permiten 140 caracteres");
           areapost.setText(areapost.getText().substring(0, max));
          }*/
      
        areapost.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if (areapost.getText().length() >= max) {
                    e.consume(); 
                    JOptionPane.showMessageDialog(null, "Solo se permiten " + max + " caracteres");
                }
            }
        });
   }
    
    public void resalto(JButton hola, JPanel hola2){
        if(hola.isSelected()){
            hola2.setBorder(new LineBorder(Color.BLACK, 4));
        }else{
             hola2.setBorder(null);
        }
    }
    
      public void mostrarHash() {
        hashs.setText("");
        
        Twits[] hashtags = user.obtenerHashtagActual();

        for (Twits hash : hashtags) {
            if (hash != null) {
                hashs.append(hash.toString() + "\n\n");
                  
            }
        }
        
        revalidate();
        repaint();
    }
     
  
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bnuser = new javax.swing.JButton();
        lbnombre = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bncerrar = new javax.swing.JButton();
        bninterac = new javax.swing.JButton();
        bnperfil = new javax.swing.JButton();
        bnhash = new javax.swing.JButton();
        bntimeline = new javax.swing.JButton();
        bnpostear = new javax.swing.JButton();
        lbfoto = new javax.swing.JLabel();
        lbfoto3 = new javax.swing.JLabel();
        lbfoto4 = new javax.swing.JLabel();
        lbfoto5 = new javax.swing.JLabel();
        lbfoto6 = new javax.swing.JLabel();
        lbfoto7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        bnpublicar = new javax.swing.JButton();
        bncancel = new javax.swing.JButton();
        lbhora = new javax.swing.JLabel();
        areapost = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        hashs = new javax.swing.JTextArea();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        contenido = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bnuser.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        bnuser.setText("username");
        bnuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnuserActionPerformed(evt);
            }
        });
        jPanel1.add(bnuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 570, 160, 20));

        lbnombre.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        lbnombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbnombre.setText("Nombre Completo");
        jPanel1.add(lbnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 540, 200, 25));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/twitter128.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 130, 110));

        bncerrar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        bncerrar.setForeground(new java.awt.Color(204, 0, 0));
        bncerrar.setText("Cerrar Sesion");
        bncerrar.setBorderPainted(false);
        bncerrar.setContentAreaFilled(false);
        bncerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bncerrar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bncerrarActionPerformed(evt);
            }
        });
        jPanel1.add(bncerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, 180, -1));

        bninterac.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        bninterac.setText("Interacciones");
        bninterac.setBorderPainted(false);
        bninterac.setContentAreaFilled(false);
        bninterac.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bninterac.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bninterac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bninteracActionPerformed(evt);
            }
        });
        jPanel1.add(bninterac, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 200, -1));

        bnperfil.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        bnperfil.setText("Perfil");
        bnperfil.setBorderPainted(false);
        bnperfil.setContentAreaFilled(false);
        bnperfil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bnperfil.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bnperfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnperfilActionPerformed(evt);
            }
        });
        jPanel1.add(bnperfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 200, -1));

        bnhash.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        bnhash.setText("Hashtags");
        bnhash.setBorderPainted(false);
        bnhash.setContentAreaFilled(false);
        bnhash.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bnhash.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bnhash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnhashActionPerformed(evt);
            }
        });
        jPanel1.add(bnhash, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 200, -1));

        bntimeline.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        bntimeline.setText("Time Line");
        bntimeline.setBorderPainted(false);
        bntimeline.setContentAreaFilled(false);
        bntimeline.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bntimeline.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bntimeline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntimelineActionPerformed(evt);
            }
        });
        jPanel1.add(bntimeline, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 200, -1));

        bnpostear.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        bnpostear.setText("Postear");
        bnpostear.setBorderPainted(false);
        bnpostear.setContentAreaFilled(false);
        bnpostear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bnpostear.setFocusPainted(false);
        bnpostear.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bnpostear.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                bnpostearFocusGained(evt);
            }
        });
        bnpostear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bnpostearMouseClicked(evt);
            }
        });
        bnpostear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnpostearActionPerformed(evt);
            }
        });
        jPanel1.add(bnpostear, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 200, -1));

        lbfoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/perfil4 (1)perfil5.png"))); // NOI18N
        jPanel1.add(lbfoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 90, 80));

        lbfoto3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/postear24.png"))); // NOI18N
        jPanel1.add(lbfoto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 30, 30));

        lbfoto4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home24.png"))); // NOI18N
        jPanel1.add(lbfoto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 30, 30));

        lbfoto5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/interac24.png"))); // NOI18N
        jPanel1.add(lbfoto5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 30, 30));

        lbfoto6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/profile24.png"))); // NOI18N
        jPanel1.add(lbfoto6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, 30));

        lbfoto7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/hash24.png"))); // NOI18N
        jPanel1.add(lbfoto7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 30, 30));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, -10, 1350, 680));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 300, 640));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel2.setText("¿En qué estás pensando?");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 210, 20));

        bnpublicar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        bnpublicar.setText("Publicar");
        bnpublicar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bnpublicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnpublicarActionPerformed(evt);
            }
        });
        jPanel3.add(bnpublicar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, -1, -1));

        bncancel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        bncancel.setText("Cancelar");
        bncancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bncancelActionPerformed(evt);
            }
        });
        jPanel3.add(bncancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, -1, -1));

        lbhora.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        lbhora.setText("00:00");
        jPanel3.add(lbhora, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 90, 40, 40));

        areapost.setColumns(20);
        areapost.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        areapost.setRows(5);
        areapost.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white)));
        areapost.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                areapostFocusLost(evt);
            }
        });
        jPanel3.add(areapost, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 660, 70));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 720, 140));

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        hashs.setColumns(20);
        hashs.setRows(5);
        jScrollPane1.setViewportView(hashs);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 250, 500));

        jTextField2.setText("Buscar");
        jTextField2.setToolTipText("");
        jPanel4.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 190, 40));

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("HASHTAGS");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lupa32.png"))); // NOI18N
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, 40));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 10, 270, 640));

        contenido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout contenidoLayout = new javax.swing.GroupLayout(contenido);
        contenido.setLayout(contenidoLayout);
        contenidoLayout.setHorizontalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 718, Short.MAX_VALUE)
        );
        contenidoLayout.setVerticalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 488, Short.MAX_VALUE)
        );

        getContentPane().add(contenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 720, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bnuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnuserActionPerformed

    }//GEN-LAST:event_bnuserActionPerformed

    private void bncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bncerrarActionPerformed
        user.cerrarSesion();
        this.dispose();
        new Iniciar_Sesion(user).setVisible(true);
    }//GEN-LAST:event_bncerrarActionPerformed

    private void bninteracActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bninteracActionPerformed
       Interacciones p2 = new Interacciones(user);
        mostrarPanel(p2);
       
    }//GEN-LAST:event_bninteracActionPerformed

    private void bnperfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnperfilActionPerformed
       this.setVisible(false);
       new Perfil(user).setVisible(true);
    }//GEN-LAST:event_bnperfilActionPerformed

    private void bnhashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnhashActionPerformed
      mostrarHash();
    }//GEN-LAST:event_bnhashActionPerformed

    private void bntimelineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntimelineActionPerformed
        TimeLine p1 = new TimeLine(user);
        mostrarPanel(p1);
    }//GEN-LAST:event_bntimelineActionPerformed

    private void bnpostearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bnpostearMouseClicked
         
    }//GEN-LAST:event_bnpostearMouseClicked

    private void bnpostearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnpostearActionPerformed
        if (jPanel3.getBorder() == null) {
        jPanel3.setBorder(new LineBorder(Color.BLACK, 4)); // Añadir borde
    } else {
        jPanel3.setBorder(null); // Quitar borde
    }
    }//GEN-LAST:event_bnpostearActionPerformed

    private void bnpublicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnpublicarActionPerformed
        LocalTime noww = LocalTime.now(); 
         DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm");
         String hora = noww.format(formato);
        
        if (!areapost.getText().isEmpty()) {
            String contenido = areapost.getText();
            user.agregarTwitActual(user.mostrarNombre(), contenido, hora);

            timeLinePanel.mostrarTwit();
            
            
            JOptionPane.showMessageDialog(null, "Post publicado");
            mostrarHash();
            
            
            areapost.setText("");
            
        
        } else {
            JOptionPane.showMessageDialog(null, "Sin contenido");
        }
    }//GEN-LAST:event_bnpublicarActionPerformed

    private void bncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bncancelActionPerformed
       areapost.setText("");
       lbhora.setVisible(false);
        
    }//GEN-LAST:event_bncancelActionPerformed

    private void areapostFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_areapostFocusLost
       //hora post
         LocalTime noww = LocalTime.now(); 
         DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm");
         String hora = noww.format(formato);
         
         lbhora.setVisible(true);
         lbhora.setText(hora);
    }//GEN-LAST:event_areapostFocusLost

    private void bnpostearFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bnpostearFocusGained
       
    }//GEN-LAST:event_bnpostearFocusGained

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
            java.util.logging.Logger.getLogger(Apariencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Apariencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Apariencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Apariencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
       /* java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areapost;
    private javax.swing.JButton bncancel;
    private javax.swing.JButton bncerrar;
    private javax.swing.JButton bnhash;
    private javax.swing.JButton bninterac;
    private javax.swing.JButton bnperfil;
    private javax.swing.JButton bnpostear;
    private javax.swing.JButton bnpublicar;
    private javax.swing.JButton bntimeline;
    private javax.swing.JButton bnuser;
    private javax.swing.JPanel contenido;
    private javax.swing.JTextArea hashs;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lbfoto;
    private javax.swing.JLabel lbfoto3;
    private javax.swing.JLabel lbfoto4;
    private javax.swing.JLabel lbfoto5;
    private javax.swing.JLabel lbfoto6;
    private javax.swing.JLabel lbfoto7;
    private javax.swing.JLabel lbhora;
    private javax.swing.JLabel lbnombre;
    // End of variables declaration//GEN-END:variables
}
