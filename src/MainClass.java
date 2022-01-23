import java.io.IOException;

public class MainClass {
    public static void main(String[] args) {
        Deck m = new Deck(); //nuevo mazo/baraja
         m.shuffle();// baraja. llamada al metodo shuffle de desk


        System.out.println(m);// imprime el resultado del barajamiento

        //extraer 2 cartas y enseña. metodo extractCard que esta Deck
        Carta c1 = m.extractCard();
        Carta c2 = m.extractCard();

        System.out.println("carta 1: " + c1);
        System.out.println("carta 2: " + c2);
    }
}
