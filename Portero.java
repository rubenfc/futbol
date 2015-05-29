import java.util.Random;
/**
 * Write a description of class Portero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Portero extends Jugador
{
    // instance variables - replace the example below with your own
    private int agilidad;
    private int fortalezaMental;

    /**
     * Constructor for objects of class Portero
     */
    public Portero(int dorsal)
    {
        super(dorsal);
        Random rmd = new Random();
        agilidad = rmd.nextInt(11);
        fortalezaMental = rmd.nextInt(11);
    }

    /**
     *  
     */
    public int getAgilidad(){
        return agilidad;
    }
    
    /**
     * 
     */
    public int getFortalezaMental(){
        return fortalezaMental;
    }
    
    public int mediaJugador(){
        return (getEstadoForma() + agilidad + fortalezaMental) / 3;
    }
    public String toString(){
        return super.toString() + " agilidad: " + agilidad + " fortM: " + fortalezaMental + "              valoracion: " + mediaJugador();
    }
}
