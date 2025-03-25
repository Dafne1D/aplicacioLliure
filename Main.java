package UNO;

public class Main {
    public static void main(String[] args) {

        Carta c1 = new Carta(1, Carta.Colors.groc);
        Carta c2 = new Carta(3, Carta.Colors.vermell);
        Carta c3 = new Carta(6, Carta.Colors.blau);
        Carta c4 = new Carta(9, Carta.Colors.verd);

        Jugador j1 = new Jugador("Jugador 1");
        j1.addCarta(c1);
        j1.addCarta(c2);
        j1.addCarta(c3);
        j1.addCarta(c4);

        for (Carta c : j1.getCarta()) {
            UI.mostrarCarta(c);
        }
    }
}
