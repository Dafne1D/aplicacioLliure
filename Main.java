package UNO;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Carta> _crearBaralla= Carta.crearBaralla(40);
        Carta.showBaraja(_crearBaralla);
    }
}