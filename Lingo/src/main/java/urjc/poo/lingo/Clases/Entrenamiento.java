
package urjc.poo.lingo.Clases;


public class Entrenamiento {
    
    private int puntosObtenidos;
    boolean pistaPalabraNoUsada;
    
    public Entrenamiento(){
        puntosObtenidos = 0;
        pistaPalabraNoUsada = true;
    }
    
    public void actualizarPuntos(int puntos){
        puntosObtenidos += puntos;
    }
    
    public void setPistaPalabraNoUsada(boolean usada){
        pistaPalabraNoUsada = usada;
    }
    
    public int getPuntos(){
        return puntosObtenidos;
    }
    
}
