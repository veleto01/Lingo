
package urjc.poo.lingo.Clases;

public class Usuario {

    private String nombre;
    private String contraseña;

    public Usuario(String nombre, String contraseña) {

        this.nombre = nombre;
        this.contraseña = contraseña;

    }

    public String getNombre() {
        return nombre;
    }

    public String getContraseña() {
        return contraseña;
    }
    
    @Override
    public String toString() {

        return (" Id = " + nombre + " Contraseña = " + contraseña);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (getClass() != o.getClass()) {
            return false;
        }
        
        
        Usuario p = (Usuario) o;
        return (p.getNombre().equals(getNombre()) 
                && p.getContraseña().equals(getContraseña()));
    }

}
