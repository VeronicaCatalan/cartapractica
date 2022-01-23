import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Deck {
//variables
    //array para almacenar las cartas
    Carta[] mazo;

    int nCarta = 48;

//constantes
    public final int OROS = 1;
    public final int COPAS = 2;
    public final int ESPADAS = 3;
    public final int BASTOS = 4;

    //constructor- inicializacion de atributos
    public Deck() {
       mazo = new Carta[48]; //porque se almacena los tipos de carta.// matriz tiene 48 posiciones

        int numCarta = 0;

        for (int i = 1; i <= 12; i++) {
            mazo[numCarta] = new Carta(i, OROS);
            numCarta++;
        }
        for (int j = 1; j <= 12; j++) {
            mazo[numCarta] = new Carta(j, COPAS);
            numCarta++;
        }
        for (int k = 1; k <= 12; k++) {
            mazo[numCarta] = new Carta(k, ESPADAS);
            numCarta++;
        }

        for (int l = 1; l <= 12; l++) {
            mazo[numCarta] = new Carta(l, BASTOS);
            numCarta++;
        }
    }


//barajar
    public void shuffle() {
        for (int i = 0; i < mazo.length; i++){
            int barajar = (int) (Math.random() * mazo.length);// aleatorio

           // cambia de posicion
            Carta temp = mazo[i];// almacena datos

            mazo[i] = mazo [barajar];
            mazo [barajar] = temp;
        }
    }

//extraer carta
    public Carta extractCard(){
        nCarta--;

        return mazo[nCarta];
    }

@Override

    public String toString(){
        String s= "";

        for(int i = 0; i < nCarta; i++){

            if (mazo[i].getPalo() == OROS){
                s += mazo[i].toString();//i posicion
                s += ", ";
            }
        }
        s += "\n"; // salto de linea

        for(int i = 0; i < nCarta; i++){
            if (mazo[i].getPalo() == COPAS){
                s += mazo[i].toString();//i posicion
                s += ", ";
            }
        }
         s += "\n";// salto de linea
        for(int i = 0; i < nCarta; i++){

            if (mazo[i].getPalo() == ESPADAS){
                s += mazo[i].toString();//i posicion
                s += ", ";
            }
        }
        s += "\n"; // salto de linea
        for(int i = 0; i < nCarta; i++){
            if (mazo[i].getPalo() == BASTOS){
                s += mazo[i].toString();//i posicion
                s += ", ";
            }
        }

        return s;
    }





    //TEMA 8 NO ENTRA
    /*
    public void writeToFile(String nameFile){
        PrintWriter out = null;
        try {
            out = new PrintWriter(new FileWriter(fileName));
            out.println("number,suit");
            for (int i = 0; i <= nCarta; i++) {
                int num = mazo[i].getNumber();
                int suit = mazo[i].getSuit();
                out.println(num + "," +suit);
            }
        } finally {
            if (out != null) {
                out.close();
            }
        }

    }
    public static Deck readFromFile(String nameFile){
        BufferedReader input = null;
        Deck deck = new Deck();
        try {
            input = new BufferedReader(new FileReader(fileName));
            input.readLine();
            String line;
            int pos = 0;
            while ((line = input.readLine()) != null) {
                String[] items = line.split(",");
                int num = Integer.parseInt(items[0]);
                int suit = Integer.parseInt(items[1]);
                Carta c = new Carta(num, suit);
                deck.insertCard(c, pos);
                pos++;
            }
            deck.setNextCard(pos - 1);
            return  deck;

        } finally {
            if (input != null) {
                input.close();
            }
        }
    }
    */
}
