package urjc.poo.lingo.Clases;


    

import java.io.Serializable;

public class Usuario implements Serializable,Comparable{


    private String nombre;
    private String contraseña;
    private int ganadas;
    private int empatadas;
    private int perdidas;
    private int puntos;
    
    

    public int getGanadas() {
        return ganadas;
    }

    public int getEmpatadas() {
        return empatadas;
    }

    public int getPerdidas() {
        return perdidas;
    }

    public int getPuntos() {
        return puntos;
    }
    private boolean admin;

    public Usuario(String nombre, String contraseña) {

        this.nombre = nombre;
        this.contraseña = contraseña;
        
    }
    public Usuario(){}
    public Usuario(String nombre, String contraseña,int gan,int empate,int per, int pun) {

        this.nombre = nombre;
        this.contraseña = contraseña;
        this.ganadas = gan;
        this.empatadas = empate;
        this.perdidas= per;
        this.puntos = pun;
        
    }
    
    public Usuario (String nombre, String contraseña, boolean admin){
        
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.admin = admin;
        
    }
    
    public String getNombre() {
       
        return nombre;
        
    }

    public boolean isAdmin() {
        return admin;
    }
    
    public void actualizarPuntos(int p){
        puntos += p;
    }
    
    public void actualizarGanadas(int n){
        ganadas += n;
    }
    
    public void actualizarPerdidas(int n){
        perdidas += n;
    }
    
    public void actualizarEmpatadas(int n){
        empatadas += n;
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

    @Override
    public int compareTo (Object otro) {
    Usuario p = (Usuario) otro;
    return nombre.compareToIgnoreCase(p.getNombre());
    }
}
