package UNO;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Jugador j1 = new Jugador("Jugador 1");

        Mazo mazo1 = new Mazo();
        mazo1.barrejar();
        Pilo pilo1 = new Pilo();
        pilo1.getCartes();
        for (int i = 0; i<38; i++){
            pilo1.getCartes().push(mazo1.agafarCarta());
        }
        System.out.println("PILO");

        UI.mostrarCartes(new ArrayList<>(pilo1.getCartes()));
        for (Carta c : mazo1.getCartes()){
            j1.addCarta(c);
        }
        System.out.println("MAZO");

        UI.mostrarCartes(j1.getCartes());

    }

}
