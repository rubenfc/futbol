import java.util.Random;
/**
 * Write a description of class Jugador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Jugador
{
    // instance variables - replace the example below with your own
    private String nombre;
    private int edad;
    private int estadoForma;
    private int dorsal;

    /**
     * Constructor for objects of class Jugador
     */
    public Jugador(int dorsal)
    {
        Random rmd = new Random();
        edad = rmd.nextInt(23)+18 ;
        estadoForma = rmd.nextInt(11);
        int nom =  rmd.nextInt(33);
        Nombres nomb = new Nombres();
        nombre = nomb.getNombre(nom);
        this.dorsal = dorsal;
        this.nombre = nombre;
    }

    /**
     *  
     */
    public int getEdad(){
        return edad;
    }
    /**
     * 
     */
    public int getEstadoForma(){
        return estadoForma;
    }
    /**
     * 
     */
    public int getDorsal(){
        return dorsal;
    }
    
    public String toString(){
        return "dorsal: " + dorsal + " " + nombre + " (" + edad + " años) forma: " + estadoForma;
    }
    public abstract int mediaJugador();
}
