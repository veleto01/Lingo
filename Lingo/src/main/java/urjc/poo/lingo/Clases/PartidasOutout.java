/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package urjc.poo.lingo.Clases;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author Manuel
 */
public class PartidasOutout {
     private FileOutputStream file;
    private ObjectOutputStream output;
    
    public void abrir()
            throws IOException {
        FileOutputStream file = new FileOutputStream("Partidas.ser");
        output = new ObjectOutputStream(file);
    }

    public void cerrar()
            throws IOException {
        if (output != null) {
            output.close();
        }
    }

    public void escribirUsuario(AlmacenPartidas aP)
            throws IOException {
        if (output != null) {
            
            for (int i = 0; i<aP.tamañoAlmacen(); i++ ){
            output.writeObject(aP.getPartida(i));
            }
        }
    }
    public void eliminar()
            throws IOException {
        if (output != null) {
            File fichero = new File("Partidas.ser");
            fichero.delete();
           
        }
    }
}
