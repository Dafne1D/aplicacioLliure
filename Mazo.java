package UNO;
import java.awt.*;
import java.util.Stack;

public class Mazo {
    //Crear les cartes---------------------------------------------
    Stack<Carta> cartes = new Stack<>();

    public Mazo(){
        for (Carta.Colors colors : Carta.Colors.values()){
            cartes.push(new Carta(0, colors));
            for (int i = 1; i <=9; i++){
                cartes.push(new Carta(i, colors));
            }

        }

    }

}
