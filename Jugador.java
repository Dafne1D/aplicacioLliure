package UNO;

import java.util.ArrayList;

public class Jugador {
    public String NomJugador;

    private ArrayList<Carta> baralla = new ArrayList<Carta>();

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