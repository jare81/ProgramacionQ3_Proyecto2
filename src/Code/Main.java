/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

import Interfaz.Apariencia;
import Interfaz.Iniciar_Sesion;
import Interfaz.Perfil;
import Interfaz.Registro;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de ManejoUsuario
        ManejoUsuario user = new ManejoUsuario(100);
        
        Apariencia apariencia = new Apariencia(user);
        Perfil perfil = new Perfil(user);

        // Crear instancias de los JFrames y pasar la instancia de ManejoUsuario
        Iniciar_Sesion iniciarSesion = new Iniciar_Sesion(user);
        Registro registro = new Registro(user);
        
      
        iniciarSesion.setVisible(true);
    }
}
