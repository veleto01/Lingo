
package urjc.poo.lingo.Clases;
import java.io.Serializable;
import java.util.*;


public class AlmacenUsuarios implements Serializable{
    
    private ArrayList<Usuario> usu = new ArrayList();

    public AlmacenUsuarios(){
    }
    

    public void añadirUsuario(Usuario u) {
        
        usu.add(u);
        
    }
    
    public void eliminarUsuario(Usuario u){
    
        usu.remove(u);
        
    }
    
    public Usuario getUsu(int i) {
        return usu.get(i);
    }
    
    public int tamañoAlmacen(){
        
        return usu.size();
    }
    

    public ArrayList<Usuario> getArraylist(){
        return usu;
    }
   

    @Override
    public String toString(){
        String a = "";
        
        for (int i = 0; i < usu.size(); i++) {
            
            a += (" Usuario " + i + ":" + usu.get(i).toString() +"\n");
        }
        return a;
    }
    
    
    
}
