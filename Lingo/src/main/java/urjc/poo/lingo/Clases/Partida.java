package urjc.poo.lingo.Clases;

import urjc.poo.lingo.Clases.*;

public class Partida {

    Usuario jugador1, jugador2;
    int marcador1, marcador2;
    Palabra[] palabrasPartida;
    int[] intentos1, intentos2;
    boolean pistaPalabraNoUsada1, pistaPalabraNoUsada2, ganoJugador1, empataron;
    boolean[] pistaLetraNoUsada1, pistaLetraNoUsada2;

    public Partida(Usuario usu1, Usuario usu2, Palabra[] palaPartida) {
        jugador1 = usu1;
        jugador2 = usu2;
        marcador1 = 0;
        marcador2 = 0;
        palabrasPartida = palaPartida;
        intentos1 = new int[palaPartida.length];
        intentos2 = new int[palaPartida.length];
        pistaPalabraNoUsada1 = true;
        pistaPalabraNoUsada2 = true;
        ganoJugador1 = true;
        empataron = false;
        pistaLetraNoUsada1 = new boolean[palaPartida.length];
        pistaLetraNoUsada2 = new boolean[palaPartida.length];
    }

    public void setPistaPalabra1(boolean usada) {
        pistaPalabraNoUsada1 = usada;
    }

    public void setPistaPalabra2(boolean usada) {
        pistaPalabraNoUsada2 = usada;
    }

    public void setPistaLetra1(boolean usada, int palabraJugada) {
        pistaLetraNoUsada1[palabraJugada] = usada;
    }

    public void setPistaLetra2(boolean usada, int palabraJugada) {
        pistaLetraNoUsada2[palabraJugada] = usada;
    }

    public void actualizarMarcador1(int puntos) {
        marcador1 = marcador1 + puntos;
    }

    public void actualizarMarcador2(int puntos) {
        marcador2 = marcador2 + puntos;
    }

    public void setIntento1(int numIntento, int palabraJugada) {
        intentos1[palabraJugada] = numIntento;
    }

    public void setIntento2(int numIntento, int palabraJugada) {
        intentos2[palabraJugada] = numIntento;
    }

    public void setGanadorJugador1(boolean bool) {
        ganoJugador1 = bool;
    }

    public void setEmpataron(boolean bool) {
        empataron = bool;
    }
    
    public int getMarcador1() {
        return marcador1;
    }

    public int getMarcador2() {
        return marcador2;
    }

    public Palabra[] getPalabras() {
        return palabrasPartida.clone();
    }

