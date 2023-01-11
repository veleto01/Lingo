/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package urjc.poo.lingo.Clases;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import urjc.poo.lingo.Clases.*;

public class UsuariosOutput {

    private FileOutputStream file;
    private ObjectOutputStream output;
    private ObjectInputStream input;

    public void abrir()
            throws IOException {
        FileOutputStream file = new FileOutputStream("Usuarios.ser");
        output = new ObjectOutputStream(file);
    }

    public void cerrar()
            throws IOException {
        if (output != null) {
            output.close();
        }
    }

    public void escribirUsuario(AlmacenUsuarios aU)
            throws IOException {
        if (output != null) {

            for (int i = 0; i < aU.tamañoAlmacen(); i++) {
                output.writeObject(aU.getUsu(i));
            }
        }
    }

    public void eliminar()
            throws IOException {
        if (output != null) {
            File fichero = new File("Usuarios.ser");
            fichero.delete();

        }
    }

}
