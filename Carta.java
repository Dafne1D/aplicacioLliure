package UNO;

import java.util.ArrayList;
import java.util.List;

public class Carta {

    public enum Colors{
        rojo,
        groc,
        blau,
        verd
    }
    public Colors color;
    public int NumCarta;
    public int IdCarta;
    //bucle creació carta

    public static List<Carta> crearBaralla() {
        List<Carta> baraja = new ArrayList<>();
        Colors[] colores = Colors.values();

        int[] valors = {0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9};

        int id = 1;

        for (Colors color : colores) {
            for (int numero : valors) {
                baraja.add(new Carta(id++, color, numero));
            }
        }

        return baraja;
    }

    public static void showBaraja(List<Carta> baraja) {
        for (Carta carta : baraja) {
            System.out.println("ID: " + carta.IdCarta + " | Color: " + carta.color + " | Número: " + carta.NumCarta);
        }
    }

    //Constructor
    public Carta (int IdCarta, Colors color, int NumCarta){
        this.NumCarta = NumCarta;
        this.IdCarta = IdCarta;
        this.color = color;
    }
}
