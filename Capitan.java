import java.util.Random;
/**
 * Write a description of class Capitan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Capitan extends JugadorDeCampo
{
    // instance variables - replace the example below with your own
    private int liderazgo;
    private static final int MIN = 0;
    private static final int MAX = 5;

    /**
     * Constructor for objects of class Capitan
     */
    public Capitan(int dorsal)
    {
        super(dorsal);
        Random rmd = new Random();
        liderazgo = rmd.nextInt(MAX + 1 - MIN) + MAX;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int getLiderazgo(){
        return liderazgo;
    }

    public int mediaJugador(){
        return super.mediaJugador() + liderazgo;
    }
    
    public String toString(){
        return toStringC() + mediaJugador() + " liderazgo " + liderazgo;
    }
}
