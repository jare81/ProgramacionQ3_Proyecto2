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
        for (Twits twit : twitsActual) {
            if (twit != null && indice < totalTwits) { 
                todosLosTwits[indice] = twit;
                indice++;
            }
        }

        // usuarios seguidos
        for (Usuario seguido : usuariosSeguidos) {
            if (seguido.isActivo()) {
                Twits[] twitsSeguido = seguido.getTwits();
                for (Twits twit : twitsSeguido) {
                    if (twit != null && indice < totalTwits) {
                        todosLosTwits[indice] = twit;
                        indice++;
                    }
                }
            }
        }

        //cronologia
        ordenarTwitsHora(todosLosTwits);

        StringBuilder twitsAcumulados = new StringBuilder();
        for (int i = todosLosTwits.length - 1; i >= 0; i--) {
            if (todosLosTwits[i] != null) {
                    twitsAcumulados.append(todosLosTwits[i].toString()).append("\n\n"); 
            }
        }
        area.setText(twitsAcumulados.toString());

        revalidate();
        repaint();

        
        
        
    }
    
    public void ordenarTwitsHora(Twits[] twits){
         SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm");
    
        for (int indiceActual = 0; indiceActual < twits.length - 1; indiceActual++) {
            for (int indiceSiguiente = 0; indiceSiguiente < twits.length - 1 - indiceActual; indiceSiguiente++) {
                if (twits[indiceSiguiente] != null && twits[indiceSiguiente + 1] != null) {
                    try {
                        Date horaTwitActual = formatoHora.parse(twits[indiceSiguiente].getHora());
                        Date horaTwitSiguiente = formatoHora.parse(twits[indiceSiguiente + 1].getHora());

                        if (horaTwitActual.after(horaTwitSiguiente)) {
                            // Intercambiar los twits
                            Twits twitTemporal = twits[indiceSiguiente];
                            twits[indiceSiguiente] = twits[indiceSiguiente + 1];
                            twits[indiceSiguiente + 1] = twitTemporal;
                        }
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
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
        jLabel1.setText("Descubre lo que están diciendo...");
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