    @Override
    public String toString() {
        int contadorPalabrasJugadasPorJugador1 = 0;
        int contadorPalabrasJugadasPorJugador2 = 1;
        int palabras = palabrasPartida.length;
        //nombres
        String msg = "Jugador 1: ";
        msg = msg + jugador1.getNombre() + "\nJugador 2: " + jugador2.getNombre();
        //marcador de la partida
        msg = msg + "\nEl marcador de la partida fue: " + marcador1 + " puntos de " + jugador1.getNombre() + " frente a " + marcador2 + " puntos de " + jugador2.getNombre();
        //ganador
        if (ganoJugador1 && !empataron) {
            msg = msg + "\nGanó " + jugador1.getNombre();
        } else if (!ganoJugador1 && !empataron) {
            msg = msg + "\nGanó " + jugador2.getNombre();
        } else {
            msg += "\nEmpataron los 2 jugadores";
        }
        //palabras
        msg = msg + "\nLas palabras de la partida fueron:";
        for (int i = 0; i < palabrasPartida.length; i++) {
            msg = msg + " " + palabrasPartida[i].toString();
        }
        //intentos por palabra jugador 1
        msg = msg + "\nEl jugador 1 acertó en los siguientes intentos por palabra:\n";
        if (palabras % 2 == 0) {
            for (int i = 0; i < palabras / 2; i++) {
                msg = msg + "Para la palabra " + palabrasPartida[contadorPalabrasJugadasPorJugador1].toString() + " el jugador " + jugador1.getNombre();
                if(intentos1[i] == 0) msg = msg + " no acertó\n";
                else msg = msg + " acertó en el intento " + (intentos1[i]) + "\n";
                contadorPalabrasJugadasPorJugador1 += 2;
            }
        } else {
            for (int i = 0; i <= palabras / 2; i++) {
                msg = msg + "Para la palabra " + palabrasPartida[contadorPalabrasJugadasPorJugador1].toString() + " el jugador " + jugador1.getNombre();
                if(intentos1[i] == 0) msg = msg + " no acertó\n";
                else msg = msg + " acertó en el intento " + (intentos1[i]) + "\n";
                contadorPalabrasJugadasPorJugador1 += 2;
            }
        }
        //intentos por palabra jugador 2
        msg = msg + "El jugador 2 acertó en los siguientes intentos por palabra:\n";
        for (int i = 0; i < palabrasPartida.length / 2; i++) {
            msg = msg + "Para la palabra " + palabrasPartida[contadorPalabrasJugadasPorJugador2].toString() + " el jugador " + jugador2.getNombre();
                if(intentos2[i] == 0) msg = msg + " no acertó\n";
                else msg = msg + " acertó en el intento " + (intentos2[i]) + "\n";
            contadorPalabrasJugadasPorJugador2 += 2;
        }
        contadorPalabrasJugadasPorJugador1 = 0;
        contadorPalabrasJugadasPorJugador2 = 1;
        //pistas de letra por palabra jugador 1
        msg = msg + "El jugador 1 usó las pistas de letra en las siguientes palabras:\n";
        if (palabras % 2 == 0) {
            for (int i = 0; i < palabrasPartida.length / 2; i++) {
                msg = msg + "Para la palabra " + palabrasPartida[contadorPalabrasJugadasPorJugador1].toString() + " el jugador " + jugador1.getNombre();
                if(pistaLetraNoUsada1[i]) msg = msg + " no usó la pista de letra\n";
                else msg = msg + " si usó la pista de letra\n";
                contadorPalabrasJugadasPorJugador1 += 2;
            }
        } else {
            for (int i = 0; i <= palabrasPartida.length / 2; i++) {
                msg = msg + "Para la palabra " + palabrasPartida[contadorPalabrasJugadasPorJugador1].toString() + " el jugador " + jugador1.getNombre();
                if(pistaLetraNoUsada1[i]) msg = msg + " no usó la pista de letra\n";
                else msg = msg + " si usó la pista de letra\n";
                contadorPalabrasJugadasPorJugador1 += 2;
            }
        }
        //pistas de letra por palabra jugador 2
        msg = msg + "El jugador 2 usó las pistas de letra en las siguientes palabras:\n";
        for (int i = 0; i < palabrasPartida.length / 2; i++) {
                msg = msg + "Para la palabra " + palabrasPartida[contadorPalabrasJugadasPorJugador2].toString() + " el jugador " + jugador2.getNombre();
                if(pistaLetraNoUsada2[i]) msg = msg + " no usó la pista de letra\n";
                else msg = msg + " si usó la pista de letra\n";
                contadorPalabrasJugadasPorJugador2 += 2;
        }
        //pista de palabra por partida jugador 1
        if(pistaPalabraNoUsada1) msg = msg + "El jugador 1 no uso la pista de palabra en toda la partida\n";
        else msg = msg + "El jugador 1 sí uso la pista de palabra a lo largo de la partida\n";
        //pista de palabra por partida jugador 2
        if(pistaPalabraNoUsada2) msg = msg + "El jugador 2 no uso la pista de palabra en toda la partida\n";
        else msg = msg + "El jugador 2 sí uso la pista de palabra a lo largo de la partida\n";
        
        return msg;
    }

}
