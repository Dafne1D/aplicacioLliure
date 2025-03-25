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
    private static int NumeroCarta;

    //Constructor
    public Carta ( int NumCarta, Colors color){
        NumeroCarta = NumCarta;
        ColorCarta = color;
    }


    public static int getNumero(){
        return NumeroCarta;
    }
    public Colors getColor(){
        return ColorCarta;
    }
}
