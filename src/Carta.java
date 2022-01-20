public class Carta {
    private int numbers;
    private int palo;//suit
    private final String [] NUMBERCARTA ={"1","2","3","4","5","6","7","8","9","sota", "caballo", "rey"};
    //se introducira dentro de la variable palo
    public final int OROS = 1;
    public final int COPAS = 2;
    public final int ESPADAS = 3;
    public final int BASTOS = 4;

    //constructores

    public Carta(int numbers, int palo){
        this.numbers= numbers;
        this.palo = palo;
    }
    public String toString(){
        String numberSuit= "";

        switch (palo){ //COMPROBAR VARIABLE PALO
            case OROS:
                numberSuit= NUMBERCARTA[numbers -1 ] + " de oros"; //-1 pq array no empieza desde 0
                break;
            case COPAS:
                numberSuit= NUMBERCARTA[numbers -1 ] + " de copas";
                break;
            case ESPADAS:
                numberSuit= NUMBERCARTA[numbers -1 ]+ " de espadas";
                break;
            case BASTOS:
                numberSuit= NUMBERCARTA[numbers -1 ]+ " de bastos";
                break;
            default:
                break;
        }
        return numberSuit;
    }


}
