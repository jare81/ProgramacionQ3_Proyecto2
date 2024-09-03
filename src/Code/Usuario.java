/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

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
    
    private Twits[] hashtags;
    private int contadorHashtags;
    
    private Twits[]  menciones;
    private int contadorMenciones;
    
    
    public Usuario(String nombre_user, char genero, String username, String contrasena, String fecha, int edad, boolean estado){
        this.nombre_user= nombre_user;
        this.genero=genero;
        this.username=username;
        this.contrasena=contrasena;
        this.fecha=fecha;
        this.edad=edad;
        this.estado=estado;
        
        this.twits = new Twits[1000]; 
        this.contadorTwits = 0;
        
        this.hashtags = new Twits[1000];
        this.contadorHashtags =0; 
        
        this.menciones = new Twits[1000];
        this.contadorMenciones=0; 
    }
    
    
    public void agregarTwit(Twits twit) {
        String uss = getUsername();
        
        if(twit.getContenido().contains("@" + uss)){
            if(contadorMenciones < menciones.length ){
                menciones[contadorMenciones] = twit;
                contadorMenciones++;
            }else{
                System.out.println("No se puede agregar mas menciones");
            } 
            
            
        }else if(twit.getContenido().contains("#")){
            if(contadorHashtags < hashtags.length ){
                hashtags[contadorHashtags] = twit;
                contadorHashtags++;
            }else{
                System.out.println("No se puede agregar mas hashtags");
            }
            
            
        }else{
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

    public Twits[] getHashtag() {
        Twits[] hashtagActuales = new Twits[contadorHashtags];
        System.arraycopy(hashtags, 0, hashtagActuales, 0, contadorHashtags);
        return hashtagActuales;
    }
    
      public Twits[] getMenciones() {
        Twits[] mencionesActuales = new Twits[contadorMenciones];
        System.arraycopy(menciones, 0, mencionesActuales, 0, contadorMenciones);
        return mencionesActuales;
    }
     
    public String getNombre_user(){
    return nombre_user;
    }
    
    
    
    public void setNombre_user(String nombre_user){
    this.nombre_user=nombre_user;    
    }
    
    public char getGenero(){
        return genero;
    }
    public void setGenero(char genero){
        this.genero=genero;
    }
    
    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username=username;
    }
    
    public String getContrasena(){
        return contrasena;
    }
    public void setContrasena(String contrasena){
        this.contrasena=contrasena;
    }
    
    public void setFecha(String fecha){
        this.fecha=fecha;
    }
    public String getFecha(){
        return fecha;
    }
    
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
    
    public boolean getEstado(){
        return estado;
    }
    public void setEstado(boolean estado){
        this.estado=estado;
    }  
    
    
    
    
}

