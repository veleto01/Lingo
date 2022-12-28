
package urjc.poo.lingo.Clases;


public class Entrenamiento extends Palabra{
    private int puntos;//Declaracion de puntos cuando entrenas
    private boolean regaloDePalabra;//Boolean para saber si se ha usado el regalo de palabra
    
    public Entrenamiento(){
        puntos = 0;
        regaloDePalabra = false;
    }
    
    public int mostrarPuntos(){
        return puntos;
    }
    
    public boolean usarPistaDePalabra(){
        
       return true;
    }
}