
package urjc.poo.lingo.Clases;

public class Partida {
      
    private int numPalabras; //Palabras de la partida que el jugador solicita. Obligatoriamente de 1 a 10.
    private int contadorJ1; //Contador de puntos de jugador1
    private int contadorJ2; //Contador de puntos de jugador2
    private boolean regaloPalabra; //Una unica vez por partida. Valor: 3 puntos
    
    
    //Constructor
    public Partida(int numPalabras){
        if(numPalabras >= 1 && numPalabras <=10){
            int Palabras[] = new int [numPalabras]; //Array de las palabras que contendra la partida
        }
        contadorJ1 = 0;
        contadorJ2 = 0;
        regaloPalabra = false; //False = No se ha utilizado
        
    }
    
    public boolean usarRegaloPalabra(int contadorJ1){
        if(contadorJ1 >= 3 && regaloPalabra){
            
              
        
            contadorJ1 = contadorJ1 - 3; //Actualizamos sus puntos restandole el valor del regalo
            regaloPalabra = true; //Ahora su valor es true y ya no se podra utilizar en la partida
        }
        
        return true;
    }
    
    
}
