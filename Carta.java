package UNO;

public class Carta {
    public int NumCarta;

    public enum Colors{
        vermell,
        groc,
        blau,
        verd
    }
    private int IdCarta;
    private Colors color;




    //Constructor
    private Carta (int IdCarta, Colors color){
        IdCarta = IdCarta;
        color = color;
    }
}
