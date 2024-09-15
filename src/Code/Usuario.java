/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;
import javax.swing.JOptionPane;

/**
 *
 * @author jaren
 */
public class Usuario {
   
    private String  nombre_user;
    private char    genero;
    private String  username;
    private String  contrasena;
    private String  fecha;
    private int     edad;
    private boolean estado; 
    
    private Twits[] twits;
    private int contadorTwits;

    private ManejoUsuario user;
    private SyS sys;
    
    
    public Usuario(String nombre_user, char genero, String username, String contrasena, String fecha, int edad, boolean estado, ManejoUsuario user){
        this.nombre_user= nombre_user;
        this.genero=genero;
        this.username=username;
        this.contrasena=contrasena;
        this.fecha=fecha;
        this.edad=edad;
        this.estado=estado;
        
        this.twits = new Twits[100]; 
        this.contadorTwits = 0;
       
        this.user=user;
        
        this.sys= new SyS(100);
      
    }
    
    public Usuario getUser(){
        return user.obtenerUsuarioActual();
    }
    
     public String getNombre_user(){
    return nombre_user;
    }

    public char getGenero(){
        return genero;
    }
    
    public String getUsername(){
        return username;
    }
   
    public String getContrasena(){
        return contrasena;
    }
    
    public String getFecha(){
        return fecha;
    }
    
    public int getEdad(){
        return edad;
    }
    public boolean getEstado(){
        return estado;
    }
    
    public void setEstado(boolean estado){
        this.estado=estado;
    } 
    
    public void cambiarEstado(boolean nuevoEstado) {
        this.estado = nuevoEstado;
    }
    
    public boolean isActivo() {
        return estado;
    }
    
    public SyS getSyS() {
        return sys; 
    }
      

    public void agregarTwit(Twits twit) {
       if (user == null) {
        System.out.println("El objeto user no está inicializado.");
        return;
    }
        
        if (twit.getContenido().contains("#")) {
       
            user.agregarHashtagG(twit);
            twits[contadorTwits] = twit;
            contadorTwits++;
         
        
    } else if (twit.getContenido().contains("@")) {
        String contenido = twit.getContenido();
        int inicio = contenido.indexOf("@") + 1;
        int fin = contenido.indexOf(" ", inicio);

        if (fin == -1) {
            fin = contenido.length();
        }

        String nombreMencionado = contenido.substring(inicio, fin);
        

        // existe el user menciojado?
        Usuario usuarioMencionado = user.obtenerUsuario(nombreMencionado);
        if (usuarioMencionado != null ) {
           // usuarioMencionado.agregarMencion(twit);
            user.agregarMencionG(twit);
            if (contadorTwits < twits.length) {
                twits[contadorTwits] = twit;
                contadorTwits++;
            }
            
        } else {
            System.out.println("El usuario @" + nombreMencionado + " no existe.");
            if (contadorTwits < twits.length) {
                twits[contadorTwits] = twit;
                contadorTwits++;
            }
        }
        
    } else {
        if (contadorTwits < twits.length) {
            twits[contadorTwits] = twit;
            contadorTwits++;
        } else {
            System.out.println("No se pueden agregar más twits.");
            }
        }
    }


    public Twits[] getTwits() {
        Twits[] twitsActuales = new Twits[contadorTwits];
        System.arraycopy(twits, 0, twitsActuales, 0, contadorTwits);
        return twitsActuales;
    }
    
    /*public void seguirUsuario(Usuario usuario){
        if (this.equals(usuario)) {
            JOptionPane.showMessageDialog(null, "No puedes seguirte a ti mismo.");
            return;
        }

        if (!sys.esSeguido(usuario)) {
            sys.agregarSeguido(usuario);
            usuario.getSyS().agregarSeguidor(this);
        } else {
            System.out.println("Ya sigues a este usuario.");
        }
    }
    
    public void dejarDeSeguirUsuario(Usuario usuario) {
        if (sys.esSeguido(usuario)) {
            sys.eliminarSeguido(usuario);
            usuario.getSyS().eliminarSeguidor(this);
        } else {
            System.out.println("No sigues a este usuario.");
        }
    }*/
    
     public Usuario[] obtenerSeguidos() {
        return sys.obtenerSeguidosA();
    }

    public Usuario[] obtenerSeguidores() {
        return sys.obtenerSeguidoresA();
    }
    
    public int getCantidadSeguidores() {
        return sys.cantidadSeguidores(); 
    }

    public int getCantidadSeguidos() {
        return sys.cantidadSeguidos(); 
    }
      
}

