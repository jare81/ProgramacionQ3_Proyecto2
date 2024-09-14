/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

/**
 *
 * @author Dell
 */
public class SyS {
    private Usuario[] seguidores;
    private int indexSeguidores;
    
    private Usuario[] seguidos;
    private int indexSeguidos;
    
    
    public SyS(int cantidad){
        seguidores=new Usuario[cantidad];
        indexSeguidores=0;
        
        seguidos=new Usuario[cantidad];
        indexSeguidos=0;
    }
    
    public void agregarSeguidor (Usuario usuario){
        if(indexSeguidores<seguidores.length){
            seguidores[indexSeguidores]=usuario;
            indexSeguidores++;
        }else{
            System.out.println(" No hay mas espacio para seguidores");
        }
    }
    
    public void agregarSeguido(Usuario usuario){
        if(indexSeguidos<seguidos.length){
            seguidos[indexSeguidos]=usuario;
            indexSeguidos++;
        }else{
            System.out.println("No hay mas espacio para seguidos");
        }
    }
    
    public void eliminarSeguidor(Usuario usuario){
        for (int i = 0; i < indexSeguidores; i++) {
            if(seguidores[i] !=null && seguidores[i].equals(usuario)){
                for (int j = i; j < indexSeguidores-1; j++) {
                    seguidores[j] = seguidores [j+1];
                }
                
                seguidores[indexSeguidores -1]=null;
                indexSeguidores--;
                return;
            }
            
        }
    }
    
    public void eliminarSeguido(Usuario usuario){
        for (int i = 0; i < indexSeguidos; i++) {
            if(seguidos[i]!=null && seguidos[i].equals(usuario)){
                for (int j = i; j < indexSeguidos-1; j++) {
                    seguidos[j] =seguidos[j-1];
                }
                seguidos[indexSeguidos -1]=null;
                indexSeguidos--;
                return;
            }
        }System.out.println("El usuario no es seguido");
    }
    
    
    public Usuario[] obtenerSeguidores(){
        Usuario[] seguidoresAct = new Usuario[indexSeguidores];
        System.arraycopy(seguidores, 0, seguidoresAct, 0, indexSeguidores);
        return seguidoresAct;
    }
    
    public Usuario[] obtenerSeguidos(){
        Usuario[] seguidosAct = new Usuario[indexSeguidos];
        System.arraycopy(seguidos, 0, seguidosAct, 0, indexSeguidos);
        return seguidosAct;
    }
    
    public boolean esSeguidor(Usuario usuario){
        for (int i = 0; i < indexSeguidores; i++) {
            if (seguidores[i]!=null && seguidores[i].equals(usuario)) {
                return true;
            }
        }return false;
    }
    
    public boolean esSeguido(Usuario usuario){
        for (int i = 0; i < indexSeguidos; i++) {
            if(seguidos[i]!=null && seguidos[i].equals(usuario)){
                return true;
            }
        }return false;
    }
    
     public int cantidadSeguidores() {
        return indexSeguidores; 
    }
    
    public int cantidadSeguidos() {
        return indexSeguidos;
    }
    
    
}
