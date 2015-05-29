import java.util.Random;
/**
 * Write a description of class JugadorDeCampo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JugadorDeCampo extends Jugador
{
    // instance variables - replace the example below with your own
    private int pase;
    private int regate;
    private int remate;
    private static final int MIN = 0;
    private static final int MAX = 10;
    /**
     * Constructor for objects of class JugadorDeCampo
     */
    public JugadorDeCampo(int dorsal)
    {
        super(dorsal);
        Random rmd = new Random();
        pase = rmd.nextInt(11);
        regate = rmd.nextInt(11);
        remate = rmd.nextInt(11);
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int getPase(){
        return pase;
    }

    /**
     * 
     */
    public int getRemate(){
        return remate;
    }

    public int getRegate(){
        return regate;
    }

    public int mediaJugador(){
        return (getEstadoForma() + pase + remate + regate) / 4;
    }
    
    public String toString(){
        return super.toString() + " pase " + pase + " regate " + regate + " remate " + regate + " valoracion " + mediaJugador();
    }
    public String toStringC(){
        return super.toString() + " pase " + pase + " regate " + regate + " remate " + regate + " valoracion ";
    }
}
