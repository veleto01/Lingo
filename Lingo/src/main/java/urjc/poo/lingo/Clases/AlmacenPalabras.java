package urjc.poo.lingo.Clases;







public class AlmacenPalabras{

    private Palabra[] palabrasCincoLetras;
    Palabra[] palabrasSeisLetras;
    int numeroPalabras;
    int contadorPalabrasCincoLetras;
    int contadorPalabrasSeisLetras;
    
    public AlmacenPalabras(){
        palabrasCincoLetras = new Palabra[100];
        palabrasSeisLetras = new Palabra[100];
        numeroPalabras = 0;
        contadorPalabrasCincoLetras = 0;
        contadorPalabrasSeisLetras = 0;
    }

    public void setPalabrasCincoLetras(Palabra[] palabras){
        palabrasCincoLetras = palabras;
    }
    
    public void setPalabrasSeisLetras(Palabra[] palabras){
        palabrasSeisLetras = palabras;
    }
    
    public void setNumeroPalabras(int numPalabras){
        numeroPalabras = numPalabras;
    }
    
    public void setContador(int contador5, int contador6){
        contadorPalabrasCincoLetras = contador5;
        contadorPalabrasSeisLetras = contador6;
    }
    
    public int getContador5(){
        return contadorPalabrasCincoLetras;
    }
    
    public int getContador6(){
        return contadorPalabrasSeisLetras;
    }
    
    public Palabra[] getPalabrasCincoLetras(){
        return palabrasCincoLetras;
    }
    
    public Palabra[] getPalabrasSeisLetras(){
        return palabrasSeisLetras;
    }
    
    public int getNumeroPalabras(){
        return numeroPalabras;
    }
    
    
    
}
