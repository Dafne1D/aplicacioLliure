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

    public static List<Carta> crearBaralla(int cantitat) {
        List<Carta> baraja = new ArrayList<>();
        Colors[] colores = Colors.values();
        int numColores = colores.length;

        int cartasPorColor = cantitat / numColores;

        int[] valoresPermitidos = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18};
        int numValors = valoresPermitidos.length;

        for (Colors color : colores) {
            int index = 0;
            for (int i = 0; i < cartasPorColor; i++) {
                int numeroCarta = valoresPermitidos[index];
                index = (index + 1) % numValors;

                Carta carta = new Carta(i + 1, color, numeroCarta);
                baraja.add(carta);
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
