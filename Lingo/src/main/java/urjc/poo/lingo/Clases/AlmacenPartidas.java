
package urjc.poo.lingo.Clases;
import java.util.ArrayList;
import urjc.poo.lingo.Clases.*;


public class AlmacenPartidas {
    
    private ArrayList<Partida> partidas;
    
    public AlmacenPartidas(){
        partidas = new ArrayList();
    }
    
    public void añadirPartida(Partida p) {
        partidas.add(p);
    }
    
    public Partida getPartida(int i) {
        return partidas.get(i);
    }
}
