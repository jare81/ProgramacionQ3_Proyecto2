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
     private Twits[] twits;
    private int numTwits;
    
    int maxi=1000;
    
    public Twits(String username, String contenido, String hora){
        this.contenido=contenido;
        this.hora=hora;
        this.username=username;
        
         this.twits= new Twits[maxi];
         this.numTwits=0;
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
    
    public String toString() {
        return "\n     @ " + username + "\n           " + "publicó a las " + hora + "\n           " + contenido + "\n\n_____________________________________________________________________________________";
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
