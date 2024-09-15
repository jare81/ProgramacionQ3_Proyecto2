/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Interfaz;

import Code.ManejoUsuario;
import Code.Twits;
import Code.Usuario;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JSeparator;

/**
 *
 * @author karen
 */
public class TimeLine extends javax.swing.JPanel {

    /**
     * Creates new form TimeLine
     */
    
    private ManejoUsuario user; 
    
    public TimeLine(ManejoUsuario user) {
        this.user=user;
        initComponents();
        area.setLineWrap(true);  
        area.setWrapStyleWord(true);
        
        mostrarTwit();
       
        
        
    }

    
  
    public void mostrarTwit() {
        area.setText("");
        
        /*----------------Twits[] twits = user.obtenerTwitsActual();

        // Recorremos el arreglo en orden inverso
        for (int i = twits.length - 1; i >= 0; i--) {
            if (twits[i] != null) {
                area.append(twits[i].toString() + "\n\n");
            }
        }
        
        revalidate();
        repaint();----------*/
        
       /* Usuario usuarioActual = user.obtenerUsuarioActual();
        StringBuilder twitsAcumulados = new StringBuilder();

        Twits[] twitsActual = usuarioActual.getTwits();
        
         ordenarTwitsHora(twitsActual);

        for (int i = twitsActual.length - 1; i >= 0; i--) {
            if (twitsActual[i] != null) {
                twitsAcumulados.append(twitsActual[i].toString()).append("\n\n");
            }
        }


          Usuario[] usuariosSeguidos = usuarioActual.obtenerSeguidos();
    
            for (Usuario seguido : usuariosSeguidos) {
                if (seguido.isActivo()) {
                    Twits[] twitsSeguido = seguido.getTwits();
                    
                     ordenarTwitsHora(twitsSeguido);
                    
                    for (int i = twitsSeguido.length - 1; i >= 0; i--) { 
                        if (twitsSeguido[i] != null) {
                            twitsAcumulados.append(twitsSeguido[i].toString3()).append("\n\n");
                        }
                    }
                }
            }*/

        Usuario usuarioActual = user.obtenerUsuarioActual();
        Twits[] twitsActual = usuarioActual.getTwits();

        Usuario[] usuariosSeguidos = usuarioActual.obtenerSeguidos();
        //tamano para arreglo generla
        int totalTwits = twitsActual.length;

        for (Usuario seguido : usuariosSeguidos) {
            if (seguido.isActivo()) {
                totalTwits += seguido.getTwits().length;
            }
        }

        //arreglop general
        Twits[] todosLosTwits = new Twits[totalTwits];
        int indice = 0;

        //twits user actual
        boolean[] esDelUsuarioActual = new boolean[totalTwits]; // Indicar si el twit es del usuario actual
        for (Twits twit : twitsActual) {
            if (twit != null) {
                todosLosTwits[indice] = twit;
                esDelUsuarioActual[indice] = true; // Este twit es del usuario actual
                indice++;
            }
        }

        //twits users seguidos
        for (Usuario seguido : usuariosSeguidos) {
            if (seguido.isActivo()) {
                Twits[] twitsSeguido = seguido.getTwits();
                for (Twits twit : twitsSeguido) {
                    if (twit != null) {
                        todosLosTwits[indice] = twit;
                        esDelUsuarioActual[indice] = false; // Este twit es de un usuario seguido
                        indice++;
                    }
                }
            }
        }

        //cronologia
        ordenarTwitsHora(todosLosTwits);

        // mostrar mas nuevo mas viejo
        StringBuilder twitsAcumulados = new StringBuilder();
        for (int i = todosLosTwits.length - 1; i >= 0; i--) {
            if (todosLosTwits[i] != null) {
                if (esDelUsuarioActual[i]) {
                // Si el twit es del usuario actual, usar toString()
                    twitsAcumulados.append(todosLosTwits[i].toString()).append("\n\n");
                } else{
                    // Si el twit es de un usuario seguido, usar toString3()
                    twitsAcumulados.append(todosLosTwits[i].toString3()).append("\n\n");
                }
            }
        }
        area.setText(twitsAcumulados.toString());

        revalidate();
        repaint();

        
        
        
    }
    
    public void ordenarTwitsHora(Twits[] twits){
        SimpleDateFormat  sdf = new SimpleDateFormat("HH:mm");
        
        for (int i = 0; i < twits.length-1; i++) {
            for (int j = 0; j < twits.length-1- i; j++) {
                if(twits[j]!=null && twits [j+1] !=null)
                     try {
                    Date hora1 = sdf.parse(twits[j].getHora());
                    Date hora2 = sdf.parse(twits[j + 1].getHora());

                        if (hora1.after(hora2)) {
                             Twits temp = twits[j];
                             twits[j] = twits[j + 1];
                             twits[j + 1] = temp;
                         }
                }   catch (ParseException e) {
                    e.printStackTrace();
                }
            }
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(0, 0, 0));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        setPreferredSize(new java.awt.Dimension(720, 490));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Descubre lo que están diciedo...");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 340, -1));

        area.setEditable(false);
        area.setBackground(new java.awt.Color(0, 0, 0));
        area.setColumns(20);
        area.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        area.setForeground(new java.awt.Color(255, 255, 255));
        area.setRows(5);
        area.setBorder(null);
        jScrollPane1.setViewportView(area);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 700, 410));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
