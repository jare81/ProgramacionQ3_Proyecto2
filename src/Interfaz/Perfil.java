
package Interfaz;

import Code.ManejoUsuario;
import Code.SyS;
import Code.Twits;
import Code.Usuario;
import java.awt.Color;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class Perfil extends javax.swing.JFrame {
private ManejoUsuario user;
private Usuario usuario;
private SyS sys;
    
    public Perfil(ManejoUsuario user) {
        this.user=user;
        initComponents();
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.setResizable(false);
        this.addWindowStateListener(e -> {
            if (e.getNewState() == JFrame.ICONIFIED) {
                this.setExtendedState(JFrame.NORMAL);  // No deja que se minimice
            }
        });
        
        
        usuario = user.obtenerUsuarioActual();
        sys = usuario.getSyS();
        jLabel1.setText("");
        jLabel1.setOpaque(false);
        
        actualizarUsuario();
        actualizarDatos();
         mostrarTwit();
         
       // aaa();
         
       //si no hay algun user select no esta visible boton
        listaUsuarios.addListSelectionListener(new ListSelectionListener() {
                    public void valueChanged(ListSelectionEvent e) {
                        if (!e.getValueIsAdjusting() && listaUsuarios.getSelectedIndex() != -1) {
                            bnentrar.setEnabled(true);
                        } else {
                            bnentrar.setEnabled(false);
                        }
                    }
                });
                bnentrar.setEnabled(false);
        
         user.setPerfilJFrame(this);
    }
    
    
     private void mostrarSeguidos() {
        DefaultListModel<String> modelo = new DefaultListModel<>(); 
        txfbperfil.setText("");
        modelo.clear();
        Usuario[] seguidos = usuario.obtenerSeguidos();
        if(seguidos == null || seguidos.length == 0){
            JOptionPane.showMessageDialog(null, "No tienes usuarios seguidos");
        }else{
            for (Usuario seguido : seguidos) {
                modelo.addElement(seguido.getNombre_user() + " - @" + seguido.getUsername());
            }
        }
        listaUsuarios.setModel(modelo);
    }

    private void mostrarSeguidores() {
        DefaultListModel<String> modelo = new DefaultListModel<>(); 
        txfbperfil.setText("");
        modelo.clear();
        Usuario[] seguidores = usuario.obtenerSeguidores();
        if(seguidores == null || seguidores.length == 0){
            JOptionPane.showMessageDialog(null, "No tienes usuarios seguidores");
        }else{
            for (Usuario seguidor : seguidores) {
                modelo.addElement(seguidor.getNombre_user() + " - @" + seguidor.getUsername());
            }
        }
        listaUsuarios.setModel(modelo);
    }
    
   
    
    //pasar informacion jfframe
     public void actualizarDatos() {
        lbsiguiendo.setText(Integer.toString(usuario.getCantidadSeguidos()));
        lbseguidores.setText(Integer.toString(usuario.getCantidadSeguidores()));
    }

    
    private void actualizarUsuario() {
        lbnombre.setText(user.mostrarNombre());
        bnuser.setText("@ " + user.mostrarUser());
        lbfecha.setText(user.mostrarFecha());
        lbedad.setText(Integer.toString(user.mostrarEdad()));
        char gen = user.mostrarGenero();
        lbsiguiendo.setText(Integer.toString(sys.cantidadSeguidos()));
        lbseguidores.setText(Integer.toString(sys.cantidadSeguidores()));
        
        if(gen=='M'){
            lbgenero.setText("Masculino");
        }else if (gen=='F'){
            lbgenero.setText("Femenino");
        }
        
        String rutaImagen = "";
        char genero = user.mostrarGenero();

        if (genero == 'M') {
            rutaImagen = "/Images/maleazul128.png"; 
        } else if (genero == 'F') {
            rutaImagen = "/Images/femaleazul128.png"; 
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
        
         Twits[] twits = usuario.getTwits();

        //  arreglo en orden inverso
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
        bnsiguiendo = new javax.swing.JButton();
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
        jLabel1 = new javax.swing.JLabel();
        lbnombre5 = new javax.swing.JLabel();
        lbedad = new javax.swing.JLabel();
        lbgenero = new javax.swing.JLabel();
        are3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        listaUsuarios = new javax.swing.JList<>();
        lbcalendario1 = new javax.swing.JLabel();
        area = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        bnentrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Fonde = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/perfil4 (1)perfil5.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, 150));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fon5.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 880, 190));

        lbsiguiendo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        lbsiguiendo.setForeground(new java.awt.Color(255, 255, 255));
        lbsiguiendo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbsiguiendo.setText("0");
        getContentPane().add(lbsiguiendo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 310, 50, 30));

        bnsiguiendo.setBackground(new java.awt.Color(0, 153, 255));
        bnsiguiendo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        bnsiguiendo.setForeground(new java.awt.Color(0, 0, 0));
        bnsiguiendo.setText("Siguiendo");
        bnsiguiendo.setBorderPainted(false);
        bnsiguiendo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bnsiguiendo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnsiguiendoActionPerformed(evt);
            }
        });
        getContentPane().add(bnsiguiendo, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 310, 140, 30));

        bnseguidores.setBackground(new java.awt.Color(0, 153, 255));
        bnseguidores.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        bnseguidores.setForeground(new java.awt.Color(0, 0, 0));
        bnseguidores.setText("Seguidores");
        bnseguidores.setBorderPainted(false);
        bnseguidores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bnseguidores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnseguidoresActionPerformed(evt);
            }
        });
        getContentPane().add(bnseguidores, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 310, 140, 30));

        lbseguidores.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        lbseguidores.setForeground(new java.awt.Color(255, 255, 255));
        lbseguidores.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbseguidores.setText("0");
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
        bnuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnuserActionPerformed(evt);
            }
        });
        getContentPane().add(bnuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 280, 20));

        lbcalendario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lupaazul32.png"))); // NOI18N
        getContentPane().add(lbcalendario, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 40, 40, 40));

        lbfecha.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        lbfecha.setForeground(new java.awt.Color(153, 153, 153));
        lbfecha.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbfecha.setText("10/12/15");
        getContentPane().add(lbfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, 100, 25));

        lbfecha1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        lbfecha1.setForeground(new java.awt.Color(153, 153, 153));
        lbfecha1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbfecha1.setText("Se unió en");
        getContentPane().add(lbfecha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, 90, 25));

        bnactivar.setBackground(new java.awt.Color(0, 153, 255));
        bnactivar.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        bnactivar.setForeground(new java.awt.Color(0, 0, 0));
        bnactivar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bnactivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnactivarActionPerformed(evt);
            }
        });
        getContentPane().add(bnactivar, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 260, 130, 30));

        bnback.setBackground(new java.awt.Color(255, 255, 255));
        bnback.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        bnback.setForeground(new java.awt.Color(0, 153, 255));
        bnback.setText("X ");
        bnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnbackActionPerformed(evt);
            }
        });
        getContentPane().add(bnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 30));

        txfbperfil.setBackground(new java.awt.Color(153, 153, 153));
        txfbperfil.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        txfbperfil.setForeground(new java.awt.Color(0, 0, 0));
        txfbperfil.setText("Buscar algo");
        txfbperfil.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txfbperfilFocusLost(evt);
            }
        });
        txfbperfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txfbperfilMousePressed(evt);
            }
        });
        txfbperfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfbperfilActionPerformed(evt);
            }
        });
        txfbperfil.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfbperfilKeyTyped(evt);
            }
        });
        getContentPane().add(txfbperfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 40, 450, 40));

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 106, 310, 30));

        lbnombre5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        lbnombre5.setForeground(new java.awt.Color(153, 153, 153));
        lbnombre5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbnombre5.setText("años");
        getContentPane().add(lbnombre5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, 70, 25));

        lbedad.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        lbedad.setForeground(new java.awt.Color(153, 153, 153));
        lbedad.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbedad.setText("Edad");
        getContentPane().add(lbedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, 40, 25));

        lbgenero.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        lbgenero.setForeground(new java.awt.Color(153, 153, 153));
        lbgenero.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbgenero.setText("Genero");
        getContentPane().add(lbgenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, 100, 25));

        are3.setBackground(new java.awt.Color(0, 0, 0));
        are3.setOpaque(false);

        listaUsuarios.setBackground(new java.awt.Color(0, 0, 0));
        listaUsuarios.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        listaUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane4.setViewportView(listaUsuarios);

        javax.swing.GroupLayout are3Layout = new javax.swing.GroupLayout(are3);
        are3.setLayout(are3Layout);
        are3Layout.setHorizontalGroup(
            are3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(are3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                .addContainerGap())
        );
        are3Layout.setVerticalGroup(
            are3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(are3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(are3, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 140, 490, 570));

        lbcalendario1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell\\OneDrive - Universidad Tecnologica Centroamericana\\Documentos\\NetBeansProjects\\Project2\\Project2\\src\\Images\\calendarazul24.png")); // NOI18N
        getContentPane().add(lbcalendario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, -1, -1));

        area.setBackground(new java.awt.Color(0, 0, 0));
        area.setOpaque(false);

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(0, 0, 0));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setRows(5);
        jTextArea1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout areaLayout = new javax.swing.GroupLayout(area);
        area.setLayout(areaLayout);
        areaLayout.setHorizontalGroup(
            areaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 880, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        areaLayout.setVerticalGroup(
            areaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(area, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 920, 320));

        bnentrar.setBackground(new java.awt.Color(0, 153, 255));
        bnentrar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        bnentrar.setForeground(new java.awt.Color(0, 0, 0));
        bnentrar.setText("Entrar");
        bnentrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bnentrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnentrarActionPerformed(evt);
            }
        });
        getContentPane().add(bnentrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 110, 120, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/time24.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, -1, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/genero24.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, 30, 30));

        Fonde.setBackground(new java.awt.Color(0, 0, 0));
        Fonde.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        Fonde.setForeground(new java.awt.Color(255, 255, 255));
        Fonde.setOpaque(true);
        getContentPane().add(Fonde, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1490, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bnsiguiendoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnsiguiendoActionPerformed
        jLabel1.setText("LISTA DE SEGUIDOS");
        jLabel1.setOpaque(true); // Hacer el fondo visible
        jLabel1.setBackground(Color.GRAY);
        mostrarSeguidos();
       
    }//GEN-LAST:event_bnsiguiendoActionPerformed

    private void bnseguidoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnseguidoresActionPerformed
    jLabel1.setText("LISTA DE SEGUIDORES");
    jLabel1.setOpaque(true); // Hacer el fondo visible
    jLabel1.setBackground(Color.GRAY);
        mostrarSeguidores();
    }//GEN-LAST:event_bnseguidoresActionPerformed

    private void bnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnbackActionPerformed
        this.setVisible(false);
        new Apariencia(user).setVisible(true);
    }//GEN-LAST:event_bnbackActionPerformed

    private void txfbperfilMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txfbperfilMousePressed
        txfbperfil.setText("");
    }//GEN-LAST:event_txfbperfilMousePressed

    private void txfbperfilKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfbperfilKeyTyped
        String palabraClave = txfbperfil.getText().trim(); // Obtener y limpiar espacios
        String estado ="";
        jLabel1.setText("");
        jLabel1.setOpaque(false);
        DefaultListModel<String> modelo = new DefaultListModel<>();
       
        if (palabraClave.isEmpty()) {
            Usuario[] todosLosUsuarios = user.obtenerTodosLosUsuarios();
            for (Usuario usuario : todosLosUsuarios) {
                if (usuario != null) {
                     
                    if (usuario.equals(usuario.getUser())) {
                         estado = "   [Tú]";
                    }else if (usuario.getUser().getSyS().esSeguido(usuario)) {
                        estado = "    [Siguiendo]";
                    } else {
                        estado = "    [No seguido]";
                    }
                    modelo.addElement("  @" + usuario.getUsername() + " " + estado);
                }
            }
        } else {
            Usuario[] resultados = user.buscarUsuarios(palabraClave);
            for (Usuario usuario : resultados) {
                if (usuario != null) {
                    
                     if (usuario.equals(usuario.getUser())) {
                         estado = "   [Tú]";
                    }else if (usuario.getUser().getSyS().esSeguido(usuario)) {
                        estado = "   [Siguiendo]";
                    } else {
                        estado = "   [No seguido]";
                    }
                    modelo.addElement("  @" + usuario.getUsername() + " " + estado);
                }
            }
        }
    
    // Actualizar la lista de usuarios
    listaUsuarios.setModel(modelo);

        
    }//GEN-LAST:event_txfbperfilKeyTyped

    private void bnactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnactivarActionPerformed
        
         if (user.mostrarEstado() == true) {
            int respuesta = JOptionPane.showConfirmDialog(null, 
                "¿Está seguro de que desea desactivar su cuenta? No podrán ver su información.", 
                "Confirmar desactivación", 
                JOptionPane.YES_NO_OPTION);

            if (respuesta == JOptionPane.YES_OPTION) {
                bnactivar.setText("Activar");
                user.cambiarEstadoUsuario(user.mostrarUser(), false);
                user.cerrarSesion();
                this.dispose(); 
                new Iniciar_Sesion(user).setVisible(true); 
                
                //JOptionPane.showMessageDialog(null, "Su cuenta está inactiva ahora. No podrán ver su información.");
                
            }
        
        } else if (user.mostrarEstado() == false) {
            bnactivar.setText("Desactivar");
            user.cambiarEstadoUsuario(user.mostrarUser(), true);
            JOptionPane.showMessageDialog(null, "Su cuenta está activa ahora. Los demás pueden ver su información.");
        }
    }//GEN-LAST:event_bnactivarActionPerformed

    private void bnuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnuserActionPerformed
   
    }//GEN-LAST:event_bnuserActionPerformed

    private void txfbperfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfbperfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfbperfilActionPerformed

    private void bnentrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnentrarActionPerformed
        // algo seleccionado
        String palabraClave = txfbperfil.getText().trim();
        Usuario[] resultados =  user.buscarUsuarios(palabraClave);

        int seleccionado = listaUsuarios.getSelectedIndex();

        if (seleccionado != -1 && resultados != null && seleccionado < resultados.length) {
            Usuario usuarioSeleccionado = resultados[seleccionado];  

            OtroPerfil otroPerfil = new OtroPerfil(usuarioSeleccionado, user); 
            otroPerfil.setVisible(true);
        } else {

            JOptionPane.showMessageDialog(this, "No se econtro ningun usuario '" + txfbperfil.getText().trim() + "'" );
        }
    
    
        
    }//GEN-LAST:event_bnentrarActionPerformed

    private void txfbperfilFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txfbperfilFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txfbperfilFocusLost

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
    private javax.swing.JButton bnactivar;
    private javax.swing.JButton bnback;
    private javax.swing.JButton bnentrar;
    private javax.swing.JButton bnseguidores;
    private javax.swing.JButton bnsiguiendo;
    private javax.swing.JButton bnuser;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lbcalendario;
    private javax.swing.JLabel lbcalendario1;
    private javax.swing.JLabel lbedad;
    private javax.swing.JLabel lbfecha;
    private javax.swing.JLabel lbfecha1;
    private javax.swing.JLabel lbgenero;
    private javax.swing.JLabel lbnombre;
    private javax.swing.JLabel lbnombre5;
    private javax.swing.JLabel lbseguidores;
    private javax.swing.JLabel lbsiguiendo;
    private javax.swing.JList<String> listaUsuarios;
    private javax.swing.JTextField txfbperfil;
    // End of variables declaration//GEN-END:variables
}
