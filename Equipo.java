import java.util.Random;
import java.util.ArrayList;
/**
 * Write a description of class Equipo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Equipo
{
    // instance variables - replace the example below with your own
    private String nombre;
    private ArrayList<Jugador> jugadores;

    public Equipo(String nombre, int numJugadores){
        jugadores = new ArrayList<>();
        this.nombre = nombre;
        jugadores.add(new Portero(1));
        jugadores.add(new Capitan(2));
        int cont = 3;

        for (int i = 0; i < numJugadores - 2; i++){
            jugadores.add(new JugadorDeCampo(cont));
            cont++;
        }
    }

    public float mediaDelEquipo(){
        float acum = 0.0F;
        for(int i = 0; i < jugadores.size(); i++){
            acum += jugadores.get(i).mediaJugador();
        }
        return acum / jugadores.size();
    }

//     public ArrayList<Jugador> equipoTitular(){
//         ArrayList<Jugador> nuevoJ = new ArrayList<>();
//         for(int i = 0; i < jugadores.size(); i++){
//             nuevoJ.add(jugadores.get(i));
//         }
//         ArrayList<Jugador> mejores = new ArrayList<>();
//         mejores.add(jugadores.get(0));
//         mejores.add(jugadores.get(1));
//         nuevoJ.remove(0);
//         nuevoJ.remove(1);
//         
//         int cont = 0;
//         int indice = 0;
//         while(cont < 9){
//             int contador = 0;
//             Jugador mejJugador = jugadores.get(0);
//             while(contador < nuevoJ.size()){
//                     if(nuevoJ.get(contador).getEstadoForma() >= mejJugador.getEstadoForma()){
//                             mejJugador = nuevoJ.get(contador);
//                             indice = contador;
//                         }
//                 
//                 contador++;
//             }
//             nuevoJ.remove(indice);
//             mejores.add(mejJugador);
//             cont++;
//           
//         }
//         return mejores;
//     }
    
    public ArrayList<Jugador> once(){
        Random rnd = new Random();
        ArrayList<Jugador> titulares = new ArrayList<>();
        ArrayList<Jugador> nuevoJ = new ArrayList<>();
        for(int i = 0; i < jugadores.size(); i++){
            nuevoJ.add(jugadores.get(i));
        }
        titulares.add(nuevoJ.get(0));
        titulares.add(nuevoJ.get(1));
        nuevoJ.remove(0);
        nuevoJ.remove(1);
        int cont = 0;
        while(cont < 9){
            int tamanio = nuevoJ.size();
            int indice = rnd.nextInt(tamanio);
            titulares.add(nuevoJ.get(indice));
            nuevoJ.remove(indice);
            cont++;
        }
        return titulares;
    }

    public void infoTitulares(){
        System.out.println(nombre);
        ArrayList<Jugador> titulares = once();
        int acum = 0;
        for(int i = 0; i < titulares.size(); i++){
            System.out.println(titulares.get(i));
            acum += titulares.get(i).mediaJugador();
        }
        System.out.println("la media del equipo titular es: " + acum / 11);
    }
    

}

