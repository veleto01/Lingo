package urjc.poo.lingo.Clases;


public class Palabra {
    String palabra;
    
    public Palabra(String s){
        palabra = s;
    }
    
    @Override
    public String toString(){
        return palabra;
    }
}
