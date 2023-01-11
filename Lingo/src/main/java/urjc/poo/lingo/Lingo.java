
package urjc.poo.lingo;
import urjc.poo.lingo.Clases.*;

import urjc.poo.lingo.Login.Iniciar;


public class Lingo {

    public static void main(String[] args) {
        AlmacenPartidas p = new AlmacenPartidas();
        AlmacenUsuarios aU = new AlmacenUsuarios();
        AlmacenPalabras aPa = new AlmacenPalabras();
        Usuario prueba = new Usuario("Sergio", "1234");
        Usuario usuario2 = new Usuario("Morales", "1234");
        Usuario PruebaPerfil = new Usuario("Pelos", "1234", 12, 14, 1, 123);
        aU.añadirUsuario(prueba);
        aU.añadirUsuario(usuario2);
        aU.añadirUsuario(PruebaPerfil);
        Iniciar ini = new Iniciar(p, aU, aPa, false);
        ini.setVisible(true);
        
    }
}
