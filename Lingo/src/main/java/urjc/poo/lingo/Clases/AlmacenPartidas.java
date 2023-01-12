
package urjc.poo.lingo.Clases;
import java.io.Serializable;
import java.util.ArrayList;
import urjc.poo.lingo.Clases.*;


public class AlmacenPartidas implements Serializable{
    
    Partida p;
    int index;
    private ArrayList<Partida> partidas;
    private int partidasCreadas;
    
    public AlmacenPartidas(){
        partidas = new ArrayList();
        partidasCreadas = 0;
    }
    
    public void añadirPartida(Partida p) {
        partidas.add(p);
        partidasCreadas += 1;
    }
    
    public Partida getPartida(int i) {
        return partidas.get(i);
    }
    

    public ArrayList getAlmacen(){
        return partidas;
    }
    

    public int tamañoAlmacen(){
        
        return partidas.size();
    }
    
    
    public ArrayList<Partida> getArraylist(){
        return partidas;
    }

    public int getPartidasCreadas(){
        return partidasCreadas;
    }
}
