
package urjc.poo.lingo.Clases;
import java.util.*;

public class AlmacenPartidas {
    
     private ArrayList<Partida> Partidas = new ArrayList();
     
     
     public AlmacenPartidas(){
      
     }
     
     
     public void infoPartidas(){
         for(Partida c : Partidas){
             System.out.println(c.infoPartida());
         }
     }
     
}
