public class Deck {

    //array para almacenar las cartas
    Carta[] mazo;
    int devuelvaCard;

    public final int OROS = 1;
    public final int COPAS = 2;
    public final int ESPADAS = 3;
    public final int BASTOS = 4;

    //constructor- inicializacion de atributos
    public Deck() {
       mazo = new Carta[48]; //porque se almacena los tipos de carta.// matriz tiene 48 posiciones

        int numCarta = 0;

        for (int i = 1; i < 12; i++) {
            mazo[numCarta] = new Carta(numCarta, OROS);
            numCarta++;
            for (int j = 12; j < 24; j++) {
                mazo[numCarta] = new Carta(numCarta, COPAS);
                numCarta++;
                for (int k = 24; k < 36; k++) {
                    mazo[numCarta] = new Carta(numCarta, ESPADAS);
                    numCarta++;

                    for (int l = 36; l < 48; l++) {
                        mazo[numCarta] = new Carta(numCarta, BASTOS);
                        numCarta++;
                    }
                }

            }
        }
    }
//barajar
    public void shuffle() {
        for (int i = 0; i < mazo.length; i++){
            int barajar = (int) (Math.random() * mazo.length);
         }

    }
    public Carta extractCard(){


        return;
    }
    public String toString(){
        String s = "";
        String ordenStr="";

        for(int i=0 ;i< mazo.length;i--){
            if(mazo[])

        }
        return s;
    }
    public void writeToFile(String nameFile){

    }
    public static Deck readFromFile(String nameFile){
        Deck deck = new Deck();

        return deck;
    }
}
