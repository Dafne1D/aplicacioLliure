package UNO;

import java.util.ArrayList;

public class Jugador {


    public String nom;
    public ArrayList<Carta> cartes; //

    public Jugador(String nomJugador){
        nomJugador = nom;
        cartes = new ArrayList<>();
    }

    public String getNom(String nom) {
        return nom;
    }
    public ArrayList<Carta> getCartes() {
        return cartes;
    }

    public void addCarta(Carta carta){
        cartes.add(carta);
    }

}