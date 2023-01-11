
package urjc.poo.lingo.Clases;
import java.util.ArrayList;
import urjc.poo.lingo.Clases.*;


public class AlmacenPartidas {
    
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
    
    public int getPartidasCreadas(){
        return partidasCreadas;
    }
}
