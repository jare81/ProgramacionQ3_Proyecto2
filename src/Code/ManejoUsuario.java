/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

import Interfaz.Perfil;

/**
 *
 * @author jaren
 */
public class ManejoUsuario {
  
    private Usuario usuarios[];
    private int contadorUsers;
    private Usuario usuarioActual;
    private Twits[] TwitsG;
    private int indexTwitsG;
    
     private Twits[] HashtagsG;
    private int indexHashtagsG;
    
    private String otroUser="";
    private Perfil perfilJFrame;
    
    
    public ManejoUsuario(int cantidad){
    
      usuarios = new Usuario[cantidad]; 
      contadorUsers=0;
      usuarioActual = null;
      
      TwitsG = new Twits[100];
      indexTwitsG=0;
      
     this.HashtagsG = new Twits[100]; 
     this.indexHashtagsG = 0;
      
    }
    
   /* private Usuario buscar(String username) {
        for (Usuario user : usuarios) {
            if (user != null && user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }*/
    
    
    public Usuario[] buscarUsuarios(String palabraClave) {
        Usuario[] resultados = new Usuario[contadorUsers];
        int contadorResultados = 0;

  
        for (int i = 0; i < contadorUsers; i++) {
            if (usuarios[i] != null 
                && usuarios[i].isActivo() // Solo incluir cuentas activas
                && (usuarios[i].getNombre_user().contains(palabraClave) 
                || usuarios[i].getUsername().contains(palabraClave))) {
                resultados[contadorResultados] = usuarios[i];
                contadorResultados++;
            }
        }

        Usuario[] resultadosFinales = new Usuario[contadorResultados];
        System.arraycopy(resultados, 0, resultadosFinales, 0, contadorResultados);

        return resultadosFinales;
    }
    
    
     public Usuario obtenerUsuario(String username) {
        for (int i = 0; i <contadorUsers ; i++) {
            if (usuarios[i] != null && usuarios[i].getUsername().equals(username)) {
                otroUser= usuarios[i].getUsername();
                return usuarios[i];
            }
        }
        return null;
    }
    
    public Usuario[] obtenerUsuarios() {
        Usuario[] usuariosActuales = new Usuario[contadorUsers];
        System.arraycopy(usuarios, 0, usuariosActuales, 0, contadorUsers);
        
        return usuariosActuales;
    }
    
    
     public boolean cambiarEstadoUsuario(String username, boolean nuevoEstado) {
        Usuario usuario = obtenerUsuario(username);
        if (usuario != null) {
             usuario.cambiarEstado(nuevoEstado);
            return true;
        }
        return false;
    }
    
    
    public Usuario obtenerUsuarioActual() {
    if (usuarioActual == null) {
        System.out.println("No hay un usuario actual");
        return null;  
    }
    return usuarioActual;
}
     
    
   /*  public void registro(Usuario datos){
        if (buscar(datos.getUsername()) == null){ 
           usuarios[contadorUsers]=datos;
           contadorUsers++;
       }else{
           System.out.println("No hay mas espacios");
       }
       
   }*/
     public  boolean agregarUser (String nombre_user, char genero, String username, String contrasena, String fecha, int edad, boolean estado){
         
            if (contadorUsers < usuarios.length) {
            Usuario nuevoUsuario = new Usuario(nombre_user, genero, username, contrasena, fecha, edad, estado, this);
            usuarios[contadorUsers] = nuevoUsuario;
            contadorUsers++;
            
            // Si no hay nadior conectado hacer que el nuevo usuario sea el usuario actual
                usuarioActual = nuevoUsuario;
                return true;
            
            } else {
        System.out.println("No se puede agregar más usuarios.");
        return false;
        }
        
     }
     
     public boolean validarCredenciales(String username, String password) {
        Usuario usuario = obtenerUsuario(username);
        if (usuario != null && usuario.getContrasena().equals(password)) {
            usuarioActual = usuario;
            return true;
        }
        return false;
    }
       
