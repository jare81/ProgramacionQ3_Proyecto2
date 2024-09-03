/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

/**
 *
 * @author karen
 */
public class ManejoUsuario {
  
    private Usuario usuarios[];
    private int contadorUsers;
    private Usuario usuarioActual;
    
    
    /*public String ser="";
    public boolean actual=false;*/
    
    
    public ManejoUsuario(int cantidad){
    
      usuarios = new Usuario[cantidad]; 
      contadorUsers=0;
      usuarioActual = null;
      
    }
    
    private Usuario buscar(String username) {
        for (Usuario user : usuarios) {
            if (user != null && user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }
     
    
     public void registro(Usuario datos){
        if (buscar(datos.getUsername()) == null){ 
           usuarios[contadorUsers]=datos;
           contadorUsers++;
       }else{
           System.out.println("No hay mas espacios");
       }
       
   }
     public  boolean agregarUser (String nombre_user, char genero, String username, String contrasena, String fecha, int edad, boolean estado){
         
           if (usuarioExiste(username)) {
                return false;
            }
           
            if (contadorUsers < usuarios.length) {
            Usuario nuevoUsuario = new Usuario(nombre_user, genero, username, contrasena, fecha, edad, estado);
            usuarios[contadorUsers] = nuevoUsuario;
            contadorUsers++;
            
            // Si no hay un usuario actualmente conectado, hacer que el nuevo usuario sea el usuario actual
            if (usuarioActual == null) {
                usuarioActual = nuevoUsuario;
            }
                return true;
            
            } else {
                return false;
            }
    
         
      }
        
 
        public boolean usuarioExiste(String username) {
        for (int i = 0; i < contadorUsers; i++) {
            if (usuarios[i] != null && usuarios[i].getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }
        
    
        
        
     
        
    public Usuario obtenerUsuario(String username) {
        for (int i = 0; i <contadorUsers ; i++) {
            if (usuarios[i] != null && usuarios[i].getUsername().equals(username)) {
                return usuarios[i];
            }
        }
        return null;
    }
    
     public boolean validarCredenciales(String username, String password) {
        Usuario usuario = obtenerUsuario(username);
        if (usuario != null && usuario.getContrasena().equals(password)) {
            usuarioActual = usuario;
            return true;
        }
        return false;
    }
        
        public boolean insertar (Usuario usuario){
       if(buscar(usuario.getUsername())==null){
           for(int i=0; i<usuarios.length; i++){
               if(usuarios[i]==null){
                   usuarios[i]=usuario;
                   
                   return true; }        
               }
        }
           return false;
   }
        public boolean cerrarSesion(){
            if (usuarioActual != null) {
            usuarioActual = null; // Limpiar la referencia del usuario actual
            return true;
            }
            return false;
        }
        
        
        
        public String mostrarNombre() {
          if (usuarioActual != null) {
            return usuarioActual.getNombre_user();
        }
        return "Usuario no encontrado"; // Mensaje adecuado si no hay usuario actual
    }
        
        public String mostrarUser() {
         if (usuarioActual != null) {
            return usuarioActual.getUsername();
        }
        return "Usuario no encontrado"; // Mensaje adecuado si no hay usuario actual
    }
        
     public char mostrarGenero() {
         if (usuarioActual != null) {
            return usuarioActual.getGenero();
        }
        return 0; // Mensaje adecuado si no hay usuario actual
    }
     
     public String mostrarFecha() {
         if (usuarioActual != null) {
            return usuarioActual.getFecha();
        }
        return "Sin Fecha"; // Mensaje adecuado si no hay usuario actual
    }
     
   public void agregarTwitActual(String username, String contenido, String hora) {
       
       if (usuarioActual != null) {
            Twits nuevoTwit = new Twits(usuarioActual.getUsername(), contenido, hora);
            usuarioActual.agregarTwit(nuevoTwit);
        } else {
            System.out.println("No hay usuario logueado.");
        }
    }
    
    public Twits[] obtenerTwitsActual() {
        if (usuarioActual != null) {
            return usuarioActual.getTwits();
        } else {
            return new Twits[0]; 
        }
    
    }
    
    public Twits[] obtenerHashtagActual() {
        if (usuarioActual != null) {
            return usuarioActual.getHashtag();
        } else {
            return new Twits[0];
        }
     
    }
    
     public Twits[] obtenerMencionActual() {
        if (usuarioActual != null) {
            return usuarioActual.getMenciones();
        } else {
            return new Twits[0];
        }
     
    }
    
    
    
    
    
    
     
      /* public Usuario obtenerUsuario(String username) {
        for (Usuario usuario : usuarios) {
            if (usuario != null && usuario.getUsername().equals(username)) {
                return usuario;
            }
        }
        return null; // Usuario no encontrado
    }
       
       
    
    
   public int buscar (String username){
       
       for(int i=0; i<usuarios.length; i++){
           if(usuarios[i] != null && usuarios[i].getUsername().equals(username)){
               return i;  
           }
       }
           return -1;
       
   } 
   
    public String user(String username, String password) {
         Usuario usuario = obtenerUsuario(username);
         if (usuario != null) {
             nombre=usuario.getUsername();
             return nombre; // Devuelve el nombre del usuario
         }
         return "Usuario no encontrado"; // Mensaje si el usuario no se encuentra
     }

       public  boolean userActual(String username){
           Usuario usuario = obtenerUsuario(username);
           if (usuario != null) {
             return true; // Devuelve el nombre del usuario
             }
             return false;
         }
   
   public boolean insertar (Usuario usuario){
       if(buscar(usuario.getUsername())==-1){
           for(int i=0; i<usuarios.length; i++){
               if(usuarios[i]==null){
                   usuarios[i]=usuario;
                   
                   return true; }        
               }
        }
           return false;
   }
   
    
   
   public boolean modificar (Usuario usuario){
      int indice = buscar(usuario.getUsername());
        if (indice != -1) {
            usuarios[indice].setContrasena(usuario.getContrasena());
            usuarios[indice].setNombre_user(usuario.getNombre_user());
          //  usuarios[indice].setGenero(usuario.getGenero());
            return true;
        }
        return false;
    }
   
   public boolean eliminar(String username){
       int indice =buscar(username);
        if (indice != -1) { 
        for (int i = indice; i < usuarios.length - 1; i++) {
            usuarios[i] = usuarios[i + 1]; 
        }
        usuarios[usuarios.length - 1] = null; 

        return true;
    } 
        return false; 
   }
    
    public Usuario obtener(String username){
        int indice = buscar(username);
        
        if(buscar(username)!=-1){
            return usuarios[indice];
        }
            return null;
        
        
    }*/
    
      
    
}
