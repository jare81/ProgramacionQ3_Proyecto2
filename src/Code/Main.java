/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

import Interfaz.Apariencia;
import Interfaz.Iniciar_Sesion;
import Interfaz.Interacciones;
import Interfaz.Perfil;
import Interfaz.Registro;

public class Main {
    
    public static void main(String[] args) {
        //instancia de manejousuario
        ManejoUsuario user = new ManejoUsuario(100);
        
       // Interacciones interacciones = new Interacciones(user);
        
        //Apariencia apariencia = new Apariencia(user); 
        //Perfil perfil = new Perfil(user);

        //instancias de los frames y pasar instancia de manejousuario
        Iniciar_Sesion iniciarSesion = new Iniciar_Sesion(user);
        Registro registro = new Registro(user);
        
      
      
        iniciarSesion.setVisible(true);
        
    }
}