        public boolean cerrarSesion() {
        if (usuarioActual != null) {
            usuarioActual = null;  // Limpiar el usuario actual
            return true;
        }
        return false;
    }
     
    
        public boolean usuarioExiste(String username) {
        for (int i = 0; i < contadorUsers; i++) {
            if (usuarios[i] != null && usuarios[i].getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }
        
      
   
   /* public Usuario obtenerUsuarioPorNombre(String username) {
        for (Usuario usuario : usuarios) {
            if (usuario != null && usuario.getUsername().equals(username)) {
                return usuario;
            }
        }
        return null;
    }*/
    
    
    
    
      
       /* public boolean insertar (Usuario usuario){
       if(buscar(usuario.getUsername())==null){
           for(int i=0; i<usuarios.length; i++){
               if(usuarios[i]==null){
                   usuarios[i]=usuario;
                   
                   return true; }        
               }
        }
           return false;
   }*/
        
        
        
        
    public String mostrarNombre() {
        if (usuarioActual != null) {
            return usuarioActual.getNombre_user();
        }
            return "Usuario no encontrado"; 
    }
        
    public String mostrarUser() {
        if (usuarioActual != null) {
            return usuarioActual.getUsername();
        }
            return "Usuario no encontrado";  
    }
        
    public char mostrarGenero() {
        if (usuarioActual != null) {
            return usuarioActual.getGenero();
        }
        return 0; 
    }
     
    public int mostrarEdad(){
        if(usuarioActual !=null){
            return usuarioActual.getEdad();
        }
         return 0;
     }
     
    public String mostrarFecha() {
        if (usuarioActual != null) {
            return usuarioActual.getFecha();
        }
        return "Sin Fecha"; 
    }
     
    public boolean mostrarEstado() {
        if (usuarioActual != null) {
            return usuarioActual.isActivo();
        }
        return false; 
    }
     
      
      
   public void agregarTwitActual(String username, String contenido, String hora, String fecha) {
       
       if (usuarioActual != null) {
            Twits nuevoTwit = new Twits(usuarioActual.getUsername(), contenido, hora, fecha, usuarioActual);
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
    
  /* public Twits[] obtenerHashtagActual() {
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
          
     
    }*/
    
    public void agregarHashtagG(Twits twit) {
        if (indexHashtagsG < HashtagsG.length) {
            HashtagsG[indexHashtagsG] = twit;
            indexHashtagsG++;
        } else {
            System.out.println("No se pueden agregar más hashtags generales.");
        }
    }
    
    public Twits[] obtenerHashtasG() {
        Twits[] hasgtagsActuales = new Twits[indexHashtagsG];
        System.arraycopy(HashtagsG, 0, hasgtagsActuales, 0, indexHashtagsG);
        return hasgtagsActuales;
    }    
    
    public Twits[] buscarHashtags(String palabraClave) {
        
        Twits[] resultados = new Twits[indexHashtagsG];
        int contadorResultados = 0;
        
        for (int i = 0; i < indexHashtagsG; i++) {
            if (HashtagsG[i] != null && HashtagsG[i].getContenido().contains(palabraClave)) {
                resultados[contadorResultados] = HashtagsG[i];
                contadorResultados++;
            }
        }
        //crear un array que muestre que eocntro
        Twits[] resultadosFinales = new Twits[contadorResultados];
        System.arraycopy(resultados, 0, resultadosFinales, 0, contadorResultados);

    return resultadosFinales;
}
     
     public void agregarMencionG(Twits twit) {
        if (indexTwitsG < TwitsG.length) {
            TwitsG[indexTwitsG] = twit;
            indexTwitsG++;
        } else {
            System.out.println("No se pueden agregar más twits generales.");
        }
    }
     
     public Twits[] obtenerMencionesG() {
        Twits[] mencionesActuales = new Twits[indexTwitsG];
        System.arraycopy(TwitsG, 0, mencionesActuales, 0, indexTwitsG);
        return mencionesActuales;
    }
     
     public Twits[] obtenerMencionesUsuarioActual() {
    if (usuarioActual != null) {
        String username = usuarioActual.getUsername();
        //las menciones del usuario acttal
        Twits[] mencionesUsuarioActual = new Twits[indexTwitsG];
        int contadorMencionesUsuario = 0;

        for (int i = 0; i < indexTwitsG; i++) {
            Twits twit = TwitsG[i];
            if (twit.getContenido().contains("@" + username)) {
                mencionesUsuarioActual[contadorMencionesUsuario] = twit;
                contadorMencionesUsuario++;
            }
        }
        //menciones encontradas
        Twits[] mencionesFiltradas = new Twits[contadorMencionesUsuario];
        System.arraycopy(mencionesUsuarioActual, 0, mencionesFiltradas, 0, contadorMencionesUsuario);

        return mencionesFiltradas;
    }
    return new Twits[0]; 
}
     
     public Usuario[] obtenerTodosLosUsuarios() {
    Usuario[] todos = new Usuario[contadorUsers];
    int contador = 0;
    for (int i = 0; i < contadorUsers; i++) {
        if (usuarios[i] != null && usuarios[i].isActivo()) {
            todos[contador] = usuarios[i];
            contador++;
        }
    }
    
    Usuario[] usuariosActivos = new Usuario[contador];
    System.arraycopy(todos, 0, usuariosActivos, 0, contador);
    
    return usuariosActivos;
}
     
     //para actualizar el numero de SYS de manera automoatica
     public void setPerfilJFrame(Perfil perfilJFrame) {
        this.perfilJFrame = perfilJFrame;
    }

    public Perfil getPerfilJFrame() {
        return perfilJFrame;
    }

     
    
}
