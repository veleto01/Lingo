package urjc.poo.lingo.Clases;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class UsuariosInput {

    private FileInputStream file;
    private ObjectInputStream input;

    public Usuario leer()
            throws IOException, ClassNotFoundException {
        Usuario usu = new Usuario();
        if (input != null) {
            try {
                usu = (Usuario) input.readObject();

            } catch (EOFException eof) {

            }
        }
        return usu;
    }

    public void abrirFichero()
            throws IOException {
        file = new FileInputStream("Usuarios.ser");
        input = new ObjectInputStream(file);
    }

    public void cerrar()
            throws IOException {
        if (input != null) {
            input.close();
        }
    }
}
