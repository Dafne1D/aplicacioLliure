package UNO;

import java.util.ArrayList;
import java.util.Stack;

public class Pilo {

    private Stack<Carta> cartes = new Stack<>();

    public Stack<Carta> getCartes (){
        return(cartes);
    }


    public Carta agafarCarta(){
        return cartes.pop();
    }

}
