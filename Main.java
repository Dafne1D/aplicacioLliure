package UNO;


public class Main {
    public static void main(String[] args) {


        Jugador j1 = new Jugador("Jugador 1");

        Mazo mazo1 = new Mazo();
        mazo1.barrejar();
        Pilo pilo1 = new Pilo();
        pilo1.getCartes();
        System.out.println(pilo1);

        for (Carta c : mazo1.getCartes()){
            j1.addCarta(c);
        }
        UI.mostrarCartes(j1.getCartes());

    }

}
