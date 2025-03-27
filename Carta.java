package UNO;

import java.awt.font.NumericShaper;
import java.util.ArrayList;
import java.util.List;

public class Carta {

    public enum Colors{
        vermell,
        groc,
        blau,
        verd
    }
    private Colors ColorCarta;
    private int NumeroCarta;

    //Constructor
    public Carta ( int NumCarta, Colors color){
        NumeroCarta = NumCarta;
        ColorCarta = color;
    }

    public int getNumero(){
        return NumeroCarta;
    }

    public Colors getColor(){
        return ColorCarta;
    }
}
