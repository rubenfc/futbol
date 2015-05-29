
/**
 * Write a description of class Partido here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Partido
{
    private Equipo equipoUno;
    private Equipo equipoDos;
    
    public Partido(Equipo equipoUno, Equipo equipoDos){
        this.equipoUno = equipoUno;
        this.equipoDos = equipoDos;
    }
    
    public void mostrarAlineaciones(){
        equipoUno.infoTitulares();
        equipoDos.infoTitulares();
    }
}
