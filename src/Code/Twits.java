/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

/**
 *
 * @author jaren
 */
public class Twits {
    private String username;
    private String contenido;
    private String hora;
    private String fecha;
    private Twits[] twits;
    private int numTwits;
    private Usuario usuario; 
    
    int maxi=1000;
    
    public Twits(String username, String contenido, String hora, String fecha, Usuario usuario){
        this.contenido=contenido;
        this.hora=hora;
        this.fecha=fecha;
        this.username=username;
        
         this.twits= new Twits[maxi];
         this.numTwits=0;
         this.usuario = usuario; 
    }
    
    public String getUsername(){
        return username;
    }
    
    public String getHora(){
       return hora; 
    }
    
    public String getContenido(){
        return contenido;
    }
    
    public String getFecha(){
        return fecha;
    }
    public Usuario getUsuario() {
        return usuario;  //quien creo el twit
    }
    
    public String toString() {
        return "\n     @ " + username + "\n           " + "publicó a las " + hora  + fecha + "\n           " + contenido + "\n\n_____________________________________________________________________________________";
    }
    
     public String toString2() {
        return "\n     @ " + username + "\n           " + "publicó " + hora + "\n           " + contenido + "\n\n_________________________________";
    }
     
     public String toString3() {
        return "\n     @ " + username + " [siguiendo] "+"\n           " + "publicó a las " + hora  + fecha + "\n           " + contenido + "\n\n_____________________________________________________________________________________";
    }
    
    public void agregarTwit(Twits twit){
        if(numTwits< maxi){
           twits[numTwits]  = twit;
           numTwits++;
        }else{
            System.out.println("No se pueden agregra mas");
        }
    }
    
    public Twits[] getTwits(){
        Twits[] twitsActual = new Twits [numTwits];
        System.arraycopy(twits, 0, twitsActual, 0, numTwits);
        return twitsActual;
    }
    
   
    
    
}
