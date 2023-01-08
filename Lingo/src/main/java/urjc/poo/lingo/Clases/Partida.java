package urjc.poo.lingo.Clases;

import urjc.poo.lingo.Clases.*;


public class Partida {
    
    Usuario jugador1, jugador2;
    int marcador1, marcador2;
    Palabra[] palabrasPartida;
    int[] intentos1, intentos2;
    boolean pistaPalabraNoUsada1, pistaPalabraNoUsada2;
    boolean[] pistaLetraNoUsada1, pistaLetraNoUsada2;
    
    
    public Partida(Usuario usu1, Usuario usu2, Palabra[] palaPartida){
        jugador1 = usu1; 
        jugador2 = usu2;
        marcador1 = 0;
        marcador2 = 0;
        palabrasPartida = palaPartida;
        intentos1 = new int[palaPartida.length];
        intentos2 = new int[palaPartida.length];
        pistaPalabraNoUsada1 = true;
        pistaPalabraNoUsada2 = true;
        pistaLetraNoUsada1 = new boolean[palaPartida.length];
        pistaLetraNoUsada2 = new boolean[palaPartida.length];
    }
    
    public void setPistaPalabra1(boolean usada){
        pistaPalabraNoUsada1 = usada;
    }
    
    public void setPistaPalabra2(boolean usada){
        pistaPalabraNoUsada2 = usada;
    }
     
    public void setPistaLetra1(boolean usada, int palabraJugada){
        pistaLetraNoUsada1[palabraJugada] = usada;
    }
    
    public void setPistaLetra2(boolean usada, int palabraJugada){
        pistaLetraNoUsada2[palabraJugada] = usada;
    }
    
    public void actualizarMarcador1(int puntos){
        marcador1 = marcador1 + puntos;
    }
    
    public void actualizarMarcador2(int puntos){
        marcador2 = marcador2 + puntos;
    }
    
    public void setIntento1(int numIntento, int palabraJugada){
        intentos1[palabraJugada] = numIntento;
    }
    
    public void setIntento2(int numIntento, int palabraJugada){
        intentos2[palabraJugada] = numIntento;
    }
    
    public int getMarcador1(){
        return marcador1;
    }
    
    public int getMarcador2(){
        return marcador2;
    }
    
    public Palabra[] getPalabras(){
        return palabrasPartida.clone();
    }
    
    
    
    
}