/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package urjc.poo.lingo.Clases;

import java.util.ArrayList;

/**
 *
 * @author Manuel
 */
public class AlmacenPartidasJugadasDosUsuarios {
    private ArrayList<Partida> partidasJugadas;

    
    public AlmacenPartidasJugadasDosUsuarios(){
        partidasJugadas = new ArrayList();
        
    }
    
    public void añadirPartida(Partida p) {
        partidasJugadas.add(p);
    }
    
    public Partida getPartida(int i) {
        return partidasJugadas.get(i);
    }

    public int tamañoAlmacen() {

        return 100;
    }
}
