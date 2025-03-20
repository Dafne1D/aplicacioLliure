package UNO;

import java.util.ArrayList;

public class Jugador {
    public String NomJugador;

    public ArrayList<Jugador> jugadors() = new ArrayList<Jugador>();
    private ArrayList<Carta> baralla = new ArrayList<Carta>();

//ADD--------------------------------------------------------------------
    public void addJugador(Jugador jugador) {
        this.jugadors().add(jugador);
    }



    //Constructor
    private Jugador (int NomJugador){
        NomJugador = NomJugador;
    }



    //GETS---------------------------------------------------------
    public String getNomJugador(){
        return NomJugador;
    }



    public ArrayList<Carta> getCartes(){
        return baralla;
    }
}