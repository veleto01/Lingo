
package urjc.poo.lingo.Clases;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class PartidasInput {
    private FileInputStream file;
    private ObjectInputStream input;

    public Partida leer()
            throws IOException, ClassNotFoundException {
        Partida p = new Partida();
        if (input != null) {
            try {
                p = (Partida) input.readObject();

            } catch (EOFException eof) {

            }
        }
        return p;
    }

    public void abrirFichero()
            throws IOException {
        file = new FileInputStream("Partidas.ser");
        input = new ObjectInputStream(file);
    }

    public void cerrar()
            throws IOException {
        if (input != null) {
            input.close();
        }
    }
}
