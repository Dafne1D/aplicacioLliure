package UNO;

import java.util.ArrayList;

public class Jugador {
    public String NomJugador;

    private ArrayList<Carta> cartes = new ArrayList<Carta>();

    //Constructor
    private Jugador (int NomJugador){
        NomJugador = NomJugador;
    }

    public String getNomJugador(){
        return NomJugador;
    }

    public ArrayList<Carta> getCartes(){
        return cartes;
    }
}