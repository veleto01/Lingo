package urjc.poo.lingo.Clases;

import java.util.ArrayList;
import static urjc.poo.lingo.Clases.AlmacenDePalabras.*;

//Clase Palabra, esta clase es la solucion de la sesion que tenga abierta el jugador, por lo tanto al crear una palabra se escoge aleatoriamente entre el almacen y desde esta
// misma clase se ejecutan todos los metodos para jugar con esa palabra, cuando el juegador gane o pierda, se escogera otra palabra de nuevo aleatoriamente para poder seguir jugando
public class Palabra {
    private enumLetras numLetras; //Declaracion de la Enum
    private char[] palabra; //Declaracion del array que conforma una palabra
    private boolean regaloDeLetra; //Delaracion del boolean que permite saber si se ha reglado ya una letra por cada palabra
    private int numIntentos;
    private Intento intento;
  
    
    public Palabra(String palabra, enumLetras numeroLetras){
        this.palabra = palabra.toCharArray();
        numIntentos = 0;
        numLetras = numeroLetras;
    }
    
    /*Constructor noargs que coge una palabra aleatoria del almacen de palabras
    public Palabra(enumLetras numeroLetras){
        //Seleccionar aleatoriamente una palabra del almacen para que sea la solucion de la sesion
        if(numeroLetras.equals(CINCO)))
        int indice = (int)(Math.random()*palabrasDeCinco.size());
       
    }*/
    
    private void comprobarColocadas(){
     
       //Este metodo compara el intento que llegue con la propia palabra(this) para ver cuantas coinciden(aparecerian en verde)
       //char[] aux = intento.recogerIntento();
              
        
       
        
    }
    
    private void comprobarDistintaPosicion(){
        /*
        //Este metodo compara el intento que llegue con la propia palabra(this) para ver cuantas estan en otra posicion(aparecerian en amarillo)
        
        */
    }
    
    public void mostrarIntentoResuelto(){
        
    }
    
    public int puntosObtenidos(){
        int puntosObtenidos = 0;
        return puntosObtenidos;
    }
    
    public void sacarPalabraAleatoria(){
        
    }
    
    public void secuenciaResultados(){
        
    }
    
    public void jugar(){
        
    }
}

